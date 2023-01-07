package com.magdamiu.androidfall2022.storage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.magdamiu.androidfall2022.R;

import java.util.List;

public class StorageActivity extends AppCompatActivity {

    private static final String TAG_ACTIVITY = "StorageActivity";
    protected static final String COLOR = "color";
    protected static final String SLIDES = "slides";

    private WordViewModel wordViewModel;

    private Button buttonInsertWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage);

        useSharedPreferences();

        buttonInsertWord = findViewById(R.id.buttonInsertWord);

        wordViewModel = new ViewModelProvider(this).get(WordViewModel.class);
        wordViewModel.getWords().observe(this, new Observer<List<Word>>() {
            @Override
            public void onChanged(List<Word> words) {
                Log.e(TAG_ACTIVITY, words.toString());
            }
        });

        insertNewWords();
    }

    private void insertNewWords() {
        buttonInsertWord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wordViewModel.insert(new Word("android" + System.currentTimeMillis()));
            }
        });
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