package com.example.kinderworld;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    Button alpha_btn,num_btn,col_btn,rhyme_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        alpha_btn=findViewById(R.id.alpha);
        num_btn=findViewById(R.id.num);
        col_btn=findViewById(R.id.col);
        rhyme_btn=findViewById(R.id.rhy);
        final MediaPlayer mp=MediaPlayer.create(this,R.raw.ring3);

        alpha_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                Intent intent=new Intent(getApplicationContext(),alphabets.class);
                startActivity(intent);

            }
        });
        num_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                Intent intent=new Intent(getApplicationContext(),Numbers.class);
                startActivity(intent);
            }
        });
        col_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                Intent intent=new Intent(getApplicationContext(),Colors.class);
                startActivity(intent);
            }
        });

        rhyme_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                Intent intent=new Intent(getApplicationContext(),rhymes.class);
                startActivity(intent);
            }
        });
    }
}
