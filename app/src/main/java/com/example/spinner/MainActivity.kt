package com.example.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val customList = listOf("First","Second","Third","Fourth")
//        val adapter = ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,customList)
//        spMonths.adapter = adapter

        spMonths.onItemSelectedListener = object : AdapterView.OnItemSelectedListener
        {
            //press ctrl + I
            override fun onItemSelected(adapterview: AdapterView<*>?, view: View?, position: Int, id: Long) {
           Toast.makeText(this@MainActivity,"You selected ${adapterview?.getItemAtPosition(position).toString()}",
           Toast.LENGTH_SHORT).show()
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
    }
}