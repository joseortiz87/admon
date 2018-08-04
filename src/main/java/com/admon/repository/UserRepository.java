package com.admon.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.admon.entities.User;

public interface UserRepository extends PagingAndSortingRepository<User,Integer>{

}
