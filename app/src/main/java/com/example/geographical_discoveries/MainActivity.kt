package com.example.geographical_discoveries

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun vek19(view: View) { }

    fun vek18(view: View) {val intent : Intent = Intent(this@MainActivity, century::class.java)
        startActivity(intent)}

}