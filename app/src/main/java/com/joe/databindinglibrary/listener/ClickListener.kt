package com.joe.databindinglibrary.listener

import android.view.View
import android.widget.EditText
import com.joe.databindinglibrary.ui.MainActivity.Companion.user

class ClickListener(var fName: EditText, var lName: EditText) {

    fun updateUser(view: View) {
        user.userFirstName = fName.text.toString()
        user.userLastName = lName.text.toString()
        fName.setText("")
        lName.setText("")
    }
}
