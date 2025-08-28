package com.jne.interanet.serviceImpl;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jne.interanet.dao.UsersDao;
import com.jne.interanet.models.UserDepartment;
import com.jne.interanet.models.UserRoleMaster;
import com.jne.interanet.models.Users;
import com.jne.interanet.service.UsersService;
import com.jne.interanet.utils.UsersPayload;




@Service
@Transactional("mydb")
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersDao usersDao;
	
	
	@Override
	public Boolean saveUser(UsersPayload payload) {
		Users userInfo = new Users();
		userInfo.setName(payload.getName());
		userInfo.setEmail(payload.getEmail());
		userInfo.setMobile(payload.getMobile());
		userInfo.setRole(payload.getRole());
		userInfo.setEmployee_code(payload.getEmployee_code());
		userInfo.setDateOfJoining(payload.getDateOfJoining());
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		userInfo.setPassword(bCryptPasswordEncoder.encode(payload.getPassword()));
		userInfo.setManager(payload.getManager());
		userInfo.setCreated_by(1);
		userInfo.setCreated_on(new Timestamp(System.currentTimeMillis()));
		userInfo.setModify_on(new Timestamp(System.currentTimeMillis()));
		userInfo.setActive_status(1);
		userInfo.setDepRole(payload.getDepRole());
		userInfo.setDepartment(payload.getDepartment());
		try {
			boolean saveDetails = usersDao.saveUserDetails(userInfo);
			return saveDetails;
		} catch (Exception e) {
			throw e;
		}
	}


	@Override
	public Users getUsersDetailsByEmailId(String email) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Users getUsersDetailsByEmployeeCode(String employeeCode) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Users> getUsersDetailsByName(String employeeCode) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void updateUserVerificationTokenAndActiveStatus(String verificationCode, int id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void updateUserPasswordAndResetPasswordStatus(String password, int id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Boolean updateProfileDetails(UsersPayload payload) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Users> getAllActiveUsersList() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean statusChange(UsersPayload payload) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean statusChangeToInactive(UsersPayload payload) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Boolean updateUserInfo(UsersPayload payload) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<UserDepartment> getAllDepartments() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<UserRoleMaster> getAllRoles(int departmentId) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public UserDepartment getDepartmentByName(String department) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Users> getUserByDepAndDepRole(String department, String depRole) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Users> getlistOfUserByManager(String manager) {
		// TODO Auto-generated method stub
		return null;
	}


}
