package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ItemTodoBinding

class TodoAdapter(var todos: List<Todo>): RecyclerView.Adapter<TodoAdapter.ToDoViewHolder>() {

    inner class ToDoViewHolder(val binding: ItemTodoBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemTodoBinding.inflate(layoutInflater, parent, false)
        return ToDoViewHolder(binding)
    }


    override fun onBindViewHolder(holder: ToDoViewHolder, position: Int) {
        holder.binding.apply {
            tvTitle.text = todos[position].title
            sbDone.isChecked = todos[position].isChecked
        }
    }

    override fun getItemCount(): Int {
        return  todos.size
    }

}