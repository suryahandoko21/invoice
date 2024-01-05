package com.api.invoice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.api.invoice.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
    @Query(value="select * from customer where id=:id",nativeQuery = true)
    Customer findCustomerById(@Param("id") Long id);
}
