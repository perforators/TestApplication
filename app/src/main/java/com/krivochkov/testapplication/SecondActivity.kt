package com.krivochkov.testapplication

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.TextView

class SecondActivity : LoggingActivity(TAG) {

    private lateinit var square: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        square = findViewById(R.id.square)
        val value = intent.getIntExtra(SQUARE_KEY, 0)
        square.text = (value * value).toString()
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)

    }

    companion object {
        private const val SQUARE_KEY = "SQUARE"
        private const val TAG = "SECOND_ACTIVITY"

        fun createIntent(context: Context, value: Int) =
            Intent(context, SecondActivity::class.java).apply { putExtra(SQUARE_KEY, value) }
    }
}