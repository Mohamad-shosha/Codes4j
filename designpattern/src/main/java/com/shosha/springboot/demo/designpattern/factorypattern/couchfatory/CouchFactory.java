package com.shosha.springboot.demo.designpattern.factorypattern.couchfatory;

import com.shosha.springboot.demo.designpattern.error.exception.CouchNotFoundException;
import com.shosha.springboot.demo.designpattern.factorypattern.BaseballCouch;
import com.shosha.springboot.demo.designpattern.factorypattern.Couch;
import com.shosha.springboot.demo.designpattern.factorypattern.FootballCouch;
import com.shosha.springboot.demo.designpattern.factorypattern.TennisCouch;

public class CouchFactory {
    public Couch createCouch(String couch) {
        return switch (couch) {
            case "Tennis Couch" -> new TennisCouch();
            case "Football Couch" -> new FootballCouch();
            case "Baseball Couch" -> new BaseballCouch();
            default -> throw new CouchNotFoundException("Can not found this couch" + couch);
        };
    }
}
