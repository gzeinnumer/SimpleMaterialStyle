package com.gzeinnumer.simplematerialstyle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.gzeinnumer.simplematerialstyle.databinding.ActivityExample1Binding;
import com.gzeinnumer.simplematerialstyle.databinding.ActivityMainBinding;

public class Example1Activity extends AppCompatActivity {


    private ActivityExample1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityExample1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.fo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "asfafasf", Toast.LENGTH_SHORT).show();
            }
        });
    }
}