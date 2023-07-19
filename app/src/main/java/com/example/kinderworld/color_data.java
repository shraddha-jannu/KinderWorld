package com.example.kinderworld;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import static android.view.ViewGroup.*;

public class color_data extends AppCompatActivity {
    Button col_btn;
    TextView col_txt;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_data);
        col_btn=findViewById(R.id.col_btn);
        col_txt=findViewById(R.id.col_txt);
        Intent i=getIntent();
        String col_str=i.getStringExtra("spell");
        int sound=i.getIntExtra("sound",0);
        mp= MediaPlayer.create(this,sound);
        mp.start();
        if(col_str.equals("BLUE")){
            col_txt.setText(col_str);
            col_btn.setBackgroundColor(Color.parseColor("#1E3DE9"));
        }
        if(col_str.equals("YELLOW")){
            col_txt.setText(col_str);
            col_btn.setBackgroundColor(Color.parseColor("#FFD600"));
        }
        if(col_str.equals("RED")){
            col_txt.setText(col_str);
            col_btn.setBackgroundColor(Color.parseColor("#D50000"));
        }
        if(col_str.equals("PINK")){
            col_txt.setText(col_str);
            col_btn.setBackgroundColor(Color.parseColor("#C51162"));
        }
        if(col_str.equals("BLACK")){
            col_txt.setText(col_str);
            col_btn.setBackgroundColor(Color.parseColor("#000000"));
        }
        if(col_str.equals("GREEN")){
            col_txt.setText(col_str);
            col_btn.setBackgroundColor(Color.parseColor("#60DB11"));
        }
        if(col_str.equals("ORANGE")){
            col_txt.setText(col_str);
            col_btn.setBackgroundColor(Color.parseColor("#FF6D00"));
        }
        if(col_str.equals("GRAY")){
            col_txt.setText(col_str);
            col_btn.setBackgroundColor(Color.parseColor("#C0B4B1"));
        }
        if(col_str.equals("BROWN")){
            col_txt.setText(col_str);
            col_btn.setBackgroundColor(Color.parseColor("#A32506"));
        }
    }
    public void onPause(){
        super.onPause();
        if(this.isFinishing())
        {
            mp.stop();
        }
    }
}
