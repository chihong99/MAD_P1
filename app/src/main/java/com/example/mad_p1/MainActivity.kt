package com.example.mad_p1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        val countupBtn: Button = findViewById(R.id.countUp_button)
        rollButton.setOnClickListener{rollDice()}
        countupBtn.setOnClickListener{countUp()}
    }

    private fun rollDice() {
        val resultText: TextView = findViewById(R.id.result_text)
        val randomInt = (1..6).random()
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
        resultText.text = randomInt.toString()
    }

    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)
        val num = resultText.text.toString().toInt()
        if (resultText.text == "Hello World!")
            resultText.text = "1"
        else {

            //resultText.text =
        }
    }
}
