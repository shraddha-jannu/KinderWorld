package com.example.kinderworld;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class rhymes extends AppCompatActivity {
    Button johny,rain,black_sheep,twinkle,ding,rose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rhymes);
        twinkle=findViewById(R.id.btn_twinkle);
        rain=findViewById(R.id.btn_rain);
        johny=findViewById(R.id.btn_johny);
        black_sheep=findViewById(R.id.btn_sheep);
        ding=findViewById(R.id.btn_ding);
        rose=findViewById(R.id.btn_rose);
        twinkle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent twinkleactivity=new Intent(getApplicationContext(),Twinkle.class);
                startActivity(twinkleactivity);
            }
        });
        johny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent johnyactivity=new Intent(getApplicationContext(),Johny.class);
                startActivity(johnyactivity);
            }
        });
        rain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rainactivity=new Intent(getApplicationContext(),Rain.class);
                startActivity(rainactivity);
            }
        });
        black_sheep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sheepactivity=new Intent(getApplicationContext(),Sheep.class);
                startActivity(sheepactivity);
            }
        });
        ding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dingactivity=new Intent(getApplicationContext(),dingdong.class);
                startActivity(dingactivity);
            }
        });
        rose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ring_roseactivity=new Intent(getApplicationContext(),ring_rose.class);
                startActivity(ring_roseactivity);
            }
        });
    }

}
