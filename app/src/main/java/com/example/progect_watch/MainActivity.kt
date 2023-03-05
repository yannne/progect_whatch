package com.example.progect_watch

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.example.progect_watch.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun signin(view: View) {
        val intent = Intent(this,SignInActivity::class.java)
        startActivity(intent)
    }
}