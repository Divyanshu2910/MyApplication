package com.studio.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.studio.myapplication.databinding.ActivityResultBinding

class Result : AppCompatActivity() {
     lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        intent?.let {
            val String = intent.getStringExtra("String")
            val Float = intent.getStringExtra("Float")
            val Double = intent.getStringExtra("Double")
            val Char = intent.getStringExtra("Char")

            binding.tvString.text = "" + String
            binding.tvFloat.text = "" + Float
            binding.tvDouble.text = "" + Double
            binding.tvChar.text = "" + Char
        }

    }
}