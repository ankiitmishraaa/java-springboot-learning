package com.amishra.app.controller;

import com.amishra.app.service.LearningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/learning")
public class LearningController {

    @Autowired
    private LearningService learningService;

    @GetMapping(value = "/start-learning")
    public ResponseEntity<String> startLearningSpringboot(){
        return new ResponseEntity<>(learningService.initiateLearning(), HttpStatus.OK);
    }

    @GetMapping(value = "/finish-learning")
    public ResponseEntity<String> finishLearning(){
        return new ResponseEntity<>(learningService.finishLearning(), HttpStatus.OK);
    }
}
