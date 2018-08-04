package com.admon.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.admon.entities.Payment;

public interface PaymentRepository extends PagingAndSortingRepository<Payment,Integer>{

}
