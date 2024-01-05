package com.api.invoice.dto;

import java.io.Serializable;
import java.util.Objects;

public class DetailItemInvoiceDTO  implements Serializable {
    private int id;
    private double price;
    private int qty;
    private double amount;
    private int item_id;
    private String item_code;
    private String item_name;
    private String item_description;
    private String item_type;


    public DetailItemInvoiceDTO() {
    }

    public DetailItemInvoiceDTO(int id, double price, int qty, double amount, int item_id, String item_code, String item_name, String item_description, String item_type) {
        this.id = id;
        this.price = price;
        this.qty = qty;
        this.amount = amount;
        this.item_id = item_id;
        this.item_code = item_code;
        this.item_name = item_name;
        this.item_description = item_description;
        this.item_type = item_type;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getItem_id() {
        return this.item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public String getItem_code() {
        return this.item_code;
    }

    public void setItem_code(String item_code) {
        this.item_code = item_code;
    }

    public String getItem_name() {
        return this.item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getItem_description() {
        return this.item_description;
    }

    public void setItem_description(String item_description) {
        this.item_description = item_description;
    }

    public String getItem_type() {
        return this.item_type;
    }

    public void setItem_type(String item_type) {
        this.item_type = item_type;
    }

    public DetailItemInvoiceDTO id(int id) {
        setId(id);
        return this;
    }

    public DetailItemInvoiceDTO price(double price) {
        setPrice(price);
        return this;
    }

    public DetailItemInvoiceDTO qty(int qty) {
        setQty(qty);
        return this;
    }

    public DetailItemInvoiceDTO amount(double amount) {
        setAmount(amount);
        return this;
    }

    public DetailItemInvoiceDTO item_id(int item_id) {
        setItem_id(item_id);
        return this;
    }

    public DetailItemInvoiceDTO item_code(String item_code) {
        setItem_code(item_code);
        return this;
    }

    public DetailItemInvoiceDTO item_name(String item_name) {
        setItem_name(item_name);
        return this;
    }

    public DetailItemInvoiceDTO item_description(String item_description) {
        setItem_description(item_description);
        return this;
    }

    public DetailItemInvoiceDTO item_type(String item_type) {
        setItem_type(item_type);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof DetailItemInvoiceDTO)) {
            return false;
        }
        DetailItemInvoiceDTO detailItemInvoiceDTO = (DetailItemInvoiceDTO) o;
        return id == detailItemInvoiceDTO.id && price == detailItemInvoiceDTO.price && qty == detailItemInvoiceDTO.qty && amount == detailItemInvoiceDTO.amount && item_id == detailItemInvoiceDTO.item_id && Objects.equals(item_code, detailItemInvoiceDTO.item_code) && Objects.equals(item_name, detailItemInvoiceDTO.item_name) && Objects.equals(item_description, detailItemInvoiceDTO.item_description) && Objects.equals(item_type, detailItemInvoiceDTO.item_type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, qty, amount, item_id, item_code, item_name, item_description, item_type);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", price='" + getPrice() + "'" +
            ", qty='" + getQty() + "'" +
            ", amount='" + getAmount() + "'" +
            ", item_id='" + getItem_id() + "'" +
            ", item_code='" + getItem_code() + "'" +
            ", item_name='" + getItem_name() + "'" +
            ", item_description='" + getItem_description() + "'" +
            ", item_type='" + getItem_type() + "'" +
            "}";
    }

 
}
