package com.api.invoice.dto;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class RequestInvoiceUpdateDTO {
    private String subject;
    private Date issueDate;
    private Date dueDate;
    private List<ItemInvoiceUpdateDTO> itemInvoice;
    private Long customer_id;
    private String createdBy;

    public RequestInvoiceUpdateDTO() {
    }

    public RequestInvoiceUpdateDTO(String subject, Date issueDate, Date dueDate, List<ItemInvoiceUpdateDTO> itemInvoice, Long customer_id, String createdBy) {
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

    public List<ItemInvoiceUpdateDTO> getItemInvoice() {
        return this.itemInvoice;
    }

    public void setItemInvoice(List<ItemInvoiceUpdateDTO> itemInvoice) {
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

    public RequestInvoiceUpdateDTO subject(String subject) {
        setSubject(subject);
        return this;
    }

    public RequestInvoiceUpdateDTO issueDate(Date issueDate) {
        setIssueDate(issueDate);
        return this;
    }

    public RequestInvoiceUpdateDTO dueDate(Date dueDate) {
        setDueDate(dueDate);
        return this;
    }

    public RequestInvoiceUpdateDTO itemInvoice(List<ItemInvoiceUpdateDTO> itemInvoice) {
        setItemInvoice(itemInvoice);
        return this;
    }

    public RequestInvoiceUpdateDTO customer_id(Long customer_id) {
        setCustomer_id(customer_id);
        return this;
    }

    public RequestInvoiceUpdateDTO createdBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof RequestInvoiceUpdateDTO)) {
            return false;
        }
        RequestInvoiceUpdateDTO requestInvoiceUpdateDTO = (RequestInvoiceUpdateDTO) o;
        return Objects.equals(subject, requestInvoiceUpdateDTO.subject) && Objects.equals(issueDate, requestInvoiceUpdateDTO.issueDate) && Objects.equals(dueDate, requestInvoiceUpdateDTO.dueDate) && Objects.equals(itemInvoice, requestInvoiceUpdateDTO.itemInvoice) && Objects.equals(customer_id, requestInvoiceUpdateDTO.customer_id) && Objects.equals(createdBy, requestInvoiceUpdateDTO.createdBy);
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
