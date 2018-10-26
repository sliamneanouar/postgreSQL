package com.example.demo.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.customer.Customer;


public interface CustomerRepository extends CrudRepository<Customer, Long>{
	List<Customer> findByLastName(String lastName);
}