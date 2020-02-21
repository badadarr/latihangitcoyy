package com.example.submission;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    public TextView tvdetails;
    public ImageView imgGear;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvdetails = findViewById(R.id.tv_razer_keyboard);
        imgGear = findViewById(R.id.imgGear1);

        Mountain extra = getIntent().getParcelableExtra("Objek");
        imgGear.setImageResource(Integer.parseInt(extra.getPhoto()));
        tvdetails.setText(extra.getDetails());

    }
}
