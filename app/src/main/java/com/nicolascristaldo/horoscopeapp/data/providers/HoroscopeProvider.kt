package com.nicolascristaldo.horoscopeapp.data.providers

import com.nicolascristaldo.horoscopeapp.domain.model.HoroscopeInfo
import com.nicolascristaldo.horoscopeapp.domain.model.HoroscopeInfo.*
import javax.inject.Inject

class HoroscopeProvider @Inject constructor() {
    fun getHoroscopes(): List<HoroscopeInfo> {
        return listOf(
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
}