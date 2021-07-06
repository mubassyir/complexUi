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
import com.mubassyir.complexui.databinding.FragmentNusantaraBinding

class NusantaraFragment : Fragment(R.layout.fragment_nusantara) {
    private var fragmentBlankBinding: FragmentNusantaraBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentNusantaraBinding.bind(view)
        fragmentBlankBinding = binding

        val data = DummyData.localFood()
        val nusantaraAdapter = FoodAdapter()

        nusantaraAdapter.setData(data)

        with(binding.rvNusantara){
            adapter = nusantaraAdapter
            layoutManager = LinearLayoutManager(activity)
            setHasFixedSize(true)
        }

        binding.btnFabNusantara.setOnClickListener {
            Intent(activity,NewActivity::class.java).let{
                startActivity(it)
            }
        }
    }

}
