package com.cifpceuta.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.time.LocalTime;

public class ActivityChatUsuario extends AppCompatActivity {
    private ImageView imagen;
    private ImageButton atras,enviarMensaje;
    private TextView hora;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_usuario);
        imagen=findViewById(R.id.imagen_alumno);
        hora=findViewById(R.id.tv_hora_chat);
        enviarMensaje=findViewById(R.id.btn_enviar_mensaje);
        atras=findViewById(R.id.btn_atras_constraint);
        LocalTime ahora = LocalTime.now();
        if(ahora.getMinute()<10){
            hora.setText(ahora.getHour()+":0"+ahora.getMinute());
        } else {
            hora.setText(ahora.getHour()+":"+ahora.getMinute());
        }
        Intent imagenAlumno = getIntent();
        if(imagenAlumno!=null){
            imagen.setImageResource(imagenAlumno.getIntExtra("imagenUsuario",R.drawable.avatar1_chico));
        }
        enviarMensaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                atras(view);
            }
        });
    }
    public void atras(View v){
        startActivity(new Intent(this, MainActivity.class));
    }
}