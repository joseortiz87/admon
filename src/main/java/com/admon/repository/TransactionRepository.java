package com.admon.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.admon.entities.Transaction;

public interface TransactionRepository extends PagingAndSortingRepository<Transaction,Integer>{

}
