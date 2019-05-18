package com.example.testing

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent

class RecyclerAdapter(private val meals:ArrayList<Meal>, private val mContext : Context) : RecyclerView.Adapter<MyHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return MyHolder(view, mContext)
    }

    override fun getItemCount(): Int {

        return meals.size
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {

       holder?.index(meals[position])
    }

/*class RecyclerAdapter(private val categories:ArrayList<Category>, private val mContext : Context) : RecyclerView.Adapter<MyHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return MyHolder(view, mContext)
    }

    override fun getItemCount(): Int {

        return categories.size
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {

        holder?.index(categories[position])
    }*/

}