package com.example.activitylaunchermodes.singletask

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.activitylaunchermodes.R
import com.example.activitylaunchermodes.databinding.ActivityTemp2Binding

class Temp2Activity : AppCompatActivity() {
    private lateinit var binding: ActivityTemp2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityTemp2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnMainActivity.setOnClickListener {
            Intent(this, SingleTaskActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}