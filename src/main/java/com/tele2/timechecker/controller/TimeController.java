package com.tele2.timechecker.controller;

import com.tele2.timechecker.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TimeController {

    private TimeService time;
    @Autowired
    public TimeController(TimeService time) {
        this.time = time;
    }

    @GetMapping(value = "/time")
    public ResponseEntity<String> read() {
        return new ResponseEntity<>(time.getTime(), HttpStatus.OK);

    }

}
