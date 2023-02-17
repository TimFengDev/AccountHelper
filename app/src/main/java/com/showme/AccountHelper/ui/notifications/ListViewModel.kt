package com.showme.AccountHelper.ui.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ListViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "列表頁"
    }
    val text: LiveData<String> = _text
}