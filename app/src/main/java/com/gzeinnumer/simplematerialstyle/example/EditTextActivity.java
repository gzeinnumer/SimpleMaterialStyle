package com.gzeinnumer.simplematerialstyle.example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.google.android.material.textfield.TextInputEditText;
import com.gzeinnumer.simplematerialstyle.R;
import com.gzeinnumer.simplematerialstyle.databinding.ActivityEditTextBinding;

import java.util.ArrayList;

public class EditTextActivity extends AppCompatActivity {

    private ActivityEditTextBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEditTextBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setTitle("EditText");

        initOnClick();
    }

    private void initOnClick() {
        binding.btnSetErrorParent.setOnClickListener(view -> {
            binding.edExample1P.setError("Error");
            binding.edExample2P.setError("Error");
            binding.edExample3P.setError("Error");
            binding.edExample5P.setError("Error");
            binding.edExample6P.setError("Error");
            binding.edExample7P.setError("Error");
            binding.edExample8P.setError("Error");
            binding.edExample10P.setError("Error");
            binding.edExample12P.setError("Error");
            binding.edExample13P.setError("Error");
            binding.edExample14P.setError("Error");
            binding.edExample15P.setError("Error");
            binding.edExample16P.setError("Error");
            binding.edExample17P.setError("Error");
            binding.edExample18P.setError("Error");
            binding.edExample19P.setError("Error");
        });
        binding.btnSetErrorEdit.setOnClickListener(view -> {
            binding.edExample1.setError("Error");
            binding.edExample2.setError("Error");
            binding.edExample3.setError("Error");
            binding.edExample5.setError("Error");
            binding.edExample6.setError("Error");
            binding.edExample7.setError("Error");
            binding.edExample8.setError("Error");
            binding.edExample10.setError("Error");
            binding.edExample12.setError("Error");
            binding.edExample13.setError("Error");
            binding.edExample14.setError("Error");
            binding.edExample15.setError("Error");
            binding.edExample16.setError("Error");
            binding.edExample17.setError("Error");
            binding.edExample18.setError("Error");
            binding.edExample19.setError("Error");
        });
        binding.btnClearError.setOnClickListener(view -> {
            binding.edExample1P.setError(null);
            binding.edExample2P.setError(null);
            binding.edExample3P.setError(null);
            binding.edExample5P.setError(null);
            binding.edExample6P.setError(null);
            binding.edExample7P.setError(null);
            binding.edExample8P.setError(null);
            binding.edExample10P.setError(null);
            binding.edExample12P.setError(null);
            binding.edExample13P.setError(null);
            binding.edExample14P.setError(null);
            binding.edExample15P.setError(null);
            binding.edExample16P.setError(null);
            binding.edExample17P.setError(null);
            binding.edExample18P.setError(null);
            binding.edExample19P.setError(null);

            binding.edExample1.setError(null);
            binding.edExample2.setError(null);
            binding.edExample3.setError(null);
            binding.edExample5.setError(null);
            binding.edExample6.setError(null);
            binding.edExample7.setError(null);
            binding.edExample8.setError(null);
            binding.edExample10.setError(null);
            binding.edExample12.setError(null);
            binding.edExample12.setError(null);
            binding.edExample13.setError(null);
            binding.edExample14.setError(null);
            binding.edExample15.setError(null);
            binding.edExample16.setError(null);
            binding.edExample17.setError(null);
            binding.edExample18.setError(null);
            binding.edExample19.setError(null);
        });
    }
}