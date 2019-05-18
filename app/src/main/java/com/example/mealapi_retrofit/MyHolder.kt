package com.example.testing

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class MyHolder(itemView : View, private val mContext : Context) : RecyclerView.ViewHolder(itemView){

    //for meals obj
    private val mealImage : ImageView
    private val mealTitle : TextView
    //private val mealCategoryList : TextView
    //private val mealArea : TextView
    //private val mealIngredient : TextView

    init {
        mealImage = itemView.findViewById<View>(R.id.image) as ImageView
        mealTitle = itemView.findViewById<View>(R.id.title) as TextView
        //mealCategoryList = itemView.findViewById<View>(R.id.title) as TextView
        //mealArea = itemView.findViewById<View>(R.id.title) as TextView
        //mealIngredient = itemView.findViewById<View>(R.id.title) as TextView
    }

    fun index(meal: Meal){
        Glide.with(mContext).load(meal.meal_image).into(mealImage)
        mealTitle.text = meal.meal_title
        //mealCategoryList.text = meal.strCategory
        //mealArea.text = meal.strArea
        //mealIngredient.text = meal.strIngredient
    }

    //for categories obj
    /*private val categoryImage : ImageView
    private val categoryName : TextView

    init {
        categoryImage = itemView.findViewById<View>(R.id.image) as ImageView
        categoryName = itemView.findViewById<View>(R.id.title) as TextView
    }

    fun index(category: Category){
        Glide.with(mContext).load(category.category_image).into(categoryImage)
        categoryName.text = category.category_name
    }*/
}