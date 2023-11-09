package com.cifpceuta.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private GridView vistaUsuarios;
    private MiAdapterUsuarios adapterUsuarios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vistaUsuarios = findViewById(R.id.lista_usuarios);

        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario(R.drawable.avatar1_chico,"Chico-1"));
        usuarios.add(new Usuario(R.drawable.avatar2_chica,"Chica-1"));
        usuarios.add(new Usuario(R.drawable.avatar3_chico,"Chico-2"));
        usuarios.add(new Usuario(R.drawable.avatar4_chica,"Chica-2"));

        adapterUsuarios = new MiAdapterUsuarios(this, usuarios);
        vistaUsuarios.setAdapter(adapterUsuarios);

        vistaUsuarios.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                chatUsuario(view, position);
            }
        });
    }
    public void chatUsuario(View v, int pos){
        Intent i = new Intent(this, ActivityChatUsuario.class);
        i.putExtra("imagenUsuario",adapterUsuarios.getItem(pos).getImagen());
        i.putExtra("nombreUsuario",adapterUsuarios.getItem(pos).getNombre());
        startActivity(i);
    }
}