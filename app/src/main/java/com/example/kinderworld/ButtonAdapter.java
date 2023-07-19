package com.example.kinderworld;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class ButtonAdapter extends BaseAdapter
{
    Context context;
    int str[]={R.drawable.alpha_a,R.drawable.alpha_b,R.drawable.alpha_c,R.drawable.alpha_d,R.drawable.alpha_e,R.drawable.alpha_f,R.drawable.alpha_g,R.drawable.alpha_h,R.drawable.alpha_i,
            R.drawable.alpha_j,R.drawable.alpha_k,R.drawable.alpha_l,R.drawable.alpha_m,R.drawable.alpha_n,R.drawable.alpha_o,R.drawable.alpha_p,R.drawable.alpha_q,R.drawable.alpha_r,R.drawable.alpha_s,R.drawable.alpha_t,R.drawable.alpha_u,R.drawable.alpha_v,R.drawable.alpha_w,R.drawable.alpha_x,R.drawable.alpha_y,R.drawable.alpha_z};
    public ButtonAdapter(alphabets alph) {
      context=alph;
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

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        //Button b;
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(R.layout.alphabets_layout,null);
        ImageView img = convertView.findViewById(R.id.img);
        img.setImageResource(str[position]);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent alphaintent=new Intent(context,data.class);
                if(position==0) {
                    alphaintent.putExtra("Capital", "A");
                    alphaintent.putExtra("Small", "a");
                    alphaintent.putExtra("spell", "APPLE");
                    alphaintent.putExtra("resId",R.drawable.apple);
                    alphaintent.putExtra("sound",R.raw.asound);
                        /*MediaPlayer mp=MediaPlayer.create(context,R.raw.asound);
                        mp.start();*/
                    context.startActivity(alphaintent);
                }
                if(position==1) {
                    alphaintent.putExtra("Capital", "B");
                    alphaintent.putExtra("Small", "b");
                    alphaintent.putExtra("spell", "BALL");
                    alphaintent.putExtra("resId",R.drawable.ball);
                    alphaintent.putExtra("sound",R.raw.bsound);
                    context.startActivity(alphaintent);
                }

                if(position==2) {
                    alphaintent.putExtra("Capital", "C");
                    alphaintent.putExtra("Small", "c");
                    alphaintent.putExtra("spell", "CAT");
                    alphaintent.putExtra("resId",R.drawable.cat);
                    alphaintent.putExtra("sound",R.raw.csound);
                    context.startActivity(alphaintent);
                }

                if(position==3) {
                    alphaintent.putExtra("Capital", "D");
                    alphaintent.putExtra("Small", "d");
                    alphaintent.putExtra("spell", "DOLPHIN");
                    alphaintent.putExtra("resId",R.drawable.dolphin);
                    alphaintent.putExtra("sound",R.raw.dsound);
                    context.startActivity(alphaintent);
                }
                if(position==4) {
                    alphaintent.putExtra("Capital", "E");
                    alphaintent.putExtra("Small", "e");
                    alphaintent.putExtra("spell", "ELEPHANT");
                    alphaintent.putExtra("resId",R.drawable.elephant);
                    alphaintent.putExtra("sound",R.raw.esound);
                    context.startActivity(alphaintent);
                }
                if(position==5) {
                    alphaintent.putExtra("Capital", "F");
                    alphaintent.putExtra("Small", "f");
                    alphaintent.putExtra("spell", "FISH");
                    alphaintent.putExtra("resId",R.drawable.fish);
                    alphaintent.putExtra("sound",R.raw.fsound);
                    context.startActivity(alphaintent);
                }
                if(position==6) {
                    alphaintent.putExtra("Capital", "G");
                    alphaintent.putExtra("Small", "g");
                    alphaintent.putExtra("spell", "GOAT");
                    alphaintent.putExtra("resId",R.drawable.goat);
                    alphaintent.putExtra("sound",R.raw.gsound);
                    context.startActivity(alphaintent);
                }
                if(position==7) {
                    alphaintent.putExtra("Capital", "H");
                    alphaintent.putExtra("Small", "h");
                    alphaintent.putExtra("spell", "HORSE");
                    alphaintent.putExtra("resId",R.drawable.horse);
                    alphaintent.putExtra("sound",R.raw.hsound);
                    context.startActivity(alphaintent);
                }
                if(position==8) {
                    alphaintent.putExtra("Capital", "I");
                    alphaintent.putExtra("Small", "i");
                    alphaintent.putExtra("spell", "ICE-CREAM");
                    alphaintent.putExtra("resId",R.drawable.icecream);
                    alphaintent.putExtra("sound",R.raw.isound);
                    context.startActivity(alphaintent);
                }
                if(position==9) {
                    alphaintent.putExtra("Capital", "J");
                    alphaintent.putExtra("Small", "j");
                    alphaintent.putExtra("spell", "JUG");
                    alphaintent.putExtra("resId",R.drawable.jug);
                    alphaintent.putExtra("sound",R.raw.jsound);
                    context.startActivity(alphaintent);
                }
                if(position==10) {
                    alphaintent.putExtra("Capital", "K");
                    alphaintent.putExtra("Small", "k");
                    alphaintent.putExtra("spell", "KITE");
                    alphaintent.putExtra("resId",R.drawable.kite);
                    alphaintent.putExtra("sound",R.raw.ksound);
                    context.startActivity(alphaintent);
                }
                if(position==11) {
                    alphaintent.putExtra("Capital", "L");
                    alphaintent.putExtra("Small", "l");
                    alphaintent.putExtra("spell", "LION");
                    alphaintent.putExtra("resId",R.drawable.lion);
                    alphaintent.putExtra("sound",R.raw.lsound);
                    context.startActivity(alphaintent);
                }
                if(position==12) {
                    alphaintent.putExtra("Capital", "M");
                    alphaintent.putExtra("Small", "m");
                    alphaintent.putExtra("spell", "MONKEY");
                    alphaintent.putExtra("resId",R.drawable.monkey);
                    alphaintent.putExtra("sound",R.raw.msound);
                    context.startActivity(alphaintent);
                }
                if(position==13) {
                    alphaintent.putExtra("Capital", "N");
                    alphaintent.putExtra("Small", "n");
                    alphaintent.putExtra("spell", "NECK");
                    alphaintent.putExtra("resId",R.drawable.neck);
                    alphaintent.putExtra("sound",R.raw.nsound);
                    context.startActivity(alphaintent);
                }
                if(position==14) {
                    alphaintent.putExtra("Capital", "O");
                    alphaintent.putExtra("Small", "o");
                    alphaintent.putExtra("spell", "ORANGE");
                    alphaintent.putExtra("resId",R.drawable.orange);
                    alphaintent.putExtra("sound",R.raw.osound);
                    context.startActivity(alphaintent);
                }
                if(position==15) {
                    alphaintent.putExtra("Capital", "P");
                    alphaintent.putExtra("Small", "p");
                    alphaintent.putExtra("spell", "PALLET");
                    alphaintent.putExtra("resId",R.drawable.pallet);
                    alphaintent.putExtra("sound",R.raw.psound);
                    context.startActivity(alphaintent);
                }
                if (position==16) {
                    alphaintent.putExtra("Capital", "Q");
                    alphaintent.putExtra("Small", "q");
                    alphaintent.putExtra("spell", "Quil");
                    alphaintent.putExtra("resId",R.drawable.quil);
                    alphaintent.putExtra("sound",R.raw.qsound);
                    context.startActivity(alphaintent);
                }
                if (position==17) {
                    alphaintent.putExtra("Capital", "R");
                    alphaintent.putExtra("Small", "r");
                    alphaintent.putExtra("spell", "RAINBOW");
                    alphaintent.putExtra("resId",R.drawable.rainbow);
                    alphaintent.putExtra("sound",R.raw.rsound);
                    context.startActivity(alphaintent);
                }
                if (position==18) {
                    alphaintent.putExtra("Capital", "S");
                    alphaintent.putExtra("Small", "s");
                    alphaintent.putExtra("spell", "SUN");
                    alphaintent.putExtra("resId",R.drawable.sun);
                    alphaintent.putExtra("sound",R.raw.ssound);
                    context.startActivity(alphaintent);
                }
                if (position==19) {
                    alphaintent.putExtra("Capital", "T");
                    alphaintent.putExtra("Small", "t");
                    alphaintent.putExtra("spell", "TOMATO");
                    alphaintent.putExtra("resId",R.drawable.tomato);
                    alphaintent.putExtra("sound",R.raw.tsound);
                    context.startActivity(alphaintent);
                }
                if (position==20) {
                    alphaintent.putExtra("Capital", "U");
                    alphaintent.putExtra("Small", "u");
                    alphaintent.putExtra("spell", "UMBRELLA");
                    alphaintent.putExtra("resId",R.drawable.umbrella);
                    alphaintent.putExtra("sound",R.raw.usound);
                    context.startActivity(alphaintent);
                }
                if (position==21) {
                    alphaintent.putExtra("Capital", "V");
                    alphaintent.putExtra("Small", "v");
                    alphaintent.putExtra("spell", "VIOLIN");
                    alphaintent.putExtra("resId",R.drawable.violin);
                    alphaintent.putExtra("sound",R.raw.vsound);
                    context.startActivity(alphaintent);
                }
                if (position==22) {
                    alphaintent.putExtra("Capital", "W");
                    alphaintent.putExtra("Small", "w");
                    alphaintent.putExtra("spell", "WATCH");
                    alphaintent.putExtra("resId",R.drawable.watch);
                    alphaintent.putExtra("sound",R.raw.wsound);
                    context.startActivity(alphaintent);
                }
                if (position==23) {
                    alphaintent.putExtra("Capital", "X");
                    alphaintent.putExtra("Small", "x");
                    alphaintent.putExtra("spell", "XYLOPHONE");
                    alphaintent.putExtra("resId",R.drawable.xylophone);
                    alphaintent.putExtra("sound",R.raw.xsound);
                    context.startActivity(alphaintent);
                }
                if (position==24) {
                    alphaintent.putExtra("Capital", "Y");
                    alphaintent.putExtra("Small", "y");
                    alphaintent.putExtra("spell", "YOYO");
                    alphaintent.putExtra("resId",R.drawable.yoyo);
                    alphaintent.putExtra("sound",R.raw.ysound);
                    context.startActivity(alphaintent);
                }
                if (position==25) {
                    alphaintent.putExtra("Capital", "Z");
                    alphaintent.putExtra("Small", "z");
                    alphaintent.putExtra("spell", "ZIPPER");
                    alphaintent.putExtra("resId",R.drawable.zipper);
                    alphaintent.putExtra("sound",R.raw.zsound);
                    context.startActivity(alphaintent);
                }
            }
        });
        return convertView;
    }
}