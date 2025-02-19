package com.example.myveryfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);
        Button btn2 = findViewById(R.id.gotothird);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null) {

        String first_message = bundle.getString("msg");
        String next_message = bundle.getString("another_msg");
            TextView txt = findViewById(R.id.second_txt);
            txt.setText(next_message);
            Toast.makeText(getApplicationContext(),first_message,Toast.LENGTH_LONG).show();
        }

        btn2.setOnClickListener((View) ->{

            //go to second activity
            Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
            startActivity(intent);
        });
    }
}