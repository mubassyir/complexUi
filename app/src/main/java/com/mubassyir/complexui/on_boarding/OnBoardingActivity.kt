package com.mubassyir.complexui.on_boarding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import androidx.viewpager2.widget.ViewPager2
import com.mubassyir.complexui.R
import com.mubassyir.complexui.adapter.OnBoardingAdapter
import com.mubassyir.complexui.databinding.ActivityOnBoardingBinding

class OnBoardingActivity : AppCompatActivity() {

    private var onBoardingPageChangeCallback = object : ViewPager2.OnPageChangeCallback() {
        override fun onPageSelected(position: Int) {
            updateCircleMarker(binding, position)
        }
    }
    private lateinit var binding: ActivityOnBoardingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val numberOfScreens = 3

        val onBoardingAdapter = OnBoardingAdapter(this, numberOfScreens)
        binding.onBoardingViewPager.adapter = onBoardingAdapter
        binding.onBoardingViewPager.registerOnPageChangeCallback(onBoardingPageChangeCallback)
    }

    private fun updateCircleMarker(binding: ActivityOnBoardingBinding, position: Int) {
        when (position) {
            0 -> {
                binding.onBoardingInitialCircle.background = ResourcesCompat.getDrawable(resources, R.drawable.bg_red_circle, null);
                binding.onBoardingMiddleCircle.background = ResourcesCompat.getDrawable(resources, R.drawable.bg_gray_circle, null);
                binding.onBoardingLastCircle.background = ResourcesCompat.getDrawable(resources, R.drawable.bg_gray_circle, null);
            }
            1 -> {
                binding.onBoardingInitialCircle.background = ResourcesCompat.getDrawable(resources, R.drawable.bg_gray_circle, null);
                binding.onBoardingMiddleCircle.background = ResourcesCompat.getDrawable(resources, R.drawable.bg_red_circle, null);
                binding.onBoardingLastCircle.background = ResourcesCompat.getDrawable(resources, R.drawable.bg_gray_circle, null);
            }
            2 -> {
                binding.onBoardingInitialCircle.background = ResourcesCompat.getDrawable(resources, R.drawable.bg_gray_circle, null);
                binding.onBoardingMiddleCircle.background = ResourcesCompat.getDrawable(resources, R.drawable.bg_gray_circle, null);
                binding.onBoardingLastCircle.background = ResourcesCompat.getDrawable(resources, R.drawable.bg_red_circle, null);
            }
        }
    }

    override fun onDestroy() {
        binding.onBoardingViewPager.unregisterOnPageChangeCallback(onBoardingPageChangeCallback)
        super.onDestroy()
    }
}