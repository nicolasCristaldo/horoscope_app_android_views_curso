package com.nicolascristaldo.horoscopeapp.data.network.response

import com.nicolascristaldo.horoscopeapp.motherobject.HoroscopeMotherObject
import io.kotlintest.shouldBe
import org.junit.Test

class PredictionResponseTest {

    @Test
    fun `toDomain should return a correct predictionModel`() {
        // given
        val horoscopeResponse = HoroscopeMotherObject.anyResponse.copy(sign = "new sign")

        // when
        val predictionModel = horoscopeResponse.toDomain()

        // then
        predictionModel.sign shouldBe horoscopeResponse.sign
        predictionModel.horoscope shouldBe horoscopeResponse.horoscope
    }
}