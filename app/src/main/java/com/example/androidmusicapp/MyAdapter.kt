package com.example.androidmusicapp

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Connects the User Interfaces with with data sources
class MyAdapter(val context: Activity, private val dataList: List<Data>): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        // Create the view in case the layout manager fail to create view for the data

        val image: ImageView
        val title: TextView
        val play: ImageButton
        val pause: ImageButton

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {


    }


    override fun getItemCount(): Int {
        // Returns the total number of items in the data set held by the adapter
        return dataList.size
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // Populate the data into the view

    }
}