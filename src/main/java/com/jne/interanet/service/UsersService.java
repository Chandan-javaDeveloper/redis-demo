package com.jne.interanet.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jne.interanet.models.UserDepartment;
import com.jne.interanet.models.UserRoleMaster;
import com.jne.interanet.models.Users;
import com.jne.interanet.utils.UsersPayload;


@Service
public interface UsersService {
	
	public Boolean saveUser(UsersPayload userInfoForm);
	
	public Users getUsersDetailsByEmailId(String email);
	
	public Users getUsersDetailsByEmployeeCode(String employeeCode);

	public List<Users> getUsersDetailsByName(String employeeCode);

	public void updateUserVerificationTokenAndActiveStatus(String verificationCode, int id);

	public void updateUserPasswordAndResetPasswordStatus(String password, int id);

	public Boolean updateProfileDetails(UsersPayload payload);

	public List<Users> getAllActiveUsersList();

	public List<Users> getAllUsers();

	public boolean statusChange(UsersPayload payload);

	public boolean statusChangeToInactive(UsersPayload payload);

	Boolean updateUserInfo(UsersPayload payload);

	public List<UserDepartment> getAllDepartments();

	public List<UserRoleMaster> getAllRoles(int departmentId);

	public UserDepartment getDepartmentByName(String department);

	public List<Users> getUserByDepAndDepRole(String department, String depRole);

	
	List<Users> getlistOfUserByManager(String manager);

	

}
