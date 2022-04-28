package com.yusufemirhanarslan.classesandfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        test()

        //Void - Unit
        mySum(7,9)

        //Return
        var result = myMultiply(8,9)
        textView.text = "Result: ${result}"

        //Class
        //Object & Instance
        val homer = Simpson("Homer",50,"Nuclear")
        homer.hairColor = "Yellow"

        /*
        homer.name = "Homer"
        homer.age = 60
        homer.job = "Nuc"
*/
        println(homer.hairColor)

        //Nullability
        // Nullable (?) && Non-null
        // !! vs ?
        var myString: String? = null
        var myAge: Int? = null
        //println(myAge!! * 10)

        // !! myAge'in değeri kesinlikle initalize edilecek anlamına geliyor.

        //1)Null Safety
        if(myAge != null){
            println(myAge * 10)
        }else{
            println("myAge null")
        }

        //2)Safe Call
        println(myAge?.compareTo(2))

        //3)Elvis

        val myResult = myAge?.compareTo(2) ?: -100
        println(myResult)

    }

    fun test(){
        println("test function")
    }

    //Input & Return
    fun mySum(number1: Int,number2: Int){
        textView.text = "Result: ${number1 + number2}"
    }

    fun myMultiply(x: Int, y: Int): Int{

        return x * y
    }

    fun helloKotlin(view : View){
        textView.text = "Hello Kotlin"
    }








}