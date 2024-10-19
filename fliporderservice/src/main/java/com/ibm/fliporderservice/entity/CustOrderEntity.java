package com.ibm.fliporderservice.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "cust_order")
@Data
public class CustOrderEntity {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	
	private Date orderDate;
	
	private String orderName;
	
	private int quantity;
	
	private int price;
	
	private String address;
	
	private long custId;
}
