package com.lucky.log_in_assessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lucky.log_in_assessment.databinding.ActivityLoginBinding
import com.lucky.log_in_assessment.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding : ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun validateForm():Boolean {
        val username = binding.etUser.text.toString()
        val password = binding.etpassword.text.toString()

        if (username.isEmpty()) {
            binding.etUser.error = "Username is required"
            return false
        }
        if (password.isEmpty()) {
            binding.etpassword.error = "Password is required"
            return false
        }

        return true
    }
}