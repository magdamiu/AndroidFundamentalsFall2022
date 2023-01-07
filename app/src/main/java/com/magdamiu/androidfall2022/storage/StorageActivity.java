package com.magdamiu.androidfall2022.storage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.magdamiu.androidfall2022.R;

public class StorageActivity extends AppCompatActivity {

    private static final String TAG_ACTIVITY = "StorageActivity";
    protected static final String COLOR = "color";
    protected static final String SLIDES = "slides";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage);

        useSharedPreferences();
    }

    private void useSharedPreferences() {
        // save values in SharedPreference
        ApplicationData.setStringValueInSharedPreferences(StorageActivity.this, COLOR, "blue");
        ApplicationData.setIntValueInSharedPreferences(StorageActivity.this, SLIDES, 7);

        // get values from SharedPreferences
        String valueColor = ApplicationData.getStringValueFromSharedPreferences(StorageActivity.this, COLOR);
        Log.e(TAG_ACTIVITY, valueColor);

        int valueSlides = ApplicationData.getIntValueFromSharedPreferences(StorageActivity.this, SLIDES);
        Log.e(TAG_ACTIVITY, valueSlides + "");

        // delete values from SharedPreferences
        ApplicationData.deleteValueFromSharedPreferences(StorageActivity.this, SLIDES);

        valueSlides = ApplicationData.getIntValueFromSharedPreferences(StorageActivity.this, SLIDES);
        Log.e(TAG_ACTIVITY, valueSlides + "");

        // delete all values from SharedPreferences
        ApplicationData.deleteAllValuesFromSharedPreferences(StorageActivity.this);

        valueColor = ApplicationData.getStringValueFromSharedPreferences(StorageActivity.this, COLOR);
        Log.e(TAG_ACTIVITY, valueColor);
    }
}