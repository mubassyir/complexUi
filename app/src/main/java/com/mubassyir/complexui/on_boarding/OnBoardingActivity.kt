package com.mubassyir.complexui.on_boarding

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import androidx.viewpager2.widget.ViewPager2
import com.mubassyir.complexui.MainActivity
import com.mubassyir.complexui.R
import com.mubassyir.complexui.adapter.OnBoardingAdapter
import com.mubassyir.complexui.databinding.ActivityOnBoardingBinding

class OnBoardingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOnBoardingBinding

    private var onBoardingPageChangeCallback = object : ViewPager2.OnPageChangeCallback() {
        override fun onPageSelected(position: Int) {
            updateCircleMarker(binding, position)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val numberOfScreens = 3

        val onBoardingAdapter = OnBoardingAdapter(this, numberOfScreens)
        binding.onBoardingViewPager.adapter = onBoardingAdapter
        binding.onBoardingViewPager.registerOnPageChangeCallback(onBoardingPageChangeCallback)

        binding.btnSkip.setOnClickListener {
            Intent(this, MainActivity::class.java).let{
                startActivity(it)
                finish()
            }
        }
    }

    private fun updateCircleMarker(binding: ActivityOnBoardingBinding, position: Int) {
        when (position) {
            0 -> {
                binding.onBoardingInitialCircle.background = ResourcesCompat.getDrawable(resources, R.drawable.bg_red_circle, null)
                binding.onBoardingMiddleCircle.background = ResourcesCompat.getDrawable(resources, R.drawable.bg_gray_circle, null)
                binding.onBoardingLastCircle.background = ResourcesCompat.getDrawable(resources, R.drawable.bg_gray_circle, null)
            }
            1 -> {
                binding.onBoardingInitialCircle.background = ResourcesCompat.getDrawable(resources, R.drawable.bg_gray_circle, null)
                binding.onBoardingMiddleCircle.background = ResourcesCompat.getDrawable(resources, R.drawable.bg_red_circle, null)
                binding.onBoardingLastCircle.background = ResourcesCompat.getDrawable(resources, R.drawable.bg_gray_circle, null)
            }
            2 -> {
                binding.onBoardingInitialCircle.background = ResourcesCompat.getDrawable(resources, R.drawable.bg_gray_circle, null)
                binding.onBoardingMiddleCircle.background = ResourcesCompat.getDrawable(resources, R.drawable.bg_gray_circle, null)
                binding.onBoardingLastCircle.background = ResourcesCompat.getDrawable(resources, R.drawable.bg_red_circle, null)
                binding.btnSkip.visibility = View.VISIBLE
            }
        }
    }

    override fun onDestroy() {
        binding.onBoardingViewPager.unregisterOnPageChangeCallback(onBoardingPageChangeCallback)
        super.onDestroy()
    }
}