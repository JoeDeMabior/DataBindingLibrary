package com.joe.databindinglibrary.model

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.joe.databindinglibrary.BR

data class User(var firstName: String, var lastName: String) : BaseObservable() {

    var userFirstName: String
        @Bindable get() = firstName
        set(value) {
            firstName = value
            notifyPropertyChanged(BR.userFirstName)
        }

    var userLastName: String
        @Bindable get() = lastName
        set(value) {
            lastName = value
            notifyPropertyChanged(BR.userLastName)
        }
}
