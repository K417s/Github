package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.content.Intent
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
///
        Toast.makeText(baseContext, "作者：江俊陞", Toast.LENGTH_LONG).show()
//
        imgNext.setOnLongClickListener(object : View.OnLongClickListener {
            override fun onLongClick(p0: View?): Boolean {
                intent = Intent(this@MainActivity,GameAcitivity::class.java)
                startActivity(intent)
                return true
            }
        })
    }
}