package com.example.activityresult

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    /*
    Override the onActivityResult to get the send back data
     */
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        // Get the result data
        data?.extras?.let {
            // Check for the result code to ensure which activity send back
            if (requestCode == 1 &&
                    resultCode == Activity.RESULT_OK) {
                txt_res.text = it.getString("num")
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_change.setOnClickListener {
            // Using intent to send data
            val intent = Intent(this, MainActivity2::class.java)

            // Start another activity and using requestCode to identify
            startActivityForResult(intent, 1)
        }
    }
}