package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.User_Dtls;

public interface UserRepository extends JpaRepository<User_Dtls,Integer>
{
	
	

}
