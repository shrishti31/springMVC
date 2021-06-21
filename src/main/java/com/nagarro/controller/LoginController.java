package com.nagarro.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.model.Employee;
import com.nagarro.model.User;
import com.nagarro.service.EmployeeService;
import com.nagarro.service.LoginService;
import com.nagarro.serviceImpl.EmployeeServiceImpl;
import com.nagarro.serviceImpl.LoginServiceImpl;


@Controller
public class LoginController {
	
	

	public static ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
	EmployeeServiceImpl employeeServiceImpl=context.getBean("employeeServiceImpl",EmployeeServiceImpl.class);

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView verifyUser(HttpServletRequest request, HttpServletRequest response) {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		LoginService userService = context.getBean("loginServiceImpl",LoginServiceImpl.class);
		ModelAndView modelAndView = new ModelAndView();
		if (userService.isValidEmployee(username, password)) {
			modelAndView.setViewName("home.jsp");
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			List<Employee> employeeList = employeeServiceImpl.getAllEmployee();
			modelAndView.addObject("employeeList", employeeList);
			return modelAndView;
		}
		modelAndView.setViewName("invaliduser.jsp");
	
		return modelAndView;

	}

}
