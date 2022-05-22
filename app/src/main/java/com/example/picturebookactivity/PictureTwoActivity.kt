package com.example.picturebookactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.MultiAutoCompleteTextView

class PictureTwoActivity : AppCompatActivity() {
    lateinit var btnnext2:Button
    lateinit var btnback2:Button
    lateinit var etdescriptionCampGear:MultiAutoCompleteTextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_two)
        btnnext2=findViewById(R.id.btnnext2)
        btnback2=findViewById(R.id.btnback2)
        btnnext2.setOnClickListener {
            val intent=Intent(this,PictureThreeActivity::class.java)
            startActivity(intent)
        }
        btnback2.setOnClickListener {
            val intent=Intent(this,PictureOneActivity::class.java)
            startActivity(intent)
        }
    }
}