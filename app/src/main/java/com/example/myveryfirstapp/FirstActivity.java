package com.example.myveryfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_first);

        Button btn1 = findViewById(R.id.gotosecond);
        Button btn2 = findViewById(R.id.gotothird);

        btn1.setOnClickListener((View) ->{

            //go to second activity
            Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
            intent.putExtra("msg","Message from First Activity");
            intent.putExtra("another_msg","Next message");
            startActivity(intent);
        });


        btn2.setOnClickListener((View) ->{

            //go to third activity
            Intent intent = new Intent(FirstActivity.this, ThirdActivity.class);
            startActivity(intent);
        });

    }
}