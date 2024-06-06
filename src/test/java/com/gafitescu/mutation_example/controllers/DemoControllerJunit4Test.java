package com.gafitescu.mutation_example.controllers;


//Change the imports accordingly to toggle between JUnit4/5

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class DemoControllerJunit4Test {

    @Autowired
    private DemoController demoController;


    @Test
    public void test01() {
        assertEquals(demoController.getJunit4DemoMessage(), "Demo Junit 4");
    }
}
