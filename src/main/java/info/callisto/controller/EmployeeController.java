package info.callisto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import info.callisto.entity.Employee;
import info.callisto.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	public int saveEmployeeController(Employee employee) {
		return employeeService.saveEmployeeService(employee);
	}
}
