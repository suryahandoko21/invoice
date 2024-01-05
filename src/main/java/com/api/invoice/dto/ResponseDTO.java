package com.api.invoice.dto;

import java.io.Serializable;
import java.util.Objects;

public class ResponseDTO implements Serializable {
    private int statusCode;
    private String message;

    public ResponseDTO() {
    }

    public ResponseDTO(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResponseDTO statusCode(int statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    public ResponseDTO message(String message) {
        setMessage(message);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ResponseDTO)) {
            return false;
        }
        ResponseDTO responseDTO = (ResponseDTO) o;
        return statusCode == responseDTO.statusCode && Objects.equals(message, responseDTO.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusCode, message);
    }

    @Override
    public String toString() {
        return "{" +
            " statusCode='" + getStatusCode() + "'" +
            ", message='" + getMessage() + "'" +
            "}";
    }
}
