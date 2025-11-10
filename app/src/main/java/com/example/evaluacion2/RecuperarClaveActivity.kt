package com.example.evaluacion2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class RecuperarClaveActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperar_clave)

        val btnRecoverConfirm = findViewById<Button>(R.id.btnRecoverConfirm)
        val btnVolverInicio = findViewById<Button>(R.id.btnVolverInicio)

        // Botón para mostrar mensaje de recuperación
        btnRecoverConfirm.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Recuperación exitosa")
                .setMessage("Se ha enviado un enlace para restablecer tu contraseña.")
                .setPositiveButton("Aceptar", null)
                .show()
        }

        // Botón para volver al MainActivity
        btnVolverInicio.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Cierra la pantalla actual
        }
    }
}
