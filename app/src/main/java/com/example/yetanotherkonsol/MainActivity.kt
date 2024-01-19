package com.example.yetanotherkonsol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var  nameEdit: EditText
    private lateinit var  klsEdit: EditText
    private lateinit var  nisEdit: EditText
    private lateinit var  submitBtn: Button

    private val NAME_KEY: String = "name"
    private val KLS_KEY: String = "kls"
    private val NIS_KEY: String = "nis"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameEdit = findViewById(R.id.nameEdit)
        klsEdit = findViewById(R.id.klsEdit)
        nisEdit = findViewById(R.id.nisEdit)

        submitBtn.setOnClickListener {
            val intent = Intent(this, NextPage::class.java)
            intent.putExtra(NAME_KEY, nameEdit.text.toString())
            intent.putExtra(KLS_KEY, klsEdit.text.toString())
            intent.putExtra(NIS_KEY, nisEdit.text.toString())
            startActivity(intent)
        }

    }
}