package com.ibm.fliporderservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.fliporderservice.entity.CustOrderEntity;

@Repository
public interface CustOrderRepository extends JpaRepository <CustOrderEntity, Long>{
	
	public List<CustOrderEntity> findByCustId(Long custId); //here findByCustId --> CustId is field created in entity class only C capital

}
