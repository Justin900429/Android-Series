package com.example.activityresult

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btn_back.setOnClickListener {
            // Save the data to the bundle object
            val bundle = Bundle()
            bundle.putString("num", edt_num.text.toString())

            // Using intent to send back the data
            val intent = Intent().putExtras(bundle)
            // Using Activity.RESULT_OK to check the status
            setResult(Activity.RESULT_OK, intent)

            // Finish Activity2
            finish()
        }
    }
}