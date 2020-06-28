package com.itspa.itic.models.dao;

import com.itspa.itic.models.entity.itic.Matter;

import org.springframework.data.repository.CrudRepository;

public interface IMatterDao extends CrudRepository<Matter,String>  {
    
}