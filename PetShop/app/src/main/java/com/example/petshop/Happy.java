package com.example.petshop;

import java.util.Date;

public class Happy extends Mood {

    public Happy() {
        super();
    }

    public Happy(Date date) {
        super(date);
    }
    @Override
    public String showMood() {
        return "Happy";
    }
}
