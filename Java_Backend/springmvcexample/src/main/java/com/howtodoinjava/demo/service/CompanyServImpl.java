package com.howtodoinjava.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.howtodoinjava.demo.dao.EmployeeDAO;
import com.howtodoinjava.demo.model.EmployeeVO;

@Service  // else u can also use @Component
@Scope("singleton")

public class CompanyServImpl implements CompanyServ {
	@Autowired
	CompanyDAO companyDAO;
	
	public CompanyServImpl(CompanyDAO companyDAO2) {
		this.companyDAO = companyDAO2;
	}

	public CompanyServImpl() {
		
	}

	public void setEmployeeDAO(EmployeeDAO companyDAO) {
		this.companyDAO = companyDAO;
	}

	public List<CompanyVO> getAllCompanies() 
	{
		return companyDAO.getAllCompanies();
	}

}
