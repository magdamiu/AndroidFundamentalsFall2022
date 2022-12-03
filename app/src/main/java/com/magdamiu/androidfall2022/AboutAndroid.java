package com.magdamiu.androidfall2022;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RatingBar;

public class AboutAndroid extends AppCompatActivity {
    private RatingBar ratingBarAndroid;
    private SwitchCompat switchBackUp;
    private ProgressBar progressBarAboutAndroid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_android);

        ratingBarAndroid = findViewById(R.id.ratingBarAndroid);
        ratingBarAndroid.getRating();

        switchBackUp = findViewById(R.id.switchBackUp);
        if (switchBackUp.isChecked()) {
            // do something
        }

        progressBarAboutAndroid = findViewById(R.id.progressBarAboutAndroid);
        progressBarAboutAndroid.setVisibility(View.INVISIBLE);
    }
}