package com.gafitescu.mutation_example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

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

    public boolean numberLowerThanTen(int number) {
        if (number <= 10) {
            return true;
        } else {
            return false;
        }
    }
}
