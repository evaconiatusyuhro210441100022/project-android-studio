package com.example.projectutspraktikum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recycle: RecyclerView
    lateinit var recycleAdapter: Adapter
    lateinit var listData: ArrayList<DataClass>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recycle = findViewById(R.id.idRVCourses)
        recycle.setHasFixedSize(true)
        listData = ArrayList()

        listData.add(DataClass("Adzan Shaliha", "180441100007", "18 Tahun", R.drawable.jkt1))
        listData.add(DataClass("Angelina Christy", "160441100043", "34 tahun", R.drawable.jkt2))
        listData.add(DataClass("Azizi Asadel", "150441100044", "20 tahun", R.drawable.jkt3))
        listData.add(DataClass("Cornelia Vanisa", "150441100010", "34 tahun", R.drawable.jkt4))
        listData.add(DataClass("Febriola Sinambela", "130441100010", "20 tahun", R.drawable.jkt5))
        listData.add(DataClass("Fiony Alveria", "210441100067", "22 tahun", R.drawable.jkt6))
        listData.add(DataClass("Flora Syafiq", "180441100043", "33 tahun", R.drawable.jkt7))
        listData.add(DataClass("Fransisca Saraswati", "200441100014", "24 tahun", R.drawable.jkt8))
        listData.add(DataClass("Freya Jayawardana", "140441100007", "20 tahun", R.drawable.jkt9))
        listData.add(DataClass("Helisma Putri", "210441100019", "24 tahun", R.drawable.jkt10))
        listData.add(DataClass("Indah Cahya", "220441100118", "26 tahun", R.drawable.jkt11))
        listData.add(DataClass("Jessica Chandra", "140441100030", "26 tahun", R.drawable.jkt12))
        listData.add(DataClass("Jesslyn Callista", "160441100120", "23 tahun", R.drawable.jkt13))
        listData.add(DataClass("Katrina Irene", "2040441100011", "27 tahun", R.drawable.jkt14))
        listData.add(DataClass("Lulu Salsabila", "2040441100192", "24 tahun", R.drawable.jkt15))
        listData.add(DataClass("Marsha Lenathea", "2040441100023", "32 tahun", R.drawable.jkt16))
        listData.add(DataClass("Mutiara Azzahra", "2040441100181", "25 tahun", R.drawable.jkt17))
        listData.add(DataClass("Reva Fidela", "2040441100002", "31 tahun", R.drawable.jkt18))
        listData.add(DataClass("Shani Indira", "2040431100005", "27 tahun", R.drawable.jkt18))
        listData.add(DataClass("Shania Gracia", "2140441100009", "30 tahun", R.drawable.jkt18))

        showList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.options, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.menu_list) {
            showList()
        } else if (item.itemId == R.id.menu_grid) {
            showGrid()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showGrid() {
        val layoutManager = GridLayoutManager(this, 2)
        recycle.layoutManager = layoutManager
        recycleAdapter = Adapter(listData, this)
        recycle.adapter = recycleAdapter
    }

    private fun showList() {
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycle.layoutManager = layoutManager
        recycleAdapter = Adapter(listData, this)
        recycle.adapter = recycleAdapter
    }
}