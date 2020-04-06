package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterPahlawan extends RecyclerView.Adapter<AdapterPahlawan.ItemviewPahlwan> {
    //buat objek array
    private ArrayList <ModelPahlawan> listData;
    Context context;

    //buat constructor
    public AdapterPahlawan(ArrayList<ModelPahlawan> listData, Context ctx) {
        context = ctx;
        this.listData = listData;
    }


    @NonNull
    @Override
    public AdapterPahlawan.ItemviewPahlwan onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pahlawan, parent, false);
        return new ItemviewPahlwan(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final AdapterPahlawan.ItemviewPahlwan holder, int position) {
        ModelPahlawan dataPosition = listData.get(position);
        // set value nya
        holder.tvTitle.setText(dataPosition.title);
        holder.tvKeterangan.setText(dataPosition.keterangan);

        holder.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, AboutActivity.class));

            }
        });

    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class ItemviewPahlwan extends RecyclerView.ViewHolder {
        ImageView imgPahlawan;
        TextView tvTitle, tvKeterangan;
        Button btnShare;
        public ItemviewPahlwan(@NonNull View itemView) {
            super(itemView);
            imgPahlawan = itemView.findViewById(R.id.img_pahlawan);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvKeterangan = itemView.findViewById(R.id.tv_keterangan);
            btnShare = itemView.findViewById(R.id.btn_share);

        }
    }
}
