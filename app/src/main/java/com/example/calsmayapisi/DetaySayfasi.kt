package com.example.calsmayapisi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calsmayapisi.databinding.ActivityDetaySayfasiBinding

class DetaySayfasi : AppCompatActivity() {
    private lateinit var binding: ActivityDetaySayfasiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetaySayfasiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val gelenAd = intent.getStringExtra("ad")
        val gelenYas = intent.getIntExtra("yas", 0)
        val gelenOkul = intent.getStringExtra("okul")
        binding.detayText.text = "Oş Geldin be yaa"
        binding.kullanCBilgi.text = " ${gelenAd + gelenYas + gelenOkul} "

    }
}