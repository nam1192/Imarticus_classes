package com.marticus.customer.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marticus.customer.entity.CustomerEntity;

@Repository
public interface CustomerRepo extends JpaRepository<CustomerEntity, Integer> {

	CustomerEntity findCustomerById(int id);

	CustomerEntity findCustomerByName(String name);

	List<CustomerEntity> findCustomerByNameContaining(String name);

	List<CustomerEntity> findCustomerByNameAndAge(String name, int custAge);


	
	
	

}
