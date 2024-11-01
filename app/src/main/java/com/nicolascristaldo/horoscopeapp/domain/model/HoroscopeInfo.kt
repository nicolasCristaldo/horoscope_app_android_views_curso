package com.nicolascristaldo.horoscopeapp.domain.model

import com.nicolascristaldo.horoscopeapp.R

sealed class HoroscopeInfo(
    val name: Int,
    val img: Int
) {
    data object Aries: HoroscopeInfo(R.string.aries, R.drawable.ic_aries)
    data object Taurus: HoroscopeInfo(R.string.taurus, R.drawable.ic_taurus)
    data object Cancer: HoroscopeInfo(R.string.cancer, R.drawable.ic_cancer)
    data object Sagittarius: HoroscopeInfo(R.string.sagittarius, R.drawable.ic_sagittarius)
    data object Scorpio: HoroscopeInfo(R.string.scorpio, R.drawable.ic_scorpio)
    data object Leo: HoroscopeInfo(R.string.leo, R.drawable.ic_leo)
    data object Pisces: HoroscopeInfo(R.string.pisces, R.drawable.ic_pisces)
    data object Virgo: HoroscopeInfo(R.string.virgo, R.drawable.ic_virgo)
    data object Aquarius: HoroscopeInfo(R.string.aquarius, R.drawable.ic_aquarius)
    data object Capricorn: HoroscopeInfo(R.string.capricorn, R.drawable.ic_capricorn)
    data object Gemini: HoroscopeInfo(R.string.gemini, R.drawable.ic_gemini)
    data object Libra: HoroscopeInfo(R.string.libra, R.drawable.ic_libra)
}
