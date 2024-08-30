package com.shosha.springboot.demo.factorypattern.util;

import lombok.Getter;

@Getter
public enum EnumCouch {
    FOOTBALL_COUCH("fbc"),
    BASKETBALL_COUCH("bkc"),
    BASEBALL_COUCH("bsc");

    String code;

    EnumCouch(){
    }
    EnumCouch(String code){
        this.code = code;
    }
}
