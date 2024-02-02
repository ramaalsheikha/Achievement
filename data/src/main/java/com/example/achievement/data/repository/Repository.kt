package com.example.achievement.data.repository

import com.example.achievement.data.api.AchievementApi
import com.example.achievement.data.model.AchievementResponseModel
import com.example.achievement.data.network.RetrofitBuilder

class Repository {
   suspend fun getAchievement():AchievementResponseModel{
        val achievementApi = RetrofitBuilder.getInstance().create(AchievementApi::class.java)
        return achievementApi.getAchievements()
    }
}