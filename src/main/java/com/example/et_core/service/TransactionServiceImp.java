package com.example.et_core.service;

import com.example.et_core.dto.CreateTransactionDto;
import com.example.et_core.dto.TransactionDto;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImp implements TransactionService{

    @Override
    public TransactionDto saveTransaction(CreateTransactionDto requestBody) {
        return null;
    }
}
