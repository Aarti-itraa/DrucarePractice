package com.spring.jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.spring.jbdc.dao.EmployeeDAO;
import com.spring.jdbc.entity.Employee;

//@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDAO employeeDao;

	@Override
	public Boolean addEmployeeDetailsUsingMap(Employee employee) {
		return employeeDao.addEmployeeDetailsUsingMap(employee);
	}
	@Override
	public Boolean addEmployeeDetailsUsingSqlParamter(Employee employee) {	
		return employeeDao.addEmployeeDetailsUsingSqlParamterSource(employee);
	}
	@Override
	public Boolean addEmployeesDetailsUsingMap(List<Employee> employeeList) {
		return employeeDao.addEmployeesDetailsUsingMap(employeeList);
	}
	@Override
	public Boolean addEmployeesDetailsUsingSqlParameter(List<Employee> employeeList) {
		return employeeDao.addEmployeesDetailsUsingSqlParameterSource(employeeList);
	}

	@Override
	public Boolean addEmployeeDetailsUsingBeanPropertySqlParameterSource(Employee employee) {
		return employeeDao.addEmployeeDetailsUsingBeanPropertySqlParameterSource(employee);
	}
	
	@Override
	public Boolean updateEmployeeDetailsUsingMap(Employee employee, Long employeeId) {
		return employeeDao.updateEmployeeDetailsUsingMap(employee, employeeId);
	}
	@Override
	public Boolean updateEmployeeDetailsUsingSqlParamterSource(Employee employee, Long employeeId) {
		return employeeDao.updateEmployeeDetailsUsingSqlParamterSource(employee, employeeId);
	}
	@Override
	public Boolean updateEmployeeDetailsUsingBeanPropertySqlParameterSource(Employee employee, Long employeeId) {
		return employeeDao.updateEmployeeDetailsUsingBeanPropertySqlParameterSource(employee, employeeId);
	}
	@Override
	public List<Employee> fetchEmployeeDetailsUsingMap(Long employeeId) {
		return employeeDao.fetchEmployeeDetailsUsingMap(employeeId);
	}
	@Override
	public List<Employee> fetchEmployeeDetailsUsingSqlParamterSource(Long employeeId) {
		return employeeDao.fetchEmployeeDetailsUsingSqlParamterSource(employeeId);
	}
	
}