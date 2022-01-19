package com.marticus.employees.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.marticus.employees.entity.EmployeesEntity;
import com.marticus.employees.repo.EmployeesRepo;
import com.marticus.employees.vo.EmployeesVO;
import com.marticus.employees.vo.ProjectVO;
import com.marticus.employees.vo.TechnologyVO;



@Service
public class EmployeesService {
	
	@Autowired
	EmployeesRepo employeesRepo;

	@Autowired
	RestTemplate template;
	
	@Autowired
	ProjectVO projectVO;
	
	@Autowired
	TechnologyVO technologyVO;
	
	
	


	public List<EmployeesEntity> getAll() {
		
		return employeesRepo.findAll();
	}

	public EmployeesEntity getEmpById(int id) {
		return employeesRepo.findEmployeeById(id);
		
	}

	public EmployeesEntity getEmpByEmpId(int empId) {
		return employeesRepo.findEmployeeByEmpId(empId);
	}

	public EmployeesEntity getEmpByProjectId(int id) {
		return employeesRepo.findEmployeesByProjectId(id);
	}

	public EmployeesEntity save(EmployeesEntity employeesEntity) {
		return employeesRepo.save(employeesEntity);
	}

	public String getRestDataForSingleOne(int id) {
		EmployeesEntity employees = employeesRepo.findEmployeeByEmpId(id);
		String projectUrl= "http://localhost:9001/projects/"+id;
		projectVO = template.getForObject(projectUrl, ProjectVO.class);
		if(projectVO != null)
		{
			String techUrl =  "http://localhost:9002/tech/"+projectVO.getTechId();
			technologyVO = template.getForObject(techUrl, TechnologyVO.class);
		}
		String response = employees.getEmpId()+" | "+employees.getEmpName()+ " | "+projectVO.getProjectName()+" | "+technologyVO.getName();
		return response;
		
	}
	public List<EmployeesVO> getAllRestData() {
		List<EmployeesEntity> empList = employeesRepo.findAll();
		 
		List<EmployeesVO> empdata= new ArrayList<EmployeesVO>();
				
		for(EmployeesEntity employees : empList)
		{
			EmployeesVO emp=new EmployeesVO();
			emp.setEmpName(employees.getEmpName());
			emp.setEmpId(employees.getEmpId());
			
			String projectUrl= "http://localhost:9001/projects/"+employees.getProjectId();
			projectVO = template.getForObject(projectUrl, ProjectVO.class);
			if(projectVO != null)
			{
				String techUrl =  "http://localhost:9002/tech/"+projectVO.getTechId();
				technologyVO = template.getForObject(techUrl, TechnologyVO.class);
			    emp.setProjectName(projectVO.getProjectName());
			    if(null!=technologyVO)
			    {
			    	emp.setTechnology(technologyVO.getName());
			    }
			}
			
			empdata.add(emp);
			//String responseString = employee.getEmpName()+ " | "+projectVO.getProjectName()+" | "+technologyVO.getName()+"\n";
		
			//responseList.add(responseString);
		}
		return empdata;
		
	}


}
