package com.shosha.springboot.demo.designpattern.factorypattern;

public class TennisCouch implements Couch{

    @Override
    public String getDailyWorkout() {
        return ("Play tennis 4 times in week");
    }
}
