package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.widget.Toast
import com.example.calculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    private lateinit var operation:String
    private lateinit var firstnum:String
    private lateinit var secondnum:String
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val chisla = arrayOf(0,1,2,3,4,5,6,7,8,9)

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
        fun operation() {
            binding.bplus.setOnClickListener {
                binding.pt3.setText("+")
            }
            binding.bminus.setOnClickListener {
                binding.pt3.setText("-")
            }
            binding.bdevide.setOnClickListener {
                binding.pt3.setText("/")
            }
            binding.bumnozh.setOnClickListener {
                binding.pt3.setText("*")
            }
            binding.bdelete.setOnClickListener {
                binding.pt1.setText("")
                binding.pt2.setText("")
                binding.pt3.setText("")
            }


            }

            binding.bresult.setOnClickListener {
                if (binding.pt1.text.toString() == "" ) {
                    Toast.makeText(applicationContext, "Ты, блять, может первое число введешь?", Toast.LENGTH_SHORT).show()
                    onPause()}

                if (binding.pt2.text.toString() == "" ) {
                    Toast.makeText(applicationContext, "Ты, блять, может второе число введешь?", Toast.LENGTH_SHORT).show()
                    onPause()}

                if (binding.pt3.text.toString() == "" ) {
                    onPause()
                    Toast.makeText(applicationContext, "Ты, блять, может хочешь посчитать?", Toast.LENGTH_LONG).show()
                }
                val io = binding.pt1.text.toString()
                val oi = binding.pt2.text.toString()
                val te = binding.pt3.text.toString()

                val cio = io.toDouble()+oi.toDouble()
                val lio = io.toDouble()-oi.toDouble()
                val gio = io.toDouble()*oi.toDouble()
                val kio = io.toDouble()/oi.toDouble()
                    if (te == "+"){
                        binding.pt1.setText("$cio")
                        binding.pt2.setText("")
                        binding.pt3.setText("")
                    }
                if (te == "-"){
                    binding.pt1.setText("$lio")
                    binding.pt2.setText("")
                    binding.pt3.setText("")
                }
                if (te == "*") {
                    binding.pt1.setText("$gio")
                    binding.pt2.setText("")
                    binding.pt3.setText("")
                }
                if (te == "/") {
                    binding.pt1.setText("$kio")
                    binding.pt2.setText("")
                    binding.pt3.setText("")
                }
                if (binding.pt1.text.toString() == "1488"){
                    Toast.makeText(applicationContext, "Нацист блять", Toast.LENGTH_SHORT).show()
                }



            }
        operation()
        }








    }




