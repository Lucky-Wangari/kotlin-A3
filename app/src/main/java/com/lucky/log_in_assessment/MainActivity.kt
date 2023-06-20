package com.lucky.log_in_assessment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.lucky.log_in_assessment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val registration : Button = binding.btn1
        registration.setOnClickListener {
            val intent = Intent(this, LoginActivity:: class.java)
            startActivity(intent)
            finish()
        }


        fun validateForm():Boolean{
            val username = binding.etuser1.text.toString()
            val phoneNumber = binding.etphone.text.toString()
            val email = binding.etconfirm.text.toString()
            val password = binding.etconfirm2.text.toString()

            if (username.isEmpty()) {
                binding.etuser1.error = "Username is required"
                return false
            }

            if (phoneNumber.isEmpty()) {
                binding.etphone.error = "Phone number is required"
                return false
            }

            if (email.isEmpty()) {
                binding.etconfirm.error = "Email address is required"
                return false
            }

            if (password.isEmpty()) {
                binding.etconfirm2.error = "Password is required"
                return false
            }

            return true

        }
    }
}