package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Button listener
        btn_change.setOnClickListener {
            // Get editText
            val num = edt_number.text.toString()
            val str = edt_str.text.toString()

            // Create an Intent object
            val change = Intent(this, MainActivity2::class.java)

            // Create bundle object
            val bundle = Bundle()

            // Put data to bundle
            bundle.putString("number", num)
            bundle.putString("string", str)

            // Put bundle to Intent
            change.putExtras(bundle)

            // Change activity
            startActivity(change)
        }
    }
}