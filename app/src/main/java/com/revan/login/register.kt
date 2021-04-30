package com.revan.login
import android.os.Bundle
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity

class register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)

        lateinit var toolbar: Toolbar
        toolbar = findViewById(R.id.toolbar_login)
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
    }

}