package com.krivochkov.testapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

abstract class LoggingActivity(private val logTag: String) : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(logTag, "OnCreate()")
    }

    override fun onStart() {
        super.onStart()
        Log.i(logTag, "OnStart()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(logTag, "OnRestart()")
    }

    override fun onResume() {
        super.onResume()
        Log.i(logTag, "OnResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.i(logTag, "OnPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.i(logTag, "OnStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(logTag, "OnDestroy()")
    }
}