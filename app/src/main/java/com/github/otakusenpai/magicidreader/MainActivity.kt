package com.github.otakusenpai.magicidreader

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var eTInputID: EditText
    lateinit var btnSubmitID: Button
    lateinit var tvShowID: TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        eTInputID = findViewById(R.id.eTInputID)
        btnSubmitID = findViewById(R.id.btnSubmitID)
        tvShowID = findViewById(R.id.tVShowID)

        btnSubmitID.setOnClickListener {
            try {
                val text = eTInputID.text.toString()

                val dob = text.substring(0 until 6)
                val sGender = if(text[7] < '5') "Female" else "Male"
                val citizen = if(text[11] == '0') "SA Citizen" else "Permanent Resident"

                tvShowID.text = getString(R.string.dob) + getString(R.string.space) + dob + getString(R.string.newline) +
                        getString(R.string.gender) + getString(R.string.space) + sGender + getString(R.string.newline) +
                        getString(R.string.citizenship) + getString(R.string.space) + citizen + getString(R.string.newline)
            } catch(e: Exception) {
                e.printStackTrace()
                tvShowID.text = e.message
            }
        }
    }
}
