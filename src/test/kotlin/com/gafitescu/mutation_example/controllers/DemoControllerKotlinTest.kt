package com.gafitescu.mutation_example.controllers

import junit.framework.TestCase.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DemoControllerKotlinTest {

    @Autowired
    lateinit var demoController: DemoController

    @Test
    fun test1() {
        assertEquals("Demo Kotlin", demoController.kotlinMessage)
    }
}