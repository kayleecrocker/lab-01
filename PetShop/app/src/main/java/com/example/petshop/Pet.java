package com.example.petshop;

import java.util.Date;

public abstract class Pet {

    private String name;
    private Date birthdate;

    public Pet(String name) {
        this.name = name;
        this.birthdate = new Date();
    }

    public Pet(String name, Date birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public abstract String speak();
}
