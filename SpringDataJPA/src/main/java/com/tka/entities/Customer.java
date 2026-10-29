package com.tka.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Customer {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String cust_name;
	private String email;
	private long mobNo;
	private String city;

}
