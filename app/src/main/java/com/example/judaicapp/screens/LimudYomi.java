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
import com.example.judaicapp.screens.limud.Shiurim.RecordedShiurim;
import com.example.judaicapp.screens.limud.dafYomi.TheDaf;
import com.example.judaicapp.screens.limud.mishnaYomi.MishnahYomi;
import com.example.judaicapp.screens.limud.shtayim_mikrah.ShtayimMikrah;
import com.example.judaicapp.screens.limud.tehillim.Tehillim;


public class LimudYomi extends Fragment {
    Button  daf_yomi_side, mishna_side, mikrah_side, tehillim_side, shiurim_side;



    public LimudYomi() {
        // Required empty public constructor
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_limud_yomi, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        LimudStuff();
    }

    private void LimudStuff() {
        daf_yomi_side = getView().findViewById(R.id.ashkenaz_shachris);
        mishna_side = getView().findViewById(R.id.ashkenaz_mincha);
        mikrah_side = getView().findViewById(R.id.ashkenaz_maariv);
        tehillim_side = getView().findViewById(R.id.tehillim_side_menu);
        shiurim_side = getView().findViewById(R.id.shiurim_side_menu);

        daf_yomi_side.setOnClickListener(v -> getParentFragmentManager().beginTransaction().addToBackStack("test").replace(R.id.nav_host_fragment, new TheDaf()).commit());
        mishna_side.setOnClickListener(v -> getParentFragmentManager().beginTransaction().addToBackStack("test").replace(R.id.nav_host_fragment, new MishnahYomi()).commit());
        mikrah_side.setOnClickListener(v -> getParentFragmentManager().beginTransaction().addToBackStack("test").replace(R.id.nav_host_fragment, new ShtayimMikrah()).commit());
        tehillim_side.setOnClickListener(v -> getParentFragmentManager().beginTransaction().addToBackStack("test").replace(R.id.nav_host_fragment, new Tehillim()).commit());
        shiurim_side.setOnClickListener(v -> getParentFragmentManager().beginTransaction().addToBackStack("test").replace(R.id.nav_host_fragment, new RecordedShiurim()).commit());

    }


}