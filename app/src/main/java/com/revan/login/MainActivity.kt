package com.revan.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private  lateinit var btnIntent: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIntent = findViewById(R.id.button4)
        btnIntent.setOnClickListener(this)
        btnIntent = findViewById(R.id.button5)
        btnIntent.setOnClickListener(this)

    }
    override fun onClick(v: View) {
        when(v.id){
            R.id.button4 -> run {
                val intenBiasa = Intent(this@MainActivity, login::class.java)
                startActivity(intenBiasa)
            }
            R.id.button5 -> run {
                val intenBiasa = Intent(this@MainActivity, register::class.java)
                startActivity(intenBiasa)
            }
        }
    }

}