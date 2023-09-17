package com.example.myfridge

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class AddActivity : AppCompatActivity() {

    private lateinit var back: ImageView
    private lateinit var item: EditText
    private lateinit var urgent: CheckBox
    private lateinit var confirm: Button
    //1 adapter dovrsiti
    //baza podataka
    //add aktivnost


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)

        back = findViewById(R.id.back)
        back.setOnClickListener{
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        confirm = findViewById(R.id.submitButton)
        confirm.setOnClickListener {

        }

        item = findViewById(R.id.itemEditText)

        urgent = findViewById(R.id.urgentCheckBox)
        urgent.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                // Checkbox is checked
                // You can perform actions here when the checkbox is checked
            } else {
                // Checkbox is unchecked
                // You can perform actions here when the checkbox is unchecked
            }
        }


    }
}