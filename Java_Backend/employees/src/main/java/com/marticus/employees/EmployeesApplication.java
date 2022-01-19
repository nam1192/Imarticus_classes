package com.marticus.employees;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.marticus.employees.vo.EmployeesVO;
import com.marticus.employees.vo.ProjectVO;
import com.marticus.employees.vo.TechnologyVO;


@SpringBootApplication
public class EmployeesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeesApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
	
	@Bean
	public ProjectVO projectVO()
	{
		return new ProjectVO();
	}
	
	@Bean
	public TechnologyVO technologyVO()
	{
		return new TechnologyVO();
	}
	@Bean
	public EmployeesVO employeeVO()
	{
		return new EmployeesVO();
	}
	
}
