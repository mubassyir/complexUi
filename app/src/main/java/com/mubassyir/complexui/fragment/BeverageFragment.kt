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
import com.mubassyir.complexui.databinding.FragmentBeverageBinding

class BeverageFragment : Fragment(R.layout.fragment_beverage) {

    private var fragmentBlankBinding: FragmentBeverageBinding? = null

    companion object {
        fun create(): BeverageFragment {
            return BeverageFragment()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentBeverageBinding.bind(view)
        fragmentBlankBinding = binding

        val data = DummyData.westernBeverage()
        val beverageAdapter = FoodAdapter()
        beverageAdapter.setData(data)

        with(binding.rvBeverage){
            adapter = beverageAdapter
            layoutManager = LinearLayoutManager(context)
        }

        binding.btnFabBeverage.setOnClickListener {
            Intent(activity,NewActivity::class.java).let{
                startActivity(it)
            }
        }
    }

}