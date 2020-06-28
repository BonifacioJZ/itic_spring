package com.itspa.itic.models.dao;

import com.itspa.itic.models.entity.itspa.Teacher;

import org.springframework.data.repository.CrudRepository;

public interface ITeacherDao extends CrudRepository<Teacher,Long>{}