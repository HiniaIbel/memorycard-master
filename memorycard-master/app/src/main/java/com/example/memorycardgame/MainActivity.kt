package com.example.memorycardgame


import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat.recreate
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList
import android.widget.AdapterView as AdapterView1


class MainActivity : AppCompatActivity() {
    private lateinit var mp: MediaPlayer
    private var totalTime: Int = 0

    private lateinit var option: Spinner
    private lateinit var play: ImageButton
    private lateinit var playersname: String
    private lateinit var levelSelected: Level
    private lateinit var help : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //music
        mp = MediaPlayer.create(this, R.raw.baby)
        mp.isLooping = true
        mp.setVolume(0.5f,0.5f)
        totalTime = mp.duration


        // titre qui tourne
        memory.setOnClickListener {
            memory.animate().apply {
                duration = 1000
                alpha(.5f)
                scaleXBy(.1f)
                scaleYBy(.5f)
                rotationYBy(.5f)
                translationYBy(200f)
            }.withEndAction{
                memory.animate().apply {
                    duration = 1000
                    alpha(1f)
                    scaleXBy(-.1f)
                    scaleYBy(-.5f)
                    rotationXBy(360f)
                    translationYBy(-200f)
                }.start()
            }
        }




      // sett = findViewById(R.id.playBtn)


        openPlayAct()

        openhelp()

    }
    // play music

    fun playBtnClick(v: View) {

        if(mp.isPlaying){
            mp.pause()

        }else {
            mp.start()

        }

    }


    //__________________________________________________________
   private fun openPlayAct() {
        option = findViewById(R.id.levels)
        val levelList: MutableList<Level> = ArrayList()
        val level1 = Level("EASY")
        levelList.add(level1)
        val level2 = Level("MEDIUM")
        levelList.add(level2)
        val level3 = Level("HARD")
        levelList.add(level3)
        val adapter: ArrayAdapter<Level> = ArrayAdapter<Level>(
                this, android.R.layout.simple_spinner_item, levelList
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        option.setAdapter(adapter)
        option.onItemSelectedListener = object : android.widget.AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: android.widget.AdapterView<*>?) {
            }

            override fun onItemSelected(adapterView: AdapterView1<*>?, view: View?, position: Int, id: Long) {

                val level: Level = option.selectedItem as Level
                levelSelected = level
                Toast.makeText(this@MainActivity, "you selected the level ${adapterView?.getItemAtPosition(position).toString()}", Toast.LENGTH_LONG).show()


            }
        }




        play = findViewById(R.id.play)
        play.setOnClickListener {
            when (levelSelected.level) {
                "EASY" -> {
                    playersname = userName.text.toString()
                    var intentplay = Intent(this, playactivity::class.java)
                    Log.d("jjee", playersname)
                    intentplay.putExtra("PLAYER_NAME", playersname)
                    startActivity(intentplay)
                }

                "MEDIUM" -> {
                    playersname = userName.text.toString()
                    var intentplay = Intent(this, playActMeduim::class.java)
                    intentplay.putExtra("PLAYER_NAME", playersname)
                    startActivity(intentplay)
                }
                "HARD" -> {
                    playersname = userName.text.toString()
                    var intentplay = Intent(this, playActHard::class.java)
                    intentplay.putExtra("PLAYER_NAME", playersname)
                    startActivity(intentplay)
                }
                else -> Toast.makeText(this, "pick a level", Toast.LENGTH_LONG).show()
            }


        }

    }


    fun openhelp(){
        help = findViewById(R.id.help)
        help.setOnClickListener{
            var intHelp = Intent(this,aide::class.java)
           startActivity(intHelp)
        }
    }


}


