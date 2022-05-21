package com.spring.jbdc.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.spring.jdbc.entity.Employee;

@Repository
@ComponentScan("com.spring.jdbc")
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	Boolean result = false;

//1. Inserting single record using Map<K,V>
	@Override
	public Boolean addEmployeeDetailsUsingMap(Employee employee) {

		String queryForInsertDetails = "Insert into employee_info_ref (first_nm,middle_nm, last_nm"
				+ "email_id, mobile_no,address, city_nm,state_nm, country_nm, pincode,emp_code,"
				+ "alternate_mobile_no,salary, doj, department_nm)"
				+ "values (:firstName,:middleName,:lastName,:email_id,:mobile_no,:address,: city,:state,: country,"
				+ ": pincode,:empCode,:alternateMobileNo,:salary, :doj,: departmentName";

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

		try {

			result = namedParameterJdbcTemplate.update(queryForInsertDetails, map) > 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

//2. Inserting single records using SqlParameterSource
	@Override
	public Boolean addEmployeeDetailsUsingSqlParamterSource(Employee employee) {
		String queryForInsertDetails = "Insert into employee_info_ref (first_nm,middle_nm, last_nm"
				+ "email_id, mobile_no,address, city_nm,state_nm, country_nm, pincode,emp_code,"
				+ "alternate_mobile_no,salary, doj, department_nm)"
				+ "values (:firstName,:middleName,:lastName,:email_id,:mobile_no,:address,: city,:state,: country,"
				+ ": pincode,:empCode,:alternateMobileNo,:salary, :doj,: departmentName";

		MapSqlParameterSource parameterSource = new MapSqlParameterSource()
				.addValue("firstName", employee.getFirstName()).addValue("middleName", employee.getMiddleName())
				.addValue("lastName", employee.getLastName()).addValue("emailId", employee.getEmailId())
				.addValue("mobileNo", employee.getMobileNo()).addValue("address", employee.getAddress())
				.addValue("city", employee.getCity()).addValue("state", employee.getState())
				.addValue("country", employee.getCountry()).addValue("pincode", employee.getPincode())
				.addValue("alternatMobileNo", employee.getAlternateMobileNo())
				.addValue("empCode", employee.getEmpCode()).addValue("salary", employee.getSalary())
				.addValue("DOJ", employee.getDoj()).addValue("departmentName", employee.getDepartment())
				.addValue("org_Id", employee.getOrg_Id()).addValue("isactive", employee.getIsactive());
		try {
			result = namedParameterJdbcTemplate.update(queryForInsertDetails, parameterSource) > 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	// 3. Inserting Multiple Employee records using Map<K,V>
	@Override
	public Boolean addEmployeesDetailsUsingMap(List<Employee> employeeList) {
		for (Employee employee : employeeList) {
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
			try {
				result = namedParameterJdbcTemplate.update(queryForInsertDetails, map) > 0;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}

//4. Inserting Multiple Employee records using SqlParameterSource
	@Override
	public Boolean addEmployeesDetailsUsingSqlParameterSource(List<Employee> employeeList) {
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
			try {
				result = namedParameterJdbcTemplate.update(queryForInsertDetails, parameterSource) > 0;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	@Override
	public Boolean updateEmployeeDetailsUsingMap(Employee updateEmployee, Long employeeId) {
		String queryForUpdateDetails = "update employee_info_ref set firstName=first_nm, middleName= middle_nm, "
				+ "lastName =last_nm,email_id =email_id, mobile_no=mobile_no,address=address,"
				+ " city =city_nm,state=state_nm, country=country_nm,pincode= pincode,empCode=emp_code,"
				+ "alternateMobileNo =alternate_mobile_no,salary =salary, doj=doj, departmentName=department_nm where emp_id = employeeId";

		Map<String, Object> map = new HashMap<>();

		map.put("first_nm", updateEmployee.getFirstName());
		map.put("middle_nm", updateEmployee.getMiddleName());
		map.put("last_nm", updateEmployee.getLastName());
		map.put("email_id", updateEmployee.getEmailId());
		map.put("mobile_no", updateEmployee.getMobileNo());
		map.put("address", updateEmployee.getAddress());
		map.put("city_nm", updateEmployee.getCity());
		map.put("state_nm", updateEmployee.getState());
		map.put("country_nm", updateEmployee.getCountry());
		map.put("pincode", updateEmployee.getPincode());
		map.put("alternat_mobile_no", updateEmployee.getAlternateMobileNo());
		map.put("emp_code", updateEmployee.getEmpCode());
		map.put("salary", updateEmployee.getSalary());
		map.put("DOJ", updateEmployee.getDoj());
		map.put("department_nm", updateEmployee.getDepartment());

		try {

			result = namedParameterJdbcTemplate.update(queryForUpdateDetails, map) > 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Boolean updateEmployeeDetailsUsingSqlParamterSource(Employee employee, Long employeeId) {
		String queryForUpdateDetails = "update employee_info_ref set firstName=first_nm, middleName= middle_nm, "
				+ "lastName =last_nm,email_id =email_id, mobile_no=mobile_no,address=address,"
				+ " city =city_nm,state=state_nm, country=country_nm,pincode= pincode,empCode=emp_code,"
				+ "alternateMobileNo =alternate_mobile_no,salary =salary, doj=doj, departmentName=department_nm where emp_id = employeeId";

		MapSqlParameterSource parameterSource = new MapSqlParameterSource()
				.addValue("firstName", employee.getFirstName()).addValue("middleName", employee.getMiddleName())
				.addValue("lastName", employee.getLastName()).addValue("emailId", employee.getEmailId())
				.addValue("mobileNo", employee.getMobileNo()).addValue("address", employee.getAddress())
				.addValue("city", employee.getCity()).addValue("state", employee.getState())
				.addValue("country", employee.getCountry()).addValue("pincode", employee.getPincode())
				.addValue("alternatMobileNo", employee.getAlternateMobileNo())
				.addValue("empCode", employee.getEmpCode()).addValue("salary", employee.getSalary())
				.addValue("DOJ", employee.getDoj()).addValue("departmentName", employee.getDepartment())
				.addValue("org_Id", employee.getOrg_Id()).addValue("isactive", employee.getIsactive());
		try {
			result = namedParameterJdbcTemplate.update(queryForUpdateDetails, parameterSource) > 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Boolean updateEmployeeDetailsUsingBeanPropertySqlParameterSource(Employee updateEmployee, Long employeeId) {

		String queryForUpdateDetails = "update employee_info_ref set firstName=first_nm, middleName= middle_nm, "
				+ "lastName =last_nm,email_id =email_id, mobile_no=mobile_no,address=address,"
				+ " city =city_nm,state=state_nm, country=country_nm,pincode= pincode,empCode=emp_code,"
				+ "alternateMobileNo =alternate_mobile_no,salary =salary, doj=doj, departmentName=department_nm where emp_id = employeeId";

		SqlParameterSource parameterSource = new BeanPropertySqlParameterSource(updateEmployee);
		try {
			result = namedParameterJdbcTemplate.update(queryForUpdateDetails, parameterSource) > 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<Employee> fetchEmployeeDetailsUsingMap(Long employeeId) {
		List<Employee> employeeList = new ArrayList<>();
		try {
			Map<String, Object> parameterSource = new HashMap<>();

			employeeList = namedParameterJdbcTemplate.query("select * from employee_info_ref where emp_id=employeeId",
					parameterSource,
					(rs, row) -> new Employee(rs.getLong("emp_id"), rs.getString("first_nm"), rs.getString("middle_nm"),
							rs.getString("last_nm"), rs.getString("email_id"), rs.getLong("mobile_no"),
							rs.getString("address"), rs.getString("city_nm"), rs.getString("state_nm"),
							rs.getString("country_nm"), rs.getString("pincode"), rs.getString("emp_code"),
							rs.getLong("alternate_mobile_no"), rs.getLong("salary"), rs.getDate("doj"),
							rs.getString("department_nm"), rs.getLong("org_id"), rs.getBoolean("isactive")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employeeList;
	}

	@Override
	public List<Employee> fetchEmployeeDetailsUsingSqlParamterSource(Long employeeId) {
		List<Employee> employeeList = new ArrayList<>();
		try {
			MapSqlParameterSource parameterSource = new MapSqlParameterSource("employeeId", employeeId);

			employeeList = namedParameterJdbcTemplate.query("select * from employee_info_ref where emp_id=employeeId",
					parameterSource,
					(rs, row) -> new Employee(rs.getLong("emp_id"), rs.getString("first_nm"), rs.getString("middle_nm"),
							rs.getString("last_nm"), rs.getString("email_id"), rs.getLong("mobile_no"),
							rs.getString("address"), rs.getString("city_nm"), rs.getString("state_nm"),
							rs.getString("country_nm"), rs.getString("pincode"), rs.getString("emp_code"),
							rs.getLong("alternate_mobile_no"), rs.getLong("salary"), rs.getDate("doj"),
							rs.getString("department_nm"), rs.getLong("org_id"), rs.getBoolean("isactive")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employeeList;
	}

	@Override
	public Boolean addEmployeeDetailsUsingBeanPropertySqlParameterSource(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

}