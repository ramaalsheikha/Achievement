package com.example.achievement.data.repository

import com.example.achievement.data.api.AchievementApi
import com.example.achievement.data.model.AchievementResponseModel
import com.example.achievement.data.network.RetrofitBuilder

class Repository(private val achievement:AchievementApi) {
   suspend fun getAchievement():List<AchievementResponseModel>{
       return achievement.getAchievements().data
   }
}