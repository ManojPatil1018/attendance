package com.qsp.Attendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qsp.Attendance.dto.User;

public interface UserRepository  extends JpaRepository<User, Integer> {

}
