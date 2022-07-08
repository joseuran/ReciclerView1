package com.example.reciclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvLista;
    private adaptadorRecicler adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        controles();
        llenarRecycler();
    }
    private void controles() {
        rvLista = findViewById(R.id.rv_item);
    }

    private void llenarRecycler() {
        String[] myDataSet = {
                "Juan",
                "jose",
                "raul",
                "luis",
                "luis2",
                "luis3",
                "luis4",
                "luis5",
                "luis6",
                "luis7",
                "luis8",
                "luis9",
                "luis10",
                "luis11",
                "luis12"
        };

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rvLista.setLayoutManager(layoutManager);
        adapter = new adaptadorRecicler(myDataSet);
        rvLista.setAdapter(adapter);

    }
}