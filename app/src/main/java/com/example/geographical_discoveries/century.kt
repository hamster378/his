package com.example.geographical_discoveries

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class century : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_century)
    }

    fun park(view: View) {val intent : Intent = Intent(this@century, park::class.java)
        startActivity(intent)}

    fun kob(view: View) {val intent : Intent = Intent(this@century, kob::class.java)
        startActivity(intent)}

    fun van(view: View) {val intent : Intent = Intent(this@century, van::class.java)
        startActivity(intent)}

    fun dimitri(view: View) {val intent : Intent = Intent(this@century, dima::class.java)
        startActivity(intent)}

    fun six(view: View) {val intent : Intent = Intent(this@century, bulenvil::class.java)
        startActivity(intent)}
}