package com.example.mad_p1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage = findViewById(R.id.dice_image)

        val rollButton: Button = findViewById(R.id.roll_button)
        val countupBtn: Button = findViewById(R.id.countUp_button)
        rollButton.setOnClickListener{rollDice()}
        countupBtn.setOnClickListener{countUp()}
    }

    private fun rollDice() {
        //val resultText: TextView = findViewById(R.id.result_text)
        val randomInt = (1..6).random()
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
        //resultText.text = randomInt.toString()

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }

    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)
        val diceImage: ImageView = findViewById(R.id.dice_image)
        // var is able to hold null value
        var num = resultText.text.toString().toIntOrNull()
        if (num == null)
            resultText.text = "1"
        else if (num < 6) {
            num++
            resultText.text = num.toString()
        }
    }
}
