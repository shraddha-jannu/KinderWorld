package com.example.kinderworld;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ring_rose extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ring_rose);
        mp=MediaPlayer.create(getApplicationContext(),R.raw.ringaringroseskinderworld);
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
