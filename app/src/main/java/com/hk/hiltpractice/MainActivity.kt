package com.hk.hiltpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.hk.hiltpractice.data.models.Product
import com.hk.hiltpractice.data.models.User
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    companion object {
        const val TAG = "Hilt_Practice"
    }

    @Inject
    lateinit var product1: Product

    @Inject
    lateinit var product2: Product

    @Inject
    lateinit var user1: User

    @Inject
    lateinit var user2: User

    lateinit var viewModel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        Log.d(TAG, "onCreate: product1 = $product1")
        Log.d(TAG, "onCreate: user of product1 = ${product1.user}")
        Log.d(TAG, "onCreate: product2 = $product2")
        Log.d(TAG, "onCreate: user of product2 = ${product2.user}")
        Log.d(TAG, "onCreate: user1 = $user1")
        Log.d(TAG, "onCreate: user2 = $user2")
    }
}