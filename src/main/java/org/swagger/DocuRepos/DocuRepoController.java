package org.swagger.DocuRepos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class DocuRepoController {
	
	
	//@Autowired
	EmployeeService employeeService;
	
	
	//@PostMapping("/create")
	public void addEmployee(Employee employee) {
		
		
		
		
	}
	
	//@GetMapping("/get/{id}")
	public void getEmployee(Employee employee) {
		
		
		
		
	}
	
	//@GetMapping("/get")
	public void getAllEmployee() {
		
		
		
		
	}
	
	//@PutMapping("/update")
	public void updateEmployee(Employee employee) {
		
		
		
		
	}
	
	//@PatchMapping("/miniupdate")
	public void updatePatchEmployee(Employee employee) {
		
		
		
		
	}

}
