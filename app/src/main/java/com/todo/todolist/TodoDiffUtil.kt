package com.todo.todolist

import androidx.recyclerview.widget.DiffUtil

class TodoDiffUtil : DiffUtil.ItemCallback<String>() {
    override fun areItemsTheSame(oldItem: String, newItem: String): Boolean = oldItem === newItem

    override fun areContentsTheSame(oldItem: String, newItem: String): Boolean = oldItem == newItem

    override fun getChangePayload(oldItem: String, newItem: String): Any? {
        return super.getChangePayload(oldItem, newItem)
    }
}