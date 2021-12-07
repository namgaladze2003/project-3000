package com.example.loginactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    lateinit var firstName: TextView
    lateinit var  lastName: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        firstName = findViewById(R.id.textView1)
        lastName = findViewById(R.id.textView2)

        firstName.text = intent?.extras?.getString("FIRST_NAME", "")
        lastName.text = intent?.extras?.getString("LAST_NAME", "")

    }

}