package com.showme.AccountHelper.ui.record

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RecordViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "紀錄頁"
    }
    val text: LiveData<String> = _text
}