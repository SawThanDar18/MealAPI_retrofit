package com.example.testing

import com.google.gson.annotations.SerializedName

class Meal {

    @SerializedName("idMeal")
    val id : String? = null

    @SerializedName("strMealThumb")
    val meal_image : String? = null

    @SerializedName("strMeal")
    val meal_title : String? = null

    @SerializedName("strCategory")
    val strCategory : String? = null

    @SerializedName("strArea")
    val strArea : String? = null

    @SerializedName("strIngredient")
    val strIngredient : String? = null
}