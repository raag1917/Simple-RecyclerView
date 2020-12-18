package com.raag.simplerecyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.raag.simplerecyclerview.R
import com.raag.simplerecyclerview.data.Names
import com.raag.simplerecyclerview.databinding.RowBinding

class MainAdapter(private val context: Context, private val dataList: MutableList<Names>): RecyclerView.Adapter<MainAdapter.MainViewHolder>() {
    //permite inflar la vista de cada item
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
    MainViewHolder (LayoutInflater.from(context).inflate(R.layout.row, parent, false))


    //define la posicion de cada elemento de la lista
    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bindView(dataList[position])
    }

    //define el tamaño de la lista
    override fun getItemCount() = dataList.size

    //permite cargar los datos y asignarlos a los elementos de la vista
    inner class MainViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val binding = RowBinding.bind(view)
        fun bindView(names: Names) = with(binding) {
            tvName.text = names.name
            tvLastName.text = names.lastName
        }
    }
}