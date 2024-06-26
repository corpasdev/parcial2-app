package com.example.parcial2_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

public class Detalle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        // Recuperar el objeto User del intent
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("usuario")) {
            User usuario = (User) intent.getSerializableExtra("usuario");

            // Mostrar los datos en la interfaz de usuario
            TextView txt_nombre = findViewById(R.id.txtNombre);
            TextView txt_estado = findViewById(R.id.txtEstado);
            TextView txt_especie = findViewById(R.id.txtEspecie);
            ImageView img_usuario = findViewById(R.id.imgUsuario);

            txt_nombre.setText(usuario.getNombre());
            txt_estado.setText(usuario.getEstado());
            txt_especie.setText(usuario.getEspecie());

            // Cargar la imagen usando Picasso
            Picasso.get().load(usuario.getImagen()).into(img_usuario);
        }

        TextView btnLogout = findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Borrar los datos de SharedPreferences
                SharedPreferences.Editor editor = getSharedPreferences("myPrefs", MODE_PRIVATE).edit();
                editor.clear(); // Borra todos los datos
                editor.apply();

                // Redirigir al activity de inicio de sesión
                Intent intent = new Intent(Detalle.this, MainActivity.class);
                startActivity(intent);
                finish(); // Esto asegura que el usuario no pueda volver atrás presionando el botón de retroceso
            }
        });

    }
}