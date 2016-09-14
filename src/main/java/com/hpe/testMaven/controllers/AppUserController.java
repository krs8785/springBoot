package com.hpe.testMaven.controllers;

import com.hpe.testMaven.model.AppUser;
import com.hpe.testMaven.service.AppUserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by shahkar on 9/7/2016.
 */

@Controller
public class AppUserController {

    @Autowired
    private AppUserDAO userDAO;

    @RequestMapping("/create")
    @ResponseBody
    public String create(String email, String name) {
        System.out.println("**** INSIDE CREATE **********");
        AppUser user = null;
        try {
            user = new AppUser(email, name,"a","b","c","d");
            userDAO.save(user);
        }
        catch (Exception ex) {
            return "Error creating the user: " + ex.toString();
        }
        return "User succesfully created! (id = " + user.getfName() + ")";
    }
}
