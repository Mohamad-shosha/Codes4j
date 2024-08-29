package com.shosha.springboot.demo.delegationpattern.delegated;

import com.shosha.springboot.demo.delegationpattern.delegator.Couch;

public class BaseballCouch implements Couch {

    @Override
    public String getDailyWork() {
        return "play baseball 4 times in month";
    }
}
