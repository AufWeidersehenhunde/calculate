package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
      private var io: Double = 0.0
      private lateinit var firstnum: String
      private var operator = ""
      private val viewModel: ViewModel by viewModels()


      private lateinit var binding: ActivityMainBinding
      override fun onCreate(savedInstanceState: Bundle?) {
          super.onCreate(savedInstanceState)
          binding = ActivityMainBinding.inflate(layoutInflater)
          setContentView(binding.root)
          val rsrIntent = Intent(this, nazist::class.java)
          val textin = binding.pt1.text

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
          val ptext = binding.pt1.text.toString()


          viewModel.planetext.observe(this) {
              binding.pt1.setText(it)
          }

          binding.bplus.setOnClickListener {
              viewModel.plus(ptext)
              binding.pt1.setText("")
          }

          binding.bminus.setOnClickListener {
              viewModel.minus(ptext)
              binding.pt1.setText("")

          }

          binding.bdevide.setOnClickListener {
              viewModel.devide(ptext)
              binding.pt1.setText("")


              }


          binding.bumnozh.setOnClickListener {
              viewModel.umnozh(ptext)

              binding.pt1.setText("")
          }

      binding.bravno.setOnClickListener{
          viewModel.ravno(ptext)


          }

          binding.bdelete.setOnClickListener {
              viewModel.delete(ptext)
          }
      }
      }




















