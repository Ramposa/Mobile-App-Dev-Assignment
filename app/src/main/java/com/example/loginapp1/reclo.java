package com.example.loginapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class reclo extends AppCompatActivity
{
    ImageView img;
    TextView tv1,tv2, tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reclo);

        img=(ImageView)findViewById(R.id.desc_img);
        tv1=(TextView)findViewById(R.id.desc_header);
        tv2=(TextView)findViewById(R.id.desc_desc);
        tv3=(TextView)findViewById(R.id.desc_descA);

        img.setImageResource(getIntent().getIntExtra("imagename",0));
        tv1.setText(getIntent().getStringExtra("header"));
        tv2.setText(getIntent().getStringExtra("desc"));
        tv3.setText(getIntent().getStringExtra("descA"));
    }
}