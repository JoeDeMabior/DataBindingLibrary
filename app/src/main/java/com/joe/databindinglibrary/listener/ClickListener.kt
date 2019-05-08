package com.joe.databindinglibrary.listener

import android.content.Context
import android.view.View
import android.widget.Toast
import com.joe.databindinglibrary.model.Contact

class ClickListener(var context: Context) {

    fun simpleButtonClick(view: View) {
        Toast.makeText(context, "Simple Button Click.", Toast.LENGTH_SHORT).show()
    }

    fun simpleButtonLongClick(view: View): Boolean {
        Toast.makeText(context, "Simple Button Long Click.", Toast.LENGTH_SHORT).show()
        return false
    }

    fun simpleButtonClickWithParams(view: View, contact: Contact) {
        Toast.makeText(context, "Simple Button Click With Parameters.\n" +
                "First Name: ${contact.firstName}\n" +
                "Last Name: ${contact.lastName}",
            Toast.LENGTH_SHORT).show()
    }
}
