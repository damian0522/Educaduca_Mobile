package com.example.educaduca_mobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.example.educaduca_mobile.views.ApplicationForm
import com.google.android.material.navigation.NavigationView

class MainEducaduca : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawerLayout = findViewById<DrawerLayout>(R.id.drawer_layout)
        val navView = findViewById<NavigationView>(R.id.nav_view)
        val btnMenu = findViewById<ImageView>(R.id.btnMenu)
        val btnComenzar = findViewById<Button>(R.id.btnComenzar)

        btnMenu.setOnClickListener {
            drawerLayout.open()
        }

        navView.menu.findItem(R.id.nav_opcion1).isEnabled = false
        navView.menu.findItem(R.id.nav_opcion2).isEnabled = false

        navView.setNavigationItemSelectedListener { false }

        btnComenzar.setOnClickListener {
            val intent = Intent(this, ApplicationForm::class.java)
            startActivity(intent)
        }
    }
}
