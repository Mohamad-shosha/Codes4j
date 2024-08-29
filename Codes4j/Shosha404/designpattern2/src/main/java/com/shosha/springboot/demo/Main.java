package com.shosha.springboot.demo;

import com.shosha.springboot.demo.delegationpattern.CouchHandler;
import com.shosha.springboot.demo.delegationpattern.delegated.FootballCouch;
import com.shosha.springboot.demo.delegationpattern.delegator.Couch;

import static com.shosha.springboot.demo.factorypattern.util.EnumCouch.FOOTBALL_COUCH;

public class Main {
    public static void main(String[] args) {
/*        Couch couch = CouchFactory.getCouch("FOOTBALL_COUCH");
        System.out.println(Objects.requireNonNull(couch).getDailyWork());
        System.out.println("Hello world!");*/

        Couch couch1 = new FootballCouch();
        CouchHandler couchHandler = new CouchHandler(couch1);
        System.out.println(couchHandler.getDailyWork());

    }
}