package com.shosha.springboot.demo.factorypattern.controller;

import com.shosha.springboot.demo.factorypattern.couchfactory.CouchFactory;
import com.shosha.springboot.demo.factorypattern.dao.Couch;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class CouchController {
    @PostMapping("GetWork/{couch}")
    public void getWork(@PathVariable String couch) {
        Couch couch1 = CouchFactory.getCouchFromCode(couch);
        log.info(couch1.getDailyWork());
    }
}
