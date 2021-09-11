package com.example.nilufer.week1work


import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.AppCompatButton
import android.util.Log



fun AppCompatActivity.replaceFragment(fragment: Fragment) {
    supportFragmentManager.beginTransaction().replace(R.id.main_activity_container, fragment).commit()
}

fun setTextInButtons(buttonsArray: Array<AppCompatButton>, texts: Array<String>){
    try {
        for (i in 0..(buttonsArray.size - 1)) {
            buttonsArray[i].text = texts[i]
        }
    } catch(e: ArrayIndexOutOfBoundsException){
        Log.e("game_activity_error","" + e.stackTrace )
    }

}
