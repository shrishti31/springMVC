package com.nagarro.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.nagarro.daoImpl.LoginDaoImpl;
import com.nagarro.service.LoginService;


public class LoginServiceImpl implements LoginService{
	
	@Autowired
	LoginDaoImpl loginDaoImpl;

	public LoginDaoImpl getLoginDaoImpl() {
		return loginDaoImpl;
	}

	public void setLoginDaoImpl(LoginDaoImpl loginDaoImpl) {
		this.loginDaoImpl = loginDaoImpl;
	}

	public boolean isValidEmployee(String username, String password) {
		return loginDaoImpl.isValidEmployee(username, password);
	}

	
	

}
