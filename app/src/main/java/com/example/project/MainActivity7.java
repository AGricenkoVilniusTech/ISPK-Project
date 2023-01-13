package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
    }
    public void newActivity1(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void newActivity2(View v) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public void newActivity5(View v) {
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }
    public void newActivity8(View v) {
        Intent intent = new Intent(this, MainActivity8.class);
        startActivity(intent);
    }
}