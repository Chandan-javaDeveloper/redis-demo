package com.jne.interanet.models;



import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_department")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class UserDepartment {
	private static final long serialVersionUID = 4537790178363882698L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "department")
	private String department;

	public UserDepartment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDepartment(int id, String department) {
		super();
		this.id = id;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "UserDepartment [id=" + id + ", department=" + department + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(department, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDepartment other = (UserDepartment) obj;
		return Objects.equals(department, other.department) && id == other.id;
	}
	
	
	

}
