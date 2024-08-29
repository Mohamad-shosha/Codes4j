package com.shosha.springboot.demo.delegationpattern.delegated;

import com.shosha.springboot.demo.delegationpattern.delegator.Couch;

public class FootballCouch implements Couch {

    @Override
    public String getDailyWork() {
        return "play football 3 days in week";
    }
}
