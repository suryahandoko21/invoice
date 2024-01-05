package com.api.invoice.dto;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

public class ReportInvoiceDTO implements Serializable{
    private int id;
    private Timestamp issue_date;
    private String subject;
    private Long total_item;
    private String customer_name;
    private Timestamp due_date;
    private String status;

    public ReportInvoiceDTO() {
    }

    public ReportInvoiceDTO(int id, Timestamp issue_date, String subject, Long total_item, String customer_name, Timestamp due_date, String status) {
        this.id = id;
        this.issue_date = issue_date;
        this.subject = subject;
        this.total_item = total_item;
        this.customer_name = customer_name;
        this.due_date = due_date;
        this.status = status;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getIssue_date() {
        return this.issue_date;
    }

    public void setIssue_date(Timestamp issue_date) {
        this.issue_date = issue_date;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Long getTotal_item() {
        return this.total_item;
    }

    public void setTotal_item(Long total_item) {
        this.total_item = total_item;
    }

    public String getCustomer_name() {
        return this.customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public Timestamp getDue_date() {
        return this.due_date;
    }

    public void setDue_date(Timestamp due_date) {
        this.due_date = due_date;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ReportInvoiceDTO id(int id) {
        setId(id);
        return this;
    }

    public ReportInvoiceDTO issue_date(Timestamp issue_date) {
        setIssue_date(issue_date);
        return this;
    }

    public ReportInvoiceDTO subject(String subject) {
        setSubject(subject);
        return this;
    }

    public ReportInvoiceDTO total_item(Long total_item) {
        setTotal_item(total_item);
        return this;
    }

    public ReportInvoiceDTO customer_name(String customer_name) {
        setCustomer_name(customer_name);
        return this;
    }

    public ReportInvoiceDTO due_date(Timestamp due_date) {
        setDue_date(due_date);
        return this;
    }

    public ReportInvoiceDTO status(String status) {
        setStatus(status);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ReportInvoiceDTO)) {
            return false;
        }
        ReportInvoiceDTO reportInvoiceDTO = (ReportInvoiceDTO) o;
        return id == reportInvoiceDTO.id && Objects.equals(issue_date, reportInvoiceDTO.issue_date) && Objects.equals(subject, reportInvoiceDTO.subject) && Objects.equals(total_item, reportInvoiceDTO.total_item) && Objects.equals(customer_name, reportInvoiceDTO.customer_name) && Objects.equals(due_date, reportInvoiceDTO.due_date) && Objects.equals(status, reportInvoiceDTO.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, issue_date, subject, total_item, customer_name, due_date, status);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", issue_date='" + getIssue_date() + "'" +
            ", subject='" + getSubject() + "'" +
            ", total_item='" + getTotal_item() + "'" +
            ", customer_name='" + getCustomer_name() + "'" +
            ", due_date='" + getDue_date() + "'" +
            ", status='" + getStatus() + "'" +
            "}";
    }
}
