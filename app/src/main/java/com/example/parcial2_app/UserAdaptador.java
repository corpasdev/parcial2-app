package com.example.parcial2_app;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.parcial2_app.R;

import com.squareup.picasso.Picasso;

import java.util.List;

public class UserAdaptador extends RecyclerView.Adapter<UserAdaptador.ViewHolder> {

    private List<User> datos;
    private OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(User user);
    }

    public UserAdaptador(List<User> datos, OnItemClickListener listener){
        this.datos = datos;
        this.listener = listener;
    }

    @NonNull
    @Override
    public UserAdaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdaptador.ViewHolder holder, int position) {
        User dato = datos.get(position);
        holder.bind(dato);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClick(dato);
            }
        });
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView txt_nombre,txt_estado, txt_especie;
        ImageView img_usuario;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_nombre = itemView.findViewById(R.id.txt_nombre);
            txt_estado = itemView.findViewById(R.id.txt_estado);
            txt_especie = itemView.findViewById(R.id.txt_especie);
            img_usuario = itemView.findViewById(R.id.img_usuario);
        }

        public void bind(User dato){
            txt_nombre.setText(dato.getNombre());

            //imagen libreria
            Picasso.get().load(dato.getImagen()).into(img_usuario);
        }
    }
}
