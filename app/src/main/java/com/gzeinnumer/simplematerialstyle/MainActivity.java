package com.gzeinnumer.simplematerialstyle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_example1).setOnClickListener(v -> startActivity(new Intent(getApplicationContext(), Example1Activity.class)));

    }
}