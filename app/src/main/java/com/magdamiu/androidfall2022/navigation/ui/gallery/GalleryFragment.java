package com.magdamiu.androidfall2022.navigation.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.magdamiu.androidfall2022.R;

public class GalleryFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // getActivity()
        return inflater.inflate(R.layout.fragment_gallery, container, false);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}