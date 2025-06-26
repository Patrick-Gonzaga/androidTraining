package com.example.kotlintraining

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kotlintraining.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



    }

    override fun onStart() {
        super.onStart()
        Log.i("life_cycle", "onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.i("life_cycle", "onResume")
        val randomNum = (0..100).random()
        binding.btnOpenNewAct.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("RandomNumber", randomNum)

            startActivity(intent)
        }
    }

    override fun onPause() {
        super.onPause()
        Log.i("life_cycle", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("life_cycle", "onStop")
    }

}