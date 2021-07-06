package com.mubassyir.complexui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mubassyir.complexui.databinding.ItemListBinding
import com.mubassyir.complexui.model.Food

class FoodAdapter:RecyclerView.Adapter<FoodAdapter.ViewHolder>() {

    private val data = ArrayList<Food>()

    fun setData(i:List<Food>?){
        i?.let {
            data.clear()
            data.addAll(i)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val pos = data[position]
        holder.bind(pos)
    }

    override fun getItemCount(): Int {
        return data.size
    }
    inner class ViewHolder(private val binding: ItemListBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(food:Food){
            with(binding){
                Glide.with(root.context)
                    .load(food.picture)
                    .into(ivPhoto)
                tvTitle.text = food.title

                itemView.setOnClickListener {
                    Toast.makeText(root.context,food.title,Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}