package com.example.et_core.service;

import com.example.et_core.dto.CreateTransactionDto;
import com.example.et_core.dto.TransactionDto;


public interface TransactionService {
    TransactionDto saveTransaction(CreateTransactionDto requestBody);
}
