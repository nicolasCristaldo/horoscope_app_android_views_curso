package com.nicolascristaldo.horoscopeapp.ui.detail

import com.nicolascristaldo.horoscopeapp.domain.model.HoroscopeModel

sealed class DetailState {
    data object Loading: DetailState()
    data class Error(val error: String): DetailState()
    data class Success(val prediction: String, val sign: String, val horoscopeModel: HoroscopeModel): DetailState()

}