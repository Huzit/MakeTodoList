package com.todo.todolist.model

class TodoListProvider {
    private var todoList = ArrayList<String>()

    fun getTodoList() = todoList
    fun setTodoList(ary: ArrayList<String>){
        todoList = ArrayList<String>(ary)
    }
}