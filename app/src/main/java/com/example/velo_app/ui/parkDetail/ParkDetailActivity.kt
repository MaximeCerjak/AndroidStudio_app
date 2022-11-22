package com.example.velo_app.ui.parkDetail

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.velo_app.R
import com.example.velo_app.model.parkSelected
import com.example.velo_app.model.stationSelected

class ParkDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_park_detail)
        val park = intent.getStringExtra("Park")
        val parkName = findViewById<TextView>(R.id.parkName)
        val openParkMapBtn = findViewById<Button>(R.id.openParkMapBtn)

        parkSelected?.let { park ->
            parkName.text = park.grpNom

            openParkMapBtn.setOnClickListener {
                // Display a label at the location of Google's Sydney office
                val gmmIntentUri =
                    Uri.parse("geo:0,0?q=${park.latitude},${park.longitude}")
                val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
                mapIntent.setPackage("com.google.android.apps.maps")
                startActivity(mapIntent)
            }
        }

    }
}