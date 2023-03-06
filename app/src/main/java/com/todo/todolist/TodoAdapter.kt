package com.todo.todolist

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.todo.todolist.databinding.TodolistViewholderBinding
import kotlin.coroutines.coroutineContext


class TodoAdapter : ListAdapter<String, TodoAdapter.TodoViewHolder>(TodoDiffUtil()) {
    private val TAG = javaClass.simpleName

    inner class TodoViewHolder(var binding: TodolistViewholderBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: String){
            binding.vhTextView.text = item
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val todoListBinding = TodolistViewholderBinding.inflate(
            LayoutInflater.from(parent.context)
            , parent
            , false)
        return TodoViewHolder(todoListBinding)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}