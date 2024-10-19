package com.ibm.flipcustservice.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibm.flipcustservice.entity.CustDetailsEntity;
import com.ibm.flipcustservice.repository.CustDetailsRepository;
import com.ibm.flipcustservice.service.CustDetailsService;

@Component
public class CustDetaisServiceImpl implements CustDetailsService {
	
	@Autowired
	public CustDetailsRepository custDetailsRepository; 


	@Override
	public CustDetailsEntity getCustDetailsById(Long custId) {
		CustDetailsEntity custDetailsData =custDetailsRepository.findCustDataById(custId);
		return custDetailsData;
	}

}
