package com.api.invoice.controller;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.invoice.dto.DetailInvoiceDTO;
import com.api.invoice.dto.ReportInvoiceDTO;
import com.api.invoice.dto.RequestInvoiceDTO;
import com.api.invoice.dto.RequestInvoicePaidDTO;
import com.api.invoice.dto.RequestInvoiceUpdateDTO;
import com.api.invoice.dto.ResponseDTO;
import com.api.invoice.service.InvoiceService;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {

    private final InvoiceService invoiceService;
    public InvoiceController(InvoiceService invoiceService){
        this.invoiceService= invoiceService;
    }

    /* Save data invoice */
    @PostMapping
    public ResponseEntity<ResponseDTO>  saveInvoice(@RequestBody RequestInvoiceDTO invoice) {
        ResponseDTO response =  invoiceService.saveInvoice(invoice);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    /* Updata data invoice */
    @PutMapping("/{id}")
    public ResponseEntity<ResponseDTO> updateItem(@PathVariable Long id, @RequestBody RequestInvoiceUpdateDTO invoice) {
        ResponseDTO updatedInvoice = invoiceService.updateInvoice(id, invoice);
        return updatedInvoice != null ? ResponseEntity.ok(updatedInvoice) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public List<ReportInvoiceDTO> getInvoiceAll() {
        return invoiceService.findAll();     
    }

    /* can used for view and print invoice */
    @GetMapping("/{id}")
    public DetailInvoiceDTO getInvoiceById(@PathVariable("id") Long id) {
        DetailInvoiceDTO data = invoiceService.getInvoiceById(id);
        return data;           
    }

    /* Paid invoice set status from UNPAID to PAID */
    @PutMapping("/paid_invoice/{id}")
    public ResponseEntity<ResponseDTO>  paidInvoice(@PathVariable Long id, @RequestBody RequestInvoicePaidDTO paid) {
        try {
            ResponseDTO response = invoiceService.paidInvoice(id,paid);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }
        catch (Exception e) {
            System.out.println("eoooo"+e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }       
    }
}
