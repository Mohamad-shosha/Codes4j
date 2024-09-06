package com.shosha.springboot.demo.factorypattern.dao;

public class FootballCouch implements Couch {

    @Override
    public String getDailyWork() {
        return "play football 3 days in week";
    }

    @Override
    public String getCouchName() {
        return "Football";
    }
}
