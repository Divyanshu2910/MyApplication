package com.studio.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.studio.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnClick.setOnClickListener {

            var intent = Intent(this,Result::class.java)
            intent.putExtra("String",binding.etString.text.toString())
            intent.putExtra("Float",binding.etFloat.text.toString())
            intent.putExtra("Double",binding.etDouble.text.toString())
            intent.putExtra("Char",binding.etChar.text.toString())
            startActivity(intent)
        }
    }

}