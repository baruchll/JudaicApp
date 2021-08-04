package com.example.judaicapp.screens;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.judaicapp.R;


public class Home extends Fragment {

    Button ashkenaz = getView().findViewById(R.id.ashkenaz);


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
        LinearLayout.LayoutParams param1 = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
                1.0f
        );
        LinearLayout.LayoutParams param4 = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
                4.0f
        );

        LinearLayout.LayoutParams param2 = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
                2.0f
        );
        Button siddur, limud, others;
        siddur = getView().findViewById(R.id.siddur_btn);
        limud = getView().findViewById(R.id.limud_yomi_btn);
        others = getView().findViewById(R.id.other_functions_btn);

        siddur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(siddur.getLayoutParams().equals(param4)){
                    siddur.setLayoutParams(param2);
                    limud.setLayoutParams(param2);
                    others.setLayoutParams(param2);
                    ashkenaz.setVisibility(View.VISIBLE);
                }
                else {
                    siddur.setLayoutParams(param4);
                    limud.setLayoutParams(param1);
                    others.setLayoutParams(param1);
                }
            }
        });

        limud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (limud.getLayoutParams().equals(param4)) {
                    siddur.setLayoutParams(param2);
                    limud.setLayoutParams(param2);
                    others.setLayoutParams(param2);

                } else {
                    siddur.setLayoutParams(param1);
                    limud.setLayoutParams(param4);
                    others.setLayoutParams(param1);
                }
            }
        });

        others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(others.getLayoutParams().equals(param4)){
                siddur.setLayoutParams(param2);
                limud.setLayoutParams(param2);
                others.setLayoutParams(param2);
            }
            else {
                siddur.setLayoutParams(param1);
                limud.setLayoutParams(param1);
                others.setLayoutParams(param4);
            }
        }
        });


    }

}