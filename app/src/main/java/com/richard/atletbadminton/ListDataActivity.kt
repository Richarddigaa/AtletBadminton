package com.richard.atletbadminton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListDataActivity : AppCompatActivity() {

    private lateinit var rv_list : RecyclerView
    private lateinit var list : ArrayList<AtletModel>
    private lateinit var myAdapter : ListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_data)

        supportActionBar!!.title = "List Data Atlet"

        list = arrayListOf()
        rv_list = findViewById(R.id.rv_list)

        myAdapter = ListAdapter(list)

        list.addAll(DataAtlet.lisData)

        rv_list.layoutManager = LinearLayoutManager(this)
        rv_list.setHasFixedSize(true)
        rv_list.adapter = myAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_list_data, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.menu_person){
            startActivity(Intent(this, AboutActivity::class.java))
        }
        return true
    }
}