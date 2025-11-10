
package com.example.evaluacion2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val etUsuario = findViewById<EditText>(R.id.etUsuario)
        val etContrasena = findViewById<EditText>(R.id.etContrasena)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val btnVolverInicio = findViewById<Button>(R.id.btnVolverInicio)

        // Acción para iniciar sesión
        btnLogin.setOnClickListener {
            val usuario = etUsuario.text.toString()
            val contrasena = etContrasena.text.toString()

            if (usuario.isNotEmpty() && contrasena.isNotEmpty()) {
                AlertDialog.Builder(this)
                    .setTitle("Inicio de sesión")
                    .setMessage("Sesión iniciada correctamente para: $usuario")
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
