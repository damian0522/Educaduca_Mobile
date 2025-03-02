package com.example.educaduca_mobile.views

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.educaduca_mobile.MainEducaduca
import com.example.educaduca_mobile.R

class ApplicationConfirmation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmation)

        val tvMensaje = findViewById<TextView>(R.id.tvMensaje)
        val btnInicio = findViewById<Button>(R.id.btnInicio)

        val nombre = intent.getStringExtra("NOMBRE") ?: "Nombre"
        val apellido = intent.getStringExtra("APELLIDO") ?: "Apellido"
        val direccion = intent.getStringExtra("DIRECCION") ?: "Direccion"
        val correo = intent.getStringExtra("CORREO") ?: "Correo"

        tvMensaje.text = "Bienvenido $nombre $apellido!, tus datos son: $direccion, $correo."

        btnInicio.setOnClickListener {
            val intent = Intent(this, MainEducaduca::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            finish()
        }
    }
}
