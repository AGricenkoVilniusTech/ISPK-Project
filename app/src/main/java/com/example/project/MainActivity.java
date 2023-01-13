package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextTextPersonName2, editTextTextPersonName;
    Button clk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);
        editTextTextPersonName2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        clk = (Button) findViewById(R.id.button16);
    }

    public void movepage(View v) {
        String stname = editTextTextPersonName.getText().toString();
        String stname2 = editTextTextPersonName2.getText().toString();

        if (stname.equals("Vardas") && stname2.equals("Slaptazodis")) {
            Intent in = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(in);
        } else if (stname.equals("Vardas") || stname2.equals("Slaptazodis")) {
            Toast.makeText(getBaseContext(), "Įveskite vardą ir slaptažodį", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(getBaseContext(), "Netinkamas vardas ir slaptažodis", Toast.LENGTH_SHORT).show();
        }


    }

}
// ../auth/login [POST]
// ../auth/register [POST]