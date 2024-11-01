package com.nicolascristaldo.horoscopeapp.domain.useCase

import com.nicolascristaldo.horoscopeapp.domain.Repository
import javax.inject.Inject

class getPrediction @Inject constructor(private val repository: Repository) {
    suspend operator fun invoke(sign: String) = repository.getPrediction(sign)
}