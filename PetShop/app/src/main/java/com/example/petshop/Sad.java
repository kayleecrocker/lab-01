package com.example.petshop;

import java.util.Date;

public class Sad extends Mood {

    public Sad() {
        super();
    }

    public Sad(Date date) {
        super(date);
    }

    @Override
    public String showMood() {
        return "Sad";
    }
}
