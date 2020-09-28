package com.example.supercv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        final EditText editText = findViewById(R.id.editText);
        final EditText editTextA = findViewById(R.id.editText2);
        final EditText editTextB = findViewById(R.id.editText3);
        final EditText editTextC = findViewById(R.id.editText4);
        Button button = findViewById(R.id.button10);
        Button button1 = findViewById(R.id.button12);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String eT = editText.getText().toString();
                String eTA = editTextA.getText().toString();
                String eTB = editTextB.getText().toString();
                String eTC = editTextC.getText().toString();

                Intent intent = new Intent(MainActivity6.this, MainActivity4.class);


                intent.putExtra("editText", eT);
                intent.putExtra("editTextA", eTA);
                intent.putExtra("editTextB", eTB);
                intent.putExtra("editTextC", eTC);

                startActivity(intent);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity6.this, MainActivity5.class);

                startActivity(intent);
            }
        });

    }
}