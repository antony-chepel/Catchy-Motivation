package com.catchymotivation.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.bakeysdietfood.app.CatchyAdapter
import com.catchymotivation.app.catchymotivationutils.CatchyList
import com.catchymotivation.app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var adapter : CatchyAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        usywtqweqwe()
    }

    private fun usywtqweqwe() = with(binding){
        adapter = CatchyAdapter(CatchyList.ldksdjsd,this@MainActivity)
        rcView.layoutManager = LinearLayoutManager(this@MainActivity,LinearLayoutManager.VERTICAL,false)
        rcView.adapter = adapter

    }
}