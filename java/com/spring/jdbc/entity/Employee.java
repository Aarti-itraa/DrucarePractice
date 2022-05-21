package com.spring.jdbc.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees_info_ref")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long employeeId;
	@Column(name = "first_nm")
	private String firstName;
	@Column(name = "middle_nm")
	private String middleName;
	@Column(name = "last_nm")
	private String lastName;
	@Column(name = "email_id")
	private String emailId;
	@Column(name = "mobile_no")
	private Long mobileNo;
	@Column(name = "address")
	private String address;
	@Column(name = "city_nm")
	private String city;
	@Column(name = "state_nm")
	private String state;
	@Column(name = "country_nm")
	private String country;
	@Column(name = "pincode")
	private String pincode;
	@Column(name = "emp_code")
	private String empCode;
	@Column(name = "alternate_mobile_no")
	private Long alternateMobileNo;
	@Column(name = "salary")
	private Long salary;
	@Column(name = "doj")
	private Date doj;
	@Column(name = "department_nm")
	private String department;
	@Column(name="org_Id")
	private Long org_Id;
	@Column(name= "isactive")
	private Boolean isactive;
	
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		address = this.address;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getEmpCode() {
		return empCode;
	}
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	public long getAlternateMobileNo() {
		return alternateMobileNo;
	}
	public void setAlternateMobileNo(long alternateMobileNo) {
		this.alternateMobileNo = alternateMobileNo;
	}

	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}

	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public Long getOrg_Id() {
		return org_Id;
	}
	public void setOrg_Id(Long org_Id) {
		this.org_Id = org_Id;
	}

	public Boolean getIsactive() {
		return isactive;
	}
	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	public Employee() {
		super();
	}

	public Employee(long employeeId, String firstName, String middleName, String lastName, String emailId,
			long mobileNo, String address, String city, String state, String country, String pincode, String empCode,
			long alternateMobileNo, long salary, Date doj, String department,Long org_id, Boolean isactive) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.empCode = empCode;
		this.alternateMobileNo = alternateMobileNo;
		this.salary = salary;
		this.doj = doj;
		this.department = department;
		this.org_Id=org_id;
		this.isactive =isactive;
	}

	@Override
	public String toString() {
		return "Employee [employeeId =" + employeeId + ",firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", emailId=" + emailId + ", mobileNo=" + mobileNo + ", address=" + address
				+ ", city=" + city + ", state=" + state + ", country=" + country + ", pincode=" + pincode + ", empCode="
				+ empCode + ", alternateMobileNo=" + alternateMobileNo + ", salary=" + salary + ", doj=" + doj
				+ ", department=" + department + ",org_id"+ org_Id+",isactive"+isactive+"]";
	}

}
