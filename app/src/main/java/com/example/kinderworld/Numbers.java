package com.example.kinderworld;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

public class Numbers extends AppCompatActivity  {
    //Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    GridView grid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        grid=findViewById(R.id.grid);
        grid.setAdapter(new NumberAdapter(this));
       /* b1=findViewById(R.id.btn_1);
        b2=findViewById(R.id.btn_2);
        b3=findViewById(R.id.btn_3);
        b4=findViewById(R.id.btn_4);
        b5=findViewById(R.id.btn_5);
        b6=findViewById(R.id.btn_6);
        b7=findViewById(R.id.btn_7);
        b8=findViewById(R.id.btn_8);
        b9=findViewById(R.id.btn_9);
        b10=findViewById(R.id.btn_10);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b10.setOnClickListener(this);*/
    }

   /* public void onClick(View v) {
        int id=v.getId();
        final MediaPlayer mp=MediaPlayer.create(this,R.raw.ring3);
        Intent i=new Intent(getApplicationContext(),data.class);
        switch (id){
            case R.id.btn_1:
                mp.start();
                i.putExtra("num",1);
                i.putExtra("spell","ONE");
                i.putExtra("resId",R.drawable.one_img);
                i.putExtra("sound",R.raw.onesound);
                startActivity(i);
                break;
            case R.id.btn_2:
                mp.start();
                i.putExtra("num",2);
                i.putExtra("spell","TWO");
                i.putExtra("resId",R.drawable.two_img);
                i.putExtra("sound",R.raw.twosound);
                startActivity(i);
                break;
            case R.id.btn_3:
                mp.start();
                i.putExtra("num",3);
                i.putExtra("spell","THREE");
                i.putExtra("resId",R.drawable.three_img);
                i.putExtra("sound",R.raw.threesound);
                startActivity(i);
                break;
            case R.id.btn_4:
                mp.start();
                i.putExtra("num",4);
                i.putExtra("spell","FOUR");
                i.putExtra("resId",R.drawable.four_img);
                i.putExtra("sound",R.raw.foursound);
                startActivity(i);
                break;
            case R.id.btn_5:
                mp.start();
                i.putExtra("num",5);
                i.putExtra("spell","FIVE");
                i.putExtra("resId",R.drawable.five_img);
                i.putExtra("sound",R.raw.fivesound);
                startActivity(i);
                break;
            case R.id.btn_6:
                mp.start();
                i.putExtra("num",6);
                i.putExtra("spell","SIX");
                i.putExtra("resId",R.drawable.six_img);
                i.putExtra("sound",R.raw.sixsound);
                startActivity(i);
                break;
            case R.id.btn_7:
                mp.start();
                i.putExtra("num",7);
                i.putExtra("spell","SEVEN");
                i.putExtra("resId",R.drawable.seven_img);
                i.putExtra("sound",R.raw.sevensound);
                startActivity(i);
                break;
            case R.id.btn_8:
                mp.start();
                i.putExtra("num",8);
                i.putExtra("spell","EIGHT");
                i.putExtra("resId",R.drawable.eight_img);
                i.putExtra("sound",R.raw.eightsound);
                startActivity(i);
                break;
            case R.id.btn_9:
                mp.start();
                i.putExtra("num",9);
                i.putExtra("spell","NINE");
                i.putExtra("resId",R.drawable.nine_img);
                i.putExtra("sound",R.raw.ninesound);
                startActivity(i);
                break;
            case R.id.btn_10:
                mp.start();
                i.putExtra("num",10);
                i.putExtra("spell","TEN");
                i.putExtra("resId",R.drawable.ten_img);
                i.putExtra("sound",R.raw.tensound);
                startActivity(i);
                break;
        }
    }*/
}
