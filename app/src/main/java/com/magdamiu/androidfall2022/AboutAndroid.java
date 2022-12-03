package com.magdamiu.androidfall2022;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class AboutAndroid extends AppCompatActivity {
    private static final String SANTA_URL = "https://santatracker.google.com/";

    private RatingBar ratingBarAndroid;
    private SwitchCompat switchBackUp;
    private ProgressBar progressBarAboutAndroid;
    private WebView webViewChristmas;
    private Spinner spinnerCities;

    private List<String> cities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_android);

        setupRatingBar();

        setupSwitch();

        setupProgressBar();

        setupWebView();

        setupSpinner();
    }

    private void setupWebView() {
        webViewChristmas = findViewById(R.id.webViewChristmas);
        webViewChristmas.getSettings().setJavaScriptEnabled(true);
        webViewChristmas.loadUrl(SANTA_URL);
    }

    private void setupProgressBar() {
        progressBarAboutAndroid = findViewById(R.id.progressBarAboutAndroid);
        progressBarAboutAndroid.setVisibility(View.INVISIBLE);
    }

    private void setupSwitch() {
        switchBackUp = findViewById(R.id.switchBackUp);
        if (switchBackUp.isChecked()) {
            // do something
        }
    }

    private void setupRatingBar() {
        ratingBarAndroid = findViewById(R.id.ratingBarAndroid);
        ratingBarAndroid.getRating();
    }
    // zero step => add the Spinner in the xml - DONE

    // first step => define the data source (usually from a db or a web service) - DONE
    private void setCities() {
        cities = new ArrayList<>();
        cities.add("Pitesti");
        cities.add("Iasi");
        cities.add("Oradea");
        cities.add("Zalau");
        cities.add("Braila");
        cities.add("Bucuresti");
        cities.add("Craiova");
        cities.add("Galati");
        cities.add("Brasov");
        cities.add("Ploiesti");
        cities.add("Timisoara");
    }

    // second step => define the default adapter - DONE
    private ArrayAdapter<String> getDefaultAdapter() {
        return new ArrayAdapter<String>(AboutAndroid.this, android.R.layout.simple_spinner_item, cities);
    }

    // third step => for spinner set the adapter
    private void setupSpinner() {
        spinnerCities = findViewById(R.id.spinnerCitiesList);

        // populate the data source
        setCities();

        spinnerCities.setAdapter(getDefaultAdapter());
    }

}