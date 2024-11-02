package com.nicolascristaldo.horoscopeapp.ui.detail

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.navArgs
import com.nicolascristaldo.horoscopeapp.R
import com.nicolascristaldo.horoscopeapp.databinding.ActivityDetailBinding
import com.nicolascristaldo.horoscopeapp.domain.model.HoroscopeModel
import com.nicolascristaldo.horoscopeapp.domain.model.HoroscopeModel.*
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    private val detailViewModel: DetailViewModel by viewModels()

    private val args: DetailActivityArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initUI()
        detailViewModel.getHoroscope(args.type)
    }

    private fun initUI() {
        initListeners()
        initUIState()
    }

    private fun initListeners() {
        binding.ivBack.setOnClickListener { onBackPressedDispatcher.onBackPressed() }
    }

    private fun initUIState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                detailViewModel.state.collect {
                    when(it) {
                        DetailState.Loading -> loadingState()
                        is DetailState.Error -> errorState()
                        is DetailState.Success -> successState(it)
                    }
                }
            }
        }
    }

    private fun loadingState() {
        binding.progressBar.isVisible = true
    }

    private fun errorState() {
        binding.progressBar.isVisible = false
    }

    private fun successState(state: DetailState.Success) {
        binding.progressBar.isVisible = false
        binding.tvTitle.text = state.sign
        binding.tvBody.text = state.prediction

        val img = when(state.horoscopeModel) {
            Aries -> R.drawable.ic_aries
            Taurus -> R.drawable.ic_taurus
            Cancer -> R.drawable.ic_cancer
            Sagittarius -> R.drawable.ic_sagittarius
            Scorpio -> R.drawable.ic_scorpio
            Leo -> R.drawable.ic_leo
            Pisces -> R.drawable.ic_pisces
            Virgo -> R.drawable.ic_virgo
            Aquarius -> R.drawable.ic_aquarius
            Capricorn -> R.drawable.ic_capricorn
            Gemini -> R.drawable.ic_gemini
            Libra -> R.drawable.ic_libra
        }

        binding.ivDetail.setImageResource(img)
    }

}