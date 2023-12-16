package com.example.appcontrolesandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class LoginActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)
    }
    //metodo para asosiar al evento click del boton salir que es  fun btnCerrar(n:view)

    fun BotonCerrar(n: View) {
        finish()
    }

    ///metodo  para asociar al evento click del botyon aceptar
    fun BotonAceptar(X: View) {
        //forma 1
        var edtusuario: EditText = findViewById(R.id.edtIngreso)
        var xuser: String = edtusuario.text.toString()
        //forma 2
        var xusuario: String = findViewById<EditText>(R.id.edtIngreso).text.toString()
        //programamcion de la clave
        var xclave: Int = findViewById<EditText>(R.id.edtClave).text.toString().toInt()
        //// xusuario = "cibertec" u Xclave =2023
        if (xusuario.toUpperCase() == "cibertec")
        //enviar mensaje en android
            Toast.makeText(this, "Bienvenido Usuario",

                Toast.LENGTH_LONG).show()

    }
    else
    {
        Toast.makeText(
            LoginActivity@ this,
            "Error, Usuario y/o Clave son incorrectas",
            Toast.LENGTH_SHORT
        ).show()
    }//

}