package com.example.activitylaunchermodes.activityresultlauncher

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.activitylaunchermodes.R
import com.example.activitylaunchermodes.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSendMessage.setOnClickListener {
            if(binding.etMessage.text.trim().toString().isNotEmpty()){
                val result = Intent()
                result.putExtra("name", binding.etMessage.text.trim().toString())
                setResult(Activity.RESULT_OK, result)
                finish()
            }else{
                Toast.makeText(this, " Required ", Toast.LENGTH_SHORT).show()
            }
        }
    }
}