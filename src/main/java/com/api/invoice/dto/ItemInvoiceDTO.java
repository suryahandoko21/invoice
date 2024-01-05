package com.api.invoice.dto;
import java.io.Serializable;
import java.util.Objects;

public class ItemInvoiceDTO implements Serializable{
    private int qty;
    private double price;
    private Long item_id;

    public ItemInvoiceDTO() {
    }

    public ItemInvoiceDTO(int qty, double price, Long item_id) {
        this.qty = qty;
        this.price = price;
        this.item_id = item_id;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Long getItem_id() {
        return this.item_id;
    }

    public void setItem_id(Long item_id) {
        this.item_id = item_id;
    }

    public ItemInvoiceDTO qty(int qty) {
        setQty(qty);
        return this;
    }

    public ItemInvoiceDTO price(double price) {
        setPrice(price);
        return this;
    }

    public ItemInvoiceDTO item_id(Long item_id) {
        setItem_id(item_id);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ItemInvoiceDTO)) {
            return false;
        }
        ItemInvoiceDTO itemInvoiceDTO = (ItemInvoiceDTO) o;
        return qty == itemInvoiceDTO.qty && price == itemInvoiceDTO.price && Objects.equals(item_id, itemInvoiceDTO.item_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(qty, price, item_id);
    }

    @Override
    public String toString() {
        return "{" +
            " qty='" + getQty() + "'" +
            ", price='" + getPrice() + "'" +
            ", item_id='" + getItem_id() + "'" +
            "}";
    }

   
}
