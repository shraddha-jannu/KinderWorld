package com.example.kinderworld;

import android.content.Intent;
import android.media.MediaPlayer;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

public class data extends AppCompatActivity {
    TextView capital,number,small,description;
    ImageView img;
    String spelling,upr,lwr;
    int num;
    MediaPlayer mp;
    //TextToSpeech tsp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        number = findViewById(R.id.number);
        //t2=findViewById(R.id.t2);
        capital=findViewById(R.id.capital);
        small=findViewById(R.id.small);
        description = findViewById(R.id.description);
        img = findViewById(R.id.img);

        Intent display = getIntent();
        num = display.getIntExtra("num", 0);
        spelling = display.getStringExtra("spell");
        upr = display.getStringExtra("Capital");
        lwr = display.getStringExtra("Small");

        if(num==0){
            capital.setText(upr);
            small.setText(lwr);
            description.setText(spelling);
        }
        else{
            number.setText("" + num);
            description.setText(spelling);
        }
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int resId = bundle.getInt("resId");
            img.setImageResource(resId);
            int sound=display.getIntExtra("sound",0);
            mp= MediaPlayer.create(this,sound);
            mp.start();
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
