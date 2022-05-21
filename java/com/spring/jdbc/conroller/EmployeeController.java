package com.spring.jdbc.conroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.spring.jdbc.model.Employee;
import com.spring.jdbc.service.EmployeeServiceImpl;


@Controller
public class EmployeeController {

	@Autowired
	EmployeeServiceImpl employeeServiceImpl;
	
	@PostMapping("/addEmployeeByMap")
	public Boolean addEmployeeByMap(@RequestBody List<Employee> emp){
		employeeServiceImpl.addEmployeeByMap(emp);
		return true;
	}
	@PostMapping("/addEmployeeByMSPS")
	public Boolean addEmployeeDetailsMSPS(@RequestBody List<Employee> employeeList) {
		employeeServiceImpl.addEmployeeDetailsMSPS(employeeList);		
		return true;
	}
	
	@PostMapping("/addEmployeeByBatch")
	public Boolean addEmployeeByBatch(@RequestBody List<Employee> employeeList) {
		employeeServiceImpl.addEmployeeByBatch(employeeList);		
		return true;
	}
}
