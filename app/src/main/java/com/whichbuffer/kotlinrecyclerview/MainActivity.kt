package com.whichbuffer.kotlinrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var blogAdapter:BlogRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecylcerView()
        addDataSet()
    }

    private fun addDataSet(){
        val data = DataSource.createDataSet()
        blogAdapter.submitList(data)
    }

    private fun initRecylcerView(){
        recycler_view.apply {
            recycler_view.layoutManager = LinearLayoutManager(this@MainActivity)
            val topSpacingDecoration = TopSpacingItemDecoration(30)
            addItemDecoration(topSpacingDecoration)
            blogAdapter = BlogRecyclerAdapter()
            adapter = blogAdapter
        }



    }
}