package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void newActivity7(View v) {
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);
    }
    public void newActivity4(View v) {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
}
// ../lockOwners/locks/{lockId}/keys [POST]
// ../lockOwners/locks/{lockId}/keys [GET]