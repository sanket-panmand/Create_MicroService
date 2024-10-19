package com.ibm.fliporderservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ibm.fliporderservice.entity.CustOrderEntity;

@Service
public interface CustOrderService {
	
	public List<CustOrderEntity> getCustOrderByCustId(Long custId);

}
