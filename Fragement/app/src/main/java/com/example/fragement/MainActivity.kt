package com.example.fragement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Message printed in log
        Log.i("MainActivity", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        // Message printed in log
        Log.i("MainActivity", "onStart")
    }

    override fun onRestart() {
        super.onRestart()
        // Message printed in log
        Log.i("MainActivity", "onRestart")
    }

    override fun onResume() {
        super.onResume()
        // Message printed in log
        Log.i("MainActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        // Message printed in log
        Log.i("MainActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        // Message printed in log
        Log.i("MainActivity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        // Message printed in log
        Log.i("MainActivity", "onDestroy")
    }
}