package com.sillylife.trial1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.sillylife.allinone.PlusMinus

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, PlusMinus.minus(10,30), Toast.LENGTH_LONG).show()
    }
}
