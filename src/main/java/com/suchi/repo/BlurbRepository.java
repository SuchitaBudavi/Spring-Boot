package com.suchi.repo;

import org.springframework.data.repository.CrudRepository;

import com.suchi.beans.Blurb;

public interface BlurbRepository extends CrudRepository<Blurb,String>{

}
