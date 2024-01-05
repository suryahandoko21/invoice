package com.api.invoice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Entity
// @Table(name="iteminvoice")
public class ItemInvoice implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="qty")
    private int qty;

    @Column(name="price")
    private double price;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    @ManyToOne
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;

    public ItemInvoice() {
    }

    public ItemInvoice(Long id, int qty, double price, Item item, Invoice invoice) {
        this.id = id;
        this.qty = qty;
        this.price = price;
        this.item = item;
        this.invoice = invoice;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
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

    public Item getItem() {
        return this.item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Invoice getInvoice() {
        return this.invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public ItemInvoice id(Long id) {
        setId(id);
        return this;
    }

    public ItemInvoice qty(int qty) {
        setQty(qty);
        return this;
    }

    public ItemInvoice price(double price) {
        setPrice(price);
        return this;
    }

    public ItemInvoice item(Item item) {
        setItem(item);
        return this;
    }

    public ItemInvoice invoice(Invoice invoice) {
        setInvoice(invoice);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ItemInvoice)) {
            return false;
        }
        ItemInvoice itemInvoice = (ItemInvoice) o;
        return Objects.equals(id, itemInvoice.id) && qty == itemInvoice.qty && price == itemInvoice.price && Objects.equals(item, itemInvoice.item) && Objects.equals(invoice, itemInvoice.invoice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, qty, price, item, invoice);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", qty='" + getQty() + "'" +
            ", price='" + getPrice() + "'" +
            ", item='" + getItem() + "'" +
            ", invoice='" + getInvoice() + "'" +
            "}";
    }
}
