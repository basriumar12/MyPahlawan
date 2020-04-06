package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvPahlawan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPahlawan = findViewById(R.id.rv_pahlawan);
        rvPahlawan.setLayoutManager(new LinearLayoutManager(this));
        //objek array
        ArrayList<ModelPahlawan> listData = new ArrayList<>();
        //ambil semua data yang telah di looping di datapahlawan
        listData.addAll(DataPahlawan.getListData());
        Log.e("TAG","data dari datapahlawan "+listData.get(1).title);
        AdapterPahlawan adapterPahlawan = new AdapterPahlawan(listData, this);
        //set dataya di recylerview
        rvPahlawan.setAdapter(adapterPahlawan);

    }
}
