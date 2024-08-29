package com.example.calculatorapp

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculatorapp.databinding.ActivityMainBinding
import com.google.android.material.card.MaterialCardView
import net.objecthunter.exp4j.ExpressionBuilder
import java.text.DateFormatSymbols


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val addition = '+'
    private val subtraction = '-'
    private val multiplication = '*'
    private val division = '/'
    private val percentage = '%'

    private lateinit var currentSymbol : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnClear.setOnClickListener {
            binding.inputText.text = ""
            binding.outputText.text = ""

        }

        binding.btn0.setOnClickListener {
            binding.inputText.append("0")
        }
        binding.btn1.setOnClickListener {
            binding.inputText.append("1")
        }
        binding.btn2.setOnClickListener {
            binding.inputText.append("2")
        }
        binding.btn3.setOnClickListener {
            binding.inputText.append("3")
        }
        binding.btn4.setOnClickListener {
            binding.inputText.append("4")
        }
        binding.btn5.setOnClickListener {
            binding.inputText.append("5")
        }
        binding.btn6.setOnClickListener {
            binding.inputText.append("6")
        }
        binding.btn7.setOnClickListener {
            binding.inputText.append("7")
        }
        binding.btn8.setOnClickListener {
            binding.inputText.append("8")
        }
        binding.btn9.setOnClickListener {
            binding.inputText.append("9")
        }
        binding.btnAdd.setOnClickListener {
            binding.inputText.append("+")
        }
        binding.btnSubtract.setOnClickListener {
            binding.inputText.append("-")
        }
        binding.btnMultiply.setOnClickListener {
            binding.inputText.append("*")
        }
        binding.btnDivide.setOnClickListener {
            binding.inputText.append("/")
        }
        binding.btnOpenBracket.setOnClickListener {
            binding.inputText.append("(")
        }
        binding.btnCloseBracket.setOnClickListener {
            binding.inputText.append(")")
        }
        binding.btnDot.setOnClickListener {
            binding.inputText.append(".")
        }
        binding.btnEquals.setOnClickListener{
            val expression = ExpressionBuilder(binding.inputText.text.toString()).build()
            val result = expression.evaluate()
            val longresult = result.toLong()

            if (result == longresult.toDouble()){
                binding.outputText.text = longresult.toString()

            }
            else{
                binding.outputText.text = result.toString()

            }
        }



    }



}
