package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
	List<Customer> findBysScheduledDate(String s_ScheduledDate);
	Customer findById(long id);
}
