package com.ibm.fliporderservice.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibm.fliporderservice.entity.CustOrderEntity;
import com.ibm.fliporderservice.repository.CustOrderRepository;
import com.ibm.fliporderservice.service.CustOrderService;

@Component
public class CustOrderServiceImpl implements CustOrderService {

	@Autowired
	private CustOrderRepository custOrderRepository;
	
	@Override
	public List<CustOrderEntity> getCustOrderByCustId(Long custId) {
		return custOrderRepository.findByCustId(custId);
	}

}
