package com.qsp.Attendance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.qsp.Attendance.dao.Userdao;
import com.qsp.Attendance.dto.ResponceStructure;
import com.qsp.Attendance.dto.User;

@Service
public class UserService {
@Autowired
	Userdao userdao;
//save 
	public ResponceStructure<User> saveUser(User user){
		ResponceStructure<User> responseStructure=new ResponceStructure<User>();
		responseStructure.setData(userdao.saveUser(user));
		responseStructure.setStatusCode(HttpStatus.CREATED.value());
		responseStructure.setMessage("User saved succesfully");
		return responseStructure;
}
	
	//get by id
			public ResponceStructure<User> getUser(int id) {
				ResponceStructure<User> responseStructure = new ResponceStructure<User>();
				User user = userdao.getById(id);
				if (user != null) {
					responseStructure.setData(user);
					responseStructure.setStatusCode(HttpStatus.CREATED.value());
					responseStructure.setMessage("Success");
				} else {
					System.out.println("Unsuccessfull");
				}
				return responseStructure;
			}
			
			//update name
			public ResponceStructure<User> updateNameUser(int id,User user) {
				ResponceStructure<User> responseStructure = new ResponceStructure<User>();
				User user1 = userdao.getById(id);
				
				if (user1 != null) {
					user1.setUsername(user.getUsername());
					responseStructure.setData(userdao.updateUser(id, user1));
					responseStructure.setStatusCode(HttpStatus.CREATED.value());
					responseStructure.setMessage("Updated");
				} else {
					System.out.println("Unsuccessfull");
				}
				return responseStructure;
			}



//update email
public ResponceStructure<User> updateEmailUser(int id,User user) {
	ResponceStructure<User> responseStructure = new ResponceStructure<User>();
	User user1 = userdao.getById(id);
	if (user1 != null) {
		
		user1.setEmail(user.getEmail());
		responseStructure.setData(userdao.updateUser(id, user1));
		responseStructure.setStatusCode(HttpStatus.CREATED.value());
		responseStructure.setMessage("Updated");
	} else {
		System.out.println("Unsuccessfull");
	}
	return responseStructure;
}


//delete user
public ResponceStructure<String> deleteUser(int id) {
	ResponceStructure<String> responseStructure = new ResponceStructure<String>();
	boolean flag = userdao.deleteUserByid(id);
	if (flag) {
		responseStructure.setData("Data deleted");
		responseStructure.setStatusCode(HttpStatus.OK.value());
		responseStructure.setMessage("Deleted");
	} else {
		System.out.println("User Not Exist");
	}
	return responseStructure;
}


//getall users
public ResponceStructure<List<User>> getAllUser(){
	ResponceStructure<List<User>> responseStructure = new ResponceStructure<List<User>>();
	List<User> productes = userdao.getAllUser();
	if (productes.size()>0) {
		responseStructure.setData(productes);
		responseStructure.setStatusCode(HttpStatus.CREATED.value());
		responseStructure.setMessage("Success");
	} else {
		System.out.println("Unsuccessfull");
	}
	return responseStructure;
}





}