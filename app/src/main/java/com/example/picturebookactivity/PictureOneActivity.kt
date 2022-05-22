package com.example.picturebookactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.MultiAutoCompleteTextView

class PictureOneActivity : AppCompatActivity() {
    lateinit var btnnext:Button
    lateinit var etnightCampDescription:MultiAutoCompleteTextView
    lateinit var btnback:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_one)
        btnnext=findViewById(R.id.btnnext)
        btnback=findViewById(R.id.btnback)
        btnnext.setOnClickListener {
            val intent=Intent(this,PictureTwoActivity::class.java)
            startActivity(intent)
        }
        btnback.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}