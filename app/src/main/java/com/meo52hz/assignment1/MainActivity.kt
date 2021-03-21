package com.meo52hz.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var namesList = mutableListOf<String>()
    private var numberPhonesList = mutableListOf<String>()
    private var imgsList = mutableListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        postToList()

        rv_contacts.layoutManager = LinearLayoutManager(this)
        rv_contacts.adapter = RecyclerViewAdapter(namesList, numberPhonesList, imgsList)

    }

    private fun addToList(name: String, phone: String, img: Int){
        namesList.add(name)
        numberPhonesList.add(phone)
        imgsList.add(img)

    }

    private fun postToList(){

        for (i in 1..10){
            addToList("Name $i", "Phone Number $i", R.mipmap.ic_launcher)
        }

    }
}


















