package com.grable.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.grable.demo.service.EmployeeService;

@Controller
@RequestMapping("employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("list")
	public String list(Model model){
		model.addAttribute("entitys", employeeService.list());
		return "employee/list";
	}
	
	
	
	

}
