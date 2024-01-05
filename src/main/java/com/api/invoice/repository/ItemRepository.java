package com.api.invoice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.invoice.model.Item;


public interface ItemRepository extends JpaRepository<Item, Long>{
    // @
    Item findByItemCode(String itemCode);
    
}
