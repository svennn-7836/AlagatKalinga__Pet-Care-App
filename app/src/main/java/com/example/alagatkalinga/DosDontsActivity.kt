package com.example.alagatkalinga

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class DosDontsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_dosdonts)

        val backButton: ImageView = findViewById(R.id.BackMenu1)
        backButton.setOnClickListener {
            onBackPressed()
        }
        // Add your activity setup code here
    }
}