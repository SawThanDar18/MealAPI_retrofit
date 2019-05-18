package com.example.mealapi_retrofit

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.widget.GridLayout
import android.widget.GridLayout.VERTICAL
import android.widget.Toast
import com.example.testing.CategoryMealResponse
import com.example.testing.LatestMealResponse
import com.example.testing.MealAPI
import com.example.testing.RecyclerAdapter
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerAdapter: RecyclerAdapter
    private lateinit var mealAPI: MealAPI

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRetrofit()
        //getLatestMeals()
        //getMeal()
        //getMealId()
        //getRandomMeal()
        //getMealCategory()
        //getCategoryList()
        //getMealArea()
        //getMealIngredient()
        //getMainIngredient()
        //getMultiIngredient()
        //getSeafoodIngredient()
        getCanadian()
    }

    private fun getCanadian() {
        mealAPI.getCanadian().enqueue(object : Callback<LatestMealResponse>{
            override fun onFailure(call: Call<LatestMealResponse>, t: Throwable) {
                Toast.makeText(applicationContext, t?.localizedMessage, Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(call: Call<LatestMealResponse>, response: Response<LatestMealResponse>) {
                if(response != null){
                    bindData(response.body())
                }
            }

        })
    }

    private fun getSeafoodIngredient() {
        mealAPI.getSeafoodIngredient().enqueue(object : Callback<LatestMealResponse>{
            override fun onFailure(call: Call<LatestMealResponse>, t: Throwable) {
                Toast.makeText(applicationContext, t?.localizedMessage, Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(call: Call<LatestMealResponse>, response: Response<LatestMealResponse>) {
                if(response != null){
                    bindData(response.body())
                }
            }

        })
    }

    private fun getMultiIngredient() {
        mealAPI.getMultiIngredient().enqueue(object : Callback<LatestMealResponse>{
            override fun onFailure(call: Call<LatestMealResponse>, t: Throwable) {
                Toast.makeText(applicationContext, t?.localizedMessage, Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(call: Call<LatestMealResponse>, response: Response<LatestMealResponse>) {
                if(response != null){
                    bindData(response.body())
                }
            }

        })
    }

    private fun getMainIngredient() {
        mealAPI.getMainIngredient().enqueue(object : Callback<LatestMealResponse>{
            override fun onFailure(call: Call<LatestMealResponse>, t: Throwable) {
                Toast.makeText(applicationContext, t?.localizedMessage, Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(call: Call<LatestMealResponse>, response: Response<LatestMealResponse>) {
                if(response != null){
                    bindData(response.body())
                }
            }

        })
    }

    private fun getMealIngredient() {
        mealAPI.getMealIngredient().enqueue(object : Callback<LatestMealResponse>{
            override fun onFailure(call: Call<LatestMealResponse>, t: Throwable) {
                Toast.makeText(applicationContext, t?.localizedMessage, Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(call: Call<LatestMealResponse>, response: Response<LatestMealResponse>) {
                if(response != null){
                    bindData(response.body())
                }
            }

        })
    }

    private fun getMealArea() {
        mealAPI.getMealArea().enqueue(object : Callback<LatestMealResponse>{
            override fun onFailure(call: Call<LatestMealResponse>, t: Throwable) {
                Toast.makeText(applicationContext, t?.localizedMessage, Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(call: Call<LatestMealResponse>, response: Response<LatestMealResponse>) {
                if(response != null){
                    bindData(response.body())
                }
            }

        })
    }

    private fun getCategoryList() {
        mealAPI.getCategoryList().enqueue(object : Callback<LatestMealResponse>{
            override fun onFailure(call: Call<LatestMealResponse>, t: Throwable) {
                Toast.makeText(applicationContext, t?.localizedMessage, Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(call: Call<LatestMealResponse>, response: Response<LatestMealResponse>) {
                if(response != null){
                    bindData(response.body())
                }
            }

        })
    }

    private fun getMealCategory() {
        mealAPI.getMealCategory().enqueue(object : Callback<CategoryMealResponse>{
            override fun onFailure(call: Call<CategoryMealResponse>, t: Throwable) {
                Toast.makeText(applicationContext, t?.localizedMessage, Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(call: Call<CategoryMealResponse>, response: Response<CategoryMealResponse>){
                if(response != null){
                    //bindData(response.body())
                }
            }

        })
    }

    private fun getRandomMeal() {
        mealAPI.getRandomMeal().enqueue(object : Callback<LatestMealResponse>{
            override fun onFailure(call: Call<LatestMealResponse>, t: Throwable) {
                Toast.makeText(applicationContext, t?.localizedMessage, Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(call: Call<LatestMealResponse>, response: Response<LatestMealResponse>) {
                if(response != null){
                    //bindData(response.body())
                }
            }

        })

    }

    private fun getMealId() {
        mealAPI.getMealId("52772").enqueue(object : Callback<LatestMealResponse>{
            override fun onFailure(call: Call<LatestMealResponse>, t: Throwable) {
                Toast.makeText(applicationContext, t?.localizedMessage, Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(call: Call<LatestMealResponse>, response: Response<LatestMealResponse>) {
                if(response != null){
                    //bindData(response.body())
                }
            }

        })
    }

    private fun getMeal() {
        mealAPI.getMeal().enqueue(object : Callback<LatestMealResponse> {
            override fun onFailure(call: Call<LatestMealResponse>, t: Throwable) {
                Toast.makeText(applicationContext, t?.localizedMessage, Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(call: Call<LatestMealResponse>, response: Response<LatestMealResponse>) {
                if (response != null){
                    bindData(response.body())
                }
            }
        })
    }

    private fun getLatestMeals() {

        mealAPI.getLatestMealResponse().enqueue(object : Callback<LatestMealResponse>{

            override fun onFailure(call: Call<LatestMealResponse>, t: Throwable) {

                Toast.makeText(applicationContext, t?.localizedMessage, Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(call: Call<LatestMealResponse>, response: Response<LatestMealResponse>) {
                if(response != null){
                    //bindData(response.body())
                }
            }
        })
    }

    //for meals response
    private fun bindData(body: LatestMealResponse?) {

        recyclerAdapter = RecyclerAdapter(body?.meals!!,this)
        recycler_view.adapter = recyclerAdapter

        var layoutManager = GridLayoutManager(this, 2, VERTICAL, false)
        recycler_view.setLayoutManager(layoutManager)
    }

    //for category response
    /*private fun bindData(body: CategoryMealResponse?) {

        recyclerAdapter = RecyclerAdapter(body?.categories!!,this)
        recycler_view.adapter = recyclerAdapter

        var layoutManager = GridLayoutManager(this, 2, VERTICAL, false)
        recycler_view.setLayoutManager(layoutManager)
    }*/

    private fun initRetrofit() {

        val retrofit = Retrofit.Builder()
            .baseUrl("https://www.themealdb.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        mealAPI = retrofit.create(MealAPI::class.java)
    }
}
