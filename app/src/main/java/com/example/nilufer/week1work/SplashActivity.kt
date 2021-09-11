package com.example.nilufer.week1work

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.splash_activity.*


class SplashActivity : AppCompatActivity(), SimpleCountDownTimer.OnCountDownListener {

    private val simpleCountDownTimer = SimpleCountDownTimer(0, 3, this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity)

        simpleCountDownTimer.start(true)

    }

    override fun onCountDownActive(time: String) {

        timerTextView.text = simpleCountDownTimer.getSecondsTillCountDown().toString()

    }


    override fun onCountDownFinished() {
        val intent = Intent(this, MainActivity::class.java)

        startActivity(intent);
    }

}
