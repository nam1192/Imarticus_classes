
package com.howtodoinjava.demo.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.howtodoinjava.demo.model.EmployeeVO;

@Controller
@RequestMapping("/Comp")
public class CompanyController {



@RequestMapping(value = "/complist", method = RequestMethod.GET)
public String testHello(Model model)
{

model.addAttribute("NAME1","IBM");
model.addAttribute("NAME2","Cognizant");
model.addAttribute("NAME3","TCS");

return "complist";
}

}



package com.howtodoinjava.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.howtodoinjava.demo.dao.CompanyDao;
import com.howtodoinjava.demo.model.CompanyVo;
import com.howtodoinjava.demo.model.EmployeeVO;
import com.howtodoinjava.demo.service.CompanyManager;

@Controller
@RequestMapping("/Comp")
public class CompanyController {
	
	@Autowired
	CompanyManager companyManager;
	
	@RequestMapping(value = "/getAllCompanyNames", method = RequestMethod.GET)
	public String getAllCompanyName(Model model)
	{
		List<CompanyVo> compList=companyManager.getAllCompanyNames();
		model.addAttribute("companies",compList );
		model.addAttribute("name","Namratha");
		model.addAttribute("title","student");
		return "companyListDisplay";
	}

}