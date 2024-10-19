package com.ibm.flipcustservice.entity;

import java.sql.Date;
import java.util.List;

import com.ibm.flipcustservice.dto.CustOrderDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity
@Data
@Table(name="cust_details")
public class CustDetailsEntity {
	
	@Id  
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	private Long id;
	
	private String firstNmae;

	private String middleName;
	
	private String lastNmae;
	
	private String gender;
	
	private Date dob;
	
	private String email;
	
	private Long phoneNumber;
	
	@Transient
	private List<CustOrderDetails> custOrderData;

	public void setCustOrderData(List<CustOrderDetails> custOrderList) {
		// TODO Auto-generated method stub
		
	}
}
