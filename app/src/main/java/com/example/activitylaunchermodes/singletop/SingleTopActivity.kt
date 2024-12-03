package com.example.activitylaunchermodes.singletop

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.activitylaunchermodes.R
import com.example.activitylaunchermodes.databinding.ActivitySingleTopBinding

class SingleTopActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySingleTopBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySingleTopBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        val message = intent.getStringExtra("message")
        binding.tvMessage.text = message ?: "No message"

        // Handle button click to launch the activity with new data
        binding.btnLaunch.setOnClickListener {
            Intent(this, SingleTopActivity::class.java).also {
                it.putExtra("message", "New message")
                startActivity(it)
            }
        }
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        // This method will be called if the activity is already at the top of the stack
        val newMessage = intent.getStringExtra("message")
        binding.tvMessage.text = newMessage ?: "No new message"
    }
}