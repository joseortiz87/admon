package com.admon.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.admon.entities.Product;

public interface ProductRepository extends PagingAndSortingRepository<Product,Integer>{

}
