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

    //Declaring my variables for the application UI
    //Switch the variables to a lateinitiate variable
    private lateinit var timeDisplay: EditText
    private lateinit var mealDisplay: TextView
    private lateinit var suggestMealBtn : Button
    private lateinit var resetBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Initialising the values for my button, edit text and text view and what they do
        timeDisplay = findViewById(R.id.timeDisplay)
        mealDisplay = findViewById(R.id.mealDisplay)
        suggestMealBtn = findViewById(R.id.suggestMealBtn)
        resetBtn = findViewById(R.id.resetBtn)

        //This is the button that the user will press to see their suggested meals.
        suggestMealBtn.setOnClickListener {
            mealSuggestion()
        }

        //This is resets all the information that the user added to the application whenever they want to try again.
        //Used the same function from my history app for the reset button: "private fun handleClearBtnClick() {
        //        ageDisplay.text.clear()
        //        searchResult.text = ""
        //    }"
        resetBtn.setOnClickListener {
            timeDisplay.text?.clear()
            mealDisplay.text = ""
        }

    }

    //Initialising the type of meal based on the time of day entered by the user
    //Used geeksforgeeks: url "https://www.geeksforgeeks.org/kotlin-when-expression/" function format, then switched it around with the val function and tweeked it a bit from my generation app:"when (yearInput?.text.toString().trim().toInt())"
    private fun mealSuggestion() {
        val timeOfDay = timeDisplay.text.toString().trim()

        //Meal suggestions
        val suggestion = when (timeOfDay) {
            "Morning" -> "Cereal,Pancakes or Eggs and bacon "
            "Mid-morning" -> "Apple, Banana or Grapes"
            "Afternoon" -> "Banana bread, BLT or 2 Hot dogs"
            "Mid Afternoon" -> "Chelsea bu, Donuts, Lays or Simba chips"
            "Dinner" -> "Mac and Cheese, Spaghetti and Meatballs or a Large pizza from any pizzeria of your choice"
            "Midnight" -> "Ice-cream, Magnum, McFlurry or any flavoured piece of cake"

            else -> "You have entered an invalid time of day, please enter one of the following: Morning, Mid-Morning, Afternoon, Mid-Afternoon, Dinner or Desert"
        }
        //The display of the meal on the text view
        //Used the function from my history app to display the "suggestion" on my textview: "searchResult.text= matchedPerson"
        mealDisplay.text = suggestion
    }

}