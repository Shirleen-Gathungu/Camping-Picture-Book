package com.example.picturebookactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnpictureBook: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnpictureBook=findViewById(R.id.btnpictureBook)
        btnpictureBook.setOnClickListener {
            val intent= Intent(this,PictureOneActivity::class.java)
            startActivity(intent)
        }
    }
}