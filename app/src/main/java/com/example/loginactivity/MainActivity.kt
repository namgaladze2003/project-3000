package com.example.loginactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var firstNameTextView: TextView
    lateinit var lastNameTextView: TextView
    lateinit var nextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstNameTextView = findViewById(R.id.firstName)
        lastNameTextView = findViewById(R.id.lastName)
        nextButton = findViewById(R.id.next)

        nextButton.setOnClickListener {

            val firstName: String = firstNameTextView.text.toString()
            val lastName: String = lastNameTextView.text.toString()

            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("FIRST_NAME", firstName)
            intent.putExtra("LAST_NAME", lastName)
            startActivity(intent)

        }

    }

}