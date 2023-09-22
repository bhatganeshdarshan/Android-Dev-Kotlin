package com.example.app1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var count = 0
        val text = findViewById<TextView>(R.id.textView)
        val clicked = findViewById<Button>(R.id.myButton)
        clicked.setOnClickListener {
            count = count+ 1
            text.text = count.toString()
        }
        val res= findViewById<Button>(R.id.reset)
        res.setOnClickListener{
            count = 0
            text.text = count.toString()
        }
        Toast.makeText(this,"Made by Ganeshdarshan",Toast.LENGTH_LONG).show()
        }
    }
