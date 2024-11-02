package com.nicolascristaldo.horoscopeapp.ui.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nicolascristaldo.horoscopeapp.domain.model.HoroscopeModel
import com.nicolascristaldo.horoscopeapp.domain.useCase.getPrediction
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(
    private val getPrediction: getPrediction
) : ViewModel() {

    private var _state = MutableStateFlow<DetailState>(DetailState.Loading)
    val state: StateFlow<DetailState> = _state

    lateinit var horoscope: HoroscopeModel

    fun getHoroscope(sign: HoroscopeModel) {
        horoscope = sign
        viewModelScope.launch {
            _state.value = DetailState.Loading
            val result = withContext(Dispatchers.IO) {
                getPrediction(sign.name)
            }

            if (result == null) {
                _state.value = DetailState.Error("Error")
            } else {
                _state.value = DetailState.Success(result.horoscope, result.sign, horoscope)
            }
        }
    }

}