package com.hpe.testMaven.service;

import com.hpe.testMaven.model.AppUser;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by shahkar on 9/7/2016.
 */



@Transactional
public interface AppUserDAO extends CrudRepository<AppUser, Long> {

    public AppUser findByEmail(String email);

}