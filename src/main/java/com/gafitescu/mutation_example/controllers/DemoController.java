package com.gafitescu.mutation_example.controllers;

import com.gafitescu.mutation_example.services.DemoKotlinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private DemoKotlinService demoKotlinService;

    @GetMapping("/demo-junit5")
    String getJunit5DemoMessage() {
        return "Demo Junit 5";
    }

    @GetMapping("/demo-groovy")
    String getGroovyDemoMessage() {
        return "Demo Groovy";
    }

    @GetMapping("/demo-junit4")
    String getJunit4DemoMessage() {
        return "Demo Junit 4";
    }

    @GetMapping("/demo-kotlin")
    String getKotlinMessage() {
        return "Demo Kotlin";
    }

    @GetMapping("/demo-kotlin-random")
    String getKotlinRandomMessage(@RequestParam(value = "upper-boundary", defaultValue = "30") int upperBoundary) {
        var randomNumber = demoKotlinService.getRandomNumberLowerThan(upperBoundary);
        return "Demo Kotlin " + randomNumber;
    }

    public boolean numberLowerThanTen(int number) {
        if (number <= 10) {
            return true;
        } else {
            return false;
        }
    }
}
