package com.hpe.testMaven.controllers;

import com.hpe.testMaven.model.AppUser;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by shahkar on 9/7/2016.
 */

@RestController
public class testController {


    @RequestMapping(
            value = "/api/getUsers",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getUsers(){

        return new ResponseEntity<String>("kk", HttpStatus.OK);
    }


}
