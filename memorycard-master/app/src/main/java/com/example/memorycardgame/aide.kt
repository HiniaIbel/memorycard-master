package com.example.memorycardgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_aide.*

class aide : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_aide)

       val tvDynamic = TextView(this)
        tvDynamic.textSize = 20f

        tvDynamic.text ="hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"

        layout1.addView(tvDynamic)

    }
}