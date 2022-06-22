package com.example.a153_086_uasga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ceklokasi(View view) {
        Intent intent = new Intent(MainActivity.this,MapsActivity.class);
        startActivity(intent);
    }

    public void laporkebakaran(View view) {
        Intent intent = new Intent(MainActivity.this,tambahlapor.class);
        startActivity(intent);
    }
}