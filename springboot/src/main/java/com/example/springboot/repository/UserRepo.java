package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.model.User;

public interface UserRepo extends JpaRepository<User,Integer>{
    
}