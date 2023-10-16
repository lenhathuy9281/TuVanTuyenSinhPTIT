package com.ptit.tuvanptit.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(): ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text

    val username = MutableLiveData("")
    val password = MutableLiveData("")

    fun login(){
        val username = username.value
        val password = password.value
        Timber.d("username: $username")
        Timber.d("password: $password")
    }
}