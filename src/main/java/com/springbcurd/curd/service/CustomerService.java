package com.springbcurd.curd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springbcurd.curd.customer.Customer;
import com.springbcurd.curd.repository.CustomerRepository;

@Service

public class CustomerService {
	@Autowired
	private CustomerRepository repo;

	public List<Customer> listAll() {
		return repo.findAll();
	}

	public void save(Customer customer) {
		repo.save(customer);
	}

	public void delete(Integer id) {
		repo.deleteById(id);

	}
	public void update( Integer id, Customer customer) {
		repo.save(customer);
		
	}

	public Customer getCustomerById(int id) {
			return repo.findById(id).get();  
	}
	

}
