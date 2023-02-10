package com.qsp.Attendance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.qsp.Attendance.dto.ResponceStructure;
import com.qsp.Attendance.dto.User;
import com.qsp.Attendance.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;
@PostMapping("/users")
public ResponceStructure<User> saveUser(@RequestBody User user){
	return userService.saveUser(user);
}

@GetMapping("/users/{id}")
public ResponceStructure<User> getUser(@PathVariable int id) {
	return userService.getUser(id);
}
@PutMapping("/usersname/{id}")
public ResponceStructure<User> updateNameUser(@PathVariable int id, @RequestBody User user) {
	return userService.updateNameUser(id, user);
}
@PutMapping("/usersemail/{id}")
public ResponceStructure<User> updateEmailUser(@PathVariable int id, @RequestBody User user) {
	return userService.updateEmailUser(id, user);
}


@DeleteMapping("/users/{id}")
public ResponceStructure<String> deleteUsers(@PathVariable int id) {
	return userService.deleteUser(id);
}


@GetMapping("/users")
public ResponceStructure<List<User>> getAllUser(){
	return userService.getAllUser();
}
}
