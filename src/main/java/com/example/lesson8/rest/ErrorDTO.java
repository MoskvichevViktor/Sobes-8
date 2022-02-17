package com.example.lesson8.rest;

import org.hibernate.type.LocalDateTimeType;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

public class ErrorDTO {

    private LocalDateTime timestamp = LocalDateTime.now();

    private String message;

    public ErrorDTO() {
    }

    public ErrorDTO(String message){
        this.timestamp = LocalDateTime.now();
        this.message = message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
