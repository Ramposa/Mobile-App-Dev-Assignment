package com.example.loginapp1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView privacyStatement;
    Button bookMuse, viewMuse, orderingBtn, souvBtn, btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);

        privacyStatement = findViewById(R.id.privacyStatement);
        bookMuse = findViewById(R.id.bookMuse);
        orderingBtn = findViewById(R.id.orderingBtn);
        souvBtn = findViewById(R.id.souvBtn);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, reycl.class);
                startActivity(intent);
            }
        });

        privacyStatement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), webAppView.class);
                startActivity(intent);
                finish();
            }
        });

        bookMuse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), viewingMuse.class);
                startActivity(intent);
                finish();
            }
        });

        orderingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), foodOrder.class);
                startActivity(intent);
                finish();
            }
        });

        souvBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), souvOrder.class);
                startActivity(intent);
                finish();
            }
        });
    }
}