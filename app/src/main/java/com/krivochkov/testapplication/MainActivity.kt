package com.krivochkov.testapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : LoggingActivity(TAG) {

    private lateinit var counterField: TextView
    private lateinit var openSecondActivityButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        counterField = findViewById(R.id.counter)
        openSecondActivityButton = findViewById(R.id.open_second_activity)
        openSecondActivityButton.setOnClickListener {
            val intent = SecondActivity.createIntent(
                this,
                counterField.text.toString().toInt()
            )
            startActivity(intent)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(COUNTER_STATE, counterField.text.toString().toInt() + 1)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        counterField.text = savedInstanceState.getInt(COUNTER_STATE).toString()
    }

    companion object {
        private const val COUNTER_STATE = "COUNTER_STATE"
        private const val TAG = "FIRST_ACTIVITY"
    }
}