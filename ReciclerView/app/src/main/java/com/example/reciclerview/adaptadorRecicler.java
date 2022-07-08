package com.example.reciclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class adaptadorRecicler extends RecyclerView.Adapter<adaptadorRecicler.ViewHolder> {

    public String[] listaData;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView nombre;
        Spinner mpago;
        ImageView imagen;

        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View
            nombre = (TextView) view.findViewById(R.id.applicant_name);
            mpago = (Spinner) view.findViewById(R.id.payment_method_list);
            imagen = (ImageView) view.findViewById(R.id.indicator_has_account);
        }

    }

    public adaptadorRecicler(String[] ld){
        this.listaData = ld;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ViewHolder(vista);
    }


    @Override
    public void onBindViewHolder(@NonNull adaptadorRecicler.ViewHolder holder, int position) {
        holder.nombre.setText(listaData[position]);
        String[] lenguajes = {"Seleccione","abonos","pagos chiquitos","por oxxo","transferencia"};
        ArrayAdapter<String> aSpinner = new ArrayAdapter<String>(holder.mpago.getContext(), android.R.layout.simple_spinner_dropdown_item, lenguajes);
        holder.mpago.setAdapter(aSpinner);
    }

    @Override
    public int getItemCount() {
        return listaData.length;
    }
}
