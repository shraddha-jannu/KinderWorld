package com.example.kinderworld;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Colors extends AppCompatActivity implements View.OnClickListener {
Button blue,yellow,red,pink,black,green,orange,gray,brown;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        blue=findViewById(R.id.btn_blue);
        yellow=findViewById(R.id.btn_yellow);
        red=findViewById(R.id.btn_red);
        pink=findViewById(R.id.btn_pink);
        black=findViewById(R.id.btn_black);
        green=findViewById(R.id.btn_green);
        orange=findViewById(R.id.btn_orange);
        gray=findViewById(R.id.btn_gray);
        brown=findViewById(R.id.btn_brown);

        blue.setOnClickListener(this);
        yellow.setOnClickListener(this);
        red.setOnClickListener(this);
        pink.setOnClickListener(this);
        black.setOnClickListener(this);
        green.setOnClickListener(this);
        orange.setOnClickListener(this);
        gray.setOnClickListener(this);
        brown.setOnClickListener(this);

    }

    @Override
    public void onClick(View v)
    {
        int id=v.getId();
        final MediaPlayer mp= MediaPlayer.create(this,R.raw.ring3);
        Intent i=new Intent(getApplicationContext(),color_data.class);
        switch (id) {
            case R.id.btn_blue:
                i.putExtra("spell", "BLUE");
                i.putExtra("sound", R.raw.blue);
                startActivity(i);
                break;
            case R.id.btn_yellow:
                i.putExtra("spell", "YELLOW");
                i.putExtra("sound", R.raw.yellow);
                startActivity(i);
                break;
            case R.id.btn_red:
                i.putExtra("spell", "RED");
                i.putExtra("sound", R.raw.red);
                startActivity(i);
                break;
            case R.id.btn_pink:
                i.putExtra("spell", "PINK");
                i.putExtra("sound", R.raw.pink);
                startActivity(i);
                break;
            case R.id.btn_black:
                i.putExtra("spell", "BLACK");
                i.putExtra("sound", R.raw.black);
                startActivity(i);
                break;
            case R.id.btn_green:
                i.putExtra("spell", "GREEN");
                i.putExtra("sound", R.raw.green);
                startActivity(i);
                break;
            case R.id.btn_orange:
                i.putExtra("spell", "ORANGE");
                i.putExtra("sound", R.raw.orange);
                startActivity(i);
                break;
            case R.id.btn_gray:
                i.putExtra("spell", "GRAY");
                i.putExtra("sound", R.raw.gray);
                startActivity(i);
                break;
            case R.id.btn_brown:
                i.putExtra("spell", "BROWN");
                i.putExtra("sound", R.raw.brown);
                startActivity(i);
                break;
            }
        }
}
