package com.example.et_core.controller;

import com.example.et_core.dto.CreateTransactionDto;
import com.example.et_core.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/transactions")
@RequiredArgsConstructor
public class TransactionsController {
    private final TransactionService transactionService;

    public ResponseEntity<?> createTransaction(@RequestBody CreateTransactionDto requestBody){
        final var responseBody = transactionService.saveTransaction(requestBody);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(responseBody);
    }
}
