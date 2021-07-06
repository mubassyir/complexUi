package com.mubassyir.complexui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.google.android.material.tabs.TabLayoutMediator
import com.mubassyir.complexui.databinding.FragmentNusantaraBinding
import com.mubassyir.complexui.databinding.FragmentWesternBinding

class WesternFragment : Fragment(R.layout.fragment_western) {

    private var fragmentBlankBinding: FragmentWesternBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentWesternBinding.bind(view)
        fragmentBlankBinding = binding
        renderTabLayer(binding)
        renderViewPager(binding)
    }

    private fun renderTabLayer(binding: FragmentWesternBinding?) {
        binding?.viewpager?.adapter = object : FragmentStateAdapter(this) {

            override fun createFragment(position: Int): Fragment {
                return ResourceStore.pagerFragments[position]
            }

            override fun getItemCount(): Int {
                return ResourceStore.tabList.size
            }
        }
    }

    private fun renderViewPager(binding: FragmentWesternBinding?) {
        TabLayoutMediator(binding!!.tabs, binding.viewpager) { tab, position ->
            tab.text = getString(ResourceStore.tabList[position])
        }.attach()

    }

}