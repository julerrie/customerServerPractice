package com.example.demo;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;

import com.fasterxml.jackson.databind.ObjectMapper;



@SpringBootApplication
public class DemoApplication{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Bean
	public CommandLineRunner loadData(CustomerRepository repository) {
		return (arg) -> {
			// TODO Auto-generated method stub
			ObjectMapper objectMapper = new ObjectMapper();
			try {
				
				InputStream inputStream =  this.getClass().getResourceAsStream("/customer.json");
				List <Customer> newCustomers = Arrays.asList(objectMapper.readValue(inputStream, Customer[].class));
				for (Customer customer : newCustomers) {
					repository.save(customer);
					System.out.print(customer.getS_ScheduledDate());
				}
			} catch (IOException e) {
		        e.printStackTrace();
			}
		};
	}
}