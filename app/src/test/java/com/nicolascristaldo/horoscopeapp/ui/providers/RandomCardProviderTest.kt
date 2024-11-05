package com.nicolascristaldo.horoscopeapp.ui.providers

import org.junit.Test
import org.junit.Assert.*

class RandomCardProviderTest {

    @Test
    fun `getRandomCard should return a random card`() {
        val randomCard = RandomCardProvider()

        val card = randomCard.getLucky()

        assertNotNull(card)
    }
}