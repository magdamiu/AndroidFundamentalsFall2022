// Generated by view binder compiler. Do not edit!
package com.magdamiu.androidfall2022.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.magdamiu.androidfall2022.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityFirstBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonDial;

  @NonNull
  public final Button buttonOpenSecondActivity;

  @NonNull
  public final Button buttonOpenWebsite;

  @NonNull
  public final Button buttonSendMessage;

  @NonNull
  public final EditText editTextMessage;

  @NonNull
  public final TextView textView;

  private ActivityFirstBinding(@NonNull ConstraintLayout rootView, @NonNull Button buttonDial,
      @NonNull Button buttonOpenSecondActivity, @NonNull Button buttonOpenWebsite,
      @NonNull Button buttonSendMessage, @NonNull EditText editTextMessage,
      @NonNull TextView textView) {
    this.rootView = rootView;
    this.buttonDial = buttonDial;
    this.buttonOpenSecondActivity = buttonOpenSecondActivity;
    this.buttonOpenWebsite = buttonOpenWebsite;
    this.buttonSendMessage = buttonSendMessage;
    this.editTextMessage = editTextMessage;
    this.textView = textView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFirstBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFirstBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_first, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFirstBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonDial;
      Button buttonDial = ViewBindings.findChildViewById(rootView, id);
      if (buttonDial == null) {
        break missingId;
      }

      id = R.id.buttonOpenSecondActivity;
      Button buttonOpenSecondActivity = ViewBindings.findChildViewById(rootView, id);
      if (buttonOpenSecondActivity == null) {
        break missingId;
      }

      id = R.id.buttonOpenWebsite;
      Button buttonOpenWebsite = ViewBindings.findChildViewById(rootView, id);
      if (buttonOpenWebsite == null) {
        break missingId;
      }

      id = R.id.buttonSendMessage;
      Button buttonSendMessage = ViewBindings.findChildViewById(rootView, id);
      if (buttonSendMessage == null) {
        break missingId;
      }

      id = R.id.editTextMessage;
      EditText editTextMessage = ViewBindings.findChildViewById(rootView, id);
      if (editTextMessage == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new ActivityFirstBinding((ConstraintLayout) rootView, buttonDial,
          buttonOpenSecondActivity, buttonOpenWebsite, buttonSendMessage, editTextMessage,
          textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
