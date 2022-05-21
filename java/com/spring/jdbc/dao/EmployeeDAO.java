package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.model.Employee;

public interface EmployeeDAO {

	public Boolean addEmployeeByMap(List<Employee> empList);
	
	public Boolean addEmployeeDetailsMSPS(List<Employee> employeeList);

	public Boolean addEmployeeByBatch(List<Employee> employeeList);
}
