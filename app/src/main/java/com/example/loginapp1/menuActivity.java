package com.example.loginapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class menuActivity extends AppCompatActivity {

    TextView privacyStatement;
    Button bookMuse, viewMuse, orderingBtn, souvBtn, btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        privacyStatement = findViewById(R.id.privacyStatement);
        bookMuse = findViewById(R.id.bookMuse);
        //viewMuse = findViewById(R.id.viewMuse);
        orderingBtn = findViewById(R.id.orderingBtn);
        souvBtn = findViewById(R.id.souvBtn);
        btn1 = findViewById(R.id.btn1);

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

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ita = new Intent(getApplicationContext(), reclo.class);
                startActivity(ita);
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