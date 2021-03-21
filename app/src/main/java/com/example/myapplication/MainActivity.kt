package com.example.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val butAdd = findViewById<Button>(R.id.butadd)
        val butRep = findViewById<Button>(R.id.butrep)
        val butRem = findViewById<Button>(R.id.butrem)
        val firstFrag = FirstFragment()
        val secondFrag = SecondFragment()
        butAdd.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                add(R.id.fliFr, firstFrag)

                commit()
            }
        }
        butRep.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fliFr, secondFrag)
                
                commit()
            }
        }
        butRem.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                remove(secondFrag)
                commit()
            }
        }
        }
    }
