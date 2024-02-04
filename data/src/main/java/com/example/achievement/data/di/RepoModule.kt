package com.example.achievement.data.di

import com.example.achievement.data.api.AchievementApi
import com.example.achievement.data.repository.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    fun provideRepo(achievementApi:AchievementApi):Repository{
        return Repository(achievementApi)
    }
}