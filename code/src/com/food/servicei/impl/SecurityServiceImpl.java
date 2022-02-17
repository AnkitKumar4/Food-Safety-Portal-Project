package com.food.servicei.impl;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Vector;

import com.food.daoi.RegionalDAOI;
import com.food.daoi.SecurityDAOI;
import com.food.daoi.impl.RegionalDAOImpl;
import com.food.daoi.impl.SecurityDAOImpl;
import com.food.exception.ConnectionException;
import com.food.exception.LoginException;
import com.food.formbean.ProfileFormBean;
import com.food.pojo.LoginDetails;
import com.food.pojo.UserDetails;
import com.food.servicei.SecurityServiceI;

public class SecurityServiceImpl implements SecurityServiceI {
	SecurityDAOI securityDAOI = new SecurityDAOImpl();

	public String checkUser(String loginid) throws ConnectionException {
		return securityDAOI.checkUser(loginid);
	}

	public boolean userRegistration(UserDetails userDetails)
			throws ConnectionException, FileNotFoundException, SQLException {
		return securityDAOI.userRegistration(userDetails);
	}

	public LoginDetails loginCheck(LoginDetails loginDetails)
			throws ConnectionException, LoginException {
		return securityDAOI.loginCheck(loginDetails);
	}

	public boolean passwordRecovery(UserDetails userDetails)
			throws ConnectionException {
		return securityDAOI.passwordRecovery(userDetails);
	}

	public boolean newPassword(LoginDetails loginDetails)
			throws ConnectionException {
		return securityDAOI.newPassword(loginDetails);
	}

	public boolean changePass(LoginDetails loginDetails)
			throws ConnectionException {
		return securityDAOI.changePass(loginDetails);
	}

	public UserDetails viewUserProfile(int userid, String path)
			throws ConnectionException {
		return securityDAOI.viewUserProfile(userid, path);
	}

	public Vector<UserDetails> viewUserList(String userid, String path)
			throws ConnectionException {
		return securityDAOI.viewUserList(userid, path);
	}

	public boolean deleteUsers(int userid) throws ConnectionException {
		return securityDAOI.deleteUsers(userid);
	}
}
