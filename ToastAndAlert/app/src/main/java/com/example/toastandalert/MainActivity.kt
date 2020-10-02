package com.example.toastandalert

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Button to show custom toast
        btn_custoa.setOnClickListener {
            showToast()
        }

        // Button to show Original alert dialog
        btn_orial.setOnClickListener {
            showOriginalAlert()
        }

        // Button to show items alert dialog
        btn_choal_1.setOnClickListener {
            showChoiceAlert1()
        }

        // Button to show items alert dialog
        btn_choal_2.setOnClickListener {
            showChoiceAlert2()
        }
    }

    /*
    Alert Dialog with multiple itmes
     */
    private fun showChoiceAlert1() {
        // Array for option
        val items = arrayOf<String>("1", "2", "3", "4", "5")

        // Alert Dialog
        AlertDialog.Builder(this)
            .setTitle("Choose a number!")
            .setItems(items) {dialogInterface, i ->
                Toast.makeText(this, "You choose ${items[i]}!", Toast.LENGTH_SHORT).show()
            }
            .show()
    }

    /*
    Alert Dialog with single choice item
     */
    private fun showChoiceAlert2() {
        // Array for option
        val items = arrayOf<String>("1", "2", "3", "4", "5")
        // Record the position
        var position = 0;

        // Alert Dialog
        AlertDialog.Builder(this)
            .setTitle("Choose a number!")
            .setSingleChoiceItems(items, 0) {dialogInterface, i ->
                position = i;
            }
            .setPositiveButton("Done") {dialog, which ->
                Toast.makeText(this, "You choose ${position}!", Toast.LENGTH_SHORT).show()
                txt_num.text = position.toString()
            }
            .show()
    }

    /*
    Alert Dialog with no choice items
     */
    private fun showOriginalAlert() {
        AlertDialog.Builder(this)
            .setTitle("Practice alert dialog")
            .setMessage("Hello world!")
            .setNeutralButton("Cancel") {dialog, which ->
                Toast.makeText(this, "Press 'cancel' button", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("No") {dialog, which ->
                Toast.makeText(this, "Press 'no' button", Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Yes") {dialog, which ->
                Toast.makeText(this, "Press 'yes' button", Toast.LENGTH_SHORT).show()
            }
            .show()
    }


    /*
    Show custom toast message
     */
    private fun showToast() {
        // Make Toast object
        val toast = Toast(this)

        // Set position
        toast.setGravity(Gravity.CENTER or Gravity.TOP, 0, 200)
        // Duration time
        toast.duration = Toast.LENGTH_SHORT
        // Custom view
        toast.view = layoutInflater.inflate(R.layout.toast_layout, null)

        // Show custom toast
        toast.show()
    }
}