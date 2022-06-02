package com.example.todolist_app.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.todolist_app.Model.Todo
import com.example.todolist_app.R
import com.example.todolist_app.databinding.ActivityMainBinding
import com.example.todolist_app.utils.TodoAdapter

class todolistActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val todoListSingleItem = mutableListOf(Todo("Go to Gym", false))
        val adapter = TodoAdapter(todoListSingleItem)
        binding.rvTodos.adapter = adapter
        binding.rvTodos.layoutManager = LinearLayoutManager(this)

        binding.btnAddtodo.setOnClickListener{

            val newTodoTitle = binding.etAddTodo.text.toString() // Getting the todos as text
            val newTodo = Todo(newTodoTitle,false) // new todoItem

            todoListSingleItem.add(newTodo)
            adapter.notifyDataSetChanged()
            binding.etAddTodo.text.clear()
        }


    }
}