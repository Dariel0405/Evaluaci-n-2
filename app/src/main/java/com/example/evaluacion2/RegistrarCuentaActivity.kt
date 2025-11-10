package com.example.evaluacion2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class RegistrarCuentaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar_cuenta)

        // Referencias a los elementos del layout
        val etNombreUsuario = findViewById<EditText>(R.id.etNombreUsuario)
        val etCorreo = findViewById<EditText>(R.id.etCorreo)
        val etContrasena = findViewById<EditText>(R.id.etContrasena)
        val btnRegisterConfirm = findViewById<Button>(R.id.btnRegisterConfirm)
        val btnVolverInicio = findViewById<Button>(R.id.btnVolverInicio)

        // Acción al registrar
        btnRegisterConfirm.setOnClickListener {
            val nombre = etNombreUsuario.text.toString()
            val correo = etCorreo.text.toString()
            val contrasena = etContrasena.text.toString()

            if (nombre.isNotEmpty() && correo.isNotEmpty() && contrasena.isNotEmpty()) {
                AlertDialog.Builder(this)
                    .setTitle("Registro exitoso")
                    .setMessage("Tu cuenta ha sido registrada correctamente.")
                    .setPositiveButton("Aceptar", null)
                    .show()
            } else {
                AlertDialog.Builder(this)
                    .setTitle("Error")
                    .setMessage("Por favor, completa todos los campos.")
                    .setPositiveButton("Aceptar", null)
                    .show()
            }
        }

        // Acción para volver al inicio (MainActivity)
        btnVolverInicio.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
