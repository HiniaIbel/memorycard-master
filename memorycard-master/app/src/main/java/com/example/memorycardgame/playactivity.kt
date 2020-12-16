package com.example.memorycardgame

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.memorycardgame.R.drawable.*
import kotlinx.android.synthetic.main.activity_playactivity.*
import kotlinx.coroutines.*


class playactivity : AppCompatActivity() {
    private lateinit var returnE: ImageView
    private var tab: MutableList<Int> = mutableListOf()
    private var tabImg: MutableList<ImageView> = mutableListOf()
    private var tabImg2: MutableList<Int> = mutableListOf()
    private var tabb: MutableList<Int> = mutableListOf()
    var tablist: MutableList<Int> = mutableListOf(0, 1, 2, 0, 1, 2)
    private lateinit var scoreEa: TextView
    private var scoreE = 0
    var c = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playactivity)


        val im1 = im1
        val im2 = im2
        val im3 = im3
        val im4 = im4
        val im5 = im5
        val im6 = im6




        val name = playerE
        val intent = intent
        val nameplayer = intent.getStringExtra("PLAYER_NAME")
        name.text = nameplayer



        tabImg2.add(chat)
        tabImg2.add(lion)
        tabImg2.add(chien)


        while ( c < 6) {
            val r = (tablist).random()
            tabb.add(r)
            tablist.remove(r)
            c += 1
        }


        im1.setOnClickListener {
            if( tab.size < 2) {
                val r = tabImg2[tabb[0]]
                tabImg.add(im1)
                tab.add(r)
                im1.setImageResource(r)
                compare()
            }
        }
        im2.setOnClickListener {
                 if ( tab.size < 2) {
                     val r = tabImg2[tabb[1]]
                     tabImg.add(im2)
                     tab.add(r)
                     im2.setImageResource(r)
                     compare()
                 }
        }

        im3.setOnClickListener {
            if(tab.size < 2) {
                val r = tabImg2[tabb[2]]
                tabImg.add(im3)
                tab.add(r)
                im3.setImageResource(r)
                compare()
            }
        }

        im4.setOnClickListener {
            if (tab.size < 2) {
            val r = tabImg2[tabb[3]]
            tabImg.add(im4)
            tab.add(r)
            im4.setImageResource(r)
            compare()
        }
        }
        im5.setOnClickListener {
            if(tab.size < 2) {
                val r = tabImg2[tabb[4]]
                tabImg.add(im5)

                tab.add(r)
                im5.setImageResource(r)
                compare()
            }
        }
        im6.setOnClickListener {
            if(tab.size < 2) {
                val r = tabImg2[tabb[5]]
                tabImg.add(im6)
                tab.add(r)
                im6.setImageResource(r)
                compare()
            }
        }

        returnHomeE()
    }

private fun compar() {
        if(tab.size == 2) {
            if (tab[0] == tab[1]) {
                scoreE += 1
                scoreEa = scoreEasy
                scoreEa.text = "Score += $scoreE !!"

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
        a.setImageResource(point)
        b.setImageResource(point)
        tabImg.remove(a)
        tabImg.remove(b)

   }
    private fun compare() {
        GlobalScope.launch(Dispatchers.Main) {
            delay(2000L)
            compar()
        }
    }

    private fun returnHomeE() {
        returnE = returnHome1
        returnE.setOnClickListener {
            val intentReturn = Intent(this, MainActivity::class.java)
            startActivity(intentReturn)
        }
    }

}








