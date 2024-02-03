package com.example.achievement.data.api

import com.example.achievement.data.model.AchievementResponseModel
import com.example.achievement.data.model.WrappedAchievementResponseModel
import retrofit2.http.GET

interface AchievementApi {
     @GET("/achievements")
     suspend fun getAchievements():WrappedAchievementResponseModel
}