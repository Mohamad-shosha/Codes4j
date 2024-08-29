package com.shosha.springboot.demo.factorypattern.dao;

public class BasketballCouch implements Couch{

    @Override
    public String getDailyWork() {
        return "play basketball 6 times in month";
    }
}
