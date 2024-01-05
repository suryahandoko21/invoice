package com.api.invoice.service;

import java.util.stream.Collectors;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.api.invoice.dto.DetailInvoiceDTO;
import com.api.invoice.dto.DetailItemInvoiceDTO;
import com.api.invoice.dto.ItemInvoiceUpdateDTO;
import com.api.invoice.dto.ReportInvoiceDTO;
import com.api.invoice.dto.RequestInvoiceDTO;
import com.api.invoice.dto.RequestInvoicePaidDTO;
import com.api.invoice.dto.RequestInvoiceUpdateDTO;
import com.api.invoice.dto.ResponseDTO;
import com.api.invoice.model.Customer;
import com.api.invoice.model.Invoice;
import com.api.invoice.model.Item;
import com.api.invoice.model.ItemInvoice;
import com.api.invoice.repository.CustomerRepository;
import com.api.invoice.repository.InvoiceRepository;
import com.api.invoice.repository.ItemInvoiceRepository;

import jakarta.transaction.Transactional;

import org.modelmapper.ModelMapper;

@Service
public class InvoiceService {
   
   private final InvoiceRepository invoiceRepository;
   private final ItemInvoiceRepository itemInvoiceRepository;
   private final CustomerRepository customerRepository;
   public InvoiceService(InvoiceRepository invoiceRepository,ItemInvoiceRepository itemInvoiceRepository,CustomerRepository customerRepository){
      this.invoiceRepository = invoiceRepository;
      this.itemInvoiceRepository = itemInvoiceRepository;
      this.customerRepository = customerRepository;
   }
   public ResponseDTO saveInvoice(RequestInvoiceDTO invoiceDTO) {
      ResponseDTO response = new ResponseDTO(); 
      ModelMapper modelMapper = new ModelMapper();
      Invoice invoice = new Invoice();
      invoice.setStatus("UNPAID");
      invoice.setSubject(invoiceDTO.getSubject());
      invoice.setCreatedBy(invoiceDTO.getCreatedBy());
      Customer customer = new Customer();
      customer.setId(invoiceDTO.getCustomer_id());
      invoice.setCustomer(customer);
      Invoice savedInvoice = invoiceRepository.save(invoice);
      List<ItemInvoice> detailEntities =invoiceDTO.getItemInvoice().stream().map(detailDTO->{
            ItemInvoice itemInvoice = modelMapper.map(detailDTO, ItemInvoice.class);
            Item item = new Item();
            item.setId(detailDTO.getItem_id());
            itemInvoice.setItem(item);
            itemInvoice.setInvoice(savedInvoice);
            return itemInvoice;
         }).collect(Collectors.toList());
      itemInvoiceRepository.saveAll(detailEntities);
      response.setStatusCode(200);
      response.setMessage("Invoice Added");
      return response;
     }

   @Transactional  
   public ResponseDTO updateInvoice(Long id,RequestInvoiceUpdateDTO invoiceDTO) {
      ResponseDTO response = new ResponseDTO(); 
      for(ItemInvoiceUpdateDTO detail: invoiceDTO.getItemInvoice()){
         if(detail.getId() !=0){
            itemInvoiceRepository.updateItemInvoice(detail.getId(), detail.getQty(), detail.getPrice(), detail.getItem_id(), id);
         }
         else{
            itemInvoiceRepository.insertUpdateItemInvoice(detail.getQty(), detail.getPrice(), detail.getItem_id(), id); 
         }
      }
        response.setStatusCode(200);
        response.setMessage("Invoice Updated");
        return response;
     }

     public List<ReportInvoiceDTO> findAll() {
         List<Object[]> resultQuery =invoiceRepository.reportInvoice();
         List<ReportInvoiceDTO> resultDTO = new ArrayList<>();
         for (Object[] obj : resultQuery) {
               ReportInvoiceDTO dto = new ReportInvoiceDTO();
               dto.setId((int) obj[0]);
               dto.setIssue_date((Timestamp) obj[1]);
               dto.setSubject((String) obj[2]);
               dto.setTotal_item((Long) obj[3]);
               dto.setCustomer_name((String) obj[4]);
               dto.setDue_date((Timestamp) obj[5]);
               dto.setStatus((String) obj[6]);
               resultDTO.add(dto);
         }
      return resultDTO;
  }

  public DetailInvoiceDTO getInvoiceById(Long id) {
      List<DetailItemInvoiceDTO> resultDetailDTO = new ArrayList<>();
      DetailInvoiceDTO detailInvoice = new DetailInvoiceDTO();
      List<Object[]> resultDetailQuery= itemInvoiceRepository.findByInvoiceId(id);
      Invoice  invoice = invoiceRepository.findByInvoiceId(id);
      if(invoice !=null){
            Customer customer = customerRepository.findCustomerById(invoice.getCustomer().getId());
            double subtotal = 0.0;
            for (Object[] obj : resultDetailQuery) {
                  double total_amount =(double) obj[1] * (int)obj[2]; 
                  subtotal+=total_amount;
                  DetailItemInvoiceDTO dto =new DetailItemInvoiceDTO();
                  dto.setId((int) obj[0]);
                  dto.setPrice((double) obj[1]);   
                  dto.setQty((int) obj[2]);
                  dto.setItem_id((int) obj[3]);
                  dto.setItem_code((String) obj[4]);
                  dto.setItem_name((String) obj[5]);
                  dto.setItem_type((String) obj[6]);
                  dto.setItem_description((String) obj[7]);
                  dto.setAmount(total_amount);
                  resultDetailDTO.add(dto);
            }
            double count_tax = 0.1 * subtotal;
            double grand_total = subtotal + count_tax;
            detailInvoice.setId(invoice.getId());
            detailInvoice.setSubject(invoice.getSubject());
            detailInvoice.setIssue_date(invoice.getIssueDate());
            detailInvoice.setDue_date(invoice.getDueDate());
            detailInvoice.setCustomer_id(customer.getId());
            detailInvoice.setCustomer_name(customer.getCustomerName());
            detailInvoice.setCustomer_address(customer.getCustomerAddress());
            detailInvoice.setCustomer_description(customer.getCustomerDescription());
            detailInvoice.setStatus(invoice.getStatus());
            detailInvoice.setItem_invoice(resultDetailDTO);
            detailInvoice.setTotal_item(resultDetailQuery.size());
            detailInvoice.setSub_total(subtotal);
            detailInvoice.setTax(count_tax);
            detailInvoice.setGrand_total(grand_total);
            detailInvoice.setPaid_from(invoice.getPaidFrom());
            detailInvoice.setPaid_for(invoice.getPaidFor());
   }
      return detailInvoice;
}

@Transactional
public ResponseDTO paidInvoice(Long id,RequestInvoicePaidDTO paid){
   try{
      ResponseDTO response = new ResponseDTO(); 
      invoiceRepository.updatePaidInvoice(id, paid.getPaid_from(), paid.getPaid_for(), paid.getCreated_by());
      response.setStatusCode(200);
      response.setMessage("Success Paid Invoice"); 
      return response;
   }
   catch (Exception e) {
      throw new RuntimeException(e.getMessage());
  }
}

}
