package com.example.androidmusicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retrofitBuilder = Retrofit.Builder()
            .baseUrl("https://deezerdevs-deezer.p.rapidapi.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiInterface::class.java)

        val retrofitData = retrofitBuilder.getData( query="eminem")

        retrofitData.enqueue(object : Callback<MyData?> {

            override fun onResponse(call: Call<MyData?>, response: Response<MyData?>) {
                // If the API call is a success then this method is executed
                val dataList = response.body()?.data
                val textView = findViewById<TextView>(R.id.helloText)
                textView.text = dataList.toString()
                Log.d("TAG: onResponse", "onResponse: "+ response.body())
            }

            override fun onFailure(call: Call<MyData?>, t: Throwable) {
                // If the API call is a failure then this method is executed
                Log.d("TAG : onFailure", "onFailure " + t.message)
            }
        })
    }
}

// #STEPS FOLLOWED

// 1. Add dependencies - retrofit and converter-gson
// 2. Create Data Class
// 3. Create API Interface
// 4. Get Data in MainActivity (Retrofit builder and enqueue method)
// 5. Populate data in view the way you want

// RecyclerView - You need a ListView (list of data) or RecyclerView when scrolling a screen

// STEPS FOLLOWED

// 1. Create an adapter
// 2. LMR Recyclerview with Adapter

