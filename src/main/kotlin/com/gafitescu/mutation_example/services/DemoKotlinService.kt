package com.gafitescu.mutation_example.services

import org.springframework.stereotype.Service

@Service
class DemoKotlinService {

    fun getRandomNumberLowerThan(upperBoundary: Int): Int {
        if (upperBoundary <= 1) {
            return 0
        }
        return (1..upperBoundary).shuffled().first()
    }
}