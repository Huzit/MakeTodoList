package com.todo.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.view.size
import androidx.recyclerview.widget.LinearLayoutManager
import com.todo.todolist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //viewBinding
    private lateinit var binding : ActivityMainBinding
    private val TAG = this.javaClass.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding inflate
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //main code

        var text = ArrayList<String>()
        binding.inputButton.setOnClickListener {

            text.add(binding.exitText.text.toString())

            val mRecyclerView = binding.recyclerView
            mRecyclerView.adapter = TodoAdapter(text)
            mRecyclerView.layoutManager = LinearLayoutManager(applicationContext)

            binding.exitText.text?.clear()
        }



    }
}