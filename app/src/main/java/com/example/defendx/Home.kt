package com.example.defendx

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val buyButton1 = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.buyButton1)

        bottomNavigationView.selectedItemId = R.id.nav_home

        buyButton1.setOnClickListener {
            val intent = Intent(this, Product::class.java)
            startActivity(intent)
        }

        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_home -> true
                R.id.nav_wishlist -> {
                    startActivity(Intent(this, Wishlist::class.java))
                    finish()
                    true
                }
                R.id.nav_profile -> {
                    startActivity(Intent(this, account::class.java))
                    finish()
                    true
                }
                else -> false
            }
        }
    }
}