package com.mubassyir.complexui.fragment

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.mubassyir.complexui.NewActivity
import com.mubassyir.complexui.R
import com.mubassyir.complexui.adapter.FoodAdapter
import com.mubassyir.complexui.data.DummyData
import com.mubassyir.complexui.databinding.FragmentFoodBinding


class FoodFragment : Fragment(R.layout.fragment_food) {
    private var fragmentBlankBinding: FragmentFoodBinding? = null

    companion object {
        fun create(): FoodFragment {
            return FoodFragment()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentFoodBinding.bind(view)
        fragmentBlankBinding = binding

        val data = DummyData.westernFood()
        val foodAdapter = FoodAdapter()
        foodAdapter.setData(data)
        with(binding.rvFood){
            adapter = foodAdapter
            layoutManager = LinearLayoutManager(activity)
            setHasFixedSize(true)
        }

        binding.btnFabFood.setOnClickListener {
            Intent(activity,NewActivity::class.java).let {
                startActivity(it)
            }
        }
    }
}