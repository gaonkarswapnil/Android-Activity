package com.example.activitylaunchermodes.singletask

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.activitylaunchermodes.R
import com.example.activitylaunchermodes.databinding.ActivityTemp1Binding

class Temp1Activity : AppCompatActivity() {
    private lateinit var binding: ActivityTemp1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityTemp1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNextActivity.setOnClickListener {
            Intent(this, Temp2Activity::class.java).also {
                startActivity(it)
            }
        }

        binding.btnMainActivity.setOnClickListener {
            Intent(this, SingleTaskActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}