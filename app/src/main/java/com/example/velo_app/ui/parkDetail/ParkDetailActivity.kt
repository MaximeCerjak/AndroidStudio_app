package com.example.velo_app.ui.parkDetail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.velo_app.R

class ParkDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_park_detail)
        val pump = intent.getStringExtra("Pump")
        val pumpName = findViewById<TextView>(R.id.parkName)

        pumpName.text = pump
    }
}