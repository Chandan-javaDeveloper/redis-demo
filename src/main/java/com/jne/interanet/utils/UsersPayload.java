package com.jne.interanet.utils;

import java.sql.Date;

public class UsersPayload {
	
	private String name;

	private String email;

	private String mobile;

	private String employee_code;

	private String password;

	private String password_token;

	private String gender;

	private String role;

	private String dob;

	private Integer created_by;

	private String manager;

	private Date dateOfJoining;

	private String depRole;

	private String department;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmployee_code() {
		return employee_code;
	}

	public void setEmployee_code(String employee_code) {
		this.employee_code = employee_code;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword_token() {
		return password_token;
	}

	public void setPassword_token(String password_token) {
		this.password_token = password_token;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Integer getCreated_by() {
		return created_by;
	}

	public void setCreated_by(Integer created_by) {
		this.created_by = created_by;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getDepRole() {
		return depRole;
	}

	public void setDepRole(String depRole) {
		this.depRole = depRole;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	

}
