package com.example.progect_watch

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.progect_watch.databinding.ActivitySignInBinding

class SignInActivity : Activity() {
    private lateinit var binding: ActivitySignInBinding

    lateinit var Email:EditText
    lateinit var Password:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Email = findViewById(R.id.editTextTextEmailAddress)
        Password = findViewById(R.id.editTextTextPassword)
    }

    fun signin(view: View) {
        if(Email.text.isNotEmpty() && Password.text.isNotEmpty()){
            val intent = Intent(this, TextActivity::class.java)
            startActivity(intent)
        }
        else{
            Toast.makeText(this,"Error",Toast.LENGTH_SHORT).show()
        }
    }
}