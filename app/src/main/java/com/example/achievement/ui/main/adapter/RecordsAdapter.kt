package com.example.achievement.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.achievement.data.model.RecordsModel
import com.example.achievement.databinding.RowMedalBinding

class RecordsAdapter(private val list: List<RecordsModel>) :
    RecyclerView.Adapter<RecordsAdapter.RecordsViewHolder>() {

    inner class RecordsViewHolder(private val binding: RowMedalBinding) :
        RecyclerView.ViewHolder(binding.root) {
            fun bind(model:RecordsModel){
                binding.model = model

            }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecordsViewHolder {
       val binding = RowMedalBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return RecordsViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecordsViewHolder, position: Int) {
        holder.bind(list[position])
    }
}