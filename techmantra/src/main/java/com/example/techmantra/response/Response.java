package com.example.techmantra.response;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Response {
    private String message;
    private LocalDate createdDate;

    public Response(String message, LocalDate createdDate) {
        this.message = message;
        this.createdDate = createdDate;
    }
}
