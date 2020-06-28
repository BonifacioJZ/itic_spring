package com.itspa.itic.models.dao;

import com.itspa.itic.models.entity.itspa.User;

import org.springframework.data.repository.CrudRepository;

public interface IUserDao  extends CrudRepository<User ,Long >{

}