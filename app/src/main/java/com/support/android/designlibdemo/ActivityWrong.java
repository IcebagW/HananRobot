package com.support.android.designlibdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class ActivityWrong extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrong);
        new android.os.Handler().postDelayed(
                new Runnable() {
                    public void run() {
                        finish();
                    }
                }, 3000);
    }
}
