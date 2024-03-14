package com.example.parouimpar
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.parouimpar.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        calculoResultado()

        binding.umTextView.setOnClickListener()
    }
    private fun escolhaComputador(): Int{
        val escolha: Int = Random.nextInt(5)
        binding.computadorTextView.text = escolha.toString()
        return escolha
    }

    private fun calculoResultado(parImpar: String, escolhaPlayer: Int): String{
        val escolhaPC: Int = escolhaComputador()
        val soma: Int = escolhaPlayer + escolhaPC
        if (soma % 2 = 0){
            
        }
    }
}
