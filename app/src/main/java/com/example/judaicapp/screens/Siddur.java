package com.example.judaicapp.screens;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.judaicapp.R;
import com.example.judaicapp.screens.Siddurim.Ashkenaz;
import com.example.judaicapp.screens.Siddurim.TefilasHaderech;


public class Siddur extends Fragment {
    TextView ashkenaz, sefard, edut, haderech;



    public Siddur() {

    }






    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_siddur, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ashkenazInit();
    }

    private void ashkenazInit() {
        ashkenaz = getView().findViewById(R.id.Ashkenaz);
        sefard = getView().findViewById(R.id.Sefard);
        edut = getView().findViewById(R.id.Edot);
        haderech = getView().findViewById(R.id.TefilatHaderech);

        ashkenaz.setOnClickListener(v -> getParentFragmentManager().beginTransaction().addToBackStack("test").replace(R.id.nav_host_fragment, new Ashkenaz()).commit());
//        sefard.setOnClickListener(v -> getParentFragmentManager().beginTransaction().addToBackStack("test").replace(R.id.nav_host_fragment, new SefardSiddur()).commit());
//        ashkenaz.setOnClickListener(v -> getParentFragmentManager().beginTransaction().addToBackStack("test").replace(R.id.nav_host_fragment, new Ashkenaz()).commit());
        haderech.setOnClickListener(v -> getParentFragmentManager().beginTransaction().addToBackStack("hi").replace(R.id.nav_host_fragment, new TefilasHaderech()).commit());


    }
}