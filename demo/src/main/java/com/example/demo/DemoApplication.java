package com.example.demo;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class DemoApplication{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Bean
	public CommandLineRunner loadData() {
		return (arg) -> {
			// TODO Auto-generated method stub
			ObjectMapper objectMapper = new ObjectMapper();
			JSONParser parser = new JSONParser();
			try (Reader reader = new FileReader("src/main/resources/customer.json")){
				JSONObject jsonObject = (JSONObject) parser.parse(reader);
		        System.out.println(jsonObject);
			} catch (IOException e) {
		        e.printStackTrace();
		    }
//			try {
//				File file = new File(
//				        this.getClass().getClassLoader().getResource("src/main/resources/customer.json").getFile()
//				    );
//				Customer newCustomer = objectMapper.readValue(file, Customer.class);
//				System.out.println(newCustomer);
//			} catch (IOException e) {
//		        e.printStackTrace();
//			}
		};
	}
}