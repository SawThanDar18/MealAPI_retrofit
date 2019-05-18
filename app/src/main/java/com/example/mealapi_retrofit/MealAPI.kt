package com.example.testing

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MealAPI {

    //get all datas
    @GET("api/json/v1/1/latest.php")
    fun getLatestMealResponse() : Call<LatestMealResponse>

    //get meal by name
    //@GET("api/json/v1/1/search.php?s=Arrabiata")
    //fun getMeal(@Query("strMeal") meal_title: String) : Call<LatestMealResponse>
    @GET("api/json/v1/1/search.php?s=Arrabiata")
    fun getMeal(): Call<LatestMealResponse>

    //get meal by id
    @GET("api/json/v1/1/lookup.php?i=52772")
    fun getMealId(@Query("idMeal") id : String) : Call<LatestMealResponse>

    //get random meal
    @GET("api/json/v1/1/random.php")
    fun getRandomMeal() : Call<LatestMealResponse>

    //get category
    @GET("api/json/v1/1/categories.php")
    fun getMealCategory() : Call<CategoryMealResponse>

    //get category lists
    @GET("api/json/v1/1/list.php?c=list")
    fun getCategoryList() : Call<LatestMealResponse>

    //get area
    @GET("api/json/v1/1/list.php?a=list")
    fun getMealArea() : Call<LatestMealResponse>

    //get ingredient
    @GET("api/json/v1/1/list.php?i=list")
    fun getMealIngredient() : Call<LatestMealResponse>

    //get main ingredient
    @GET("api/json/v1/1/filter.php?i=chicken_breast")
    fun getMainIngredient() : Call<LatestMealResponse>

    //get multi ingredient
    @GET("api/json/v1/1/filter.php?i=chicken_breast,garlic,salt")
    fun getMultiIngredient() : Call<LatestMealResponse>

    //get meal by seafood
    @GET("api/json/v1/1/filter.php?c=Seafood")
    fun getSeafoodIngredient() : Call<LatestMealResponse>

    @GET("api/json/v1/1/filter.php?a=Canadian")
    fun getCanadian() : Call<LatestMealResponse>
}