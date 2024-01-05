package com.api.invoice.dto;
import java.util.Objects;

public class ItemInvoiceUpdateDTO {
    private int id;
    private int qty;
    private double price;
    private Long item_id;

    public ItemInvoiceUpdateDTO() {
    }

    public ItemInvoiceUpdateDTO(int id, int qty, double price, Long item_id) {
        this.id = id;
        this.qty = qty;
        this.price = price;
        this.item_id = item_id;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
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

    public ItemInvoiceUpdateDTO id(int id) {
        setId(id);
        return this;
    }

    public ItemInvoiceUpdateDTO qty(int qty) {
        setQty(qty);
        return this;
    }

    public ItemInvoiceUpdateDTO price(double price) {
        setPrice(price);
        return this;
    }

    public ItemInvoiceUpdateDTO item_id(Long item_id) {
        setItem_id(item_id);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ItemInvoiceUpdateDTO)) {
            return false;
        }
        ItemInvoiceUpdateDTO itemInvoiceUpdateDTO = (ItemInvoiceUpdateDTO) o;
        return id == itemInvoiceUpdateDTO.id && qty == itemInvoiceUpdateDTO.qty && price == itemInvoiceUpdateDTO.price && Objects.equals(item_id, itemInvoiceUpdateDTO.item_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, qty, price, item_id);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", qty='" + getQty() + "'" +
            ", price='" + getPrice() + "'" +
            ", item_id='" + getItem_id() + "'" +
            "}";
    }
}
