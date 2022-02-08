package com.mrsv.android.mydiceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val countUpButton: Button = findViewById(R.id.count_up)
        countUpButton.setOnClickListener { countUp() }
    }

    private fun rollDice() {
//        Toast.makeText(this, "button clicked",
//        Toast.LENGTH_SHORT).show()

        val randomInt = (1..6).random()
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }


    private fun countUp() {
//        Toast.makeText(this, "button clicked",
//        Toast.LENGTH_SHORT).show()

        val countUpButton: TextView = findViewById(R.id.result_text)

        if (countUpButton.text == "Hello World!") {
            countUpButton.text = "1"
        } else {
            var countInt: Int = countUpButton.text.toString().toInt()

            if (countInt < 6) {
                countInt++
                countUpButton.text = countInt.toString()
            }
        }
    }
 }





