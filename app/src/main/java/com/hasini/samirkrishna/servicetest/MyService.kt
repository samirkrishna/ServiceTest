package com.hasini.samirkrishna.servicetest

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder


class MyService:Service(){
    var mPlayer: MediaPlayer?=null
    override fun onBind(intent: Intent?): IBinder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate() {
        super.onCreate()
        mPlayer= MediaPlayer.create(this,R.raw.sa)
    }

    override fun onStart(intent: Intent?, startId: Int) {
        super.onStart(intent, startId)
        mPlayer!!.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        mPlayer!!.stop()
    }
}