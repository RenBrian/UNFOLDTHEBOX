package com.onebox.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onebox.backend.entity.User;;

public interface UserDao extends JpaRepository<User,String> {

}
