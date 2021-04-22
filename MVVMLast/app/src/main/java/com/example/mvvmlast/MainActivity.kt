package com.example.mvvmlast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.mvvmlast.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: ViewModelClass
    private lateinit var binding: ActivityMainBinding
        lateinit var b1 :Button
        lateinit var t1 :TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel = ViewModelProviders.of(this).get(ViewModelClass::class.java)
        binding.buttonGo.setOnClickListener {

            viewModel.getListOfQuotes()
            viewModel.quote.observe(this, Observer { ViewQuotes -> binding.textViewShow.text=(ViewQuotes) })
         }
        if(savedInstanceState != null){
            viewModel.quote.observe(this, Observer { ViewQuotes -> binding.textViewShow.text=(ViewQuotes) })
        }
    }

}