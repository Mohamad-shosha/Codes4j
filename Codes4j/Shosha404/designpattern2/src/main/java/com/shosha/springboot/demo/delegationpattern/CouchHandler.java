package com.shosha.springboot.demo.delegationpattern;

import com.shosha.springboot.demo.delegationpattern.delegator.Couch;
import org.springframework.beans.factory.annotation.Autowired;

public class CouchHandler {
    private final Couch couch;

    @Autowired
    public CouchHandler(Couch couch) {
        this.couch = couch;
    }

    public String getDailyWork (){
        return couch.getDailyWork();
    }
}
