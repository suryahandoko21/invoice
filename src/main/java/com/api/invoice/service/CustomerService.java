package com.api.invoice.service;

import java.util.Date;
import org.springframework.stereotype.Service;
import com.api.invoice.dto.ResponseDTO;
import com.api.invoice.model.Customer;
import com.api.invoice.repository.CustomerRepository;
import java.util.List;
import java.util.Optional;
// import java.util.Optional;
@Service
public class CustomerService {
    private final CustomerRepository customerRepository;
    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository= customerRepository;
    }
    
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    public Optional<Customer> getCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    public ResponseDTO saveCustomer(Customer customer) {
        try{
            ResponseDTO response = new ResponseDTO(); 
            response.setStatusCode(200);
            response.setMessage("Item Added");
            customer.setCreatedAt(new Date());
            customer.setUpdatedAt(new Date());
            customerRepository.save(customer);
            return response;
        }
        catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
    }
    public Customer updateCustomer(Long id,Customer customer){
            if(customerRepository.existsById(id)){
                customer.setId(id);
                customer.setUpdatedBy(customer.getUpdatedBy());
                customer.setUpdatedAt(new Date());
                return customerRepository.save(customer);
            }
            throw new RuntimeException("Not Found ID");
    }

    public ResponseDTO deleteCustomer(Long id) {
        try{
            ResponseDTO response = new ResponseDTO(); 
            if(!customerRepository.findById(id).isPresent()){
                 response.setStatusCode(400);
                 response.setMessage("Can't find ID !!"); 
                 return response;
            }
            response.setStatusCode(200);
            response.setMessage("Success delete Customer"); 
            customerRepository.deleteById(id);
            return response;
        }
        catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
       
    }

}
