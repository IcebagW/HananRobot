package com.support.android.designlibdemo;

import java.io.Serializable;


public class User implements Serializable{
    /*
    private int id;
    private String email;
    private String address;
    private String username;
    private String password;
    private int age;
    private String sex;
    private String mobile;
    public User() {
        super();
        // TODO Auto-generated constructor stub
    }
    public User(String email,String address,String username, String password, int age, String sex,String mobile) {
        super();
        this.email=email;
        this.address=address;
        this.username = username;
        this.password = password;
        this.age = age;
        this.sex = sex;
        this.mobile=mobile;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getEmail(){return email;}
    public void setEmail(String email){this.email=email;}

    public String getAddress(){return address;}
    public void setAddress(String address){this.address=address;}

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

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", email=" + email + ", address=" + address + ", username=" + username + ", password="
                + password + ", age=" + age + ", sex=" + sex + ", mobile=" + mobile + "]";
    }
    */
    private int id;
    private String username;
    private String password;
    private int age;
    private String sex;
    public User() {
        super();
        // TODO Auto-generated constructor stub
    }
    public User(String username, String password, int age, String sex) {
        super();
        this.username = username;
        this.password = password;
        this.age = age;
        this.sex = sex;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", password="
                + password + ", age=" + age + ", sex=" + sex + "]";
    }
}

