package com.example.graphqldemo.domain

import com.example.graphqldemo.domain.CountryClient
import com.example.graphqldemo.domain.DetailedCountry

class GetCountryUseCase(
    private val countryClient: CountryClient
) {
    suspend fun execute(code: String): DetailedCountry? {
        return countryClient.getCountry(code)
    }
}