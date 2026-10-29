package com.tka.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.CustomerRepo;
import com.tka.entities.Customer;

@Service
public class CustomerService {

	@Autowired
	CustomerRepo repo;

	public String insertData(Customer c) {
		repo.save(c);
		return "inserted ...!";
	}

	public String deleteData(int id) {
		repo.deleteById(id);
		return "deleted...!";
	}

	public Optional<Customer> getSingleData(int id) {
//		return repo.getById(id);
		return repo.findById(id);
	}

	public List<Customer> getAll() {
		return repo.findAll();
	}

	public String updateData(Customer c, int id) {
		Customer c1 = repo.getById(id);
		c1.setCust_name(c.getCust_name());
		c1.setCity(c.getCity());
		c1.setEmail(c.getEmail());
		c1.setMobNo(c.getMobNo());
		repo.save(c1);
		return "updated ...!";
	}
}
