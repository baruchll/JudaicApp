package com.example.judaicapp.screens;

import android.content.Intent;
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
import com.example.judaicapp.screens.Siddurim.AshkenazSiddur;
import com.example.judaicapp.screens.Siddurim.EdotSiddur;
import com.example.judaicapp.screens.Siddurim.SefardSiddur;
import com.example.judaicapp.screens.others.JlemCompass.CompassActivity;


public class Home extends Fragment {

    Button siddur, limud, others;
    Button ashkenaz, sefard, edot;
    Button daf_yomi, mishna_yomi, shtayim_mikrah, tehillim, shiurim;
    Button rav_chat, compass, calender, tefilllin, zmanai_hayom;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init();
        close();

    }

    private void close() {
        ashkenaz.setVisibility(View.GONE);
        sefard.setVisibility(View.GONE);
        edot.setVisibility(View.GONE);
        daf_yomi.setVisibility(View.GONE);
        mishna_yomi.setVisibility(View.GONE);
        shtayim_mikrah.setVisibility(View.GONE);
        tehillim.setVisibility(View.GONE);
        shiurim.setVisibility(View.GONE);
        rav_chat.setVisibility(View.GONE);
        compass.setVisibility(View.GONE);
        calender.setVisibility(View.GONE);
        tefilllin.setVisibility(View.GONE);
        zmanai_hayom.setVisibility(View.GONE);


    }

    private void init() {
        LinearLayout.LayoutParams param48 = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
                48.0f
        );
        LinearLayout.LayoutParams param24 = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
                24.0f
        );

        LinearLayout.LayoutParams param18 = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
                18.0f
        );

        siddur = requireView().findViewById(R.id.siddur_btn);
        limud = requireView().findViewById(R.id.limud_yomi_btn);
        others = requireView().findViewById(R.id.other_functions_btn);
        ashkenaz = requireView().findViewById(R.id.ashkenaz);
        sefard = requireView().findViewById(R.id.sefard);
        edot = requireView().findViewById(R.id.edut);
        rav_chat = requireView().findViewById(R.id.rav_chat);
        calender = requireView().findViewById(R.id.jewish_calender);
        compass = requireView().findViewById(R.id.compass);
        tefilllin = requireView().findViewById(R.id.tefillin_guide);
        zmanai_hayom = requireView().findViewById(R.id.zmanai_hayom);
        daf_yomi = requireView().findViewById(R.id.daf_yomi);
        mishna_yomi = requireView().findViewById(R.id.mishna_yomi);
        tehillim = requireView().findViewById(R.id.tehillim);
        shiurim = requireView().findViewById(R.id.recorded_shiurim);
        shtayim_mikrah = requireView().findViewById(R.id.shtayim_mikra);


        siddur.setLayoutParams(param48);
        limud.setLayoutParams(param48);
        others.setLayoutParams(param48);

        siddur.setOnClickListener(v -> {

            if (ashkenaz.getVisibility() == View.GONE) {
                close();
                siddur.setLayoutParams(param24);
                limud.setLayoutParams(param24);
                others.setLayoutParams(param24);
                ashkenaz.setVisibility(View.VISIBLE);
                sefard.setVisibility(View.VISIBLE);
                edot.setVisibility(View.VISIBLE);
            }
            else {
                close();
                siddur.setLayoutParams(param48);
                limud.setLayoutParams(param48);
                others.setLayoutParams(param48);
            }
        });

        limud.setOnClickListener(v -> {

            if (daf_yomi.getVisibility() == View.GONE) {
                close();
                limud.setLayoutParams(param18);
                siddur.setLayoutParams(param18);
                others.setLayoutParams(param18);
                daf_yomi.setVisibility(View.VISIBLE);
                mishna_yomi.setVisibility(View.VISIBLE);
                shtayim_mikrah.setVisibility(View.VISIBLE);
                tehillim.setVisibility(View.VISIBLE);
                shiurim.setVisibility(View.VISIBLE);
            }
            else {
                close();
                siddur.setLayoutParams(param48);
                limud.setLayoutParams(param48);
                others.setLayoutParams(param48);
            }
        });

        others.setOnClickListener(v -> {

            if (tefilllin.getVisibility() == View.GONE) {
                close();
                others.setLayoutParams(param18);
                siddur.setLayoutParams(param18);
                limud.setLayoutParams(param18);
                rav_chat.setVisibility(View.VISIBLE);
                calender.setVisibility(View.VISIBLE);
                compass.setVisibility(View.VISIBLE);
                tefilllin.setVisibility(View.VISIBLE);
                zmanai_hayom.setVisibility(View.VISIBLE);
            }
            else {
                close();
                siddur.setLayoutParams(param48);
                limud.setLayoutParams(param48);
                others.setLayoutParams(param48);
            }
    });

        ashkenaz.setOnClickListener(v -> {
            Intent goToAshkenaz = new Intent(v.getContext(), AshkenazSiddur.class);
            startActivity(goToAshkenaz);
        });

        sefard.setOnClickListener(v -> {
            Intent goToSefard = new Intent(v.getContext(), SefardSiddur.class);
            startActivity(goToSefard);
        });


        edot.setOnClickListener(v -> {
            Intent goToEdot = new Intent(v.getContext(), EdotSiddur.class);
            startActivity(goToEdot);
        });

        compass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToCompass = new Intent(v.getContext(), CompassActivity.class);
                startActivity(goToCompass);
            }
        });


    }

}