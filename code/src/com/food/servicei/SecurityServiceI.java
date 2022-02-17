package com.food.servicei;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Vector;

import com.food.exception.ConnectionException;
import com.food.exception.LoginException;
import com.food.formbean.ProfileFormBean;
import com.food.pojo.LoginDetails;
import com.food.pojo.UserDetails;

public interface SecurityServiceI {
	public String checkUser(String loginid) throws ConnectionException;

	public boolean userRegistration(UserDetails userDetails)
			throws ConnectionException, FileNotFoundException, SQLException;

	public LoginDetails loginCheck(LoginDetails loginDetails)
			throws ConnectionException, LoginException;

	public boolean passwordRecovery(UserDetails userDetails)
			throws ConnectionException;

	public boolean newPassword(LoginDetails loginDetails)
			throws ConnectionException;

	public boolean changePass(LoginDetails loginDetails)
			throws ConnectionException;

	public UserDetails viewUserProfile(int userid, String path)
			throws ConnectionException;

	public Vector<UserDetails> viewUserList(String user, String path)
			throws ConnectionException;

	public boolean deleteUsers(int userid) throws ConnectionException;
}
