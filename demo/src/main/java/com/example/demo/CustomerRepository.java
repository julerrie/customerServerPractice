package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
	List<Customer> findBysScheduledDate(String s_ScheduledDate);
	@Query("select c from Customer c where c.sScheduledDate=?1 AND c.sGasSecchi=?2 AND c.sGouBan=?3")
	Customer findByCustomerId(String s_ScheduledDate, String s_GasSecchi, String s_GouBan);
	Customer findById(long id);
}
