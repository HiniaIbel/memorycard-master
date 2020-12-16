package com.example.memorycardgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_play_act_hard.*
import kotlinx.android.synthetic.main.activity_play_act_meduim.*
import kotlinx.android.synthetic.main.activity_playactivity.*
import kotlinx.coroutines.*

class playActHard : AppCompatActivity() {
    //return botton
    private lateinit var returnH: ImageView

     private var tab: MutableList<String> = mutableListOf()
    private var tabImg: MutableList<ImageView> = mutableListOf()
    private var tabImg2: MutableList<Int> = mutableListOf()
    private var tabb: MutableList<Int> = mutableListOf()
    var tablist : MutableList<Int> = mutableListOf(0,1,2,3,4,5,6,7,8,9,10,11,0,1,2,3,4,5,6,7,8,9,10,11)
    private lateinit var scoreHAR: TextView
    private var scoreH = 0
    var c = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_act_hard)
          var nameH = playerH
        val intent = intent
        var nameplayer = intent.getStringExtra("PLAYER_NAME")
        nameH.text = nameplayer


        var im1 = im1H
        var im2 = im2H
        var im3 = im3H
        var im4 = im4H
        var im5 = im5H
        var im6 = im6H
        var im7 = im7H
        var im8 = im8H
        var im9 = im9h
        var im10 = im10h
        var im11 = im11h
        var im12 = im12H
        var im13 = im13H
        var im14 = im14H
        var im15 = im15H
        var im16 = im16H
        var im17 = im17H
        var im18 = im18H
        var im19 = im19H
        var im20 = im20H
        var im21 = im21H
        var im22 = im22H
        var im23 = im23H
        var im24 = im24H

        tabImg2.add(R.drawable.a)
        tabImg2.add(R.drawable.b)
        tabImg2.add(R.drawable.c)
        tabImg2.add(R.drawable.d)
        tabImg2.add(R.drawable.e)
        tabImg2.add(R.drawable.f)
        tabImg2.add(R.drawable.g)
        tabImg2.add(R.drawable.h)
        tabImg2.add(R.drawable.i)
        tabImg2.add(R.drawable.j)
        tabImg2.add(R.drawable.k)
        tabImg2.add(R.drawable.l)



        while ( c < 24) {

            var r = (tablist).random()

            tabb.add(r)
            tablist.remove(r)

            c += 1
        }


        im1.setOnClickListener {
            val r = tabImg2[tabb[0]]
            tabImg.add(im1)
            tab.add(r.toString())
            im1.setImageResource(r)
            compare()

        }
        im2.setOnClickListener {
            val r = tabImg2[tabb[1]]
            tabImg.add(im2)
            tab.add(r.toString())
            im2.setImageResource(r)
            compare()
        }

        im3.setOnClickListener {
            val r = tabImg2[tabb[2]]
            tabImg.add(im3)
            tab.add(r.toString())
            im3.setImageResource(r)
            compare()
        }

        im4.setOnClickListener {
            val r = tabImg2[tabb[3]]
            tabImg.add(im4)
            tab.add(r.toString())
            im4.setImageResource(r)
            compare()
        }
        im5.setOnClickListener {
            val r = tabImg2[tabb[4]]
            tabImg.add(im5)
            tab.add(r.toString())
            im5.setImageResource(r)
            compare()
        }
        im6.setOnClickListener {
            val r = tabImg2[tabb[5]]
            tabImg.add(im6)
            tab.add(r.toString())
            im6.setImageResource(r)
            compare()
        }
        im7.setOnClickListener {
            val r = tabImg2[tabb[6]]
            tabImg.add(im7)
            tab.add(r.toString())
            im7.setImageResource(r)
            compare()
        }
        im8.setOnClickListener {
            val r = tabImg2[tabb[7]]
            tabImg.add(im8)
            tab.add(r.toString())
            im8.setImageResource(r)
            compare()
        }
        im9.setOnClickListener {
            val r = tabImg2[tabb[8]]
            tabImg.add(im9)
            tab.add(r.toString())
            im9.setImageResource(r)
            compare()
        }
        im10.setOnClickListener {
            val r = tabImg2[tabb[9]]
            tabImg.add(im10)
            tab.add(r.toString())
            im10.setImageResource(r)
            compare()
        }
        im11.setOnClickListener {
            val r = tabImg2[tabb[10]]
            tabImg.add(im11)
            tab.add(r.toString())
            im11.setImageResource(r)
            compare()
        }
        im12.setOnClickListener {
            val r = tabImg2[tabb[11]]
            tabImg.add(im12)
            tab.add(r.toString())
            im12.setImageResource(r)
            compare()
        }
        im13.setOnClickListener {
            val r = tabImg2[tabb[12]]
            tabImg.add(im13)
            tab.add(r.toString())
            im13.setImageResource(r)
            compare()

        }
        im14.setOnClickListener {
            val r = tabImg2[tabb[13]]
            tabImg.add(im14)
            tab.add(r.toString())
            im14.setImageResource(r)
            compare()
        }

        im15.setOnClickListener {
            val r = tabImg2[tabb[14]]
            tabImg.add(im15)
            tab.add(r.toString())
            im15.setImageResource(r)
            compare()
        }

        im16.setOnClickListener {
            val r = tabImg2[tabb[15]]
            tabImg.add(im16)
            tab.add(r.toString())
            im16.setImageResource(r)
            compare()
        }
        im17.setOnClickListener {
            val r = tabImg2[tabb[16]]
            tabImg.add(im17)
            tab.add(r.toString())
            im17.setImageResource(r)
            compare()
        }
        im18.setOnClickListener {
            val r = tabImg2[tabb[17]]
            tabImg.add(im18)
            tab.add(r.toString())
            im18.setImageResource(r)
            compare()
        }
        im19.setOnClickListener {
            val r = tabImg2[tabb[18]]
            tabImg.add(im19)
            tab.add(r.toString())
            im19.setImageResource(r)
            compare()
        }
        im20.setOnClickListener {
            val r = tabImg2[tabb[19]]
            tabImg.add(im20)
            tab.add(r.toString())
            im20.setImageResource(r)
            compare()
        }
        im21.setOnClickListener {
            val r = tabImg2[tabb[20]]
            tabImg.add(im21)
            tab.add(r.toString())
            im21.setImageResource(r)
            compare()
        }
        im22.setOnClickListener {
            val r = tabImg2[tabb[21]]
            tabImg.add(im22)
            tab.add(r.toString())
            im22.setImageResource(r)
            compare()
        }
        im23.setOnClickListener {
            val r = tabImg2[tabb[22]]
            tabImg.add(im23)
            tab.add(r.toString())
            im23.setImageResource(r)
            compare()
        }
        im24.setOnClickListener {
            val r = tabImg2[tabb[23]]
            tabImg.add(im24)
            tab.add(r.toString())
            im24.setImageResource(r)
        compare()
        }

        returnHomeH()

    }

    private fun compar() {
        if(tab.size == 2) {
            if (tab[0] == tab[1]) {
                scoreH += 1
                scoreHAR = scoreHARD
                scoreHAR.text = "Score += $scoreH !!"

            }else {
                defaced()
            }
            tab.clear()
        }



    }


    private fun defaced(){

        var n = tabImg.size
        var a = tabImg[n - 1]
        var b = tabImg[n - 2]
        a.setImageResource(R.drawable.point)
        b.setImageResource(R.drawable.point)
        tabImg.remove(a)
        tabImg.remove(b)

    }
    private fun compare() {

        GlobalScope.launch(Dispatchers.Main) {
            delay(2000L)
            compar()
        }
    }
    private fun returnHomeH() {
        returnH = returnHome3
        returnH.setOnClickListener {
            val intentReturnH = Intent(this, MainActivity::class.java)
            startActivity(intentReturnH)
        }
    }
}
