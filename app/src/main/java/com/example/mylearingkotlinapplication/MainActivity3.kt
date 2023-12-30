package com.example.mylearingkotlinapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val zero: Button = findViewById(R.id.btnZero)
        val one: Button = findViewById(R.id.btnOne)
        val two: Button = findViewById(R.id.btnTwo)
        val three: Button = findViewById(R.id.btnThree)
        val four: Button = findViewById(R.id.btnFour)
        val five: Button = findViewById(R.id.btnFive)
        val six: Button = findViewById(R.id.btnSix)
        val seven: Button = findViewById(R.id.btnSeven)
        val eight: Button = findViewById(R.id.btnEight)
        val nine: Button = findViewById(R.id.btnNine)
        val C: Button = findViewById(R.id.btnC)
        val CE: Button = findViewById(R.id.btnCe)
        val answer: Button = findViewById(R.id.btnAnswer)
        val input: TextView = findViewById(R.id.input)

        zero.setOnClickListener {
            input.setText("0")
        }

        one.setOnClickListener {
            input.setText("1")
        }

        two.setOnClickListener {
            input.setText("2")
        }

        three.setOnClickListener {
            input.setText("3")
        }

        four.setOnClickListener {
            input.setText("4")
        }

        five.setOnClickListener {
            input.setText("5")
        }

        six.setOnClickListener {
            input.setText("6")
        }

        seven.setOnClickListener {
            input.setText("7")
        }

        eight.setOnClickListener {
            input.setText("8")
        }

        nine.setOnClickListener {
            input.setText("9")
        }

    }
}