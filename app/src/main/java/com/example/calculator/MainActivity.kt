package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val viewModel: ViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initButtons()

        viewModel.planetext.observe(this) {
            binding.pt1.setText(it)
        }
        operations()

    }

    private fun initButtons(){
        val buttons = listOf(binding.b0,binding.b1,binding.b2,binding.b3,binding.b4,binding.b5,binding.b6,binding.b7,binding.b8,binding.b9,binding.bdot)

        with(binding.pt1) {
            buttons[0].setOnClickListener { setText(binding.pt1.text.toString() + "0") }
            buttons[1].setOnClickListener { setText(binding.pt1.text.toString() + "1") }
            buttons[2].setOnClickListener { setText(binding.pt1.text.toString() + "2") }
            buttons[3].setOnClickListener { setText(binding.pt1.text.toString() + "3")}
            buttons[4].setOnClickListener { setText(binding.pt1.text.toString() + "4") }
            buttons[5].setOnClickListener { setText(binding.pt1.text.toString() + "5")}
            buttons[6].setOnClickListener { setText(binding.pt1.text.toString() + "6") }
            buttons[7].setOnClickListener { setText(binding.pt1.text.toString() + "7") }
            buttons[8].setOnClickListener {setText(binding.pt1.text.toString() + "8")}
            buttons[9].setOnClickListener { setText(binding.pt1.text.toString() + "9") }
            buttons[10].setOnClickListener { setText(binding.pt1.text.toString() + ".") }
        }
    }
    fun operations() {
        val buttonsOperation = listOf(binding.bdelete, binding.bdevide, binding.bplus, binding.bminus, binding.bravno, binding.bumnozh)
        buttonsOperation[0].setOnClickListener { viewModel.delete() }
        buttonsOperation[1].setOnClickListener { viewModel.devide(binding.pt1.text.toString()) }
        buttonsOperation[2].setOnClickListener { viewModel.plus(binding.pt1.text.toString()) }
        buttonsOperation[3].setOnClickListener { viewModel.minus(binding.pt1.text.toString()) }
        buttonsOperation[4].setOnClickListener { viewModel.equals(binding.pt1.text.toString()) }
        buttonsOperation[5].setOnClickListener { viewModel.umnozh(binding.pt1.text.toString()) }
    }

}




















