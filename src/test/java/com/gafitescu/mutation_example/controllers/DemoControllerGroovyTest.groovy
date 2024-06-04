package com.gafitescu.mutation_example.controllers

import com.blogspot.toomuchcoding.spock.subjcollabs.Subject
import spock.lang.Specification

class DemoControllerGroovyTest extends Specification {

    @Subject
    DemoController demoController

    def "show example message"(){
        expect:
        demoController.getExampleMessage() == "Example"
    }
}