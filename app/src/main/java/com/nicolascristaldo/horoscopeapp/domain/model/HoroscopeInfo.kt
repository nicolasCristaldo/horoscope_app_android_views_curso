package com.nicolascristaldo.horoscopeapp.domain.model

import com.nicolascristaldo.horoscopeapp.R

sealed class HoroscopeInfo(
    val name: Int,
    val img: Int
) {
    object Aries: HoroscopeInfo(R.string.aries, R.drawable.ic_aries)
    object Taurus: HoroscopeInfo(R.string.taurus, R.drawable.ic_taurus)
    object Cancer: HoroscopeInfo(R.string.cancer, R.drawable.ic_cancer)
    object Sagittarius: HoroscopeInfo(R.string.sagittarius, R.drawable.ic_sagittarius)
    object Scorpio: HoroscopeInfo(R.string.scorpio, R.drawable.ic_scorpio)
    object Leo: HoroscopeInfo(R.string.leo, R.drawable.ic_leo)
    object Pisces: HoroscopeInfo(R.string.pisces, R.drawable.ic_pisces)
    object Virgo: HoroscopeInfo(R.string.virgo, R.drawable.ic_virgo)
    object Aquarius: HoroscopeInfo(R.string.aquarius, R.drawable.ic_aquarius)
    object Capricorn: HoroscopeInfo(R.string.capricorn, R.drawable.ic_capricorn)
    object Gemini: HoroscopeInfo(R.string.gemini, R.drawable.ic_gemini)
    object Libra: HoroscopeInfo(R.string.libra, R.drawable.ic_libra)
}
