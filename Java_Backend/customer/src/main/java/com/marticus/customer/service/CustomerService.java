package com.marticus.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.marticus.customer.Repo.CustomerRepo;
import com.marticus.customer.entity.CustomerEntity;
import com.marticus.customer.security.JWTAuthorizationFilter;
import com.marticus.customer.utility.JwtToken;

@Service
public class CustomerService {

	@Autowired
	CustomerRepo customerRepo;
	
	
	public void saveCustomer(CustomerEntity customerEntity) {
		// TODO Auto-generated method stub
		customerRepo.save(customerEntity);
	}
		
	
	public CustomerEntity findCustomerById(int id)
	{
		return customerRepo.findCustomerById(id);
		
	}


	public CustomerEntity findCustomerByName(String name) {
		// TODO Auto-generated method stub
		return customerRepo.findCustomerByName(name);
	}


	public List<CustomerEntity> findAllCustomer() {
		// TODO Auto-generated method stub
		return customerRepo.findAll(Sort.by(Sort.Direction.ASC,"name"));
	}


	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		CustomerEntity customerEntity=customerRepo.getById(id);
		if(customerEntity!=null)
		{
			customerRepo.delete(customerEntity);
			return true;
		}
		return false;
		
	}


	public CustomerEntity update(CustomerEntity customerEntity) {
		// TODO Auto-generated method stub
		CustomerEntity entityInPersistState = customerRepo.findCustomerById(customerEntity.getId());
		entityInPersistState.setName(customerEntity.getName());
		entityInPersistState.setAge(customerEntity.getAge());
		customerRepo.save(entityInPersistState);
		return entityInPersistState;
	}


	public List<CustomerEntity> findCustomerByNameContaining(String name) {
		return customerRepo.findCustomerByNameContaining(name);
	}


	public List<CustomerEntity> findCustomerByNameAndAge(String name, int custAge) {
		// TODO Auto-generated method stub
		return customerRepo.findCustomerByNameAndAge(name,custAge);
	}


	
	///overWriting the customer object itself
//	public CustomerEntity update(CustomerEntity customerEntity) {
//		// TODO Auto-generated method stub
//		customerRepo.save(customerEntity);
//		return customerEntity;
//	}
	
	
	
}
