package com.example.aplikacja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var licznik = 1;

        findViewById<Button>(R.id.buttonBack).setOnClickListener {
            if (licznik == 1)
                licznik = 5;
            else licznik -= 1;

            if (licznik == 1)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.z1);
            else if (licznik == 2)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.z2);
            else if (licznik == 3)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.z3);
        }

        findViewById<Button>(R.id.buttonNext).setOnClickListener {
            if (licznik == 5)
                licznik = 1;
            else
                licznik += 1;

            if (licznik == 1)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.z1);
            else if (licznik == 2)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.z2);
            else if (licznik == 3)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.z3);
        }

        findViewById<CheckBox>(R.id.checkBox2).setOnClickListener {
            if (findViewById<CheckBox>(R.id.checkBox2).isChecked == false) {
                findViewById<ImageView>(R.id.imageView).visibility = View.VISIBLE
            } else {
                findViewById<ImageView>(R.id.imageView).visibility = View.INVISIBLE
            }
        }
    }
}