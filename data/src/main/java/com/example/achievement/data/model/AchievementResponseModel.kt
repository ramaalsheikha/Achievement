package com.example.achievement.data.model

import com.google.gson.annotations.SerializedName

data class AchievementResponseModel(
    @SerializedName("id")
    val idAchievement:Int,

    val title:String,

    val label:String,

    val records:List<RecordsModel>,
)
