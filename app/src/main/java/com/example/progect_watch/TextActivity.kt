package com.example.progect_watch

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.progect_watch.databinding.ActivityTextBinding

class TextActivity : Activity() {

    private lateinit var binding: ActivityTextBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTextBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun sendresult(view: View) {
        Toast.makeText(this,"Sussec", Toast.LENGTH_SHORT).show()
    }
}