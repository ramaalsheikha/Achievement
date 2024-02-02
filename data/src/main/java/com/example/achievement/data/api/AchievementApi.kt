package com.example.achievement.data.api

import com.example.achievement.data.model.AchievementResponseModel
import retrofit2.http.GET

interface AchievementApi {
     @GET("/achievements")
     suspend fun getAchievements():AchievementResponseModel
}