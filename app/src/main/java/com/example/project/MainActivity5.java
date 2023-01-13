package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
    public void newActivity7(View v) {
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);
    }
    public void newActivity8(View v) {
        Intent intent = new Intent(this, MainActivity8.class);
        startActivity(intent);
    }
}
// ../sharedKeys/shore/{sharingId} [GET]