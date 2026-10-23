package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.tka.entities.Employee;
import com.tka.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@PostMapping("/insert")
	public String insertData(@RequestBody Employee e) {
		String msg = service.insertData(e);
		return msg;
	}

	@DeleteMapping("/dlt/{id}")
	public String deleteData(@PathVariable int id) {
		String msg = service.deleteData(id);
		return msg;
	}

	@GetMapping("/singleone")
	public Employee getSingleData(@RequestParam int id) {
		Employee emp = service.getSingleData(id);
		return emp;
	}

	@GetMapping("/getAll")
	public List<Employee> getAllRecord() {
		List<Employee> list = service.getAllRecord();
		return list;
	}

	@PutMapping("/update/{id}")
	public String updateData(@RequestBody Employee e,@PathVariable int id) {
		String msg = service.updateData(e,id);
		return msg;
	}
}
