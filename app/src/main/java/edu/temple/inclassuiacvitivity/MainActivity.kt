package edu.temple.inclassuiacvitivity

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinner)
        val displayTextView = findViewById<TextView>(R.id.textDisplay)

        /* TODO Step 2: Populate this array with multiples of 5 from 5 - 100*/
        val numberArray = Array(20) { 5 * (it + 1) }
        //numberArray.toTypedArray()

        /* TODO Step 3: Create adapter to display items from array in Spinner */
        spinner.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, numberArray)


        // TODO Step 4: Change TextView's text size to the number selected in the Spinner */
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {}
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                displayTextView.setTextSize(spinner.selectedItem.toString().toFloat())
            }
        }



    }
}