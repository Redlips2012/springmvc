package com.example.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.springmvc.entity.Employee;
import com.example.springmvc.service.EmployeeService;

//@RestController
@Controller
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@GetMapping("/employee")
	public String showEmployee() {

		return "employee";

	}

	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute Employee employee, Model model) {
	
		return "employee";

	}

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
			Model model) {
		model.addAttribute("name");
		return "greeting";
	}
}
