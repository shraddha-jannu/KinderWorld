package com.example.kinderworld;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Rain extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rain);
        mp=MediaPlayer.create(getApplicationContext(),R.raw.rainraingoaway);
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
