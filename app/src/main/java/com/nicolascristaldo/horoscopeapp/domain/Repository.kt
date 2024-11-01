package com.nicolascristaldo.horoscopeapp.domain

import com.nicolascristaldo.horoscopeapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign: String): PredictionModel?
}