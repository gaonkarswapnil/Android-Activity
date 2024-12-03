package com.example.activitylaunchermodes.singleinstance

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.activitylaunchermodes.R
import com.example.activitylaunchermodes.databinding.ActivitySingleInstanceBinding

class SingleInstanceActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySingleInstanceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySingleInstanceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSingleInstance.setOnClickListener {
            Intent(this, TempActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}