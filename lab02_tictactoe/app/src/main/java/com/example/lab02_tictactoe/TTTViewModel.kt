package com.example.lab02_tictactoe

import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModel
import kotlinx.android.synthetic.main.activity_main.*

private const val TAG = "TTTViewModel"

class TTTViewModel : ViewModel(){
    init{
        Log.d(TAG, "ViewModel instance created")
    }

    var currentIndex: Int = 0

    override fun onCleared() {
        super.onCleared()
        Log.d(TAG, "ViewModel instance about to be destroyed")
    }
}