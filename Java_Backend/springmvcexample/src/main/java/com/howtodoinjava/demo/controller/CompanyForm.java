package com.howtodoinjava.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.howtodoinjava.demo.model.Company;
import com.howtodoinjava.demo.model.Student;

@Controller
@RequestMapping("/Comp")
public class CompanyForm {
	
	@RequestMapping(value = "/getAllCompanies", method = RequestMethod.GET)
	public ModelAndView getAllEmployees()
	{
		return new ModelAndView("compformreg", "company", new Company());
	}
	@RequestMapping(value = "/getAllCompany1", method = RequestMethod.GET)
	public String getAllEmployees_new(Model m)
	{
		//System.out.println(propertyFileConfiguration.getTestProperty());
		//  return new ModelAndView("studentreg", "student", new Student());
		
		m.addAttribute("compformreg",new Company());
		
		return "compformreg";
	}
	@RequestMapping(value = "/showerror", method = RequestMethod.GET)
	public String showerror(Model m)
	{
		//System.out.println(propertyFileConfiguration.getTestProperty());
		//  return new ModelAndView("studentreg", "student", new Student());
		
		m.addAttribute("compformreg",new Company());
		
		return "compformreg";
	}
	@RequestMapping(value = "/showdashboard", method = RequestMethod.GET)
	public String showDashBoard(Model m)
	{
		//System.out.println(propertyFileConfiguration.getTestProperty());
		//  return new ModelAndView("studentreg", "student", new Student());
		
		m.addAttribute("compformreg",new Company());
		
		return "compformreg";
	}
	@RequestMapping(value = "/addCompany", method = RequestMethod.POST)
	public String addCompany(@ModelAttribute("company")Company company, 
			   ModelMap model) {
		model.addAttribute("id", company.getId());
		model.addAttribute("Company_name", company.getCompanyName());
		return "compform";
	      

}
}