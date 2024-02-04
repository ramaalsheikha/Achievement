package com.example.achievement.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.achievement.data.model.AchievementResponseModel
import com.example.achievement.databinding.RowAchievementBinding

class AchievementAdapter(private val list: List<AchievementResponseModel>) :
    RecyclerView.Adapter<AchievementAdapter.MedalViewHolder>() {

    inner class MedalViewHolder(private val binding: RowAchievementBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(model: AchievementResponseModel) {
            binding.model = model
            binding.recyclerViewRecords.adapter =
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MedalViewHolder {
        val binding =
            RowAchievementBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MedalViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MedalViewHolder, position: Int) {
        holder.bind(list[position])
    }
}