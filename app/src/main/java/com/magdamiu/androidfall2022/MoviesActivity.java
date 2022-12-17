package com.magdamiu.androidfall2022;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MoviesActivity extends AppCompatActivity {

    private List<Movie> movieList;

    private RecyclerView moviesRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);

        moviesRecyclerView = findViewById(R.id.recyclerViewMovies);
        setupRecyclerView();
    }

    // step 0 => add RecyclerView in the xml file & define the item template (matritza) - DONE

    // step 1 => get the data source - DONE
    // step 1.1 => create a dedicated class for Movie - DONE
    // step 1.2 => populate the data source - DONE
    private void setMovies() {
        movieList = new ArrayList<>();
        movieList.add(new Movie("Home Alone", "Comedy", "https://lumiere-a.akamaihd.net/v1/images/homealone2_7706aa6d.jpeg"));
        movieList.add(new Movie("Harry Potter", "Fantasy", "https://lumiere-a.akamaihd.net/v1/images/homealone2_7706aa6d.jpeg"));
        movieList.add(new Movie("Kill Bill", "action", ""));
        movieList.add(new Movie("Avatar", "SF", ""));
        movieList.add(new Movie("Matrix", "action", ""));
        movieList.add(new Movie("The Light House", "SF", ""));
        movieList.add(new Movie("Superman", "action", ""));
        movieList.add(new Movie("Annabel", "horror", ""));
        movieList.add(new Movie("Spiderman", "action", ""));
        movieList.add(new Movie("Ironman", "action", ""));
        movieList.add(new Movie("Lost", "drama", ""));
    }

    // step 2 => get custom adapter
    // step 2.1 => define the ViewHolder - DONE
    // step 2.2 => define the Adapter - DONE
    // setAdapter()... movieList

    // step 3 => setup adapter for the RecyclerView - DONE
    // step 3.1 => setup LayoutManager - DONE
    // step 3.2 => set the adapter - DONE
    private void setMoviesLayoutManager() {
        moviesRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setMoviesAdapter() {
        moviesRecyclerView.setAdapter(new MovieAdapter(movieList));
    }

    private void setupRecyclerView() {
        setMovies();
        setMoviesLayoutManager();
        setMoviesAdapter();
    }
}