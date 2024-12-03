package com.example.activitylaunchermodes

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.activitylaunchermodes.databinding.ActivityMainBinding
import com.example.activitylaunchermodes.singleinstance.SingleInstanceActivity
import com.example.activitylaunchermodes.singletask.SingleTaskActivity
import com.example.activitylaunchermodes.singletop.SingleTopActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSingleTop.setOnClickListener {
            Intent(this, SingleTopActivity::class.java).also {
                startActivity(it)
            }
        }

        binding.btnSingleTask.setOnClickListener {
            Intent(this, SingleTaskActivity::class.java).also {
                startActivity(it)
            }
        }

        binding.btnSingleInstance.setOnClickListener {
            Intent(this, SingleInstanceActivity::class.java).also {
                startActivity(it)
            }
        }

    }
}