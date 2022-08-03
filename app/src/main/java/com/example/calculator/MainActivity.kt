package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.widget.Toast
import com.example.calculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

  class MainActivity : AppCompatActivity() {
    private lateinit var firstnum:String
    private lateinit var secondnum:String
    private lateinit var io:String
    private lateinit var oi:String


      private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



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
        fun secondnum() {

            binding.b0.setOnClickListener {
                binding.pt2.setText(binding.pt2.text.toString() + "0")
            }
            binding.b1.setOnClickListener {
                binding.pt2.setText(binding.pt2.text.toString() + "1")
            }
            binding.b2.setOnClickListener {
                binding.pt2.setText(binding.pt2.text.toString() + "2")
            }
            binding.b3.setOnClickListener {
                binding.pt2.setText(binding.pt2.text.toString() + "3")
            }
            binding.b4.setOnClickListener {
                binding.pt2.setText(binding.pt2.text.toString() + "4")
            }
            binding.b5.setOnClickListener {
                binding.pt2.setText(binding.pt2.text.toString() + "5")
            }
            binding.b6.setOnClickListener {
                binding.pt2.setText(binding.pt2.text.toString() + "6")
            }
            binding.b7.setOnClickListener {
                binding.pt2.setText(binding.pt2.text.toString() + "7")
            }
            binding.b8.setOnClickListener {
                binding.pt2.setText(binding.pt2.text.toString() + "8")
            }
            binding.b9.setOnClickListener {
                binding.pt2.setText(binding.pt2.text.toString() + "9")
            }
            binding.bdot.setOnClickListener {
                binding.pt2.setText(binding.pt2.text.toString() + ".")
            }
        }
        var clickCount = 0
        binding.button20.setOnClickListener {
            clickCount++
            println("$clickCount")
            if (clickCount% 2 != 0){secondnum()}
            else
                firstnum()
        }





            binding.bplus.setOnClickListener {
                if (binding.pt1.text.isNullOrEmpty()){
                    Toast.makeText(applicationContext, "Lox", Toast.LENGTH_SHORT).show()

                }

                else if (binding.pt2.text.isNullOrEmpty()){
                    Toast.makeText(applicationContext, "Lox", Toast.LENGTH_SHORT).show()
                }
                else
                {val io = binding.pt1.text.toString()
                    val oi = binding.pt2.text.toString()
                    val cio = io.toDouble()+oi.toDouble()
                    binding.pt1.setText("$cio")
                    binding.pt2.setText("")}



            }
            binding.bminus.setOnClickListener {

                if (binding.pt1.text.isNullOrEmpty()){
                    Toast.makeText(applicationContext, "Lox", Toast.LENGTH_SHORT).show()
                }
                else if (binding.pt2.text.isNullOrEmpty()){
                    Toast.makeText(applicationContext, "Lox", Toast.LENGTH_SHORT).show()
                }
                else{
                val io = binding.pt1.text.toString()
                val oi = binding.pt2.text.toString()
                val lio = io.toDouble()-oi.toDouble()
                binding.pt1.setText("$lio")
                binding.pt2.setText("")}
            }
            binding.bdevide.setOnClickListener {
                if (binding.pt1.text.isNullOrEmpty()){
                    Toast.makeText(applicationContext, "Lox", Toast.LENGTH_SHORT).show()
                }
                else if (binding.pt2.text.isNullOrEmpty()){
                    Toast.makeText(applicationContext, "Lox", Toast.LENGTH_SHORT).show()
                }
                else{
                val io = binding.pt1.text.toString()
                val oi = binding.pt2.text.toString()
                val kio = io.toDouble()/oi.toDouble()
                binding.pt1.setText("$kio")
                binding.pt2.setText("")}

            }
            binding.bumnozh.setOnClickListener {

                if (binding.pt1.text.isNullOrEmpty()){
                    Toast.makeText(applicationContext, "Lox", Toast.LENGTH_SHORT).show()
                }
                else if (binding.pt2.text.isNullOrEmpty()){
                    Toast.makeText(applicationContext, "Lox", Toast.LENGTH_SHORT).show()
                }
                else{
                    val io = binding.pt1.text.toString()
                    val oi = binding.pt2.text.toString()
                    val gio = io.toDouble()*oi.toDouble()
                binding.pt1.setText("$gio")
                binding.pt2.setText("")}
            }
            binding.bdelete.setOnClickListener {
                binding.pt1.setText("")
                binding.pt2.setText("")

            }



            }

        }













