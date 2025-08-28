package com.jne.interanet.models;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_role_master")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class UserRoleMaster implements Serializable {
	private static final long serialVersionUID = 646421069434453890L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "user_role")
	private String userRole;

	@NonNull
	@ManyToOne
	@JoinColumn(name = "department_id")
	private UserDepartment departmentId;

	public UserRoleMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserRoleMaster(int id, String userRole, UserDepartment departmentId) {
		super();
		this.id = id;
		this.userRole = userRole;
		this.departmentId = departmentId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public UserDepartment getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(UserDepartment departmentId) {
		this.departmentId = departmentId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "UserRoleMaster [id=" + id + ", userRole=" + userRole + ", departmentId=" + departmentId + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(departmentId, id, userRole);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserRoleMaster other = (UserRoleMaster) obj;
		return Objects.equals(departmentId, other.departmentId) && id == other.id
				&& Objects.equals(userRole, other.userRole);
	}
	
	
	
}
