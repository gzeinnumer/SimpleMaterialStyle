package com.gzeinnumer.simplematerialstyle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.gzeinnumer.simplematerialstyle.databinding.ActivityMainBinding;
import com.gzeinnumer.simplematerialstyle.example.ButtonActivity;
import com.gzeinnumer.simplematerialstyle.example.EditTextActivity;
import com.gzeinnumer.simplematerialstyle.example.ImageViewActivity;
import com.gzeinnumer.simplematerialstyle.example.SelectionActivity;
import com.gzeinnumer.simplematerialstyle.example.TextViewActivity;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setTitle("Menu");
        initOnClick();
    }

    private void initOnClick() {
        binding.btnButton.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), ButtonActivity.class);
            startActivity(intent);
        });
        binding.btnTextview.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), TextViewActivity.class);
            startActivity(intent);
        });
        binding.btnEdittext.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), EditTextActivity.class);
            startActivity(intent);
        });
        binding.btnImageview.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), ImageViewActivity.class);
            startActivity(intent);
        });
        binding.btnSelection.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), SelectionActivity.class);
            startActivity(intent);
        });

    }
}