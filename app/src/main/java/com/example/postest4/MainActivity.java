package com.example.postest4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "mainactivity";
    private Button masuk;
    private Button daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "oncreate");
        Toast.makeText(MainActivity.this, "OnCreate", Toast.LENGTH_SHORT).show();

        masuk = (Button) findViewById(R.id.buttonmasuk);
        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "LOGIN", Toast.LENGTH_SHORT).show();
            }
        });

        daftar = (Button) findViewById(R.id.buttondaftar);
        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "DAFTAR", Toast.LENGTH_SHORT).show();
            }
        });


    }

    protected void onStart(){
        super.onStart();
        Log.d(TAG, "onStart");
        Toast.makeText(MainActivity.this, "Start", Toast.LENGTH_SHORT).show();
    }

    protected void onResume(){
        super.onResume();
        Log.d(TAG, "onResume");
        Toast.makeText(MainActivity.this, "Resume", Toast.LENGTH_SHORT).show();
    }

    protected void onPause(){
        super.onPause();
        Log.d(TAG, "onPause");
        Toast.makeText(MainActivity.this, "Pause", Toast.LENGTH_SHORT).show();
    }

    protected void onStop(){
        super.onStop();
        Log.d(TAG, "onStop");
        Toast.makeText(MainActivity.this, "Stop", Toast.LENGTH_SHORT).show();
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy");
        Toast.makeText(MainActivity.this, "Destroy", Toast.LENGTH_SHORT).show();
    }

}