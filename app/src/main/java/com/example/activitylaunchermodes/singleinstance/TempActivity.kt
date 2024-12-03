package com.example.activitylaunchermodes.singleinstance

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.activitylaunchermodes.R
import com.example.activitylaunchermodes.databinding.ActivityTempBinding

class TempActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTempBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityTempBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}