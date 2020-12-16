package com.example.memorycardgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_aide.*
import java.time.chrono.JapaneseEra.values

class aide : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_aide)

       val tvDynamic = TextView(this)
        tvDynamic.textSize = 25f
        tvDynamic.setTextColor(getResources().getColor(R.color.black));
        tvDynamic.text ="-enter an identifier. -Select a difficulty level (by easy default)   -click on the play botton to start -click on the botton at the bottom left to stop the music-click on the botton at the bottom right to see the scores."

        layout1.addView(tvDynamic)

    }
}