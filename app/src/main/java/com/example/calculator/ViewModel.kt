package com.example.calculator


import android.content.Intent
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel : ViewModel() {
    val exp = MutableLiveData<String>()
    val answer = MutableLiveData<String>()

    init {
        exp.value = "0.0"
        answer.value = "0.0"
    }
    private var _planetext = MutableLiveData<String>()
    var planetext: LiveData<String> = _planetext
    var operator = ""
    fun firstnim(){
        val expi = exp.value

    }
    fun secondnum(){
        val answeri = answer.value

    }


    fun devide(check: String) {

        if (!check.isEmpty()) {
            operator = "3"
            firstnim()
        }

    }
    fun minus(check: String){

        if (check.isEmpty()) {
        } else {
            operator = "2"
            firstnim()

            if(_planetext.value=="1488.0") {
            }
        }
    }
    fun umnozh(check: String){

        if (check.isEmpty()) {
        } else {
            operator = "4"
            firstnim()
        }
    }
    fun plus(check: String){
        if (check.isEmpty()) {
        } else {
            operator = "1"
            firstnim()


        }
    }
    fun ravno(check: String){
        secondnum()
        if (operator=="3" && _planetext.value =="0" &&  exp!= "0".toDouble()){
            _planetext.value = ""
        }
        else if  (operator=="3" && _planetext.value == ""  && exp == "0".toDouble()){
            _planetext.value = "1"
        }

        else {
            val end = when (operator) {
                "1" -> (expi + answeri.toDouble())
                "2" -> (exp - answer.toDouble())
                "3" -> (exp / answer.toDouble())
                "4" -> (exp * answer.toDouble())
                else -> "wtf"
            }
            _planetext.value = "$end"

        }
    }
    fun delete(check: String){
        _planetext.value = ""
    }
}
