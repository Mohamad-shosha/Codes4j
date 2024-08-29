package com.shosha.springboot.demo.factorypattern.dao;

public class BaseballCouch implements Couch {

    @Override
    public String getDailyWork() {
        return "play baseball 4 times in month";
    }
}
