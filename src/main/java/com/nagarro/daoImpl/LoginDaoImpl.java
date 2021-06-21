package com.nagarro.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.nagarro.dao.LoginDao;
import com.nagarro.model.Employee;
import com.nagarro.model.User;

public class LoginDaoImpl implements LoginDao{
	
	HibernateTemplate hTemplate;

	public HibernateTemplate gethTemplate() {
		return hTemplate;
	}

	public void sethTemplate(HibernateTemplate hTemplate) {
		this.hTemplate = hTemplate;
	}

	public boolean isValidEmployee(String username, String password) {
		Object[] params= {username,password};
		List<User> userList = (List<User>) this.hTemplate.find("from User where username=? and password=?",params);
		if (!userList.isEmpty()) {
			
					return true;
	
		}

		return false;
	}

}
