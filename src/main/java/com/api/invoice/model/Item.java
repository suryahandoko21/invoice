package com.api.invoice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import java.io.Serializable;
import jakarta.persistence.Id;
import java.util.Objects;
import java.util.Date;
@Entity
@Table(name="item")
public class Item implements Serializable{
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="item_name")
    private String itemName;

    @Column(name="item_code")
    private String itemCode;

    @Column(name="item_type")
    private String itemType;

    @Column(name="item_description")
    private String itemDescription;
    
    @Column(name="created_by")
    private String createdBy;

    @Column(name="updated_by")
    private String updatedBy;

    @Column(name="created_at")
    private Date createdAt;
    
    @Column(name="updated_at")
    private Date updatedAt;

    

    public Item() {
    }

    public Item(Long id, String itemName, String itemCode, String itemType, String itemDescription, String createdBy, String updatedBy, Date createdAt, Date updatedAt) {
        this.id = id;
        this.itemName = itemName;
        this.itemCode = itemCode;
        this.itemType = itemType;
        this.itemDescription = itemDescription;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemCode() {
        return this.itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemType() {
        return this.itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemDescription() {
        return this.itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
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

    public Item id(Long id) {
        setId(id);
        return this;
    }

    public Item itemName(String itemName) {
        setItemName(itemName);
        return this;
    }

    public Item itemCode(String itemCode) {
        setItemCode(itemCode);
        return this;
    }

    public Item itemType(String itemType) {
        setItemType(itemType);
        return this;
    }

    public Item itemDescription(String itemDescription) {
        setItemDescription(itemDescription);
        return this;
    }

    public Item createdBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    public Item updatedBy(String updatedBy) {
        setUpdatedBy(updatedBy);
        return this;
    }

    public Item createdAt(Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    public Item updatedAt(Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Item)) {
            return false;
        }
        Item item = (Item) o;
        return Objects.equals(id, item.id) && Objects.equals(itemName, item.itemName) && Objects.equals(itemCode, item.itemCode) && Objects.equals(itemType, item.itemType) && Objects.equals(itemDescription, item.itemDescription) && Objects.equals(createdBy, item.createdBy) && Objects.equals(updatedBy, item.updatedBy) && Objects.equals(createdAt, item.createdAt) && Objects.equals(updatedAt, item.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, itemName, itemCode, itemType, itemDescription, createdBy, updatedBy, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", itemName='" + getItemName() + "'" +
            ", itemCode='" + getItemCode() + "'" +
            ", itemType='" + getItemType() + "'" +
            ", itemDescription='" + getItemDescription() + "'" +
            ", createdBy='" + getCreatedBy() + "'" +
            ", updatedBy='" + getUpdatedBy() + "'" +
            ", createdAt='" + getCreatedAt() + "'" +
            ", updatedAt='" + getUpdatedAt() + "'" +
            "}";
    }
   
}