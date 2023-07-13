package com.springbcurd.curd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbcurd.curd.customer.Customer;

public interface ProductRepository extends JpaRepository<Customer, Integer>{

}
