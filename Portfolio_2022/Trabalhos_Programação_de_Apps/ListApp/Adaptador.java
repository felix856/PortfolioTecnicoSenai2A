package com.example.listapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.BinderThread;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.MyViewHolder> {
    Context context;
    ArrayList<Prato> list;
    Adaptador.OnItemClickListener listener;


    public Adaptador(Context context, ArrayList<Prato> list, OnItemClickListener listener) {
        this.context = context;
        this.list = list;
        this.listener = listener;
    }

    @NonNull
    @Override
    public Adaptador.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View f = LayoutInflater.from(context).inflate(R.layout.layout,parent,false);
          return new Adaptador.MyViewHolder(f);

    }

    @Override
    public void onBindViewHolder(@NonNull Adaptador.MyViewHolder holder, int position) {
      Prato prato  = list.get(position);
      holder.nomePrato.setText(prato.getNome());
      holder.ingredientes.setText(prato.getIngredientes());
      holder.preco.setText(Float.toString(prato.getPreco()));
        holder.itemView.setOnClickListener(view -> {
            listener.onItemClick(prato);
      });
    }

    @Override
    public int getItemCount() {
                return list.size();
    }

    public interface OnItemClickListener {
        void onItemClick(Prato prato);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView nomePrato,ingredientes, preco;
          public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nomePrato = itemView.findViewById(R.id.cardnome);
              ingredientes = itemView.findViewById(R.id.cardingredientes);
              preco = itemView.findViewById(R.id.cardpreco);
          }
    }
}
