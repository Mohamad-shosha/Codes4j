package com.shosha.springboot.demo;

import com.shosha.springboot.demo.delegationpattern.CouchHandler;
import com.shosha.springboot.demo.delegationpattern.delegated.FootballCouch;
import com.shosha.springboot.demo.delegationpattern.delegator.Couch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.shosha.springboot.demo.factorypattern.util.EnumCouch.FOOTBALL_COUCH;
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}