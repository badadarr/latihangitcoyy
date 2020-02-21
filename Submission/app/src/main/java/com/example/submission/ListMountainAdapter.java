package com.example.submission;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListMountainAdapter extends RecyclerView.Adapter<ListMountainAdapter.ListViewHolder> {
    private ArrayList<Mountain> listMountain;

    public ListMountainAdapter(ArrayList<Mountain> list) {
        this.listMountain = list;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View gear = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_set_gaming, parent, false);
        return new ListViewHolder(gear);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, final int position) {
        Mountain mountain = listMountain.get(position);

        Glide.with(holder.itemView.getContext())
                .load(mountain.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);

        holder.tvName.setText(mountain.getName());
        holder.tvDetail.setText(mountain.getDetails());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentmove = new Intent(view.getContext(),DetailActivity.class);
                intentmove.putExtra("objek", listMountain.get(position));
                view.getContext().startActivity(intentmove);
            }
        });


    }

    @Override
    public int getItemCount() {
        return listMountain.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);

        }
    }
}
