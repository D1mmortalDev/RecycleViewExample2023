package com.example.recycleexample2023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.RecoverySystem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleexample2023.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var  recycleView:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recycleView = binding.myRecycleView
        recycleView.layoutManager = LinearLayoutManager(this)

        var items = listOf(
            Item("Laptop","Portable Computer"),
            Item("Mouse","Pointing Device"),
            Item("Keyboard","Input Device"),
            Item("Laptop","Portable Computer"),
            Item("Mouse","Pointing Device"),
            Item("Keyboard","Input Device"),
            Item("Laptop","Portable Computer"),
            Item("Mouse","Pointing Device"),
            Item("Keyboard","Input Device"),
            Item("Laptop","Portable Computer"),
            Item("Mouse","Pointing Device"),
            Item("Keyboard","Input Device"),
            Item("Laptop","Portable Computer"),
            Item("Mouse","Pointing Device"),
            Item("Keyboard","Input Device"),
            Item("Laptop","Portable Computer"),
            Item("Mouse","Pointing Device"),
            Item("Keyboard","Input Device")
        )
        recycleView.adapter=ItemAdapter(items)

    }
}