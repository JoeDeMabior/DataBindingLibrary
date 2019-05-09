package com.joe.databindinglibrary.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.joe.databindinglibrary.R
import com.joe.databindinglibrary.databinding.ActivityMainBinding
import com.joe.databindinglibrary.listener.ClickListener
import com.joe.databindinglibrary.model.User

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setSupportActionBar(binding.toolbar)

        user.firstName = "Joe"
        user.lastName = "Deng"
        binding.user = user

        val click = ClickListener(binding.content.txtFirstName, binding.content.txtLastName)
        binding.content.click = click
    }

    companion object {
        val user = User("", "")
    }
}
