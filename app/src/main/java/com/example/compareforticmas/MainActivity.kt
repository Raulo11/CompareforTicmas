package com.example.compareforticmas

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var editText1: EditText
    private lateinit var editText2: EditText
    private lateinit var compareButton: Button
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText1 = findViewById(R.id.editText1)
        editText2 = findViewById(R.id.editText2)
        compareButton = findViewById(R.id.compareButton)
        resultTextView = findViewById(R.id.resultTextView)

        compareButton.setOnClickListener {
            val text1 = editText1.text.toString()
            val text2 = editText2.text.toString()

            compareStrings(text1, text2)
        }
    }

    private fun compareStrings(text1: String, text2: String) {
        if (text1 == text2) {
            resultTextView.text = "Las cadenas son iguales"
        } else {
            resultTextView.text = "Las cadenas son diferentes"
        }
    }
}

