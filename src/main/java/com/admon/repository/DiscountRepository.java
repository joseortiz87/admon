package com.admon.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.admon.entities.Discount;

public interface DiscountRepository extends PagingAndSortingRepository<Discount, Integer> {

}
