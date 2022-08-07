package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class nazist : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nazist)
        val fIntent = Intent(this, MainActivity::class.java)
            val cal =findViewById<TextView>(R.id.textView)
        cal.setOnClickListener{
            Toast.makeText(applicationContext, "Нахуй ты кликаешь?", Toast.LENGTH_SHORT).show()
        }
            val pal = findViewById<Button>(R.id.button)
        pal.setOnClickListener{
            startActivity(fIntent)
        }
                }
}