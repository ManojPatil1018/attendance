package com.qsp.Attendance.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.Attendance.dto.User;
import com.qsp.Attendance.repository.UserRepository;

@Repository
public class Userdao {
	       @Autowired  
		UserRepository userRepository;
	       
		//save
	       public User saveUser(User user) {
	    	   return userRepository.save(user);
	       }
	       
	    // get by id
	    	public User getById(int id) {
	    		Optional<User> opt = userRepository.findById(id);
	    		if (opt.isEmpty()) {
	    			return null;
	    		} else {
	    			return opt.get();
	    		}
	    	}
	    	
	    	// get all
	       	public List<User> getAllUser() {
	       		return userRepository.findAll();
	       	}
	       	
	       	
	       	// delete
	     	public boolean deleteUserByid(int id) {
	     		Optional<User> opt = userRepository.findById(id);
	     		if (opt.isPresent()) {
	     			userRepository.delete(opt.get());
	     			return true;
	     		} else {
	     			return false;
	     		}
	     	}
	     	
	     	
	    	// update
	     	public User updateUser(int id, User user) {
	     		Optional<User> opt = userRepository.findById(id);
	     		if (opt.isEmpty()) {
	     			return null;
	     		} else {
	     			return userRepository.save(user);
	     		}
	     	}
}



