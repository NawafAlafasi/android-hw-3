package com.example.supercv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        final Button button = findViewById(R.id.button11);

        TextView textView = findViewById(R.id.textView12);
        TextView textViewA = findViewById(R.id.textView14);
        TextView textViewB = findViewById(R.id.textView15);
        TextView textViewC = findViewById(R.id.textView16);

        Bundle nPage = getIntent().getExtras();

        String textV = nPage.getString("editText");
        String textV2 = nPage.getString("editTextA");
        String textV3 = nPage.getString("editTextB");
        String textV4 = nPage.getString("editTextC");

        textView.setText(textV);
        textViewA.setText(textV2);
        textViewB.setText(textV3);
        textViewC.setText(textV4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity4.this, MainActivity6.class);

                startActivity(intent);

            }
        });

    }
}