package com.example.kinderworld;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class NumberAdapter extends BaseAdapter {
    Context con;
    int str[]={R.drawable.num_one,R.drawable.num_two,R.drawable.num_three,R.drawable.num_four,R.drawable.num_five,R.drawable.num_six,R.drawable.num_seven,R.drawable.numb_eight,R.drawable.num_nine,
            R.drawable.num_ten};
    public NumberAdapter(Context con){
        this.con=con;
    }
    @Override
    public int getCount() {
        return str.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(con);
        convertView = inflater.inflate(R.layout.alphabets_layout,null);
        ImageView img = convertView.findViewById(R.id.img);
        img.setImageResource(str[position]);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent alphaintent=new Intent(con,data.class);
                if(position==0) {
                    alphaintent.putExtra("num",1);
                    alphaintent.putExtra("spell","ONE");
                    alphaintent.putExtra("resId",R.drawable.one_img);
                    alphaintent.putExtra("sound",R.raw.onesound);
                    con.startActivity(alphaintent);
                }
                if(position==1) {
                    alphaintent.putExtra("num",2);
                    alphaintent.putExtra("spell","TWO");
                    alphaintent.putExtra("resId",R.drawable.two_img);
                    alphaintent.putExtra("sound",R.raw.twosound);
                    con.startActivity(alphaintent); }

                if(position==2) {
                    alphaintent.putExtra("num",3);
                    alphaintent.putExtra("spell","THREE");
                    alphaintent.putExtra("resId",R.drawable.three_img);
                    alphaintent.putExtra("sound",R.raw.threesound);
                    con.startActivity(alphaintent);
                }

                if(position==3) {
                    alphaintent.putExtra("num",4);
                    alphaintent.putExtra("spell","FOUR");
                    alphaintent.putExtra("resId",R.drawable.four_img);
                    alphaintent.putExtra("sound",R.raw.foursound);
                    con.startActivity(alphaintent);
                }
                if(position==4) {
                    alphaintent.putExtra("num",5);
                    alphaintent.putExtra("spell","FIVE");
                    alphaintent.putExtra("resId",R.drawable.five_img);
                    alphaintent.putExtra("sound",R.raw.fivesound);
                    con.startActivity(alphaintent);
                }
                if(position==5) {
                    alphaintent.putExtra("num",6);
                    alphaintent.putExtra("spell","SIX");
                    alphaintent.putExtra("resId",R.drawable.six_img);
                    alphaintent.putExtra("sound",R.raw.sixsound);
                    con.startActivity(alphaintent);
                }
                if(position==6) {
                    alphaintent.putExtra("num",7);
                    alphaintent.putExtra("spell","SEVEN");
                    alphaintent.putExtra("resId",R.drawable.seven_img);
                    alphaintent.putExtra("sound",R.raw.sevensound);
                    con.startActivity(alphaintent);
                }
                if(position==7) {
                    alphaintent.putExtra("num",8);
                    alphaintent.putExtra("spell","EIGHT");
                    alphaintent.putExtra("resId",R.drawable.eight_img);
                    alphaintent.putExtra("sound",R.raw.eightsound);
                    con.startActivity(alphaintent);
                }
                if(position==8) {
                    alphaintent.putExtra("num",9);
                    alphaintent.putExtra("spell","NINE");
                    alphaintent.putExtra("resId",R.drawable.nine_img);
                    alphaintent.putExtra("sound",R.raw.ninesound);
                    con.startActivity(alphaintent);
                }
                if(position==9) {
                    alphaintent.putExtra("num",10);
                    alphaintent.putExtra("spell","TEN");
                    alphaintent.putExtra("resId",R.drawable.ten_img);
                    alphaintent.putExtra("sound",R.raw.tensound);
                    con.startActivity(alphaintent);
                }

            }
        });
        return convertView;
    }
}
