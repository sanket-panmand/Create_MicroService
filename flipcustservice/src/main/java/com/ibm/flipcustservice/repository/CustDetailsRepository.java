package com.ibm.flipcustservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ibm.flipcustservice.entity.CustDetailsEntity;

@Repository
public interface CustDetailsRepository extends JpaRepository<CustDetailsEntity, Long>{

	 // Native SQL query using the @Query annotation
	//@Query(value ="SELECT * FROM cust_details where id = :custId",nativeQuery = true)
	public CustDetailsEntity findCustDataById(@Param("custId") Long custId);

}