package com.marticus.employees.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marticus.employees.vo.EmployeesVO;
import com.marticus.employees.service.EmployeesService;


@Controller
@RequestMapping("/mvc-controller")
public class RestDataValue {
	
	@Autowired
	EmployeesService employeesService;
	
	@GetMapping("/")
	public String getALl(Model model)
	{

		List<EmployeesVO> responseList = employeesService.getAllRestData();
		model.addAttribute("list", responseList);
		return "getEmpList.jsp";
	}
	
	
	
	
}

