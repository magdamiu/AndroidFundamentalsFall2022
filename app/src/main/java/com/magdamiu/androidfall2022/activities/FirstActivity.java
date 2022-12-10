package com.magdamiu.androidfall2022.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.magdamiu.androidfall2022.R;

public class FirstActivity extends AppCompatActivity {

    private final String TAG = "FirstActivity";

    private Button buttonOpenSecondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Log.e(TAG, "onCreate");

        setupButtonOpenSecondActivity();
    }

    private void setupButtonOpenSecondActivity() {
        buttonOpenSecondActivity = findViewById(R.id.buttonOpenSecondActivity);
        buttonOpenSecondActivity.setOnClickListener(view -> {
            Intent openSecondActivity = new Intent(FirstActivity.this, SecondActivity.class);
            startActivity(openSecondActivity);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy");
    }
}