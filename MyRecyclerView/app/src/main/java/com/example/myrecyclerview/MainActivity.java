package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvGunung;
    private ArrayList<Gunung> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvGunung = findViewById(R.id.rv_gunung);
        rvGunung.setHasFixedSize(true);

        list.addAll(DataGunung.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvGunung.setLayoutManager(new LinearLayoutManager(this));
        ListGunung listGunung = new ListGunung(list);
        rvGunung.setAdapter(listGunung);
    }
}
