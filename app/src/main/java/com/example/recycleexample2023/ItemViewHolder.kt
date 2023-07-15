package com.example.recycleexample2023

import androidx.recyclerview.widget.RecyclerView
import com.example.recycleexample2023.databinding.ItemLayoutBinding

class ItemViewHolder(private val binding:ItemLayoutBinding):RecyclerView.ViewHolder(binding.root){
    fun bind(item:Item){
        binding.txtRecycleName.text = item.name
        binding.txtRecycleDesc.text = item.descripton
    }
}