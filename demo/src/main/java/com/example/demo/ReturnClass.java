package com.example.demo;

import java.util.List;

public class ReturnClass {
	private String message;
	private List<Customer> results;
	private String status;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<Customer> getResults() {
		return results;
	}
	public void setResults(List<Customer> results) {
		this.results = results;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
