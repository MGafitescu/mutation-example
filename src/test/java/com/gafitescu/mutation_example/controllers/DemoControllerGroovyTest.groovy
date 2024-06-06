package com.gafitescu.mutation_example.controllers

import com.blogspot.toomuchcoding.spock.subjcollabs.Subject
import spock.lang.Specification

class DemoControllerGroovyTest extends Specification {

    @Subject
    DemoController demoController

    def "show demo message"() {
        expect:
        demoController.getGroovyDemoMessage() == "Demo Groovy"
    }

    def "test numberLowerThanTen"() {
        when:
        def actual = demoController.numberLowerThanTen(input)

        then:
        actual == expected

        where:
        input || expected
        7     || true
        14    || false
        10    || true
    }
}