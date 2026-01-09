package com.example.petshop;

import java.util.Date;

public class Cat extends Pet implements Pettable {
    public Cat(String name) {
        super(name);
    }

    public Cat(String name, Date birthdate) {
        super(name, birthdate);
    }

    @Override
    public String speak() {
        return "mew mew meow";
    }

    @Override
    public void pet() {

    }
}
