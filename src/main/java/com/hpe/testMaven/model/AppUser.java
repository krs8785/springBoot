package com.hpe.testMaven.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by shahkar on 9/7/2016.
 */

@Entity
@Table(name = "AppUser")
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String username;

    @NotNull
    private String password;

    @NotNull
    private String fName;

    @NotNull
    private String lName;

    @NotNull
    private String email;

    @NotNull
    private String dob;


    public AppUser(){

    }

    public AppUser(
            String _fName,
            String _lName,
            String _username,
            String _email,
            String _password,
            String _dob){
        this.setfName(_fName);
        this.setlName(_lName);
        this.setDob(_dob);
        this.setEmail(_email);
        this.setUsername(_username);
        this.password = _password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
