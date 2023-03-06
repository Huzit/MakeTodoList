package com.todo.todolist.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.todo.todolist.R
import com.todo.todolist.TodoAdapter
import com.todo.todolist.databinding.ActivityMainBinding
import com.todo.todolist.vm.TodoViewModel

class MainActivity : AppCompatActivity() {

    //    }
//        TodoAdapter()
//    private val mTodoAdapter by lazy {
//    private var todoText = ArrayList<String>()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //databinding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = TodoViewModel()
        binding.lifecycleOwner = this

//        binding.recyclerView.apply {
//            adapter = mTodoAdapter
//            layoutManager = LinearLayoutManager(context)
//        }
    }
//
//    //click event
//    fun buttonPressed() {
//        //null, 공백 검증
//        val text = binding.exitText.text.toString()
//        if (text.isEmpty()) return
//
//        todoText.add(text)
//
//        mTodoAdapter.submitList(ArrayList<String>(todoText))
//        binding.exitText.text?.clear()
//    }
}