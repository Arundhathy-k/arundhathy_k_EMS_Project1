package com.gl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gl.bean.Employee;
import com.gl.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService eService;
	
	@RequestMapping("/")
	public String goToIndexPage() {
		return "index";
	}
	
	@RequestMapping("/add")
	public String addEmployee(Model model) {
		model.addAttribute("emp", new Employee());
		return "addEmp";
	}
	
	@RequestMapping("/addEmployee")
	public String saveEmployee(@ModelAttribute("emp") Employee emp) {
		eService.addEmployee(emp);
		return "redirect:/list";
	}
	
	@RequestMapping("/list")
	public String goToListOfEmployee(Model model) {
		List<Employee> list =eService.getEmployeeList();
		model.addAttribute("list", list);
		return "home";
	}
	
	@RequestMapping("/deleteEmp")
	public String goToDeleteById(@RequestParam("id") int id) {
		eService.deleteEmployee(id);
		return "redirect:/list";
	}
	
	@RequestMapping("/updateForm")
	public String goToupdateById(@RequestParam("id") int id,Model model) {
		Employee e= eService.getEmployeeById(id);
		model.addAttribute("emp", e);
		return "updateEmp";
	}
	
	
	@RequestMapping("/updateEmployee")
	public String goToupdateEmployee(@ModelAttribute("emp") Employee emp){
		int id=emp.getId();
		eService.updateEmployee(emp, id);
		return "redirect:/list";
	}

}
