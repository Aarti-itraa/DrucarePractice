package com.spring.jdbc.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.spring.jdbc.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public Boolean addEmployeeByMap(List<Employee> empList) {
		int count = 0;
		for (Employee employee : empList) {
			String queryForInsertDetails = "Insert into employee_info_ref (first_nm,middle_nm, last_nm"
					+ "email_id, mobile_no,address, city_nm,state_nm, country_nm, pincode,emp_code,"
					+ "alternate_mobile_no,salary, doj, department_nm)"
					+ "values (:firstName,:middleName,:lastName,:email_id,:mobile_no,:address,: city,:state,: country,: pincode,:empCode,"
					+ "	:alternateMobileNo,:salary, :doj,: departmentName";

			Map<String, Object> map = new HashMap<>();

			map.put("first_nm", employee.getFirstName());
			map.put("middle_nm", employee.getMiddleName());
			map.put("last_nm", employee.getLastName());
			map.put("email_id", employee.getEmailId());
			map.put("mobile_no", employee.getMobileNo());
			map.put("address", employee.getAddress());
			map.put("city_nm", employee.getCity());
			map.put("state_nm", employee.getState());
			map.put("country_nm", employee.getCountry());
			map.put("pincode", employee.getPincode());
			map.put("alternat_mobile_no", employee.getAlternateMobileNo());
			map.put("emp_code", employee.getEmpCode());
			map.put("salary", employee.getSalary());
			map.put("DOJ", employee.getDoj());
			map.put("department_nm", employee.getDepartment());

			count += namedParameterJdbcTemplate.update(queryForInsertDetails, map);
		}
		return count == empList.size() ? true : false;
	}

	@Override
	public Boolean addEmployeeDetailsMSPS(List<Employee> employeeList) {
		int count = 0;
		for (Employee employee : employeeList) {
			String queryForInsertDetails = "Insert into employee_info_ref (first_nm,middle_nm, last_nm"
					+ "email_id, mobile_no,address, city_nm,state_nm, country_nm, pincode,emp_code,"
					+ "alternate_mobile_no,salary, doj, department_nm)"
					+ "values(:firstName,:middleName,:lastName,:email_id,:mobile_no,:address,: city,:state,: country,: pincode,:empCode,"
					+ "	:alternateMobileNo,:salary, :doj,: departmentName";

			MapSqlParameterSource parameterSource = new MapSqlParameterSource()
					.addValue("firstName", employee.getFirstName()).addValue("middleName", employee.getMiddleName())
					.addValue("lastName", employee.getLastName()).addValue("emailId", employee.getEmailId())
					.addValue("mobileNo", employee.getMobileNo()).addValue("address", employee.getAddress())
					.addValue("city", employee.getCity()).addValue("state", employee.getState())
					.addValue("country", employee.getCountry()).addValue("pincode", employee.getPincode())
					.addValue("alternatMobileNo", employee.getAlternateMobileNo())
					.addValue("empCode", employee.getEmpCode()).addValue("salary", employee.getSalary())
					.addValue("DOJ", employee.getDoj()).addValue("departmentName", employee.getDepartment());
			count += namedParameterJdbcTemplate.update(queryForInsertDetails, parameterSource);
		}
		return count == employeeList.size() ? true : false;
	}

	public Boolean addEmployeeByBatch(List<Employee> employeeList) {
		String queryForInsertDetails = "Insert into employee_info_ref (first_nm,middle_nm, last_nm,"
						+ "email_id, mobile_no,address, city_nm,state_nm, country_nm, pincode,emp_code,"
						+ "alternate_mobile_no,salary, doj, department_nm)" + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		List<Object[]> batchArgsList =new ArrayList<Object[]>();
				
						for(Employee employee : employeeList) {
							Object[] objectArray = { employee.getEmployeeId(), employee.getFirstName()};
							
							batchArgsList.add(objectArray);
						}
						namedParameterJdbcTemplate.update(queryForInsertDetails, (SqlParameterSource) batchArgsList);
						return true;
	}
	}
