package com.tcs.controlller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.entity.Employee;

@RestController
public class EmployeeController {
	
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		final List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("1", "Sahin - 1", 25, "9836125471"));
		employees.add(new Employee("2", "Sahin - 2", 26, "9836125472"));
		employees.add(new Employee("3", "Sahin - 3", 27, "9836125473"));
		employees.add(new Employee("4", "Sahin - 4", 28, "9836125474"));
		employees.add(new Employee("5", "Sahin - 5", 29, "9836125475"));
		
		return employees;
	}

}
