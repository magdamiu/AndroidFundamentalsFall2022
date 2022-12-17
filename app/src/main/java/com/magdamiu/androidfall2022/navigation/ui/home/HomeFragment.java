package com.magdamiu.androidfall2022.navigation.ui.home;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.magdamiu.androidfall2022.R;
import com.magdamiu.androidfall2022.networking.OnGetUsersCallback;
import com.magdamiu.androidfall2022.networking.User;
import com.magdamiu.androidfall2022.networking.UsersRepository;

import java.util.List;


public class HomeFragment extends Fragment {

    private UsersRepository usersRepository;
    private RecyclerView recyclerViewGithubUsers;
    private List<User> githubUsers;

    @SuppressLint("MissingInflatedId")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        getGithubUsers();

        View homeFragmentView = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerViewGithubUsers = homeFragmentView.findViewById(R.id.recyclerViewGithubUsers);

        return homeFragmentView;
    }

    private void getGithubUsers() {
        usersRepository = UsersRepository.getInstance();
        usersRepository.getUsers(new OnGetUsersCallback() {
            @Override
            public void onSuccess(List<User> users) {
                // Recycler View
                Log.e("github users", users.toString());
                githubUsers = users;
            }

            @Override
            public void onError() {
                Log.e("Github", "no users");
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}