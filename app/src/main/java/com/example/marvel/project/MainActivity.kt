package com.example.marvel.project

import android.app.ProgressDialog
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.marvel.project.adapter.RecyclerAdapter
import com.example.marvel.project.api.ApiInterface
import com.example.marvel.project.model.ResultComics
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    lateinit var progerssProgressDialog: ProgressDialog
    lateinit var recyclerView: RecyclerView
    lateinit var recyclerAdapter: RecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerAdapter = RecyclerAdapter(this)
        recyclerview.layoutManager = LinearLayoutManager(this) as RecyclerView.LayoutManager?
        recyclerView.adapter = recyclerAdapter

        progerssProgressDialog = ProgressDialog(this)
        progerssProgressDialog.setTitle(R.string.msgLoad)
        progerssProgressDialog.setCancelable(false)
        progerssProgressDialog.show()


        getResultTypes()
    }

    fun getResultTypes(){
        val apiService = ApiInterface.create().getResults()

        apiService.enqueue(object : Callback<List<ResultComics>>{
            override fun onFailure(call: Call<List<ResultComics>>, t: Throwable) {
                progerssProgressDialog.dismiss()
                showToas(this@MainActivity, call.toString())
            }

            override fun onResponse(call: Call<List<ResultComics>>, response: Response<List<ResultComics>>) {
                if (response?.body() != null)
                    recyclerAdapter.setListItems(response.body())
                else
                    showToas(this@MainActivity,response.toString())
                progerssProgressDialog.dismiss()
            }

        })
    }

    private fun showToas(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
    }
}
