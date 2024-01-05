package com.api.invoice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;
import com.api.invoice.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice,Long>{
    @Query(value ="select invoice.id,issue_date,subject,COUNT(item_invoice.id) AS total_item,customer_name ,due_date,status\n" + //
            "from invoice join customer on customer.id = invoice.customer_id \n" + //
            "left join item_invoice on invoice.id=item_invoice.invoice_id \n" + //
            "GROUP  by invoice.id,invoice.subject,customer.customer_name,issue_date,due_date,status", nativeQuery = true )
    List<Object[]> reportInvoice();

    @Query(value="select * from invoice where id=:id",nativeQuery = true)
    Invoice findByInvoiceId(@Param("id") Long id);

    @Modifying
    @Query(value="update invoice set status='PAID',paid_from=:paid_from,paid_for=:paid_for,updated_by=:created_by WHERE id=:id",nativeQuery = true)
    void updatePaidInvoice(@Param("id") Long id,@Param("paid_from") String paid_from,@Param("paid_for") String paid_for,@Param("created_by") String created_by);
    
    @Modifying
    @Query(value = "update invoice set subject=:subject,issue_date=:issue_date,customer_id=:customer_id,due_date=:due_date,updated_by=:created_by where id=:id",nativeQuery = true)
    void updateInvoice(@Param("id") Long id, @Param("subject") String subject,@Param("issue_date") Date issue_date,@Param("customer_id") Long customer_id,@Param("due_date") Date due_date,@Param("created_by") String created_by);
}
