package com.example.kinderworld;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class dingdong extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dingdong);
        mp=MediaPlayer.create(getApplicationContext(),R.raw.dingdongbell);
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
