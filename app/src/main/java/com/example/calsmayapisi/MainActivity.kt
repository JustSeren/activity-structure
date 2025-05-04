package com.example.calsmayapisi

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calsmayapisi.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonDetay.setOnClickListener {
            //Snackbar.make(it, "Im here", Snackbar.LENGTH_SHORT).show()
            //binding.textView.text = "Vuu"
            val intent = Intent( this@MainActivity, DetaySayfasi::class.java)
            intent.putExtra("ad", "Seren ")
            intent.putExtra("yas", 25)
            intent.putExtra("okul", "çalışmıyor ")
            startActivity(intent)
        }

    }
}