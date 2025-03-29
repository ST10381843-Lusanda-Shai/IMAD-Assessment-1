package vcmsa.ci.mealsuggestionapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    //Initialising my variables for the application
    private var timeDisplay : EditText? = null
    private var mealDisplay : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Initialising the values for my button, edit text and text view and what they do
        val timeDisplay = findViewById<EditText>(R.id.timeDisplay)
        val mealDisplay = findViewById<TextView>(R.id.mealDisplay)
        val suggestMealBtn = findViewById<Button>(R.id.suggestMealBtn)
        val resetBtn = findViewById<Button>(R.id.resetBtn)

        //This is the button that the user will press to see their suggested meals.
        suggestMealBtn.setOnClickListener {

        }

        //This is resets all the information that the user added to the application whenever they want to try again.
        resetBtn.setOnClickListener {
            timeDisplay.text?.clear()
            mealDisplay?.text = ""
        }
        
        }

    }