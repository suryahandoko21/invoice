package com.api.invoice.dto;

import java.io.Serializable;
import java.util.Objects;

public class RequestInvoicePaidDTO implements Serializable {
    private String paid_from;
    private String paid_for;
    private String created_by;

    public RequestInvoicePaidDTO() {
    }

    public RequestInvoicePaidDTO(String paid_from, String paid_for, String created_by) {
        this.paid_from = paid_from;
        this.paid_for = paid_for;
        this.created_by = created_by;
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

    public String getCreated_by() {
        return this.created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public RequestInvoicePaidDTO paid_from(String paid_from) {
        setPaid_from(paid_from);
        return this;
    }

    public RequestInvoicePaidDTO paid_for(String paid_for) {
        setPaid_for(paid_for);
        return this;
    }

    public RequestInvoicePaidDTO created_by(String created_by) {
        setCreated_by(created_by);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof RequestInvoicePaidDTO)) {
            return false;
        }
        RequestInvoicePaidDTO requestInvoicePaidDTO = (RequestInvoicePaidDTO) o;
        return Objects.equals(paid_from, requestInvoicePaidDTO.paid_from) && Objects.equals(paid_for, requestInvoicePaidDTO.paid_for) && Objects.equals(created_by, requestInvoicePaidDTO.created_by);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paid_from, paid_for, created_by);
    }

    @Override
    public String toString() {
        return "{" +
            " paid_from='" + getPaid_from() + "'" +
            ", paid_for='" + getPaid_for() + "'" +
            ", created_by='" + getCreated_by() + "'" +
            "}";
    }
}
