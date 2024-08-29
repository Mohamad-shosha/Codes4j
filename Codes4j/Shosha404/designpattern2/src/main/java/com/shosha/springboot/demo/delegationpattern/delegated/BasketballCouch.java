package com.shosha.springboot.demo.delegationpattern.delegated;

import com.shosha.springboot.demo.delegationpattern.delegator.Couch;

public class BasketballCouch implements Couch {

    @Override
    public String getDailyWork() {
        return "play basketball 6 times in month";
    }
}
