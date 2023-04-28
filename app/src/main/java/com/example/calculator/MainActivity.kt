package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         addingtwonumbers() // function call

    }

    fun addingtwonumbers() // function
    {
        var num1 = findViewById<EditText>(R.id.number1) // var( values change)
        var num2 = findViewById<EditText>(R.id.number2) // used to call values from frontend by Ids
        var button1 = findViewById<Button>(R.id.btn_add1)
        var button2 = findViewById<Button>(R.id.btn_add2)
        var button3 = findViewById<Button>(R.id.btn_add3)
        var button4 = findViewById<Button>(R.id.btn_add4)
        var resultText = findViewById<TextView>(R.id.result_tv)

        button1.setOnClickListener{// performs an operation
            var addnum1 = num1.text.toString().toInt() // change the string to integer
            var addnum2 = num2.text.toString().toInt()
            var result = addnum1 + addnum2 //  this works when the event is clicked
            resultText.text = result.toString()

            Toast.makeText(this,"$result",Toast.LENGTH_SHORT).show() // to verify if the button is working or not
            
        }
        button2.setOnClickListener {
            var addnum1 = num1.text.toString().toInt() // change the string to integer
            var addnum2 = num2.text.toString().toInt()
            var result = addnum1 - addnum2 //  this works when the event is clicked

            resultText.text = result.toString()
            Toast.makeText(this,"$result",Toast.LENGTH_SHORT).show()
        }
        button3.setOnClickListener {
            var addnum1 = num1.text.toString().toInt() // change the string to integer
            var addnum2 = num2.text.toString().toInt()
            var result = addnum1 - addnum2 //  this works when the event is clicked
            resultText.text = result.toString() // display result message

            Toast.makeText(this,"$result",Toast.LENGTH_SHORT).show()

        }
        button3.setOnClickListener {
            var addnum1 = num1.text.toString().toInt() // change the string to integer
            var addnum2 = num2.text.toString().toInt()
            var result = addnum1 - addnum2 //  this works when the event is clicked
            resultText.text = result.toString()
            Toast.makeText(this,"$result",Toast.LENGTH_SHORT).show()

        }





    }
}