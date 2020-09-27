package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Get the data in Intent, default to ""
        intent?.extras?.let {
            val num = it.getString("number", "Didn't enter before")
            val str = it.getString("string", "Didn't enter before")

            // Set TextView
            txt_num.text = num
            txt_str.text = str
        }

        // Finish if press button
        btn_finish.setOnClickListener {
            finish()
        }
    }
}