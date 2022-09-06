package com.bakeysdietfood.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.catchymotivation.app.databinding.ActivityDetailBinding


class CatchyDetail : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDetailBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        jsdkdkfweew()
        isusysa()
    }

    private fun jsdkdkfweew() = with(binding){
        val title = intent.getStringExtra(CatchyAdapter.NAME_DIET)
        val desc = intent.getStringExtra(CatchyAdapter.DESC_DIET)

        tvTitle.text = title.toString()
        tvDesc.text = desc.toString()
    }

    private fun isusysa(){
        binding.floatingActionButton2.setOnClickListener {
            finish()
        }
    }
}