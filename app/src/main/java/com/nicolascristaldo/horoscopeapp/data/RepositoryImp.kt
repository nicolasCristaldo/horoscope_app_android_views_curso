package com.nicolascristaldo.horoscopeapp.data

import android.util.Log
import com.nicolascristaldo.horoscopeapp.data.network.HoroscopeApiService
import com.nicolascristaldo.horoscopeapp.domain.Repository
import com.nicolascristaldo.horoscopeapp.domain.model.PredictionModel
import javax.inject.Inject

class RepositoryImp @Inject constructor(
    private val apiService: HoroscopeApiService
): Repository {

    override suspend fun getPrediction(sign: String): PredictionModel? {
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("getPrediction", it.message.toString())}

        return null
    }

}