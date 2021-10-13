package com.doseyenc.navigationders1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.doseyenc.navigationders1.databinding.ActivityUcuncuBinding

class UcuncuActivity : AppCompatActivity() {
    private lateinit var binding:ActivityUcuncuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityUcuncuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button4.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)

        }
    }
}