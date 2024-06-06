package com.gafitescu.mutation_example.controllers

import com.blogspot.toomuchcoding.spock.subjcollabs.Collaborator
import com.blogspot.toomuchcoding.spock.subjcollabs.Subject
import com.gafitescu.mutation_example.services.DemoKotlinService
import spock.lang.Specification
import spock.lang.Unroll

class DemoControllerGroovyTest extends Specification {

    @Subject
    DemoController demoController

    @Collaborator
    DemoKotlinService demoKotlinService = new DemoKotlinService()

    def "show demo message"() {
        expect:
        demoController.getGroovyDemoMessage() == "Demo Groovy"
    }

    @Unroll
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

    def "demo Kotlin random message"() {
        when:
        def actual = demoController.getKotlinRandomMessage(10)

        then:
        actual.matches("Demo Kotlin \\d*")
    }
}