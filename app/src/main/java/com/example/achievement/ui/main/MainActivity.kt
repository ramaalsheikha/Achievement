package com.example.achievement.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import com.example.achievement.R
import com.example.achievement.databinding.ActivityMainBinding
import com.example.achievement.ui.main.adapter.AchievementAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
     private val viewModel: MainViewModel by viewModels()
     private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initObserver()

    }

    private fun initObserver() {
        viewModel.achievementsSuccessLiveData.observe(this) { response ->
            binding.recyclerViewAcheivement.adapter = AchievementAdapter(response)
        }
        viewModel.exceptionsSuccessLiveData.observe(this){ e ->
                Toast.makeText(this,"Error = ${ e.localizedMessage}", Toast.LENGTH_SHORT).show()
            }
    }
}