package com.todo.todolist.vm

import android.util.Log
import androidx.databinding.BindingAdapter
import androidx.lifecycle.MutableLiveData
import com.google.android.material.tabs.TabLayout.TabGravity
import com.todo.todolist.TodoAdapter
import com.todo.todolist.model.TodoListProvider

class TodoViewModel {
    //RecyclerView Adapter
    private val mTodoAdapter = TodoAdapter()
    //UI
    private val todoListLiveData by lazy {
        MutableLiveData<ArrayList<String>>()
    }
    //텍스트 입력부분
    var todoText = MutableLiveData<String>("")

    private val todoList = TodoListProvider().getTodoList()

    fun getTodoAdapter() = mTodoAdapter


    fun buttonPressed() {
        //null, 공백 검증
        val text = todoText
        if (text.value.isNullOrBlank()) return

        todoList.add(text.value.toString())
        Log.d("---------------", todoList.toString())
        //TODO todoList -> TodoListLiveData
//        mTodoAdapter.submitList()

        todoText.value = ""
    }
}