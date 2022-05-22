package com.example.picturebookactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.MultiAutoCompleteTextView

class PictureThreeActivity : AppCompatActivity() {
    lateinit var btnNext3:Button
    lateinit var btnback3:Button
    lateinit var etcampFriendsDescription:MultiAutoCompleteTextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_three)
        btnNext3=findViewById(R.id.btnNext3)
        btnback3=findViewById(R.id.btnback3)
        btnNext3.setOnClickListener {
            val intent=Intent(this,Picture4Activity::class.java)
            startActivity(intent)
        }
        btnback3.setOnClickListener {
            val intent=Intent(this,PictureTwoActivity::class.java)
            startActivity(intent)
        }
    }
}