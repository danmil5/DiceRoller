package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val die1: ImageView = findViewById(R.id.show_dice1)
        val die2: ImageView = findViewById(R.id.show_dice2)
        val diceNum: TextView = findViewById(R.id.dice_num)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice(diceNum, die1, die2)
            }


    }

    private fun rollDice(total: TextView, die1: ImageView, die2: ImageView) {
        val value1: Int = Random.nextInt(1, 7)
        val value2: Int = Random.nextInt(1, 7)
        when(value1) {
            1 -> die1.setImageResource(R.drawable.d1)
            2 -> die1.setImageResource(R.drawable.d2)
            3 -> die1.setImageResource(R.drawable.d3)
            4 -> die1.setImageResource(R.drawable.d4)
            5 -> die1.setImageResource(R.drawable.d5)
            6 -> die1.setImageResource(R.drawable.d6)
            else -> println("Error - Number not in range")
        }
        when(value2) {
            1 -> die2.setImageResource(R.drawable.d1)
            2 -> die2.setImageResource(R.drawable.d2)
            3 -> die2.setImageResource(R.drawable.d3)
            4 -> die2.setImageResource(R.drawable.d4)
            5 -> die2.setImageResource(R.drawable.d5)
            6 -> die2.setImageResource(R.drawable.d6)
            else -> println("Error - Number not in range")
        }
        when(value1+value2) {
            8, 11 -> total.text = "You rolled an " + (value1+value2) +"!"
            else -> total.text = "You rolled a " + (value1+value2) +"!"
        }

    }


}
