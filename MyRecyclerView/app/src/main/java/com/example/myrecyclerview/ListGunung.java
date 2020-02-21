package com.example.myrecyclerview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListGunung extends RecyclerView.Adapter<ListGunung.ListViewHolder> {
    @NonNull
    @Override
    public ListGunung.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ListGunung.ListViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return listGunung.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgGambar;
        TextView tvnama, tvDetil;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgGambar = itemView.findViewById(R.id.img_item_photo);
            tvnama = itemView.findViewById(R.id.tv_item_name);
            tvDetil = itemView.findViewById(R.id.tv_item_detail);
    }
}
