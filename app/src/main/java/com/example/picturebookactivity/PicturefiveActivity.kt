package com.example.picturebookactivity

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.MultiAutoCompleteTextView

class PicturefiveActivity : AppCompatActivity() {
    lateinit var btnBack5:Button
    lateinit var etdescriptionCampStories:MultiAutoCompleteTextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picturefive)
        btnBack5=findViewById(R.id.btnBack5)
        btnBack5.setOnClickListener {
            val intent=Intent(this,Picture4Activity::class.java)
            startActivity(intent)
        }
    }
}