package com.sharif.foodandnutrition.Models;

public class Users {
    String UsersName,mail,password,userId;

    public Users(String usersName, String mail, String password, String userId) {
        UsersName = usersName;
        this.mail = mail;
        this.password = password;
        this.userId = userId;
    }
    public Users(){

    }
    //Signup Constarctor

    public Users(String usersName, String mail, String password) {
        UsersName = usersName;
        this.mail = mail;
        this.password = password;

    }

    public String getUsersName() {
        return UsersName;
    }

    public void setUsersName(String usersName) {
        UsersName = usersName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
