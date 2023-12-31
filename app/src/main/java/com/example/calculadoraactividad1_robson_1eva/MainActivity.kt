package com.example.calculadoraactividad1_robson_1eva

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {

    private var screenText:String = " "
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val screen: TextView = findViewById(R.id.calculatorScreen)

        val button0: Button = findViewById(R.id.button0)
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val button4: Button = findViewById(R.id.button4)
        val button5: Button = findViewById(R.id.button5)
        val button6: Button = findViewById(R.id.button6)
        val button7: Button = findViewById(R.id.button7)
        val button8: Button = findViewById(R.id.button8)
        val button9: Button = findViewById(R.id.button9)
        val buttonComa: Button = findViewById(R.id.buttonComa)
        val buttonPlus: Button = findViewById(R.id.buttonPlus)
        val buttonMinus: Button = findViewById(R.id.buttonMinus)
        val buttonMultiplication: Button = findViewById(R.id.buttonMultiplication)
        val buttonDivision: Button = findViewById(R.id.buttonDivision)
        val buttonEquals: Button = findViewById(R.id.buttonEquals)
        val buttonShare: Button = findViewById(R.id.buttonShare)
        val buttonAC: Button = findViewById(R.id.buttonAC)

        button0.setOnClickListener {
            screen.text = screen.text.toString() + button0.text
            screenText = screen.text.toString()
            println(screenText)
        }
        button1.setOnClickListener {
            screen.text = screen.text.toString() + button1.text
            screenText = screen.text.toString()
            println(screenText)
        }
        button2.setOnClickListener {
            screen.text = screen.text.toString() + button2.text
            screenText = screen.text.toString()
            println(screenText)
        }
        button3.setOnClickListener {
            screen.text = screen.text.toString() + button3.text
            screenText = screen.text.toString()
        }
        button4.setOnClickListener {
            screen.text = screen.text.toString() + button4.text
            screenText = screen.text.toString()
        }
        button5.setOnClickListener {
            screen.text = screen.text.toString() + button5.text
            screenText = screen.text.toString()
        }
        button6.setOnClickListener {
            screen.text = screen.text.toString() + button6.text
            screenText = screen.text.toString()
        }
        button7.setOnClickListener {
            screen.text = screen.text.toString() + button7.text
            screenText = screen.text.toString()
        }
        button8.setOnClickListener {
            screen.text = screen.text.toString() + button8.text
            screenText = screen.text.toString()
        }
        button9.setOnClickListener {
            screen.text = screen.text.toString() + button9.text
            screenText = screen.text.toString()
        }
        buttonComa.setOnClickListener {
            if (obtainPreviousInput(screen.text.toString())) {
                screen.text = screen.text.toString() + buttonComa.text
                screenText = screen.text.toString()
            }
        }
        buttonPlus.setOnClickListener {
            if (obtainPreviousInput(screen.text.toString())) {
                screen.text = screen.text.toString() + buttonPlus.text
                screenText = screen.text.toString()
            }
        }
        buttonMinus.setOnClickListener {
            if (obtainPreviousInput(screen.text.toString())) {
                screen.text = screen.text.toString() + buttonMinus.text
                screenText = screen.text.toString()
            }
        }
        buttonMultiplication.setOnClickListener {
            if (obtainPreviousInput(screen.text.toString())) {
                screen.text = screen.text.toString() + buttonMultiplication.text
                screenText = screen.text.toString()
            }
        }
        buttonDivision.setOnClickListener {
            if (obtainPreviousInput(screen.text.toString())) {
                screen.text = screen.text.toString() + buttonDivision.text
                screenText = screen.text.toString()
            }
        }
        buttonEquals.setOnClickListener {
            try {
                screen.text = " "
            }catch (e: Exception){
                screen.text = " "
            }
        }
        buttonShare.setOnClickListener {
            try {
                screen.text = " "
            }catch (e: Exception){
                screen.text = " "
            }
        }
        buttonAC.setOnClickListener {
            try {
                screen.text = " "
            }catch (e: Exception){
                screen.text = " "
            }
        }
    }
    private fun obtainPreviousInput(screen: String): Boolean{
        if(!screen.last().isDigit() || screen.last().equals(null)){
            return false
        }
        return true
    }

    override fun onResume(){
        super.onResume()
        val screenView:TextView = findViewById(R.id.calculatorScreen)
        screenView.text = screenText
    }
    override fun onSaveInstanceState(outState: Bundle) {

        outState.putString("screen",screenText)
        super.onSaveInstanceState(outState)
    }
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        screenText = savedInstanceState.getString("screen", "").toString()
    }
}