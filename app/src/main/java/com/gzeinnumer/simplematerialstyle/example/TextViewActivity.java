package com.gzeinnumer.simplematerialstyle.example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.gzeinnumer.simplematerialstyle.R;

public class TextViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);

        setTitle("TextView");
    }
}