package com.example.kinderworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class alphabets extends AppCompatActivity {
    GridView grid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets);
        grid=findViewById(R.id.grid);
        grid.setAdapter(new ButtonAdapter(this));
    }
}
