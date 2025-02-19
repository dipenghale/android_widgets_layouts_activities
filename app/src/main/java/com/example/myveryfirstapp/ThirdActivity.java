package com.example.myveryfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_third);
        Button btn2 = findViewById(R.id.gotofirst);

        btn2.setOnClickListener((View) ->{

            //go to second activity
            Intent intent = new Intent(ThirdActivity.this, FirstActivity.class);
            startActivity(intent);
        });
    }
}