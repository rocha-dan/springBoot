package com.example.controller;

import java.util.List;

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
import com.example.model.Photo;
import com.example.service.EmployeeService;
import com.example.service.PhotoService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private PhotoService photoService;
	

	@GetMapping("/site")
	public String site(Model model) {
		model.addAttribute("employee", new Employee());
		return "site";
	}

	@GetMapping("/photos")
	public String photos(Model model) {
		model.addAttribute("employee", new Employee());
		return "photos";
	}
	
	@GetMapping("/")
	public String photos2(Model model) {
		List<Photo> photos = photoService.getAllPhotos();
		model.addAttribute("photos", photos);
		return "photos2";
	}
	
	@GetMapping("/about")
	public String about(Model model) {
		model.addAttribute("employee", new Employee());
		return "about";
	}

	@GetMapping("/contact")
	public String contact(Model model) {
		model.addAttribute("employee", new Employee());
		return "contact";
	}

	@PostMapping("/employee2")
	public String addEmployee2(Employee emp) {
		employeeService.saveEmployee(emp);
		return "redirect:/";
	}

	@GetMapping("/newPhoto")
	public String newPhoto(Model model) {
		model.addAttribute("photo", new Photo());
		return "addPhoto";
	}
	
	@PostMapping("/newPhoto")
	public String addPhoto(Photo e) {
		photoService.savePhoto(e);
		return "redirect:/photos2";
	}
}