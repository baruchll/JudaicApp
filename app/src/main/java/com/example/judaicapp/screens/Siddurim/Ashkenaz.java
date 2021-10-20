package com.example.judaicapp.screens.Siddurim;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.judaicapp.R;
import com.example.judaicapp.screens.Siddurim.ashkenaz.AshkenazMincha;
import com.example.judaicapp.screens.Siddurim.ashkenaz.AshkenazShachris;


public class Ashkenaz extends Fragment {
    Button shachris, mincha;



    public Ashkenaz() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_ashkenaz, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        shachris = getView().findViewById(R.id.menu_rav_chat);
        mincha = getView().findViewById(R.id.menu_jlem_compass);

        shachris.setOnClickListener(v -> getParentFragmentManager().beginTransaction().addToBackStack("test").replace(R.id.nav_host_fragment, new AshkenazShachris()).commit());
        mincha.setOnClickListener(v -> getParentFragmentManager().beginTransaction().addToBackStack("test").replace(R.id.nav_host_fragment, new AshkenazMincha()).commit());
    }
}