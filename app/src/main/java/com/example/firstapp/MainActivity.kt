package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonSubmit.setOnClickListener{
            val nome = binding.inputName.text.toString();
            if(nome != "") {
                binding.textViewHello.text = "Olá ${nome} !!!"
            }else {
                binding.textViewHello.text = "Sem dados!"
            }

        }
    }
}