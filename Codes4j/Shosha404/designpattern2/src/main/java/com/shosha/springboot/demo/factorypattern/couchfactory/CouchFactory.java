package com.shosha.springboot.demo.factorypattern.couchfactory;

import com.shosha.springboot.demo.factorypattern.dao.BaseballCouch;
import com.shosha.springboot.demo.factorypattern.dao.BasketballCouch;
import com.shosha.springboot.demo.factorypattern.dao.Couch;
import com.shosha.springboot.demo.factorypattern.dao.FootballCouch;

import static com.shosha.springboot.demo.factorypattern.util.EnumCouch.*;

public class CouchFactory {

    private CouchFactory(){

    }

    public static Couch getCouch (String typeOfCouch) {
        if(FOOTBALL_COUCH.toString().equals(typeOfCouch)) {
            return new FootballCouch();
        }
        else if(BASEBALL_COUCH.toString().equals(typeOfCouch)) {
            return new BaseballCouch();
        }
        else if(BASKETBALL_COUCH.toString().equals(typeOfCouch)) {
            return new BasketballCouch();
        }
        else {
            return null;
        }
    }
}
