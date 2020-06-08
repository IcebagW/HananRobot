package com.support.android.designlibdemo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class IdleActivity extends AppCompatActivity{

    private DrawerLayout mDrawerLayout;
    private Button btn_stop;
    private Button btn_goin;
    private ImageView img_show;
    private AnimationDrawable anim;
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idle);
        //Animation animation = AnimationUtils.loadAnimation(this, R.anim.idle_gif);
        img_show = (ImageView) findViewById(R.id.img_show);
        btn_goin = (Button) findViewById(R.id.btn_goin);
        btn_stop = (Button) findViewById(R.id.btn_stop);


        anim = (AnimationDrawable) img_show.getBackground();
        mMediaPlayer=MediaPlayer.create(this,R.raw.auroraborealis );
        mMediaPlayer.setLooping(true);

        anim.start();
        mMediaPlayer.start();

        btn_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                anim.stop();
                mMediaPlayer.stop();
               // playstart(view);
            }
        });
        btn_goin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(IdleActivity.this, Login2Activity.class);
                startActivity(intent);
                finish();

            }
        });
        /*
        ImageView imageView = findViewById(R.id.img_show);
        imageView.startAnimation(animation);

         */
        //TextView textView   = findViewById(R.id.text);
        //textView.startAnimation(animation);

    }



}
