package com.jne.interanet.models;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class Users implements Serializable {

	private static final long serialVersionUID = -5035205655641513426L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private int id;

	@Column(name = "name", length = 45)
	private String name;

	@Column(name = "email", length = 45)
	private String email;

	@Column(name = "mobile", length = 45)
	private String mobile;

	@Column(name = "password", length = 45)
	private String password;

	@Column(name = "employee_code", length = 45)
	private String employee_code;

	@Column(name = "gender", length = 45)
	private String gender;

	@Column(name = "role", length = 45)
	private String role;

	@Column(name = "dob")
	private Date dob;

	@Column(name = "created_by", length = 45)
	private int created_by;

	@Column(name = "created_on")
	private Timestamp created_on;

	@Column(name = "modify_on")
	private Timestamp modify_on;

	@Column(name = "active_status")
	private int active_status;

	@Column(name = "password_token")
	public String password_token;

	@Column(name = "reset_pwd_status")
	public Integer reset_pwd_status;

	@Column(name = "manager")
	public String manager;

	@Column(name = "dateOfJoining")
	private Date dateOfJoining;

	@Column(name = "dep_role")
	private String depRole;

	@Column(name = "department")
	private String department;

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(int id, String name, String email, String mobile, String password, String employee_code, String gender,
			String role, Date dob, int created_by, Timestamp created_on, Timestamp modify_on, int active_status,
			String password_token, Integer reset_pwd_status, String manager, Date dateOfJoining, String depRole,
			String department) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
		this.employee_code = employee_code;
		this.gender = gender;
		this.role = role;
		this.dob = dob;
		this.created_by = created_by;
		this.created_on = created_on;
		this.modify_on = modify_on;
		this.active_status = active_status;
		this.password_token = password_token;
		this.reset_pwd_status = reset_pwd_status;
		this.manager = manager;
		this.dateOfJoining = dateOfJoining;
		this.depRole = depRole;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmployee_code() {
		return employee_code;
	}

	public void setEmployee_code(String employee_code) {
		this.employee_code = employee_code;
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getCreated_by() {
		return created_by;
	}

	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}

	public Timestamp getCreated_on() {
		return created_on;
	}

	public void setCreated_on(Timestamp created_on) {
		this.created_on = created_on;
	}

	public Timestamp getModify_on() {
		return modify_on;
	}

	public void setModify_on(Timestamp modify_on) {
		this.modify_on = modify_on;
	}

	public int getActive_status() {
		return active_status;
	}

	public void setActive_status(int active_status) {
		this.active_status = active_status;
	}

	public String getPassword_token() {
		return password_token;
	}

	public void setPassword_token(String password_token) {
		this.password_token = password_token;
	}

	public Integer getReset_pwd_status() {
		return reset_pwd_status;
	}

	public void setReset_pwd_status(Integer reset_pwd_status) {
		this.reset_pwd_status = reset_pwd_status;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", password="
				+ password + ", employee_code=" + employee_code + ", gender=" + gender + ", role=" + role + ", dob="
				+ dob + ", created_by=" + created_by + ", created_on=" + created_on + ", modify_on=" + modify_on
				+ ", active_status=" + active_status + ", password_token=" + password_token + ", reset_pwd_status="
				+ reset_pwd_status + ", manager=" + manager + ", dateOfJoining=" + dateOfJoining + ", depRole="
				+ depRole + ", department=" + department + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(active_status, created_by, created_on, dateOfJoining, depRole, department, dob, email,
				employee_code, gender, id, manager, mobile, modify_on, name, password, password_token, reset_pwd_status,
				role);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		return active_status == other.active_status && created_by == other.created_by
				&& Objects.equals(created_on, other.created_on) && Objects.equals(dateOfJoining, other.dateOfJoining)
				&& Objects.equals(depRole, other.depRole) && Objects.equals(department, other.department)
				&& Objects.equals(dob, other.dob) && Objects.equals(email, other.email)
				&& Objects.equals(employee_code, other.employee_code) && Objects.equals(gender, other.gender)
				&& id == other.id && Objects.equals(manager, other.manager) && Objects.equals(mobile, other.mobile)
				&& Objects.equals(modify_on, other.modify_on) && Objects.equals(name, other.name)
				&& Objects.equals(password, other.password) && Objects.equals(password_token, other.password_token)
				&& Objects.equals(reset_pwd_status, other.reset_pwd_status) && Objects.equals(role, other.role);
	}

	
	

}
