package com.admon.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.admon.entities.Address;

public interface AddressRepository extends PagingAndSortingRepository<Address, Integer> {

}
