package com.spring.jbdc.dao;

import java.util.List;

import com.spring.jdbc.entity.Employee;

public interface EmployeeDAO {

	public Boolean addEmployeeDetailsUsingMap(Employee employee);
	public Boolean addEmployeeDetailsUsingSqlParamterSource(Employee employee);
	public Boolean addEmployeeDetailsUsingBeanPropertySqlParameterSource(Employee employee);

	public Boolean addEmployeesDetailsUsingMap(List<Employee> employeeList);
	public Boolean addEmployeesDetailsUsingSqlParameterSource(List<Employee> employeeList);
	
	public Boolean updateEmployeeDetailsUsingMap(Employee employee, Long employeeId);
	public Boolean updateEmployeeDetailsUsingSqlParamterSource(Employee employee, Long employeeId);
	public Boolean updateEmployeeDetailsUsingBeanPropertySqlParameterSource(Employee employee, Long employeeId);

	public List<Employee> fetchEmployeeDetailsUsingMap( Long employeeId);
	public List<Employee> fetchEmployeeDetailsUsingSqlParamterSource(Long employeeId);
	

}
