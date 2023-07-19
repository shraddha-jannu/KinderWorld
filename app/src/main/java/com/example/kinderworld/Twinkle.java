package com.example.kinderworld;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class Twinkle extends AppCompatActivity {
    //final MediaPlayer mp=MediaPlayer.create(getApplicationContext(),R.raw.twinkle);
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twinkle);
        mp=MediaPlayer.create(getApplicationContext(),R.raw.twinkletwinklelittlestar);
        mp.start();
    }
    protected void onPause()
    {
        super.onPause();
        if(this.isFinishing())
        {
            mp.stop();
        }
    }
}
