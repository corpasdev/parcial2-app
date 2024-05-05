package com.example.parcial2_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtUser;
    private EditText txtPass;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtengo referencia de los componentes de la UI
        txtUser = findViewById(R.id.txtUser);
        txtPass = findViewById(R.id.txtPass);
        btnLogin = findViewById(R.id.btnLogin);

        // Configurar el evento onClick para el botón de login
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener el texto ingresado en la pantalla login
                String username = txtUser.getText().toString().trim();
                String password = txtPass.getText().toString().trim();

                // Validar si los campos están vacíos
                if (username.isEmpty() || password.isEmpty()) {
                    // Mostrar mensaje de error
                    Toast.makeText(MainActivity.this, "Por favor, llene todos los campos.", Toast.LENGTH_SHORT).show();
                } else {
                    if (username.equals("bcorpas") && password.equals("92210164")) {
                        Intent intent = new Intent(MainActivity.this, Home.class);
                        startActivity(intent);
                        Toast.makeText(MainActivity.this, "Inicio de sesión exitoso.", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "Credenciales inválidas. Por favor, inténtelo de nuevo.", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });


    }
}