package com.example.et_core.dto;

public record TransactionDto(
            String type,
            Double amount,
            String description,
            String paymentMode,
            String category
){
}

