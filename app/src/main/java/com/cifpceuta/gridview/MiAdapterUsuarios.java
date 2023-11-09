package com.cifpceuta.gridview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MiAdapterUsuarios extends ArrayAdapter<Usuario> {
    private Activity context;
    private ArrayList<Usuario> listaUsuarios;
    public MiAdapterUsuarios(Activity context, ArrayList<Usuario> listaUsuarios){
        super(context,R.layout.usuario_item,listaUsuarios);
        this.context=context;
        this.listaUsuarios=listaUsuarios;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.usuario_item,parent,false);

        Usuario usuario = listaUsuarios.get(position);

        ImageView imagenUsuario = rowView.findViewById(R.id.iv_imagen_usuario);
        TextView nombreUsuario = rowView.findViewById(R.id.tv_nombre_usuario);

        imagenUsuario.setImageResource(usuario.getImagen());
        nombreUsuario.setText(usuario.getNombre());

        return rowView;
    }
}
