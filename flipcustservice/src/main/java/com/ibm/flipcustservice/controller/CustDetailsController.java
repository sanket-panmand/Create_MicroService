package com.ibm.flipcustservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ibm.flipcustservice.dto.CustOrderDetails;
import com.ibm.flipcustservice.entity.CustDetailsEntity;
import com.ibm.flipcustservice.service.CustDetailsService;

@RestController
@RequestMapping("/customer")
public class CustDetailsController{
	

	@Autowired
	private CustDetailsService custDetailsService;
	
	@Autowired
	private RestTemplate restTemplate;	

//	@GetMapping("/cust-details")
//	public ResponseEntity<CustDetailsEntity> getCustDetailsById(@RequestParam Long custId){
//		CustDetailsEntity custData = custDetailsService.getCustDetailsById(custId);
	
	@GetMapping("/cust-details/{custId}")
	public ResponseEntity<CustDetailsEntity> getCustDetailsById(@PathVariable Long custId){
		CustDetailsEntity custData = custDetailsService.getCustDetailsById(custId);
		
		// call to get order details against cust
		List<CustOrderDetails> custOrderList = 
				restTemplate.getForObject("http://order-service/order/order-details"+ custId, List.class);
		
		custData.setCustOrderData(custOrderList);
		return new ResponseEntity<>(custData, HttpStatus.OK);
	}

}