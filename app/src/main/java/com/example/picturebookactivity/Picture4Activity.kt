package com.example.picturebookactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.MultiAutoCompleteTextView

class Picture4Activity : AppCompatActivity() {
    lateinit var btnNext4:Button
    lateinit var btnBack4:Button
    lateinit var etdescriptionCampFoodie:MultiAutoCompleteTextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture4)
        btnNext4=findViewById(R.id.btnNext4)
        btnBack4=findViewById(R.id.btnBack4)
        btnNext4.setOnClickListener {
            val intent= Intent(this,PicturefiveActivity::class.java)
            startActivity(intent)
        }
        btnBack4.setOnClickListener {
            val intent=Intent(this,PictureThreeActivity::class.java)
            startActivity(intent)
        }
    }
}