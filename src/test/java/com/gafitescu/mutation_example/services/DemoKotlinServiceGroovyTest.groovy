package com.gafitescu.mutation_example.services

import com.blogspot.toomuchcoding.spock.subjcollabs.Subject
import spock.lang.Specification
import spock.lang.Unroll

class DemoKotlinServiceGroovyTest extends Specification {

    @Subject
    DemoKotlinService demoKotlinService

    @Unroll
    def "test random number lower than"() {
        when:
        def actual = demoKotlinService.getRandomNumberLowerThan(input)

        then:
        assertionFunction.call(actual)

        where:
        input || assertionFunction
        10    || { n -> n >= 1 && n <= 10 }
        2     || { n -> n >= 1 && n <= 2 }
        1     || { n -> n == 0 }
        0     || { n -> n == 0 }
        -1    || { n -> n == 0 }
    }


}
