package com.gzeinnumer.simplematerialstyle.example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.gzeinnumer.simplematerialstyle.R;

public class PhotoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);

        setTitle("Photo");
    }
}