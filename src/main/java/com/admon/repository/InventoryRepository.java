package com.admon.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.admon.entities.Inventory;

public interface InventoryRepository extends PagingAndSortingRepository<Inventory, Integer>{

}
