package com.doseyenc.navigationders1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.doseyenc.navigationders1.databinding.ActivityIkinciBinding

class ikinciActivity : AppCompatActivity() {
    private lateinit var binding:ActivityIkinciBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityIkinciBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2.setOnClickListener {
            val intent=Intent(this,UcuncuActivity::class.java)
            startActivity(intent)

        }
    }
}