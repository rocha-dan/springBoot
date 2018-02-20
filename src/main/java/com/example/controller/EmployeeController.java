package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.Employee;
import com.example.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	 @GetMapping("/")
	    public String greetingForm(Model model) {
	        model.addAttribute("employee", new Employee());
	        return "index";
	    }
	 
	 @PostMapping("/employee2")
	    public String addEmployee2(Employee emp){
		 employeeService.saveEmployee(emp);
	    	return "redirect:/";
	    }

}
