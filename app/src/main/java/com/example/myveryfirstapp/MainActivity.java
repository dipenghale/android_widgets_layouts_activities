package com.example.myveryfirstapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.frame_layout);
        EditText edtext = findViewById(R.id.edittext1);
        Button submit_button = findViewById(R.id.submit);

        submit_button.setOnClickListener((View) ->{
            String typed_text = edtext.getText().toString();
            Toast.makeText(getApplicationContext(),typed_text, Toast.LENGTH_LONG).show();

        });

    }
}