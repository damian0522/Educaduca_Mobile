package com.example.educaduca_mobile.views

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.educaduca_mobile.MainEducaduca
import com.example.educaduca_mobile.R

class ApplicationForm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etApellido = findViewById<EditText>(R.id.etApellido)
        val etDireccion = findViewById<EditText>(R.id.etDireccion)
        val etCorreo = findViewById<EditText>(R.id.etCorreo)
        val btnEnviar = findViewById<Button>(R.id.btnEnviar)
        val btnVolver = findViewById<Button>(R.id.btnVolver)

        btnEnviar.setOnClickListener {
            val nombre = etNombre.text.toString().trim()
            val apellido = etApellido.text.toString().trim()
            val direccion = etDireccion.text.toString().trim()
            val correo = etCorreo.text.toString().trim()

            if (nombre.isEmpty() || apellido.isEmpty() || direccion.isEmpty() || correo.isEmpty()) {
                Toast.makeText(this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val intent = Intent(this, ApplicationConfirmation::class.java)
            intent.putExtra("NOMBRE", nombre)
            intent.putExtra("APELLIDO", apellido)
            intent.putExtra("DIRECCION", direccion)
            intent.putExtra("CORREO", correo)
            startActivity(intent)
        }

        btnVolver.setOnClickListener {
            val intent = Intent(this, MainEducaduca::class.java)
            startActivity(intent)
            finish() //
        }
    }
}
