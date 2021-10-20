package com.example.judaicapp.screens.Siddurim.ashkenaz;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.judaicapp.R;


public class BirkasHamazon extends Fragment {
    TextView a_bh_bircas_hamazon_1, a_bh_purim, a_bh_chanukah, a_bh_bircas_hamazon_2, a_bh_rosh_chodesh_1, a_bh_pesach, a_bh_sukkkos_1, a_bh_bircas_hamazon_3,
            a_bh_rosh_chodesh_2, a_bh_sukkos_2, a_bh_yom_tov, a_bh_migdol, a_bh_magdil;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_birkas_hamazon, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        hamazon();
    }

    private void hamazon() {

    }
}