package com.spring.jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.jdbc.entity.Employee;
import com.spring.jdbc.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	//*********************************** INSERT OPERATION ***************************************

		//---------------------------- Single Employee Record -----------------------------------
	@PostMapping("/addEmployeeDetailsByMap")
	public Boolean addEmployeeDetailsUsingMap(@RequestBody Employee employee) {
		employeeService.addEmployeeDetailsUsingMap(employee);
		return true;
	}

	@PostMapping("/addEmployeeDetailsByMap")
	public Boolean addEmployeeDetailUsingSqlParameter(@RequestBody Employee employee) {
		employeeService.addEmployeeDetailsUsingSqlParamter(employee);
		return true;
	}

	@PostMapping("/addEmployeesDetailsUsingMap")
	public Boolean addEmployeesDetailsUsingMap(@RequestBody List<Employee> employeeList) {
		employeeService.addEmployeesDetailsUsingMap(employeeList);
		return true;
	}
	
	//---------------------------- Multiple Employee Record -----------------------------------


	@PostMapping("/addEmployeesDetailsUsingSqlParameter")
	public Boolean addEmployeesDetailsUsingSqlParameter(@RequestBody List<Employee> employeeList) {
		employeeService.addEmployeesDetailsUsingSqlParameter(employeeList);
		return true;
	}
	
	@PostMapping("/addEmployeeDetailsUsingBeanPropertySqlParameterSource") 
	public Boolean addEmployeeDetailsUsingBeanPropertySqlParameterSource(Employee employee) {
		employeeService.addEmployeeDetailsUsingBeanPropertySqlParameterSource(employee);
		return true;
		
	}
	
	
	//********************************************* UPDATE OPERATION ***************************************************

	
		//---------------------------- Single Employee Record -----------------------------------

	@PutMapping("/updateEmployeeDetailsUsingMap")
	public Boolean updateEmployeeDetailsUsingMap(@RequestBody Employee employee, @PathVariable Long employeeId) {
		return employeeService.updateEmployeeDetailsUsingMap(employee, employeeId);
	}
	
	@PutMapping("/updateEmployeeDetailsUsingSqlParameterSource")
	public Boolean updateEmployeeDetailsUsingSqlParameterSource(@RequestBody Employee employee, @PathVariable Long employeeId) {
		return employeeService.updateEmployeeDetailsUsingSqlParamterSource(employee, employeeId);
	}
	
	@PutMapping("/updateEmployeeDetailsUsinBeanPropertySqlParameterSource")
	public Boolean updateEmployeeDetailsUsingBeanPropertySqlParameterSource(@RequestBody Employee employee, @PathVariable Long employeeId) {
		return employeeService.updateEmployeeDetailsUsingBeanPropertySqlParameterSource(employee, employeeId);
	}
	
	//*************************************** FETCH OPERATION ***********************************************

			//---------------------------- Single Employee Record -----------------------------------

	@GetMapping("/fetchEmployeeDetailsUsingMap")
	public List<Employee> fetchEmployeeDetailsUsingMap( @PathVariable Long employeeId) {
		return employeeService.fetchEmployeeDetailsUsingMap(employeeId);
	}
	
	@GetMapping("/fetchEmployeeDetailsUsingSqlParameterSource")
	public List<Employee> fetchEmployeeDetailsUsingSqlParameterSource(@PathVariable Long employeeId) {
		return employeeService.fetchEmployeeDetailsUsingSqlParamterSource(employeeId);
	}
	
	/*
	 * @GetMapping("/fetchEmployeeDetailsUsinBeanPropertySqlParameterSource") public
	 * List<Employee>
	 * fetchEmployeeDetailsUsingBeanPropertySqlParameterSource(@PathVariable Long
	 * employeeId) { return
	 * employeeService.fetchEmployeeDetailsUsingBeanPropertySqlParameterSource(
	 * employeeId); }
	 */
	
	/*
	 * //---------------------------- Multiple Employee Record
	 * -----------------------------------
	 * 
	 * @GetMapping("/fetchEmployeesDetailsUsingMap") public Boolean
	 * fetchEmployeesDetailsUsingMap() { return
	 * employeeService.fetchEmployeesDetailsUsingMap(); }
	 * 
	 * @GetMapping("/fetchEmployeesDetailsUsingSqlParameterSource") public Boolean
	 * fetchEmployeesDetailsUsingSqlParameterSource() { return
	 * employeeService.fetchEmployeesDetailsUsingSqlParameterSource(); }
	 * 
	 * @GetMapping("/fetchEmployeesDetailsUsinBeanPropertySqlParameterSource")
	 * public Boolean fetchEmployeesDetailsUsingBeanPropertySqlParameterSource() {
	 * return
	 * employeeService.fetchEmployeesDetailsUsingBeanPropertySqlParameterSource(); }
	 */
	
}
