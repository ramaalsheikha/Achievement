package com.example.achievement.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.achievement.data.model.AchievementResponseModel
import com.example.achievement.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@HiltViewModel
class MainViewModel(private val repository: Repository):ViewModel() {
    val achievementsSuccessLiveData:MutableLiveData<List<AchievementResponseModel>> = MutableLiveData()
    val exceptionsSuccessLiveData:MutableLiveData<Exception> = MutableLiveData()

    init {
        getAchievement()
    }
    private fun getAchievement(){
        viewModelScope.launch {
            try {
                val response = repository.getAchievement()
                achievementsSuccessLiveData.postValue(response)
            }catch (e:Exception){
                exceptionsSuccessLiveData.postValue(e)
            }

        }


    }
}