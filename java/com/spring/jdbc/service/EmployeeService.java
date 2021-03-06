package com.spring.jdbc.service;

import java.util.List;

import com.spring.jdbc.model.Employee;

public interface EmployeeService {

	public Boolean addEmployeeByMap(List<Employee> emp);

	public Boolean addEmployeeDetailsMSPS(List<Employee> employeeList);

	public Boolean addEmployeeByBatch(List<Employee> employeeList);

}
