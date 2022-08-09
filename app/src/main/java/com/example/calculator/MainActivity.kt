package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import com.example.calculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

  class MainActivity : AppCompatActivity() {
      private var io: Double = 0.0
      private lateinit var firstnum: String
      private var operator = ""



      private lateinit var binding: ActivityMainBinding
      override fun onCreate(savedInstanceState: Bundle?) {
          super.onCreate(savedInstanceState)
          binding = ActivityMainBinding.inflate(layoutInflater)
          setContentView(binding.root)
          val rsrIntent = Intent(this, nazist::class.java)


          fun firstnum() {

              binding.b0.setOnClickListener {
                  binding.pt1.setText(binding.pt1.text.toString() + "0")
              }
              binding.b1.setOnClickListener {
                  binding.pt1.setText(binding.pt1.text.toString() + "1")
              }
              binding.b2.setOnClickListener {
                  binding.pt1.setText(binding.pt1.text.toString() + "2")
              }
              binding.b3.setOnClickListener {
                  binding.pt1.setText(binding.pt1.text.toString() + "3")
              }
              binding.b4.setOnClickListener {
                  binding.pt1.setText(binding.pt1.text.toString() + "4")
              }
              binding.b5.setOnClickListener {
                  binding.pt1.setText(binding.pt1.text.toString() + "5")
              }
              binding.b6.setOnClickListener {
                  binding.pt1.setText(binding.pt1.text.toString() + "6")
              }
              binding.b7.setOnClickListener {
                  binding.pt1.setText(binding.pt1.text.toString() + "7")
              }
              binding.b8.setOnClickListener {
                  binding.pt1.setText(binding.pt1.text.toString() + "8")
              }
              binding.b9.setOnClickListener {
                  binding.pt1.setText(binding.pt1.text.toString() + "9")
              }
              binding.bdot.setOnClickListener {
                  binding.pt1.setText(binding.pt1.text.toString() + ".")
              }
          }
          firstnum()

          var operator = ""
          
          binding.bplus.setOnClickListener {
              if (binding.pt1.text.isNullOrEmpty()) {
                  Toast.makeText(applicationContext, "Lox", Toast.LENGTH_SHORT).show()

              } else {
                  operator = "1"
                  val kto = binding.pt1.text.toString()
                  io = kto.toDouble()
                  binding.pt1.setText("")
                      if(binding.pt1.text.toString()=="1488.0") {
                          startActivity(rsrIntent)
                      }
              }
          }

          binding.bminus.setOnClickListener {
                operator = "2"
              if (binding.pt1.text.isNullOrEmpty()) {
                  Toast.makeText(applicationContext, "Lox", Toast.LENGTH_SHORT).show()
              } else {
                  val kto = binding.pt1.text.toString()
                  io = kto.toDouble()
                  binding.pt1.setText("")

                      if(binding.pt1.text.toString()=="1488.0") {
                          startActivity(rsrIntent)
                      }
              }
          }

          binding.bdevide.setOnClickListener {
              operator = "3"
              if (binding.pt1.text.isNullOrEmpty()) {
                  Toast.makeText(applicationContext, "Lox", Toast.LENGTH_SHORT).show()
              }
              else {
                  val kto = binding.pt1.text.toString()
                  io = kto.toDouble()
                  binding.pt1.setText("")
              }
                          if(binding.pt1.text.toString()=="1488.0") {
                              startActivity(rsrIntent)
                          }

              }


          binding.bumnozh.setOnClickListener {
                operator = "4"
              if (binding.pt1.text.isNullOrEmpty()) {
                  Toast.makeText(applicationContext, "Lox", Toast.LENGTH_SHORT).show()
              } else {
                  val kto = binding.pt1.text.toString()
                  io = kto.toDouble()
                  binding.pt1.setText("")
              }
          }

      binding.bravno.setOnClickListener{
          val oi = binding.pt1.text.toString()
          if (operator=="3" && binding.pt1.text.toString()=="0" &&  io != "0".toDouble()){
                         Toast.makeText(applicationContext, "Нельзя так брат", Toast.LENGTH_LONG).show()
                         binding.pt1.setText("")
                     }
          else if  (operator=="3" && (binding.pt1.text.toString() == "0") && (io == "0".toDouble())){
              binding.pt1.setText("1")
          }

              else {
              val end = when (operator) {
                  "1" -> (io + oi.toDouble())
                  "2" -> (io - oi.toDouble())
                  "3" -> (io / oi.toDouble())
                  "4" -> (io * oi.toDouble())
                  else -> "wtf"
              }
              binding.pt1.setText("$end")
              if (binding.pt1.text.toString() == "1488.0") {
                  startActivity(rsrIntent)
              }
          }

          }

          binding.bdelete.setOnClickListener {
              binding.pt1.setText("")
          }
      }
      }




















