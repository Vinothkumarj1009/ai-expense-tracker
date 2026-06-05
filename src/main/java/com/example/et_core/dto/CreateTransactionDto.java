package com.example.et_core.dto;

public record CreateTransactionDto(
            String type,
            Double amount,
            String description,
            String paymentModeId,
            String categoryId,
            String accountId
){
}

