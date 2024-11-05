package com.nicolascristaldo.horoscopeapp.motherobject

import com.nicolascristaldo.horoscopeapp.data.network.response.PredictionResponse
import com.nicolascristaldo.horoscopeapp.domain.model.HoroscopeInfo.*

object HoroscopeMotherObject {

    val anyResponse = PredictionResponse("date", "horoscope", "sign")

    val horoscopeInfoList = listOf(
        Aries,
        Taurus,
        Cancer,
        Sagittarius,
        Scorpio,
        Leo,
        Pisces,
        Virgo,
        Aquarius,
        Capricorn,
        Gemini,
        Libra
    )
}