package com.amishra.app.service;

import org.springframework.stereotype.Service;

@Service
public class LearningApi implements LearningService {

    @Override
    public String initiateLearning() {
        return "Started Java with Spring-boot";
    }


    @Override
    public String finishLearning() {
        return "Finished Learning.";
    }
}
