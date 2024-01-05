package com.api.invoice.service;

import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Service;

import com.api.invoice.dto.ResponseDTO;
import com.api.invoice.model.Item;
import com.api.invoice.repository.ItemRepository;

@Service
public class ItemService {
    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository){
        this.itemRepository=itemRepository;
    }

    public List<Item> getAllItem() {
        return itemRepository.findAll();
    }
    
    public ResponseDTO saveItem(Item item) {
        try{
            ResponseDTO response = new ResponseDTO(); 
            if(itemRepository.findByItemCode(item.getItemCode()) !=null){
                response.setStatusCode(400);
                response.setMessage("Item Code Exist");
                return response;
            }
            response.setStatusCode(200);
            response.setMessage("Item Added");
            item.setCreatedAt(new Date());
            item.setUpdatedAt(new Date());
            itemRepository.save(item);
            return response;
        }
     catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public Item updateItem(Long id,Item item){
            if(itemRepository.existsById(id)){
                item.setId(id);
                item.setUpdatedBy(item.getUpdatedBy());
                item.setUpdatedAt(new Date());
                return itemRepository.save(item);
            }
            throw new RuntimeException("Not Found ID");
    }

    public ResponseDTO deleteItem(Long id) {
        try{
            ResponseDTO response = new ResponseDTO(); 
            if(!itemRepository.findById(id).isPresent()){
                 response.setStatusCode(400);
                 response.setMessage("Can't find ID !!"); 
                 return response;
            }
            response.setStatusCode(200);
            response.setMessage("Success delete Item"); 
            itemRepository.deleteById(id);
            return response;
        }
        catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
       
    }
}
