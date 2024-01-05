package com.api.invoice.controller;

import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.invoice.dto.ResponseDTO;
import com.api.invoice.model.Customer;
import com.api.invoice.service.CustomerService;
import com.mysql.cj.x.protobuf.MysqlxDatatypes.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
@RestController
@RequestMapping("/customers")
public class CustomerController {
    
    private final CustomerService customerService;
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getAllItems() {
        return customerService.getAllCustomer();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getCustomerById(@PathVariable("id") Long id) {
        Optional<Customer> customer = customerService.getCustomerById(id);
        Map<String, Object> emptyResponse = new HashMap<>();
        if(customer.isPresent()){
           return customer.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }
        return ResponseEntity.ok(emptyResponse);           
    }

    @PutMapping("/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
        Customer updatedCustomer = customerService.updateCustomer(id, customer);
        return updatedCustomer != null ? ResponseEntity.ok(updatedCustomer) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<ResponseDTO> saveCustomer(@RequestBody Customer customer) {
        try {
            ResponseDTO response = customerService.saveCustomer(customer);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }
        catch (Exception e) {
            ResponseDTO res = new ResponseDTO();
            res.setMessage(e.getMessage());
            res.setStatusCode(406);
            return new ResponseEntity<>(res,HttpStatus.NOT_ACCEPTABLE);
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseDTO> deleteCustomer(@PathVariable Long id) {
        try {
            ResponseDTO response = customerService.deleteCustomer(id);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
