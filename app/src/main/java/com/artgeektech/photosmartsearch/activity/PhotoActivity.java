package com.artgeektech.photosmartsearch.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.artgeektech.photosmartsearch.R;
import com.artgeektech.photosmartsearch.fragment.PhotoFragment;

public class PhotoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
        if (fragment == null) {
            fragment = new PhotoFragment();
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }
    }
}
