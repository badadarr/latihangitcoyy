package com.example.submission;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvContent;
    private ArrayList<Mountain> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvContent = findViewById(R.id.rv_set_gaming);
        rvContent.setHasFixedSize(true);

        list.addAll(MountainData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvContent.setLayoutManager(new LinearLayoutManager(this));
        ListMountainAdapter listMountainAdapter = new ListMountainAdapter(list);
        rvContent.setAdapter(listMountainAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
        setMode (item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.Profile:
                Intent Profile= new Intent(MainActivity.this,Profile.class);
                startActivity(Profile);
                break;
        }
    }
}
