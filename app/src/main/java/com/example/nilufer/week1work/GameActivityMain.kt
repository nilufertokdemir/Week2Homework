package com.example.nilufer.week1work

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.game_page_activity.*
import android.os.CountDownTimer
import android.util.Log
import android.widget.ProgressBar
import android.widget.TextView
import kotlinx.android.synthetic.main.game_page_activity.view.*


class GameActivityMain : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_page_activity)

        val buttons = arrayOf(button,button1,button2,button3)
        val stringArray = arrayOf("Görsellestirmek","Altında","Bağış","Ensülin")

        setTextInButtons(buttons, stringArray)
        question_string.text = "Visualize"

        val mCountDownTimer: CountDownTimer
        var i = 0

        progressBar.progress = i
        mCountDownTimer = object : CountDownTimer(20000, 1000) {

            override fun onTick(millisUntilFinished: Long) {
                Log.v("Log_tag", "Tick of Progress$i$millisUntilFinished")
                i++
                progressBar.progress = i * 100 / (20000 / 1000)
                horizontal_progressbar.progress = i * 100 / (20000 / 1000)
                text_progress.text = "" + (millisUntilFinished / 1000)
            }

            override fun onFinish() {
                progressBar.visibility = ProgressBar.INVISIBLE
                text_progress.visibility = TextView.INVISIBLE
                horizontal_progressbar.setProgress(100)
            }
        }
        mCountDownTimer.start()

    }

}