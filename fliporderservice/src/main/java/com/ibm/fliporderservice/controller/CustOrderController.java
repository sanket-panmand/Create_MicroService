package com.ibm.fliporderservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.fliporderservice.entity.CustOrderEntity;
import com.ibm.fliporderservice.service.CustOrderService;

@RestController
@RequestMapping("/order")
public class CustOrderController {
	
	@Autowired
	private CustOrderService custOrderService;
	
	@GetMapping("/order-details/{custId}")
	public List<CustOrderEntity> getCustOrderDetailsByCustId(@PathVariable Long custId){
		List<CustOrderEntity> custOrderData = custOrderService.getCustOrderByCustId(custId);
		return custOrderData;
			}

}
