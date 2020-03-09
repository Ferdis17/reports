package com.pdfreport.informationreport.service;

import com.pdfreport.informationreport.model.Transaction;
import com.pdfreport.informationreport.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService implements ITransactionService {

    @Autowired
    private TransactionRepository repository;

    @Override
    public List<Transaction> findAll() {

        return (List<Transaction>) repository.findAll();
    }

    public Optional<Transaction> getTransactionById(Long id){

        return repository.findById(id);
    }
}
