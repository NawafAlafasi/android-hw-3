package com.example.supercv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Button button = findViewById(R.id.button4);
        Button buttonA = findViewById(R.id.button5);
        Button buttonB = findViewById(R.id.button6);
        Button buttonC = findViewById(R.id.button7);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity5.this, MainActivity6.class);
                startActivity(intent);
            }
        });

        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity5.this, MainActivity6.class);
                startActivity(intent);
            }
        });

        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity5.this, MainActivity6.class);
                startActivity(intent);
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity5.this, MainActivity6.class);
                startActivity(intent);
            }
        });
    }
}