package com.example.techtaskforadmire

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView
import com.airbnb.lottie.LottieDrawable

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupAnimation()
    }

   private fun setupAnimation() {
        val animation = findViewById<LottieAnimationView>(R.id.av_typing_man)
        animation.repeatCount = LottieDrawable.INFINITE
    }
}