package com.shosha.springboot.demo.delegationpattern.controller;

import com.shosha.springboot.demo.factorypattern.couchfactory.CouchFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DesignpatternController {
    @GetMapping
    public void getDailyWork(){
        CouchFactory.getCouch("Fotballcouch");
    }
}
