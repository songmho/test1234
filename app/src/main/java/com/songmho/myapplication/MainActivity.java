package com.songmho.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;
import java.util.Timer;

public class MainActivity extends AppCompatActivity {

    Button bit1;
    Button bit2;
    Button bit3;
    Button bit4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






       int ran=(int) (Math.random()%8);
        bit1=(Button)findViewById(R.id.bit1);
        bit2=(Button)findViewById(R.id.bit2);
        bit3=(Button)findViewById(R.id.bit3);
        bit4=(Button)findViewById(R.id.bit4);
        bit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "메롱", Toast.LENGTH_SHORT).show();
                bit1.setBackgroundColor(0x00ff0033);
            }
        });
    }

    Timer timer=new Timer();
}
