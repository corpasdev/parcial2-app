package com.example.parcial2_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity implements UserAdaptador.OnItemClickListener {

    RecyclerView rcv_users;
    List<User> listaUsuarios = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        rcv_users = findViewById(R.id.rcv_users);

        User usu1 = new User("https://rickandmortyapi.com/api/character/avatar/72.jpeg","Ruben","alive", "human");
        User usu2 = new User("https://rickandmortyapi.com/api/character/avatar/120.jpeg","Ruben","alive", "human");
        User usu3 = new User("https://rickandmortyapi.com/api/character/avatar/190.jpeg","Ruben","alive", "human");
        User usu4 = new User("https://rickandmortyapi.com/api/character/avatar/241.jpeg","Ruben","alive", "human");

        listaUsuarios.add(usu1);
        listaUsuarios.add(usu2);
        listaUsuarios.add(usu3);
        listaUsuarios.add(usu4);
        listaUsuarios.add(usu1);
        listaUsuarios.add(usu2);
        listaUsuarios.add(usu3);
        listaUsuarios.add(usu4);
        listaUsuarios.add(usu1);
        listaUsuarios.add(usu2);
        listaUsuarios.add(usu3);
        listaUsuarios.add(usu4);
        listaUsuarios.add(usu1);
        listaUsuarios.add(usu2);
        listaUsuarios.add(usu3);
        listaUsuarios.add(usu4);

        rcv_users.setLayoutManager(new LinearLayoutManager(this));
        // Pasamos esta actividad como el listener para manejar los clics en el RecyclerView
        rcv_users.setAdapter(new UserAdaptador(listaUsuarios, this));

    }

    @Override
    public void onItemClick(User user) {
        // Aquí maneja la navegación a la pantalla de detalle
        Intent intent = new Intent(this, Detalle.class);
        intent.putExtra("usuario", user); // Pasamos el objeto User como extra a la actividad de detalle
        startActivity(intent);
    }
}
