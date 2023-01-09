package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class signupActivity extends AppCompatActivity {
    TextView createNow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        createNow = (TextView)findViewById(R.id.moveToLoginScreen);
        createNow = findViewById(R.id.moveToLoginScreen);
        createNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(signupActivity.this,loginActivity.class);
                startActivity(intent);
            }
        });
    }
}