package com.suchi.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.suchi.beans.Institute;

public interface InstituteRepository extends MongoRepository<Institute, Integer>{

}
