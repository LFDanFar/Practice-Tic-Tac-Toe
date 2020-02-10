package com.example.lab02_tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_choose.*

class ChooseActivity : AppCompatActivity() {
    /*companion object{
        val playerOne = "X"
        val playerTwo = "O"
        val PLAYER_ONE = playerOne
        val PLAYER_TWO = playerTwo
    }*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose)

        val buttonChangeOK = findViewById(R.id.buttonOK) as Button
        val buttonChangeCancel = findViewById(R.id.buttonCancel) as Button
        var editPlayerOne = findViewById(R.id.textViewPlayerOne) as EditText
        var editPlayerTwo = findViewById(R.id.textViewPlayerTwo) as EditText

        //buttonChangeOK.isEnabled = false

        buttonChangeCancel.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        editPlayerOne.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {            }
        })
        editPlayerTwo.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {            }
        })

        if (editPlayerOne.text.toString() != editPlayerTwo.text.toString()){
            buttonChangeOK.isEnabled = true
        }

        buttonChangeOK.setOnClickListener{
            if(editPlayerOne.text.toString() == editPlayerTwo.text.toString()){
                Toast.makeText(this, "Make the players different", Toast.LENGTH_SHORT).show()
            }
            val intent = Intent(this, MainActivity::class.java)
            //intent.putExtra(PLAYER_ONE, editPlayerOne.text.toString())
            //intent.putExtra(editPlayerTwo.text.toString(), PLAYER_TWO)
            startActivity(intent)
        }
    }
}