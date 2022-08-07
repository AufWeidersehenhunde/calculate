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
      private lateinit var firstnum: String
      private lateinit var io: String
      private lateinit var oi: String


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


          binding.bplus.setOnClickListener {
              if (binding.pt1.text.isNullOrEmpty()) {
                  Toast.makeText(applicationContext, "Lox", Toast.LENGTH_SHORT).show()

              } else {
                  val io = binding.pt1.text.toString()
                  val cio = io.toDouble()
                  println("cio$cio")
                  binding.pt1.setText("")


                  binding.button20.setOnClickListener {
                      val oi = binding.pt1.text.toString()
                      val oic = oi.toDouble()
                      println("oic$oic")
                      val sum = cio + oic
                      binding.pt1.setText("$sum")
                      if(binding.pt1.text.toString()=="1488.0") {
                          startActivity(rsrIntent)
                      }
                  }

              }


          }

          binding.bminus.setOnClickListener {

              if (binding.pt1.text.isNullOrEmpty()) {
                  Toast.makeText(applicationContext, "Lox", Toast.LENGTH_SHORT).show()

              } else {
                  val io = binding.pt1.text.toString()
                  val cio = io.toDouble()
                  println("cio$cio")
                  binding.pt1.setText("")


                  binding.button20.setOnClickListener {
                      val oi = binding.pt1.text.toString()
                      val oic = oi.toDouble()
                      println("oic$oic")
                      val minus = cio - oic
                      binding.pt1.setText("$minus")
                      if(binding.pt1.text.toString()=="1488.0") {
                          startActivity(rsrIntent)
                      }
                  }

              }

          }


          binding.bdevide.setOnClickListener {
              if (binding.pt1.text.isNullOrEmpty()) {
                  Toast.makeText(applicationContext, "Lox", Toast.LENGTH_SHORT).show()

              }


              else {
                  val io = binding.pt1.text.toString()
                  val cio = io.toDouble()
                  println("cio$cio")
                  binding.pt1.setText("")


                  binding.button20.setOnClickListener {
                      if (binding.pt1.text.toString()=="0"&& io=="0"){
                              println("kaka")
                              binding.pt1.setText("1")
                      }

                     else if (binding.pt1.text.toString()=="0"){
                         Toast.makeText(applicationContext, "Нельзя так брат", Toast.LENGTH_LONG).show()
                         binding.pt1.setText("")

                     }


                      else {

                         val oi = binding.pt1.text.toString()
                         val oic = oi.toDouble()
                         println("oic$oic")

                             val devide = cio / oic
                             binding.pt1.setText("$devide")
                          if(binding.pt1.text.toString()=="1488.0") {
                              startActivity(rsrIntent)
                          }




                     }

                  }


              }
          }

          binding.bumnozh.setOnClickListener {

              if (binding.pt1.text.isNullOrEmpty()) {
                  Toast.makeText(applicationContext, "Lox", Toast.LENGTH_SHORT).show()

              } else {
                  val io = binding.pt1.text.toString()
                  val cio = io.toDouble()
                  println("cio$cio")
                  binding.pt1.setText("")


                  binding.button20.setOnClickListener {
                      val oi = binding.pt1.text.toString()
                      val oic = oi.toDouble()
                      println("oic$oic")
                      val umnozh = cio * oic
                      binding.pt1.setText("$umnozh")
                      if(binding.pt1.text.toString()=="1488.0") {
                          startActivity(rsrIntent)
                      }

                  }

              }
          }
          binding.bdelete.setOnClickListener {
              binding.pt1.setText("")
          }
      }
  }



















