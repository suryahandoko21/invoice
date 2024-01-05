package com.api.invoice.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class DetailInvoiceDTO implements Serializable{
    private long id;
    private String subject;
    private Date issue_date;
    private Date due_date;
    private String status;
    private Long customer_id;
    private String customer_name;
    private String customer_address;
    private String customer_description;
    private List<DetailItemInvoiceDTO>item_invoice;
    private int total_item;
    private double sub_total;
    private double tax;
    private double grand_total;
    private String paid_from;
    private String paid_for;

    

    public DetailInvoiceDTO() {
    }

    public DetailInvoiceDTO(long id, String subject, Date issue_date, Date due_date, String status, Long customer_id, String customer_name, String customer_address, String customer_description, List<DetailItemInvoiceDTO> item_invoice, int total_item, double sub_total, double tax, double grand_total, String paid_from, String paid_for) {
        this.id = id;
        this.subject = subject;
        this.issue_date = issue_date;
        this.due_date = due_date;
        this.status = status;
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.customer_address = customer_address;
        this.customer_description = customer_description;
        this.item_invoice = item_invoice;
        this.total_item = total_item;
        this.sub_total = sub_total;
        this.tax = tax;
        this.grand_total = grand_total;
        this.paid_from = paid_from;
        this.paid_for = paid_for;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getIssue_date() {
        return this.issue_date;
    }

    public void setIssue_date(Date issue_date) {
        this.issue_date = issue_date;
    }

    public Date getDue_date() {
        return this.due_date;
    }

    public void setDue_date(Date due_date) {
        this.due_date = due_date;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getCustomer_id() {
        return this.customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return this.customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_address() {
        return this.customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }

    public String getCustomer_description() {
        return this.customer_description;
    }

    public void setCustomer_description(String customer_description) {
        this.customer_description = customer_description;
    }

    public List<DetailItemInvoiceDTO> getItem_invoice() {
        return this.item_invoice;
    }

    public void setItem_invoice(List<DetailItemInvoiceDTO> item_invoice) {
        this.item_invoice = item_invoice;
    }

    public int getTotal_item() {
        return this.total_item;
    }

    public void setTotal_item(int total_item) {
        this.total_item = total_item;
    }

    public double getSub_total() {
        return this.sub_total;
    }

    public void setSub_total(double sub_total) {
        this.sub_total = sub_total;
    }

    public double getTax() {
        return this.tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getGrand_total() {
        return this.grand_total;
    }

    public void setGrand_total(double grand_total) {
        this.grand_total = grand_total;
    }

    public String getPaid_from() {
        return this.paid_from;
    }

    public void setPaid_from(String paid_from) {
        this.paid_from = paid_from;
    }

    public String getPaid_for() {
        return this.paid_for;
    }

    public void setPaid_for(String paid_for) {
        this.paid_for = paid_for;
    }

    public DetailInvoiceDTO id(long id) {
        setId(id);
        return this;
    }

    public DetailInvoiceDTO subject(String subject) {
        setSubject(subject);
        return this;
    }

    public DetailInvoiceDTO issue_date(Date issue_date) {
        setIssue_date(issue_date);
        return this;
    }

    public DetailInvoiceDTO due_date(Date due_date) {
        setDue_date(due_date);
        return this;
    }

    public DetailInvoiceDTO status(String status) {
        setStatus(status);
        return this;
    }

    public DetailInvoiceDTO customer_id(Long customer_id) {
        setCustomer_id(customer_id);
        return this;
    }

    public DetailInvoiceDTO customer_name(String customer_name) {
        setCustomer_name(customer_name);
        return this;
    }

    public DetailInvoiceDTO customer_address(String customer_address) {
        setCustomer_address(customer_address);
        return this;
    }

    public DetailInvoiceDTO customer_description(String customer_description) {
        setCustomer_description(customer_description);
        return this;
    }

    public DetailInvoiceDTO item_invoice(List<DetailItemInvoiceDTO> item_invoice) {
        setItem_invoice(item_invoice);
        return this;
    }

    public DetailInvoiceDTO total_item(int total_item) {
        setTotal_item(total_item);
        return this;
    }

    public DetailInvoiceDTO sub_total(double sub_total) {
        setSub_total(sub_total);
        return this;
    }

    public DetailInvoiceDTO tax(double tax) {
        setTax(tax);
        return this;
    }

    public DetailInvoiceDTO grand_total(double grand_total) {
        setGrand_total(grand_total);
        return this;
    }

    public DetailInvoiceDTO paid_from(String paid_from) {
        setPaid_from(paid_from);
        return this;
    }

    public DetailInvoiceDTO paid_for(String paid_for) {
        setPaid_for(paid_for);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof DetailInvoiceDTO)) {
            return false;
        }
        DetailInvoiceDTO detailInvoiceDTO = (DetailInvoiceDTO) o;
        return id == detailInvoiceDTO.id && Objects.equals(subject, detailInvoiceDTO.subject) && Objects.equals(issue_date, detailInvoiceDTO.issue_date) && Objects.equals(due_date, detailInvoiceDTO.due_date) && Objects.equals(status, detailInvoiceDTO.status) && Objects.equals(customer_id, detailInvoiceDTO.customer_id) && Objects.equals(customer_name, detailInvoiceDTO.customer_name) && Objects.equals(customer_address, detailInvoiceDTO.customer_address) && Objects.equals(customer_description, detailInvoiceDTO.customer_description) && Objects.equals(item_invoice, detailInvoiceDTO.item_invoice) && total_item == detailInvoiceDTO.total_item && sub_total == detailInvoiceDTO.sub_total && tax == detailInvoiceDTO.tax && grand_total == detailInvoiceDTO.grand_total && Objects.equals(paid_from, detailInvoiceDTO.paid_from) && Objects.equals(paid_for, detailInvoiceDTO.paid_for);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, subject, issue_date, due_date, status, customer_id, customer_name, customer_address, customer_description, item_invoice, total_item, sub_total, tax, grand_total, paid_from, paid_for);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", subject='" + getSubject() + "'" +
            ", issue_date='" + getIssue_date() + "'" +
            ", due_date='" + getDue_date() + "'" +
            ", status='" + getStatus() + "'" +
            ", customer_id='" + getCustomer_id() + "'" +
            ", customer_name='" + getCustomer_name() + "'" +
            ", customer_address='" + getCustomer_address() + "'" +
            ", customer_description='" + getCustomer_description() + "'" +
            ", item_invoice='" + getItem_invoice() + "'" +
            ", total_item='" + getTotal_item() + "'" +
            ", sub_total='" + getSub_total() + "'" +
            ", tax='" + getTax() + "'" +
            ", grand_total='" + getGrand_total() + "'" +
            ", paid_from='" + getPaid_from() + "'" +
            ", paid_for='" + getPaid_for() + "'" +
            "}";
    }
    
}
