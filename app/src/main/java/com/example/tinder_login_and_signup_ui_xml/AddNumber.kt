package com.example.tinder_login_and_signup_ui_xml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class AddNumber : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    override fun onNothingSelected(p0: AdapterView<*>?) {

    }


    /*subjects*/

    internal var subjets = arrayOf("IN +91", "US +1", "and more")

    internal lateinit var mConditionTextView: TextView
    internal lateinit var loginbymail: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_number)


        mConditionTextView = findViewById(R.id.mConditionTextView)
        loginbymail = findViewById(R.id.loginbymail)

        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        val spin = findViewById(R.id.countrycode_spinner) as Spinner

        spin.onItemSelectedListener = this


        //Creating the ArrayAdapter instance having the country list

        val aa = ArrayAdapter(this, android.R.layout.simple_spinner_item, subjets)

        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        //Setting the ArrayAdapter data on the Spinner

        spin.adapter = aa


        val htmlString =
            getString(R.string.condition_desc) + "" + "<u>This text will be underlined</u>"
        mConditionTextView.text = htmlString
        val libymailHtmlString = "<u>LOG IN BY EMAIL</u>"
        loginbymail.text = libymailHtmlString
    }


    override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
        Toast.makeText(applicationContext, subjets[position] + " is selected", Toast.LENGTH_LONG)
            .show()

    }
}