// Generated by view binder compiler. Do not edit!
package com.magdamiu.androidfall2022.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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

public final class ActivitySecondBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final FrameLayout frameLayoutPlaceholder;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textViewReceivedMessage;

  private ActivitySecondBinding(@NonNull LinearLayout rootView,
      @NonNull FrameLayout frameLayoutPlaceholder, @NonNull TextView textView2,
      @NonNull TextView textViewReceivedMessage) {
    this.rootView = rootView;
    this.frameLayoutPlaceholder = frameLayoutPlaceholder;
    this.textView2 = textView2;
    this.textViewReceivedMessage = textViewReceivedMessage;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySecondBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySecondBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_second, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySecondBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.frameLayoutPlaceholder;
      FrameLayout frameLayoutPlaceholder = ViewBindings.findChildViewById(rootView, id);
      if (frameLayoutPlaceholder == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textViewReceivedMessage;
      TextView textViewReceivedMessage = ViewBindings.findChildViewById(rootView, id);
      if (textViewReceivedMessage == null) {
        break missingId;
      }

      return new ActivitySecondBinding((LinearLayout) rootView, frameLayoutPlaceholder, textView2,
          textViewReceivedMessage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}