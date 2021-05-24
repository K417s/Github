package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.content.Intent
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.module.AppGlideModule
import kotlinx.android.synthetic.main.activity_main.*
@GlideModule
public final class MyAppGlideModule : AppGlideModule()


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val img: ImageView = findViewById(R.id.imageTitle)

        GlideApp.with(this)
            .load(R.drawable.cover)
            .override(800, 600)
            .into(img)

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
