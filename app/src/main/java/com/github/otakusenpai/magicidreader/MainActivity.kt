package com.github.otakusenpai.magicidreader

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var eTInputID: EditText
    lateinit var btnSubmitID: Button
    lateinit var tvShowID: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        eTInputID = findViewById(R.id.eTInputID)
        btnSubmitID = findViewById(R.id.btnSubmitID)
        tvShowID = findViewById(R.id.tVShowID)

        btnSubmitID.setOnClickListener {
            val text = eTInputID.text as String
            
            
        }
    }
}
