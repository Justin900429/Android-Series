package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Simulate the database
        var memberList = mutableListOf(
            MemberInfo("Justin", 20),
            MemberInfo("Joyce", 20)
        )

        // Make the adapter object
        // And assign it to recyclerView
        val adapter = MemberAdapter(memberList)
        rv_member.adapter = adapter
        rv_member.layoutManager = LinearLayoutManager(this)

        btn_enter.setOnClickListener {
            if (edt_age.text.isEmpty() || edt_name.text.isEmpty()) {
                Toast.makeText(this, "Please enter both name and age.", Toast.LENGTH_SHORT).show()
            } else {
                // Get name and age from EditText
                val name = edt_name.text.toString()
                val age = edt_age.text.toString()

                // Add to the memberList
                memberList.add(MemberInfo(name, age.toInt()))

                // Insert new items to RecyclerView
                adapter.notifyItemInserted(memberList.size - 1)

                edt_name.setText("")
                edt_age.setText("")
            }
        }
    }
}