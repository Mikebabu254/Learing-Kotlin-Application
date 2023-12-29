package com.example.mylearingkotlinapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //Edittext
        val number1 : EditText = findViewById(R.id.number1)
        val number2 : EditText = findViewById(R.id.number2)
        //textview
        val answer : TextView = findViewById(R.id.answer)
        //Button
        val addition : Button = findViewById(R.id.additionBtn)
        val subtruction : Button = findViewById(R.id.subtructionBtn)
        val multiply : Button = findViewById(R.id.multiplicationBtn)
        val division : Button = findViewById(R.id.divisionBtn)



        addition.setOnClickListener {

            try {
                val input1 = number1.text.toString().toInt()
                val input2 = number2.text.toString().toInt()

                val total = input1 + input2

                val tot = total.toString()

                answer.setText(tot)
            } catch (e: NumberFormatException) {
                // Handle the case where the input cannot be converted to an integer
                Toast.makeText(this, "Invalid input. Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }

        subtruction.setOnClickListener {

            try {
                val input1 = number1.text.toString().toInt()
                val input2 = number2.text.toString().toInt()

                val total = input1 - input2

                val tot = total.toString()
                answer.setText(tot)

            }catch (e: NumberFormatException){
                Toast.makeText(this,"Invalid input. Please enter valid numbers",Toast.LENGTH_SHORT).show()
            }

        }



        multiply.setOnClickListener {

            try {

                val input1 = number1.text.toString().toInt()
                val input2 = number2.text.toString().toInt()

                val total = input1 * input2

                val tot = total.toString()
                answer.setText(tot)

            }catch (e: NumberFormatException){
                Toast.makeText(this,"Invalid input. Please enter valid numbers",Toast.LENGTH_SHORT).show()
            }
        }

        division.setOnClickListener {

            try {

                val input1 = number1.text.toString().toInt()
                val input2 = number2.text.toString().toInt()

                val total = input1 / input2

                val tot = total.toString()
                answer.setText(tot)

            }catch (e: NumberFormatException){
                Toast.makeText(this,"Invalid input. Please enter valid numbers",Toast.LENGTH_SHORT).show()
            }


        }


    }
}