package com.todo.todolist

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.todo.todolist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val TAG = this.javaClass.simpleName

    //viewBinding
    private lateinit var binding: ActivityMainBinding
    private var todoText = ArrayList<String>()
    private val mTodoAdapter by lazy {
        TodoAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //databinding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.todoList = this

        binding.recyclerView.apply {
            adapter = mTodoAdapter
            layoutManager = LinearLayoutManager(context)
        }
    }

    //click event
    fun buttonPressed() {
        //null, 공백 검증
        val text = binding.exitText.text.toString()
        if (text.isEmpty()) return

        todoText.add(text)

        mTodoAdapter.submitList(ArrayList<String>(todoText))
        binding.exitText.text?.clear()
    }
}