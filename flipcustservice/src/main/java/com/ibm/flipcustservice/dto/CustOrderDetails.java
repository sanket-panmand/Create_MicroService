package com.ibm.flipcustservice.dto;

import java.sql.Date;
import lombok.Data;

@Data
public class CustOrderDetails {

	private Long id;
	
	private Date orderDate;
	
	private String orderName;
	
	private int quantity;
	
	private int price;
	
	private String address;
	
	private long custId;
	
	
	
}



