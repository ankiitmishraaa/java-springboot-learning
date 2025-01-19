package com.amishra.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/learning")
public class LearningController {

    @GetMapping(value="/start-learning")
    public String startLearningSpringboot(){
        return "Started Java with Spring-boot";
    }
}
