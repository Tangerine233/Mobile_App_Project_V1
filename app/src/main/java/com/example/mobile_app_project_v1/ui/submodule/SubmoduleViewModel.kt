package com.example.mobile_app_project_v1.ui.submodule

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SubmoduleViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is SubModules "
    }
    val text: LiveData<String> = _text
}