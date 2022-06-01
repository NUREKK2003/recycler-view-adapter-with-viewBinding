package com.lexmasterteam.recyclerviewapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.lexmasterteam.recyclerviewapp1.databinding.ActivityMainBinding

private lateinit var binding:ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var todoList = mutableListOf(
            Todo("Hold the line!",false),
            Todo("Hold the line!",false),
            Todo("Hold the line!",false),
            Todo("Hold the line!",false),
            Todo("Hold the line!",false),
            Todo("Hold the line!",false),
            Todo("Hold the line!",false),
            Todo("Hold the line!",false),
        )
        val adapter = TodoAdapter(todoList)
        binding.rvTodos.adapter = adapter
        binding.rvTodos.layoutManager = LinearLayoutManager(this)

        binding.btnAddTodo.setOnClickListener {
            val tile = binding.etTodo.text.toString()
            val todo = Todo(tile,false)
            todoList.add(todo)
            // update only last item
            adapter.notifyItemInserted(todoList.size-1)
        }
    }
}