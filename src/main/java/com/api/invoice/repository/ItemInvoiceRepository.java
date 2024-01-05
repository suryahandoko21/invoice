package com.api.invoice.repository;

import com.api.invoice.model.ItemInvoice;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ItemInvoiceRepository extends JpaRepository<ItemInvoice,Long>{
    @Query(value ="select i.id,i.price ,i.qty ,it.id,it.item_code ,it.item_name ,it.item_type,it.item_description  from item_invoice i join item it on i.item_id =it.id where i.invoice_id=:id", nativeQuery = true )
    List<Object[]> findByInvoiceId(@Param("id") Long id);

    @Modifying
    @Query(value="update item_invoice set qty=:qty,price=:price,item_id=:item_id,invoice_id=:invoice_id where id=:id",nativeQuery = true)
    void updateItemInvoice(@Param("id") int id,@Param("qty") int qty,@Param("price") double price,@Param("item_id") Long item_id,@Param("invoice_id") Long invoice_id);

    @Modifying
    @Query(value="insert into item_invoice(qty,price,item_id,invoice_id) values(:qty,:price,:item_id,:invoice_id)",nativeQuery = true)
    void insertUpdateItemInvoice(@Param("qty") int qty,@Param("price") double price,@Param("item_id") Long item_id,@Param("invoice_id") Long invoice_id);

}
