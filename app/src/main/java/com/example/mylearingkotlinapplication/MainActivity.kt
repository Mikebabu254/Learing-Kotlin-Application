package com.example.mylearingkotlinapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        val calc: Button = findViewById(R.id.calculator)

        button.setOnClickListener {
            intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        calc.setOnClickListener {
            intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
    }
}