package com.example.evaluacion2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referencias a los botones
        val btnIrLogin = findViewById<Button>(R.id.btnIrLogin)
        val btnIrRegistrar = findViewById<Button>(R.id.btnIrRegistrar)
        val btnIrRecuperar = findViewById<Button>(R.id.btnIrRecuperar)

        // Ir al Login
        btnIrLogin.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        // Ir al Registro
        btnIrRegistrar.setOnClickListener {
            startActivity(Intent(this, RegistrarCuentaActivity::class.java))
        }

        // Ir a Recuperar Clave
        btnIrRecuperar.setOnClickListener {
            startActivity(Intent(this, RecuperarClaveActivity::class.java))





        }
    }
}
