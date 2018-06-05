package com.hasini.samirkrishna.servicetest

import android.content.Intent
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun start(v:View)
    {
      var i =Intent(this,MyService::class.java)
        startService(i)
    }
    fun stop(v:View)
    {
    var i = Intent(this,MyService::class.java)
        stopService(i)
    }
}

