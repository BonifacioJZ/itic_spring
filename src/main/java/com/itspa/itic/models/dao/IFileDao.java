package com.itspa.itic.models.dao;

import com.itspa.itic.models.entity.itspa.File;

import org.springframework.data.repository.CrudRepository;

public interface IFileDao extends CrudRepository <File,Long>  {
    
}