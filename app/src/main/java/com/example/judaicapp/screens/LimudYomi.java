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
import com.example.judaicapp.screens.limud.tehillim.TehillimYomi;

import java.util.Objects;


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
        daf_yomi_side = requireView().findViewById(R.id.menu_daf_yomi);
        mishna_side = requireView().findViewById(R.id.menu_mishna);
        mikrah_side = requireView().findViewById(R.id.menu_mikrah);
        tehillim_side = requireView().findViewById(R.id.menu_tehillim);
        shiurim_side = requireView().findViewById(R.id.menu_shiurim);

        daf_yomi_side.setOnClickListener(v -> getParentFragmentManager().beginTransaction().addToBackStack("test").replace(R.id.nav_host_fragment, new TheDaf()).commit());
        mishna_side.setOnClickListener(v -> getParentFragmentManager().beginTransaction().addToBackStack("test").replace(R.id.nav_host_fragment, new MishnahYomi()).commit());
        mikrah_side.setOnClickListener(v -> getParentFragmentManager().beginTransaction().addToBackStack("test").replace(R.id.nav_host_fragment, new ShtayimMikrah()).commit());
        tehillim_side.setOnClickListener(v -> getParentFragmentManager().beginTransaction().addToBackStack("test").replace(R.id.nav_host_fragment, new TehillimYomi()).commit());
        shiurim_side.setOnClickListener(v -> getParentFragmentManager().beginTransaction().addToBackStack("test").replace(R.id.nav_host_fragment, new RecordedShiurim()).commit());

    }


}