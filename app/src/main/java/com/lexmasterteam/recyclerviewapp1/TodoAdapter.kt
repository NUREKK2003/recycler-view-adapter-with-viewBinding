package com.lexmasterteam.recyclerviewapp1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lexmasterteam.recyclerviewapp1.databinding.ItemTodoBinding

class TodoAdapter(
    var todos:List<Todo>
) : RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {
    inner class TodoViewHolder(val binding: ItemTodoBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemTodoBinding.inflate(inflater,parent,false)
        return TodoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.binding.tvTitle.text = todos[position].title
        holder.binding.cbDone.isChecked = todos[position].isChecked

    }

    override fun getItemCount(): Int {
        return todos.size
    }
}