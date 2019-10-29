package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun toastMe(view: View) {
        val myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countMe(view: View) {

        val showCountTextView = findViewById<TextView>(R.id.textView)

        val countString = showCountTextView.text.toString()

        var count: Int = Integer.parseInt(countString)
        count++

        showCountTextView.text = count.toString()
    }

    fun random(view: View) {

        val randomIntent = Intent(this, SecondActivity::class.java) //declares intent to segue?

        val textView = findViewById<TextView>(R.id.textView) //retrieves text view from this class

        val countString = textView.text.toString() //converts the contents of the textview to a string

        val count = Integer.parseInt(countString) //turns this string into an integer again

        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count) //changes the TOTAL_COUNT variable in the next VC to the count in this VC

        startActivity(randomIntent)
    }

}

