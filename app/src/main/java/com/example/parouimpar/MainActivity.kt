package com.example.parouimpar
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.parouimpar.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding
    private var valorPlayer: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.umTextView.setOnClickListener {
            valorPlayer = 1
            binding.numeroTextView.text = "1"
        }
        binding.doisTextView.setOnClickListener{
            valorPlayer = 2
            binding.numeroTextView.text = "2"
        }
        binding.tresTextView.setOnClickListener{
            valorPlayer = 3
            binding.numeroTextView.text = "3"
        }
        binding.quatroTextView.setOnClickListener{
            valorPlayer = 4
            binding.numeroTextView.text = "4"
        }
        binding.cincoTextView.setOnClickListener{
            valorPlayer = 5
            binding.numeroTextView.text = "5"
        }
        binding.imparTextView.setOnClickListener {
            if (valorPlayer == null){
                Toast.makeText(this, "Escolha um número primeiro...", Toast.LENGTH_LONG).show()
            }else{
                val numeroPlayer: Int = valorPlayer!!
                calculoResultado("Ímpar", numeroPlayer)
            }
        }
        binding.parTextView.setOnClickListener {
            if (valorPlayer == null){
                Toast.makeText(this, "Escolha um número primeiro...", Toast.LENGTH_LONG).show()
            }else{
                val numeroPlayer: Int = valorPlayer!!
                calculoResultado("Par", numeroPlayer)
            }
        }
    }
    private fun escolhaComputador(): Int{
        val escolha: Int = Random.nextInt(5)
        binding.computadorTextView.text = escolha.toString()
        return escolha
    }

    private fun calculoResultado(escolhaParOuImpar: String, escolhaPlayer: Int): String{
        val escolhaPC: Int = escolhaComputador()
        val soma: Int = escolhaPlayer + escolhaPC
        if ((soma % 2 == 0 && escolhaParOuImpar == "Par") || (soma % 2 != 0 && escolhaParOuImpar == "Ímpar")) {
            val resultado = "Você Ganhou!!"
            binding.resultadoTextView.text = resultado
            Toast.makeText(this, resultado, Toast.LENGTH_LONG).show()
            return resultado
        }
        val resultado = "Você Perdeu..."
        binding.resultadoTextView.text = resultado
        Toast.makeText(this, resultado, Toast.LENGTH_LONG).show()
        return resultado
    }
}
