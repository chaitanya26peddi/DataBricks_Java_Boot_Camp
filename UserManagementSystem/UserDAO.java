package com.ums.dao;

public interface UserDAO {
	void register();
	boolean verifyUserNameAndPassword(String uname, String password);
	String forgotPassword(String uname);

}
