package com.doguisoft.loginsignupui

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                             WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

        getWindow().setStatusBarColor(Color.TRANSPARENT)
        setContentView(R.layout.activity_main)
    }

    fun OpenSignupPage(view: View){
        //startActivity(Intent(this@MainActivity, SignupActivity::Class.java))
    }
}
