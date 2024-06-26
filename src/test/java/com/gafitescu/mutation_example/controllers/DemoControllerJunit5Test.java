package com.gafitescu.mutation_example.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class DemoControllerJunit5Test {

    @Autowired
    private DemoController demoController;

    @Test
    void testDemoMessage() {
        assertEquals(demoController.getJunit5DemoMessage(), "Demo Junit 5");
    }
}
