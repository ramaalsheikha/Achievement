package com.example.achievement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
     private lateinit var viewModel:MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViewModel()
        initObserver()

    }

    private fun initObserver() {
        viewModel.achievementsSuccessLiveData.observe(this) { response ->
            Toast.makeText(this, "Response = $response", Toast.LENGTH_SHORT).show()
        }
        viewModel.exceptionsSuccessLiveData.observe(this){ e ->
                Toast.makeText(this,"Error = ${ e.localizedMessage}", Toast.LENGTH_SHORT).show()
            }
    }

    private fun initViewModel() {
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
    }
}