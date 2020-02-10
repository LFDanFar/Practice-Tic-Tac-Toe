package com.example.lab02_tictactoe

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.annotation.IntegerRes
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.ViewModelProviders.*
//import com.example.lab02_tictactoe.ChooseActivity.Companion.PLAYER_ONE
//import com.example.lab02_tictactoe.ChooseActivity.Companion.PLAYER_TWO
import kotlinx.android.synthetic.main.activity_main.*


private const val TAG = "MainActivity"
private const val KEY_INDEX = "index"

class MainActivity : AppCompatActivity() {

    private val tViewModel: TTTViewModel by lazy{
        of(this).get(TTTViewModel::class.java)
    }
    override fun onSaveInstanceState(savedInstanceState: Bundle) {
        super.onSaveInstanceState(savedInstanceState)
        savedInstanceState.putInt(KEY_INDEX, tViewModel.currentIndex)
    }

    //Something about this was part of the third requirement
    /*override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
    }*/

    var turn = 1
    //val stringX = intent.getStringExtra(PLAYER_ONE)
    //val stringO = intent.getStringExtra(PLAYER_TWO)
    var dootX = "X Wins!"
    var dootO = "O Wins!"
    var dootDraw = "It's a draw!"
    var b1 = 10
    var b2 = 20
    var b3 = 30
    var b4 = 40
    var b5 = 50
    var b6 = 60
    var b7 = 70
    var b8 = 80
    var b9 = 90


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val currentIndex = savedInstanceState?.getInt(KEY_INDEX, 0) ?: 0
        val provider: ViewModelProvider = of(this)
        val tViewModel = provider.get(TTTViewModel::class.java)
        //tViewModel.currentIndex = currentIndex

        val button1 = findViewById(R.id.button1) as Button
        val button2 = findViewById(R.id.button2) as Button
        val button3 = findViewById(R.id.button3) as Button
        val button4 = findViewById(R.id.button4) as Button
        val button5 = findViewById(R.id.button5) as Button
        val button6 = findViewById(R.id.button6) as Button
        val button7 = findViewById(R.id.button7) as Button
        val button8 = findViewById(R.id.button8) as Button
        val button9 = findViewById(R.id.button9) as Button
        val buttonPlayAgain = findViewById(R.id.buttonPlayAgain) as Button
        val buttonResultShare = findViewById(R.id.buttonShare) as Button
        val buttonSymbol = findViewById(R.id.buttonSymbolChanger) as Button

        buttonResultShare.visibility = View.INVISIBLE

        buttonSymbol.setOnClickListener{
            val intent = Intent(this, ChooseActivity::class.java)
            startActivity(intent)
        }
        button1.setOnClickListener{
            buttonSymbol.isEnabled = false
            if (turn%2 == 1) {
                button1.text = "X"
                b1 = 1
                if (b1 == b2 && b1 == b3) {
                    turn %= 2
                    if (turn == 1) {
                        Toast.makeText(this, "$dootX", Toast.LENGTH_SHORT).show()
                        buttonResultShare.text = "Share X's game!"
                    }
                    else {
                        Toast.makeText(this, "$dootO", Toast.LENGTH_SHORT).show()
                        buttonResultShare.text = "Share O's game!"
                    }
                    button1.isClickable = false
                    button2.isClickable = false
                    button3.isClickable = false
                    button4.isClickable = false
                    button5.isClickable = false
                    button6.isClickable = false
                    button7.isClickable = false
                    button8.isClickable = false
                    button9.isClickable = false
                    buttonResultShare.visibility = View.VISIBLE
                }
                if (b1 == b4 && b1 == b7) {
                    turn %= 2
                    if (turn == 1) {
                        Toast.makeText(this, "$dootX", Toast.LENGTH_SHORT).show()
                        buttonResultShare.text = "Share X's game!"
                    }
                    else {
                        Toast.makeText(this, "$dootO", Toast.LENGTH_SHORT).show()
                        buttonResultShare.text = "Share O's game!"
                    }
                    button1.isClickable = false
                    button2.isClickable = false
                    button3.isClickable = false
                    button4.isClickable = false
                    button5.isClickable = false
                    button6.isClickable = false
                    button7.isClickable = false
                    button8.isClickable = false
                    button9.isClickable = false
                    buttonResultShare.visibility = View.VISIBLE
                }
                if (b1 == b5 && b1 == b9) {
                    turn %= 2
                    if (turn == 1) {
                        Toast.makeText(this, "$dootX", Toast.LENGTH_SHORT).show()
                        buttonResultShare.text = "Share X's game!"
                    }
                    else {
                        Toast.makeText(this, "$dootO", Toast.LENGTH_SHORT).show()
                        buttonResultShare.text = "Share O's game!"
                    }
                    button1.isClickable = false
                    button2.isClickable = false
                    button3.isClickable = false
                    button4.isClickable = false
                    button5.isClickable = false
                    button6.isClickable = false
                    button7.isClickable = false
                    button8.isClickable = false
                    button9.isClickable = false
                    buttonResultShare.visibility = View.VISIBLE
                }
                turn += 1
                button1.isClickable = false
                if (turn == 10){
                    Toast.makeText(this, "$dootDraw", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share draw game!"
                    buttonResultShare.visibility = View.VISIBLE
                }
            }
        }
        button2.setOnClickListener{
            buttonSymbol.isEnabled = false
            if (turn%2 == 1) {
                button2.text = "X"
                b2 = 1
            }
            else {
                button2.text = "O"
                b2 = 2
            }
            if(b1 == b2 && b1 == b3){
                turn %= 2
                if (turn == 1) {
                    Toast.makeText(this, "$dootX", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share X's game!"
                }
                else {
                    Toast.makeText(this, "$dootO", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share O's game!"
                }
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
                buttonResultShare.visibility = View.VISIBLE
            }
            if(b2 == b5 && b5 == b8){
                turn %= 2
                if (turn == 1) {
                    Toast.makeText(this, "$dootX", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share X's game!"
                }
                else {
                    Toast.makeText(this, "$dootO", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share O's game!"
                }
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
                buttonResultShare.visibility = View.VISIBLE
            }
            turn += 1
            button2.isClickable = false
            if (turn == 10){
                Toast.makeText(this, "$dootDraw", Toast.LENGTH_SHORT).show()
                buttonResultShare.text = "Share draw game!"
                buttonResultShare.visibility = View.VISIBLE
            }
        }
        button3.setOnClickListener{
            buttonSymbol.isEnabled = false
            if (turn%2 == 1) {
                button3.text = "X"
                b3 = 1
            }
            else {
                button3.text = "O"
                b3 = 2
            }
            if(b1 == b2 && b1 == b3){
                turn %= 2
                if (turn == 1) {
                    Toast.makeText(this, "$dootX", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share X's game!"
                }
                else {
                    Toast.makeText(this, "$dootO", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share O's game!"
                }
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
                buttonResultShare.visibility = View.VISIBLE
            }
            if(b3 == b5 && b7 == b3){
                turn %= 2
                if (turn == 1) {
                    Toast.makeText(this, "$dootX", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share X's game!"
                }
                else {
                    Toast.makeText(this, "$dootO", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share O's game!"
                }
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
                buttonResultShare.visibility = View.VISIBLE
            }
            if(b3 == b6 && b9 == b3){
                turn %= 2
                if (turn == 1) {
                    Toast.makeText(this, "$dootX", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share X's game!"
                }
                else {
                    Toast.makeText(this, "$dootO", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share O's game!"
                }
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
                buttonResultShare.visibility = View.VISIBLE
            }
            turn += 1
            button3.isClickable = false
            if (turn == 10){
                Toast.makeText(this, "$dootDraw", Toast.LENGTH_SHORT).show()
                buttonResultShare.text = "Share draw game!"
                buttonResultShare.visibility = View.VISIBLE
            }
        }
        button4.setOnClickListener{
            buttonSymbol.isEnabled = false
            if (turn%2 == 1) {
                button4.text = "X"
                b4 = 1
            }
            else {
                button4.text = "O"
                b4 = 2
            }
            if(b1 == b4 && b1 == b7){
                turn %= 2
                if (turn == 1) {
                    Toast.makeText(this, "$dootX", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share X's game!"
                }
                else {
                    Toast.makeText(this, "$dootO", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share O's game!"
                }
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
                buttonResultShare.visibility = View.VISIBLE
            }
            if(b4 == b5 && b4 == b6){
                turn %= 2
                if (turn == 1) {
                    Toast.makeText(this, "$dootX", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share X's game!"
                }
                else {
                    Toast.makeText(this, "$dootO", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share O's game!"
                }
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
                buttonResultShare.visibility = View.VISIBLE
            }
            turn += 1
            button4.isClickable = false
            if (turn == 10){
                Toast.makeText(this, "$dootDraw", Toast.LENGTH_SHORT).show()
                buttonResultShare.text = "Share draw game!"
                buttonResultShare.visibility = View.VISIBLE
            }
        }
        button5.setOnClickListener{
            buttonSymbol.isEnabled = false
            if (turn%2 == 1) {
                button5.text = "X"
                b5 = 1
            }
            else {
                button5.text = "O"
                b5 = 2
            }
            if(b1 == b5 && b1 == b9){
                turn %= 2
                if (turn == 1) {
                    Toast.makeText(this, "$dootX", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share X's game!"
                }
                else {
                    Toast.makeText(this, "$dootO", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share O's game!"
                }
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
                buttonResultShare.visibility = View.VISIBLE
            }
            if(b2 == b5 && b2 == b8){
                turn %= 2
                if (turn == 1) {
                    Toast.makeText(this, "$dootX", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share X's game!"
                }
                else {
                    Toast.makeText(this, "$dootO", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share O's game!"
                }
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
                buttonResultShare.visibility = View.VISIBLE
            }
            if(b3 == b5 && b7 == b3){
                turn %= 2
                if (turn == 1) {
                    Toast.makeText(this, "$dootX", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share X's game!"
                }
                else {
                    Toast.makeText(this, "$dootO", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share O's game!"
                }
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
                buttonResultShare.visibility = View.VISIBLE
            }
            if(b4 == b5 && b4 == b6){
                turn %= 2
                if (turn == 1) {
                    Toast.makeText(this, "$dootX", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share X's game!"
                }
                else {
                    Toast.makeText(this, "$dootO", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share O's game!"
                }
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
                buttonResultShare.visibility = View.VISIBLE
            }
            turn += 1
            button5.isClickable = false
            if (turn == 10){
                Toast.makeText(this, "$dootDraw", Toast.LENGTH_SHORT).show()
                buttonResultShare.text = "Share draw game!"
                buttonResultShare.visibility = View.VISIBLE
            }
        }
        button6.setOnClickListener{
            buttonSymbol.isEnabled = false
            if (turn%2 == 1) {
                button6.text = "X"
                b6 = 1
            }
            else {
                button6.text = "O"
                b6 = 2
            }
            if(b3 == b6 && b9 == b3){
                turn %= 2
                if (turn == 1) {
                    Toast.makeText(this, "$dootX", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share X's game!"
                }
                else {
                    Toast.makeText(this, "$dootO", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share O's game!"
                }
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
                buttonResultShare.visibility = View.VISIBLE
            }
            if(b4 == b5 && b4 == b6){
                turn %= 2
                if (turn == 1) {
                    Toast.makeText(this, "$dootX", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share X's game!"
                }
                else {
                    Toast.makeText(this, "$dootO", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share O's game!"
                }
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
                buttonResultShare.visibility = View.VISIBLE
            }
            button6.isClickable = false
            turn += 1
            if (turn == 10){
                Toast.makeText(this, "$dootDraw", Toast.LENGTH_SHORT).show()
                buttonResultShare.text = "Share draw game!"
                buttonResultShare.visibility = View.VISIBLE
            }
        }
        button7.setOnClickListener{
            buttonSymbol.isEnabled = false
            if (turn%2 == 1) {
                button7.text = "X"
                b7 = 1
            }
            else {
                button7.text = "O"
                b7 = 2
            }
            if(b1 == b4 && b1 == b7){
                turn %= 2
                if (turn == 1) {
                    Toast.makeText(this, "$dootX", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share X's game!"
                }
                else {
                    Toast.makeText(this, "$dootO", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share O's game!"
                }
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
                buttonResultShare.visibility = View.VISIBLE
            }
            if(b3 == b5 && b7 == b3){
                turn %= 2
                if (turn == 1) {
                    Toast.makeText(this, "$dootX", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share X's game!"
                }
                else {
                    Toast.makeText(this, "$dootO", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share O's game!"
                }
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
                buttonResultShare.visibility = View.VISIBLE
            }
            if(b7 == b8 && b7 == b9){
                turn %= 2
                if (turn == 1) {
                    Toast.makeText(this, "$dootX", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share X's game!"
                }
                else {
                    Toast.makeText(this, "$dootO", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share O's game!"
                }
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
                buttonResultShare.visibility = View.VISIBLE
            }
            turn += 1
            button7.isClickable = false
            if (turn == 10){
                Toast.makeText(this, "$dootDraw", Toast.LENGTH_SHORT).show()
                buttonResultShare.visibility = View.VISIBLE
            }
        }
        button8.setOnClickListener{
            buttonSymbol.isEnabled = false
            if (turn%2 == 1) {
                button8.text = "X"
                b8 = 1
            }
            else {
                button8.text = "O"
                b8 = 2
            }
            if(b2 == b5 && b5 == b8){
                turn %= 2
                if (turn == 1) {
                    Toast.makeText(this, "$dootX", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share X's game!"
                }
                else {
                    Toast.makeText(this, "$dootO", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share O's game!"
                }
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
                buttonResultShare.visibility = View.VISIBLE
            }
            if(b7 == b8 && b7 == b9){
                turn %= 2
                if (turn == 1) {
                    Toast.makeText(this, "$dootX", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share X's game!"
                }
                else {
                    Toast.makeText(this, "$dootO", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share O's game!"
                }
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
                buttonResultShare.visibility = View.VISIBLE
            }
            turn += 1
            button8.isClickable = false
            if (turn == 10){
                Toast.makeText(this, "$dootDraw", Toast.LENGTH_SHORT).show()
                buttonResultShare.visibility = View.VISIBLE
            }
        }
        button9.setOnClickListener{
            buttonSymbol.isEnabled = false
            if (turn%2 == 1) {
                button9.text = "X"
                b9 = 1
            }
            else {
                button9.text = "O"
                b9 = 2
            }
            if(b1 == b5 && b1 == b9){
                turn %= 2
                if (turn == 1) {
                    Toast.makeText(this, "$dootX", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share X's game!"
                }
                else {
                    Toast.makeText(this, "$dootO", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share O's game!"
                }
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
                buttonResultShare.visibility = View.VISIBLE
            }
            if(b3 == b6 && b9 == b3){
                turn %= 2
                if (turn == 1) {
                    Toast.makeText(this, "$dootX", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share X's game!"
                }
                else {
                    Toast.makeText(this, "$dootO", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share O's game!"
                }
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
                buttonResultShare.visibility = View.VISIBLE
            }
            if(b7 == b8 && b7 == b9){
                turn %= 2
                if (turn == 1) {
                    Toast.makeText(this, "$dootX", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share X's game!"
                }
                else {
                    Toast.makeText(this, "$dootO", Toast.LENGTH_SHORT).show()
                    buttonResultShare.text = "Share O's game!"
                }
                button1.isClickable = false
                button2.isClickable = false
                button3.isClickable = false
                button4.isClickable = false
                button5.isClickable = false
                button6.isClickable = false
                button7.isClickable = false
                button8.isClickable = false
                button9.isClickable = false
                buttonResultShare.visibility = View.VISIBLE
            }
            turn += 1
            button9.isClickable = false
            if (turn == 10){
                Toast.makeText(this, "$dootDraw", Toast.LENGTH_SHORT).show()
                buttonResultShare.visibility = View.VISIBLE
            }
        }
        buttonPlayAgain.setOnClickListener{
            buttonSymbol.isEnabled = true
            button1.text = ""
            button2.text = ""
            button3.text = ""
            button4.text = ""
            button5.text = ""
            button6.text = ""
            button7.text = ""
            button8.text = ""
            button9.text = ""

            button1.isClickable = true
            button2.isClickable = true
            button3.isClickable = true
            button4.isClickable = true
            button5.isClickable = true
            button6.isClickable = true
            button7.isClickable = true
            button8.isClickable = true
            button9.isClickable = true
            buttonResultShare.visibility = View.INVISIBLE

            turn = 1
            b1 = 0
            b2 = b1
            b3 = b1
            b4 = b1
            b5 = b1
            b6 = b1
            b7 = b1
            b8 = b1
            b9 = b1
        }
        buttonResultShare.setOnClickListener{
            messageSend()
        }
    }

    fun messageSend(){
        Intent(Intent.ACTION_SEND).apply{
            //type = HTTP.PLAIN_TEXT_TYPE
            putExtra(Intent.EXTRA_EMAIL, arrayOf("geoffreythestudent@gmail.com")) // recipients
            putExtra(Intent.EXTRA_SUBJECT, "Email subject")
            putExtra(Intent.EXTRA_TEXT, "Email message text")
            putExtra(Intent.EXTRA_STREAM, Uri.parse("content://path/to/email/attachment"))
        }
        val intent = Intent(Intent.ACTION_SEND)
        val title = resources.getString(R.string.chooser_title)
        val chooser = Intent.createChooser(intent, title)
        startActivity(chooser)
        /*val intent = Intent(Intent.ACTION_SEND)
        val uri = Uri.parse("smsto:7248845264")
        intent.putExtra("sms_body", "Message")
        startActivity(intent)*/
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop() called")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy() called")
    }
    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause() called")
    }
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() called")
    }
    override fun onStart(){
        super.onStart()
        Log.d(TAG, "onStart() called")
    }
}