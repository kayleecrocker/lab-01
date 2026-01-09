package com.example.petshop;

import java.util.Date;

public class Scorpion extends Pet {
    public Scorpion(String name) {
        super(name);
    }

    public Scorpion(String name, Date birthdate) {
        super(name, birthdate);
    }

    @Override
    public String speak() {
        return "hissssss";
    }

}
