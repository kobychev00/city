package com.example.city.domain;

import java.util.Calendar;

public class User {
    private String name;
    private String surname;

    private short age;
    private char sex;
    private Calendar dateOfBirth;

    public User(String name, String surname, short age, char sex, Calendar dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}


