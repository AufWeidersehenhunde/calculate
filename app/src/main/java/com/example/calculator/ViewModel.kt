package com.example.calculator

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.CreationExtras

class ViewModel : ViewModel() {
    private var operator: Operator? = null
    private var secondNumber: Double = 0.0
    private var firstNumber: Double = 0.0

    private var _planetext = MutableLiveData<String>() // state flow
    var planetext: LiveData<String> = _planetext

    enum class Operator {
        Plus, Minus, Devide, Umnozh
    }

    fun devide(check: String) {
        if (check.isNotEmpty()) {
            operator = Operator.Devide
            firstNumber = check.toDouble()
            _planetext.value = ""
        } else {
            _planetext.value = "Ошибка!!! Введите число"
        }
    }

    fun minus(check: String) {
        if (check.isEmpty()) {
            _planetext.value = "101"
        } else {
            operator = Operator.Minus
            firstNumber += check.toDouble()
            _planetext.value = ""
        }
    }

    fun umnozh(check: String) {
        if (check.isEmpty()) {
            _planetext.value = "101"
        } else {
            operator = Operator.Umnozh
            firstNumber += check.toDouble()
            _planetext.value = ""
        }
    }

    fun plus(check: String) {
        if (check.isEmpty()) {
            _planetext.value = "101"
        } else {
            operator = Operator.Plus
            firstNumber += check.toDouble()
            _planetext.value = ""
        }
    }

    fun equals(secondNumberForActivity: String) {
        if (secondNumberForActivity.isEmpty()) {
            _planetext.value = "kek"
        } else {
            secondNumber = secondNumberForActivity.toDouble()
            if (operator == Operator.Devide && secondNumber == 0.0 && firstNumber != 0.0) {
                _planetext.value = "eblan4ik"
            } else if (operator == Operator.Devide && secondNumber == null && firstNumber == 0.0) {
                _planetext.value = "vse normalno brat sha budem dratsa4"
            } else if (operator == Operator.Devide && secondNumber == 0.0 && firstNumber == 0.0) {
                _planetext.value = "vse normalno brat sha budem dratsa"
            } else {
                secondNumber = secondNumberForActivity.toDouble()
                val end = when (operator) {
                    Operator.Plus -> (firstNumber + secondNumber)
                    Operator.Minus -> (firstNumber - secondNumber)
                    Operator.Devide -> (firstNumber / secondNumber)
                    Operator.Umnozh -> (firstNumber * secondNumber)
                    else -> "wtf"
                }
                _planetext.value = "$end"

            }

        }
    }

    fun delete() {
        _planetext.value = ""
        firstNumber = 0.0
        secondNumber = 0.0
    }
}