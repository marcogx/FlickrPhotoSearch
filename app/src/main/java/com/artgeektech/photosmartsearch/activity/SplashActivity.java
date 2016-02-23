package com.artgeektech.photosmartsearch.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

import com.artgeektech.photosmartsearch.R;

public class SplashActivity extends Activity {

    private static final int KEEP_TIME = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, GalleryActivity.class);
                startActivity(intent);
                finish();
            }
        }, KEEP_TIME);
    }


}
