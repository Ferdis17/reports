package com.pdfreport.informationreport.service;

import com.pdfreport.informationreport.model.Transaction;

import java.util.List;

public interface ITransactionService {

    List<Transaction> findAll();
}
