package com.janeullah.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

// Use of () specifies invoking the parent's default constructor
// Separate interfaces being implemented by commas
// If need to invoke an overloaded constructor, pass the values by the class name
class MainActivity : AppCompatActivity() {

    // make a variable as nullable by putting the question mark next to the Type declaration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // hello_button.setOnClickListener(this::sayHello) or hello_button.setOnClickListener(::sayHello) 
        hello_button.setOnClickListener { v -> sayHello(v) }
    }

    private fun sayHello(view: View?) {
        val name = edit_text.text.toString()

        // vararg list
        startActivity<WelcomeActivity>("user" to name)
    }
}
