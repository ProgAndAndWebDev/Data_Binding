package com.example.simplemvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.viewbinding.ViewBinding
import com.example.simplemvvm.databinding.ActivityMainBinding
import com.example.simplemvvm.viewModel.MainViewModel

class MainActivity : AppCompatActivity() {
    private val viewModel:MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val kk= DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main).also {  binding ->
            binding.viewModel=viewModel
        }
        viewModel.user.observe(this,{
            Log.i("jd",it.name)
            Log.i("jd",kk.textView.text.toString())

        //    kk.textView.text=it.name
        })
    }
}