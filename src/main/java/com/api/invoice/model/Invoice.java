package com.api.invoice.model;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
// @Table(name="invoice")
public class Invoice  implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    
    @Column(name="subject")
    private String subject;


    @Column(name="issue_date")
    private Date issueDate;

    @Column(name="due_date")
    private Date dueDate;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ItemInvoice> itemInvoice;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(name="created_by")
    private String createdBy;

    @Column(name="updated_by")
    private String updatedBy;

    @Column(name="created_at")
    private Date createdAt;
    
    @Column(name="updated_at")
    private Date updatedAt;

    @Column(name="status")
    private String status;

    @Column(name="paid_from")
    private String paidFrom;

    @Column(name="paid_for")
    private String paidFor;


    public Invoice() {
    }

    public Invoice(Long id, String subject, Date issueDate, Date dueDate, List<ItemInvoice> itemInvoice, Customer customer, String createdBy, String updatedBy, Date createdAt, Date updatedAt, String status, String paidFrom, String paidFor) {
        this.id = id;
        this.subject = subject;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        this.itemInvoice = itemInvoice;
        this.customer = customer;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.status = status;
        this.paidFrom = paidFrom;
        this.paidFor = paidFor;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<ItemInvoice> getItemInvoice() {
        return this.itemInvoice;
    }

    public void setItemInvoice(List<ItemInvoice> itemInvoice) {
        this.itemInvoice = itemInvoice;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPaidFrom() {
        return this.paidFrom;
    }

    public void setPaidFrom(String paidFrom) {
        this.paidFrom = paidFrom;
    }

    public String getPaidFor() {
        return this.paidFor;
    }

    public void setPaidFor(String paidFor) {
        this.paidFor = paidFor;
    }

    public Invoice id(Long id) {
        setId(id);
        return this;
    }

    public Invoice subject(String subject) {
        setSubject(subject);
        return this;
    }

    public Invoice issueDate(Date issueDate) {
        setIssueDate(issueDate);
        return this;
    }

    public Invoice dueDate(Date dueDate) {
        setDueDate(dueDate);
        return this;
    }

    public Invoice itemInvoice(List<ItemInvoice> itemInvoice) {
        setItemInvoice(itemInvoice);
        return this;
    }

    public Invoice customer(Customer customer) {
        setCustomer(customer);
        return this;
    }

    public Invoice createdBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    public Invoice updatedBy(String updatedBy) {
        setUpdatedBy(updatedBy);
        return this;
    }

    public Invoice createdAt(Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    public Invoice updatedAt(Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    public Invoice status(String status) {
        setStatus(status);
        return this;
    }

    public Invoice paidFrom(String paidFrom) {
        setPaidFrom(paidFrom);
        return this;
    }

    public Invoice paidFor(String paidFor) {
        setPaidFor(paidFor);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Invoice)) {
            return false;
        }
        Invoice invoice = (Invoice) o;
        return Objects.equals(id, invoice.id) && Objects.equals(subject, invoice.subject) && Objects.equals(issueDate, invoice.issueDate) && Objects.equals(dueDate, invoice.dueDate) && Objects.equals(itemInvoice, invoice.itemInvoice) && Objects.equals(customer, invoice.customer) && Objects.equals(createdBy, invoice.createdBy) && Objects.equals(updatedBy, invoice.updatedBy) && Objects.equals(createdAt, invoice.createdAt) && Objects.equals(updatedAt, invoice.updatedAt) && Objects.equals(status, invoice.status) && Objects.equals(paidFrom, invoice.paidFrom) && Objects.equals(paidFor, invoice.paidFor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, subject, issueDate, dueDate, itemInvoice, customer, createdBy, updatedBy, createdAt, updatedAt, status, paidFrom, paidFor);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", subject='" + getSubject() + "'" +
            ", issueDate='" + getIssueDate() + "'" +
            ", dueDate='" + getDueDate() + "'" +
            ", itemInvoice='" + getItemInvoice() + "'" +
            ", customer='" + getCustomer() + "'" +
            ", createdBy='" + getCreatedBy() + "'" +
            ", updatedBy='" + getUpdatedBy() + "'" +
            ", createdAt='" + getCreatedAt() + "'" +
            ", updatedAt='" + getUpdatedAt() + "'" +
            ", status='" + getStatus() + "'" +
            ", paidFrom='" + getPaidFrom() + "'" +
            ", paidFor='" + getPaidFor() + "'" +
            "}";
    }


    
   
}
