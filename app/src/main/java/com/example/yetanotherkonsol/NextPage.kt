package com.example.yetanotherkonsol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class NextPage : AppCompatActivity() {

    private lateinit var nameView: TextView
    private lateinit var klsView: TextView
    private lateinit var nisView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_page)

        nameView = findViewById(R.id.nameView)
        klsView = findViewById(R.id.klsView)
        nisView = findViewById(R.id.nisView)

        val extras = intent.extras

        nameView.text = extras?.getString("name")
        klsView.text = extras?.getString("kls")
        nisView.text = extras?.getString("nis")

    }
}