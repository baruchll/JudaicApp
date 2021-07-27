package com.example.judaicapp.screens;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.judaicapp.R;


public class Home extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
            return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init();
    }

    private void init() {
        Button siddur, limud, others;
        siddur = getView().findViewById(R.id.siddur_btn);
        limud = getView().findViewById(R.id.limud_yomi_btn);
        others = getView().findViewById(R.id.other_functions_btn);

        siddur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                siddur
            }
        });
    }

}