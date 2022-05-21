package com.spring.jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.jdbc.dao.EmployeeDAOImpl;
import com.spring.jdbc.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeDAOImpl employeeDaoImpl;
	
	@Override
	public Boolean addEmployeeByMap(List<Employee> emp){
		employeeDaoImpl.addEmployeeByMap(emp);
		return true;
	}

	@Override
	public Boolean addEmployeeDetailsMSPS(List<Employee> employeeList) {
		employeeDaoImpl.addEmployeeDetailsMSPS(employeeList);		
		return true;
	}

	@Override
	public Boolean addEmployeeByBatch(List<Employee> employeeList) {
		employeeDaoImpl.addEmployeeByBatch(employeeList);
		return true;
	}
}
