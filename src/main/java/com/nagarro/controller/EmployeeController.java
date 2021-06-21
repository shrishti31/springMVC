package com.nagarro.controller;


import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.model.Employee;
import com.nagarro.serviceImpl.EmployeeServiceImpl;

@Controller
public class EmployeeController {
	
	public static ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
	EmployeeServiceImpl employeeServiceImpl=context.getBean("employeeServiceImpl",EmployeeServiceImpl.class);

	
	@RequestMapping(value = "/updateDetails")
	public ModelAndView updateDetails(HttpServletRequest request, HttpServletResponse response) {
		int empid = Integer.parseInt(request.getParameter("employeeid"));
		int empcode = Integer.parseInt(request.getParameter("employeecode"));
		String empname = request.getParameter("employeename");

		String email = request.getParameter("email");
		String date = request.getParameter("date");
		
		String location = request.getParameter("location");
		Employee employee = context.getBean("employee", Employee.class);
		employee.setEmployee_Code(empcode);
		employee.setEmail(email);
		employee.setDob(location);
		employee.setEmployee_Name(empname);
		employee.setLocation(location);
		employeeServiceImpl.updateEmployee(employee);
		ModelAndView mv = new ModelAndView();
		List<Employee> employeeList = employeeServiceImpl.getAllEmployee();
		mv.addObject("employeeList", employeeList);
		mv.setViewName("home.jsp");
		return mv;

	}

}
