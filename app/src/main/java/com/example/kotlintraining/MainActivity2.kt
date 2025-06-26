package com.example.kotlintraining

import android.os.Build
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kotlintraining.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private val binding by lazy {
        ActivityMain2Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val bundle = intent.extras

        val usuario = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU){
            bundle?.getParcelable("user", User::class.java)
        }else{
            bundle?.getParcelable("user")
        }

        binding.randomNum.text = "Nome: ${usuario?.nome} - Idade: ${usuario?.idade} - Nat.: ${usuario?.nat}"

        /*if (bundle != null){
            binding.randomNum.text = bundle.getInt("RandomNumber").toString()
        }*/

        binding.fechar.setOnClickListener{
            finish()
        }
    }
}