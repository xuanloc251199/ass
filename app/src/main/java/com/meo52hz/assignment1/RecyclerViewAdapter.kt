package com.meo52hz.assignment1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter (private var names: List<String>, private var phoneNumbers: List<String>,
private var images: List<Int>) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val itemName : TextView = itemView.findViewById(R.id.txt_name)
        val itemPhoneNumber : TextView = itemView.findViewById(R.id.txt_phoneNumber)
        val itemImg : ImageView = itemView.findViewById(R.id.img_thumbnail)

        init {
            itemView.setOnClickListener { v: View ->
                Toast.makeText(itemView.context, "Đã click!", Toast.LENGTH_SHORT).show()
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_contact, parent, false)

        return ViewHolder(v)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.itemName.text = names[position]
        holder.itemPhoneNumber.text = phoneNumbers[position]
        holder.itemImg.setImageResource(images[position])

    }

    override fun getItemCount(): Int {

        return names.size

    }
}