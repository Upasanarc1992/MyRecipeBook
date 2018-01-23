package com.upasana.home.recipebook.Activity;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.upasana.home.recipebook.R;

public class SplashActivity extends AppCompatActivity {

    Context c;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        c=this;
        i=new Intent(this,HomeActivity.class);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
               c.startActivity(i);
               finish();
            }
        }, 3000);

    }
}
