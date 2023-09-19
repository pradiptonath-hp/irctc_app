package com.ashokit.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ashokit.binding.Employee;
import com.ashokit.service.EmployeeService;

import jakarta.validation.Valid;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	@GetMapping("/")
	public String loadForm(Model model) {
		model.addAttribute("employee",new Employee());
		return "form";
	}
	@PostMapping("/save")
	public String saveForm(@Valid Employee employee, BindingResult result,Model model,RedirectAttributes redirectAttributes ) {
		
		System.out.println(employee);
		if(result.hasErrors()) { //if this condition has satisfied that means form validation is failed
			return "form";
		}
		
		boolean saveData = empService.saveData(employee);
		if(saveData) {
	        redirectAttributes.addFlashAttribute("msg", "Data is saved!"); //
		}
		return "redirect:/empCreationSuccess";//POST REQUEST GET Design pattern to handle duplicate form submission
	}	
		
	@GetMapping("/empCreationSuccess")
	public String empCreationSuccess(Model model) {
		model.addAttribute("employee",new Employee());
		return "form";	
	}	
	@GetMapping("/viewAll")
	public String getAllEmployees(Model model) {
		List<Employee> allUsers = empService.getAllEmployees();
		model.addAttribute("employee",allUsers);
		return "employee-list";
	}	
	@GetMapping("/edit/{empId}")
	public String editEmployee(@PathVariable("empId")Integer empId,Model model) {
		Employee employee = empService.findById(empId);
		model.addAttribute("employee",employee);
		return "edit-employee";
	}
	@PostMapping("/updateEmployee")
	public String updateEmployee(@ModelAttribute Employee employee) {
	    empService.updateEmployee(employee);
	    return "redirect:/viewAll"; // Redirect to the employee list page
	}

}
