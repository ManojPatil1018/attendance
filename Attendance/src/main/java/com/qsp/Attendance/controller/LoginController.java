package com.qsp.Attendance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.Attendance.service.LoginService;

@RestController
public class LoginController {
	   @Autowired
		LoginService loginService;
	   
	   
}
