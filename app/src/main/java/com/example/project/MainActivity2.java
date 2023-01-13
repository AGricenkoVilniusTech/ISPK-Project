package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void newActivity3(View v) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
    public void newActivity6(View v) {
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }
    public void newActivity7(View v) {
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);
    }
}
// ../lockOwners/locks [GET]
// ../lockOwners/locks [POST]
// ../lockOwners/locks/{lockId} [DELETE]