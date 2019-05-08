package com.joe.databindinglibrary.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.joe.databindinglibrary.R
import com.joe.databindinglibrary.databinding.ActivityMainBinding
import com.joe.databindinglibrary.model.Contact
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val contact = Contact("Joe", "Deng")
        binding.contact = contact
        setSupportActionBar(toolbar)
    }
}
