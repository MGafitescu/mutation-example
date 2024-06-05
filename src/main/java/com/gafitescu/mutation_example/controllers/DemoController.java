package com.gafitescu.mutation_example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/demo")
    String getDemoMessage() {
        return "Demo";
    }

    @GetMapping("/example")
    String getExampleMessage() {
        return "Example";
    }

    public boolean numberLowerThanTen(int number) {
        if (number <= 10) {
            return true;
        } else {
            return false;
        }
    }
}
