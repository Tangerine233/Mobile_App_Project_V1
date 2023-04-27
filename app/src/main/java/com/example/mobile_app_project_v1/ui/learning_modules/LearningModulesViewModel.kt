package com.example.mobile_app_project_v1.ui.learning_modules

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LearningModulesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Learning Modules "
    }
    val text: LiveData<String> = _text
}