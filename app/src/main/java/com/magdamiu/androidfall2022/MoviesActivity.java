package com.magdamiu.androidfall2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MoviesActivity extends AppCompatActivity {

    private List<Movie> movieList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
    }

    // step 0 => add RecyclerView in the xml file & define the item template (matritza) - DONE

    // step 1 => get the data source - DONE
    // step 1.1 => create a dedicated class for Movie - DONE
    // step 1.2 => populate the data source - DONE
    private void setMovies() {
        movieList = new ArrayList<>();
        movieList.add(new Movie("Home Alone", "Comedy", ""));
        movieList.add(new Movie("Harry Potter", "Fantasy", ""));
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
    // step 2.2 => define the Adapter
    // setAdapter()... movieList

    // step 3 => setup adapter for the RecyclerView
    // step 3.1 => setup LayoutManager
    // step 3.2 => set the adapter
}