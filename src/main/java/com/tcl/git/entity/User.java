package com.tcl.git.entity;

public class User {
    public int age;
    public String sex;
    public String address;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User(int age, String sex, String address) {
        this.age = age;
        this.sex = sex;
        this.address = address;
    }
}
