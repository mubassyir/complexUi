package com.mubassyir.complexui.on_boarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.mubassyir.complexui.R
import com.mubassyir.complexui.data.DummyData
import com.mubassyir.complexui.databinding.FragmentOnBoardingBinding

class OnBoardingFragment : Fragment() {
    companion object {
        private const val ARG_POSITION = "ARG_POSITION"

        fun getInstance(position: Int) = OnBoardingFragment().apply {
            arguments = bundleOf(ARG_POSITION to position)
        }
    }

    private lateinit var binding: FragmentOnBoardingBinding

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnBoardingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val position = requireArguments().getInt(ARG_POSITION)
        val onBoardingTitles = DummyData.onBoardingTitles()
        val onBoardingMessages = DummyData.onBoardingMessages()
        val onBoardingImages = getOnBoardAssetsLocation()
        with(binding) {
            activity?.let {
                Glide.with(it)
                        .load(onBoardingImages[position])
                        .into(onBoardingImage)
            }
            onBoardingTextTitle.text = onBoardingTitles[position]
            onBoardingTextMsg.text = onBoardingMessages[position]
        }
    }

    private fun getOnBoardAssetsLocation(): List<Int> {
        val onBoardAssets = ArrayList<Int>()
        onBoardAssets.add(R.drawable.local_food_perkedel)
        onBoardAssets.add(R.drawable.local_food_pecel_lele)
        onBoardAssets.add(R.drawable.local_food_nasi_padang)
        return onBoardAssets
    }
}