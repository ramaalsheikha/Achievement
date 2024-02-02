package com.example.achievement

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.achievement.data.model.AchievementResponseModel
import com.example.achievement.data.repository.Repository
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel:ViewModel() {
    private val repository = Repository()
    val achievementsSuccessLiveData:MutableLiveData<AchievementResponseModel> = MutableLiveData()

    init {
        getAchievement()
    }
    private fun getAchievement(){
        viewModelScope.launch {
            val response = repository.getAchievement()
            achievementsSuccessLiveData.postValue(response)
            delay(5000)
            achievementsSuccessLiveData.postValue(response)
        }


    }
}