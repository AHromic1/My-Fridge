package com.example.myfridge

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    private lateinit var addNew: ImageView
    private lateinit var itemList: RecyclerView
    private lateinit var submitButton: Button
    private lateinit var adapter: AdapterMain

    //baza podataka
    //add aktivnost
    //promijeniti boju ako je urgent


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addNew = findViewById(R.id.add)

        addNew.setOnClickListener{
            var intent = Intent(this, AddActivity::class.java)
            startActivity(intent)
        }
        //another way to achieve the same thing
       /* addNew.setOnTouchListener { view, motionEvent ->
            if (motionEvent.action == MotionEvent.ACTION_UP) {  //actions are performed when user lifts the finger of the image
                var intent = Intent(this, AddActivity::class.java)
                startActivity(intent)
            }
            true // Return 'true' to consume the touch event - no further actions are needed
        }*/
        submitButton = findViewById(R.id.submitButton)
        submitButton.setOnClickListener { //dodaje u bazu
        }

        itemList = findViewById(R.id.list)
        itemList.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        var listDisplayed: List<Item> = listOf() //dodati da vuče iz baze
        adapter = AdapterMain(listDisplayed)
        itemList.adapter = adapter  //attach adapter to RecyclerView
    }
}