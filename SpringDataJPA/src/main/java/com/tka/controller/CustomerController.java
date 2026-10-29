package com.tka.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entities.Customer;
import com.tka.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService service;

	@PostMapping("/add")
	public String insertData(@RequestBody Customer c) {
		return service.insertData(c);
	}

	@PutMapping("/update/{id}")
	public String updateData(@RequestBody Customer c, @PathVariable int id) {
		return service.updateData(c, id);
	}

	@DeleteMapping("/dlt/{id}")
	public String deleteData(@PathVariable int id) {
		return service.deleteData(id);
	}

	@GetMapping("/getall")
	public List<Customer> getAll() {
		return service.getAll();
	}

	@GetMapping("/getbyId/{id}")
	public Optional<Customer> getSinleData(@PathVariable int id) {
		return service.getSingleData(id);
	}

}
