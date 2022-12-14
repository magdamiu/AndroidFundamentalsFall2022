// Generated by view binder compiler. Do not edit!
package com.magdamiu.androidfall2022.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.magdamiu.androidfall2022.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MovieItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView imageViewPoster;

  @NonNull
  public final TextView textViewMovieCategory;

  @NonNull
  public final TextView textViewMovieTitle;

  private MovieItemBinding(@NonNull LinearLayout rootView, @NonNull ImageView imageViewPoster,
      @NonNull TextView textViewMovieCategory, @NonNull TextView textViewMovieTitle) {
    this.rootView = rootView;
    this.imageViewPoster = imageViewPoster;
    this.textViewMovieCategory = textViewMovieCategory;
    this.textViewMovieTitle = textViewMovieTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MovieItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MovieItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.movie_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MovieItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageViewPoster;
      ImageView imageViewPoster = ViewBindings.findChildViewById(rootView, id);
      if (imageViewPoster == null) {
        break missingId;
      }

      id = R.id.textViewMovieCategory;
      TextView textViewMovieCategory = ViewBindings.findChildViewById(rootView, id);
      if (textViewMovieCategory == null) {
        break missingId;
      }

      id = R.id.textViewMovieTitle;
      TextView textViewMovieTitle = ViewBindings.findChildViewById(rootView, id);
      if (textViewMovieTitle == null) {
        break missingId;
      }

      return new MovieItemBinding((LinearLayout) rootView, imageViewPoster, textViewMovieCategory,
          textViewMovieTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
