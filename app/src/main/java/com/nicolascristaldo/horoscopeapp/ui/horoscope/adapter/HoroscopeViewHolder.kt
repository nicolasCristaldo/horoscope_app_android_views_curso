package com.nicolascristaldo.horoscopeapp.ui.horoscope.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.nicolascristaldo.horoscopeapp.databinding.ItemHoroscopeBinding
import com.nicolascristaldo.horoscopeapp.domain.model.HoroscopeInfo

class HoroscopeViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemHoroscopeBinding.bind(view)

    fun render(horoscopeInfo: HoroscopeInfo) {
        val ctx = binding.tvTitle.context
        binding.ivHoroscope.setImageResource(horoscopeInfo.img)
        binding.tvTitle.text = ctx.getString(horoscopeInfo.name)
    }
}