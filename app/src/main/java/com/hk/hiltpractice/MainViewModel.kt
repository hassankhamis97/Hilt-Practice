package com.hk.hiltpractice

import android.util.Log
import androidx.lifecycle.ViewModel
import com.hk.hiltpractice.MainActivity.Companion.TAG
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(): ViewModel() {
    init {
        Log.d(TAG, "viewModel init")
    }
}