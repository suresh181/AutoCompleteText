package com.example.autocompletetext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.autocompletetext.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val colors = arrayOf("Red","Orange","Blue","Black","Yellow","Black","White","Voilet","Purple")

        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,colors)
        binding.atv.threshold = 1
        binding.atv.setAdapter(adapter)

        binding.btn.setOnClickListener {
            val enterText = binding.atv.text
            Toast.makeText(this,enterText, Toast.LENGTH_SHORT).show()

        }
    }

}