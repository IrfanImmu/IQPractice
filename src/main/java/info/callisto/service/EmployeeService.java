package info.callisto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.callisto.dao.EmployeeDao;
import info.callisto.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	public int saveEmployeeService(Employee employee) {
		Float salary = employee.getSalary();
		Float taxamount=(salary*30)/100;
		Float netsalary=salary-taxamount;
		employee.setSalary(netsalary);
		
		return employeeDao.saveEmployee(employee);
	}
}
