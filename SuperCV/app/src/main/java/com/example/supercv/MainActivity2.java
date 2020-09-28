package com.example.supercv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button = findViewById(R.id.button8);
        TextView textView = findViewById(R.id.textView3);
        TextView textView1 = findViewById(R.id.textView5);
        ImageView imageView = findViewById(R.id.imageView3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String phone = "+96599887645";

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);

            }
        });

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent sgmail = new Intent(Intent.ACTION_SEND);
                    sgmail.setData(Uri.parse("mailto:"));
                    sgmail.setType("message/rfc822");

                    sgmail.putExtra(Intent.EXTRA_EMAIL, "nawafalmutairi2005@gmail.com");
                    startActivity(sgmail);
                }catch (Exception e){}
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this , MapsActivity.class);
                startActivity(intent);
            }
        });
    }
}