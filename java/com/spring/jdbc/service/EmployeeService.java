package com.spring.jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.jbdc.dao.EmployeeDAO;
import com.spring.jdbc.entity.Employee;
@Service
public interface EmployeeService {

	public Boolean addEmployeeDetailsUsingMap(Employee employee);
	public Boolean addEmployeeDetailsUsingSqlParamter(Employee employee);
	public Boolean addEmployeeDetailsUsingBeanPropertySqlParameterSource(Employee employee);
	
	public Boolean addEmployeesDetailsUsingMap(List<Employee> employeeList);
	public Boolean addEmployeesDetailsUsingSqlParameter(List<Employee> employeeList);
	
	public Boolean updateEmployeeDetailsUsingMap(Employee employee,Long employeeId);
	public Boolean updateEmployeeDetailsUsingSqlParamterSource(Employee employee,Long employeeId);
	public Boolean updateEmployeeDetailsUsingBeanPropertySqlParameterSource(Employee employee,Long employeeId);
	
	public List<Employee> fetchEmployeeDetailsUsingMap( Long employeeId);
	public List<Employee> fetchEmployeeDetailsUsingSqlParamterSource(Long employeeId);
	
	
	
	}
