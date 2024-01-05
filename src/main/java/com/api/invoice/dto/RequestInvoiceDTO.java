package com.api.invoice.dto;
import java.io.Serializable;
import java.util.List;
import java.util.Date;
import java.util.Objects;
public class RequestInvoiceDTO implements Serializable{
    private String subject;
    private Date issueDate;
    private Date dueDate;
    private List<ItemInvoiceDTO> itemInvoice;
    private Long customer_id;
    private String createdBy;

    public RequestInvoiceDTO() {
    }

    public RequestInvoiceDTO(String subject, Date issueDate, Date dueDate, List<ItemInvoiceDTO> itemInvoice, Long customer_id, String createdBy) {
        this.subject = subject;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        this.itemInvoice = itemInvoice;
        this.customer_id = customer_id;
        this.createdBy = createdBy;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getIssueDate() {
        return this.issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public List<ItemInvoiceDTO> getItemInvoice() {
        return this.itemInvoice;
    }

    public void setItemInvoice(List<ItemInvoiceDTO> itemInvoice) {
        this.itemInvoice = itemInvoice;
    }

    public Long getCustomer_id() {
        return this.customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    public String getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public RequestInvoiceDTO subject(String subject) {
        setSubject(subject);
        return this;
    }

    public RequestInvoiceDTO issueDate(Date issueDate) {
        setIssueDate(issueDate);
        return this;
    }

    public RequestInvoiceDTO dueDate(Date dueDate) {
        setDueDate(dueDate);
        return this;
    }

    public RequestInvoiceDTO itemInvoice(List<ItemInvoiceDTO> itemInvoice) {
        setItemInvoice(itemInvoice);
        return this;
    }

    public RequestInvoiceDTO customer_id(Long customer_id) {
        setCustomer_id(customer_id);
        return this;
    }

    public RequestInvoiceDTO createdBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof RequestInvoiceDTO)) {
            return false;
        }
        RequestInvoiceDTO requestInvoiceDTO = (RequestInvoiceDTO) o;
        return Objects.equals(subject, requestInvoiceDTO.subject) && Objects.equals(issueDate, requestInvoiceDTO.issueDate) && Objects.equals(dueDate, requestInvoiceDTO.dueDate) && Objects.equals(itemInvoice, requestInvoiceDTO.itemInvoice) && Objects.equals(customer_id, requestInvoiceDTO.customer_id) && Objects.equals(createdBy, requestInvoiceDTO.createdBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject, issueDate, dueDate, itemInvoice, customer_id, createdBy);
    }

    @Override
    public String toString() {
        return "{" +
            " subject='" + getSubject() + "'" +
            ", issueDate='" + getIssueDate() + "'" +
            ", dueDate='" + getDueDate() + "'" +
            ", itemInvoice='" + getItemInvoice() + "'" +
            ", customer_id='" + getCustomer_id() + "'" +
            ", createdBy='" + getCreatedBy() + "'" +
            "}";
    }

   
}
