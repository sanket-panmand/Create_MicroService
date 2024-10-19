package com.ibm.flipcustservice.service;

import org.springframework.stereotype.Service;

import com.ibm.flipcustservice.entity.CustDetailsEntity;

@Service
public interface CustDetailsService {

	public CustDetailsEntity getCustDetailsById(Long custId);
}
