package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    public void newActivity3(View v) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}
// ../lockOwners/locks/{lockId}/keys/{keyId} [POST]
// ../lockOwners/locks/{lockId}/keys/{keyId} [DELETE]