package com.example.myfridge

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterMain(
    private var items: List<Item>
): RecyclerView.Adapter<AdapterMain.ItemViewHolder>() {

    //override onCreateViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return ItemViewHolder(view)
        //return holder of the inflated view
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val itemValue = items[position]
        holder.itemTitle.text = itemValue.title //mora .text
        holder.itemDelete.setOnClickListener{ }  //delete from a database
        holder.itemCheck.setOnClickListener{ }  //same thing
    }

    override fun getItemCount(): Int {
        return items.size
    }

    //inner class for ItemViewHolder
    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) { //nasljedjuje recyclerview viewholder
        val itemTitle: TextView = itemView.findViewById(R.id.itemTextView) //itemBiew kao parametar
        val itemDelete: ImageView = itemView.findViewById(R.id.cancelImageView)
        val itemCheck: ImageView = itemView.findViewById(R.id.checkImageView)
    }
}