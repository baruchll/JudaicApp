package com.example.judaicapp.screens.Siddurim.ashkenaz;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.judaicapp.R;


public class AshkenazMincha extends Fragment {



    public AshkenazMincha() {
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_ashkenaz_mincha, container, false);
    }
}