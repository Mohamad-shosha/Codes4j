package com.shosha.springboot.demo.factorypattern.couchfactory;

import com.shosha.springboot.demo.factorypattern.dao.BaseballCouch;
import com.shosha.springboot.demo.factorypattern.dao.BasketballCouch;
import com.shosha.springboot.demo.factorypattern.dao.Couch;
import com.shosha.springboot.demo.factorypattern.dao.FootballCouch;
import com.shosha.springboot.demo.factorypattern.error.exception.NotFoundCouchException;

import static com.shosha.springboot.demo.factorypattern.util.EnumCouch.*;

public class CouchFactory {

    private CouchFactory(){

    }

    public static Couch getCouchFromString(String typeOfCouch) {
        if(FOOTBALL_COUCH.toString().equals(typeOfCouch.toUpperCase())) {
            return new FootballCouch();
        }
        else if(BASEBALL_COUCH.toString().equals(typeOfCouch.toUpperCase())) {
            return new BaseballCouch();
        }
        else if(BASKETBALL_COUCH.toString().equals(typeOfCouch.toUpperCase())) {
            return new BasketballCouch();
        }
        else {
            throw new NotFoundCouchException("No found the couch in factory");
        }
    }

    public static Couch getCouchFromCode(String code) {
        if(FOOTBALL_COUCH.getCode().equals(code)) {
            return new FootballCouch();
        }
        else if(BASEBALL_COUCH.getCode().equals(code)) {
            return new BaseballCouch();
        }
        else if(BASKETBALL_COUCH.getCode().equals(code)) {
            return new BasketballCouch();
        }
        else {
            throw new NotFoundCouchException("No found the couch in factory");
        }
    }

}
