package com.example.achievement.core


import android.app.Activity
import android.content.Context
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter(value=["app:imageUrl"])
fun imageView(imageView:ImageView,url:String?){
   Glide.with(Activity().baseContext)
      .load(url)
      .into(imageView)
}