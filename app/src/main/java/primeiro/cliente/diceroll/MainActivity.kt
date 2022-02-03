package primeiro.cliente.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.buttonPlay)
        val image: ImageView = findViewById(R.id.imageView)




        rollButton.setOnClickListener {
            val firstDice = Dice(6)
            val diceRoll = firstDice.roll()

            when(diceRoll){
                1 -> image.setImageResource(R.drawable.dice_1)
                2 -> image.setImageResource(R.drawable.dice_2)
                3 -> image.setImageResource(R.drawable.dice_3)
                4 -> image.setImageResource(R.drawable.dice_4)
                5 -> image.setImageResource(R.drawable.dice_5)
                6 -> image.setImageResource(R.drawable.dice_6)
            }

        }
    }

    class Dice(private val numSides: Int) {
        fun roll(): Int{
            return (1..numSides).random()

        }
    }
}