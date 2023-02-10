package com.qsp.Attendance.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qsp.Attendance.dto.Login;

public interface LoginRepository  extends JpaRepository<Login, Integer> {


@Repository
public class LoginDao {
@Autowired
 LoginRepository loginRepository;


}
}