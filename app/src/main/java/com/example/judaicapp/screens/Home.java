package com.example.judaicapp.screens;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.judaicapp.R;
import com.example.judaicapp.screens.Siddurim.Ashkenaz;
import com.example.judaicapp.screens.Siddurim.EdotSiddur;
import com.example.judaicapp.screens.limud.Shiurim.RecordedShiurim;
import com.example.judaicapp.screens.limud.dafYomi.TheDaf;
import com.example.judaicapp.screens.limud.mishnaYomi.MishnahYomi;
import com.example.judaicapp.screens.limud.shtayim_mikrah.ShtayimMikrah;
import com.example.judaicapp.screens.limud.tehillim.TehillimYomi;
import com.example.judaicapp.screens.others.JlemCompass.CompassFragment;
import com.example.judaicapp.screens.others.Zmanim.Zmanim;
import com.example.judaicapp.screens.others.rav_chat.ChatLogin;
import com.example.judaicapp.screens.others.tefillin.TefillinVideo;

import java.util.Calendar;


public class Home extends Fragment {

    Button siddur, limud, others;
    Button ashkenaz, sefard, edot;
    Button daf_yomi, mishna_yomi, shtayim_mikrah, tehillim, shiurim;
    Button rav_chat, compass, calender, tefilllin, zmanai_hayom;
    TextView halacha_yomit;
    String[] halacha_yomit_arr;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        shabbos();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        halachayomit();
        init();
        initclose();

    }

    private void shabbos() {
        Calendar cal = Calendar.getInstance();
        int shabbos = cal.get(Calendar.DAY_OF_WEEK);
        if (shabbos == Calendar.SATURDAY){
            Intent intent = new Intent(this.getContext(), ShabbosScreen.class);
            startActivity(intent);

        }
    }

    private void halachayomit() {
        halacha_yomit = getView().findViewById(R.id.halacha_yomit);
        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DAY_OF_MONTH);
        halacha_yomit_arr = getResources().getStringArray(R.array.halacha_yomit);
        for (int i = 0; i < 30; i++) {
            if (i == day){
                halacha_yomit.setText(halacha_yomit_arr[i]);
                halacha_yomit.setTextColor(Color.parseColor("#FFFFFF"));
            }

        }
    }


    private void initclose() {
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

        siddur = getView().findViewById(R.id.siddur_btn);
        limud = getView().findViewById(R.id.limud_yomi_btn);
        others = getView().findViewById(R.id.other_functions_btn);
        ashkenaz = getView().findViewById(R.id.ashkenaz);
        sefard = getView().findViewById(R.id.sefard);
        edot = getView().findViewById(R.id.edut);
        rav_chat = getView().findViewById(R.id.rav_chat);
        calender = getView().findViewById(R.id.jewish_calender);
        compass = getView().findViewById(R.id.compass);
        tefilllin = getView().findViewById(R.id.tefillin_guide);
        zmanai_hayom = getView().findViewById(R.id.zmanai_hayom);
        daf_yomi = getView().findViewById(R.id.daf_yomi);
        mishna_yomi = getView().findViewById(R.id.mishna_yomi);
        tehillim = getView().findViewById(R.id.tehillim);
        shiurim = getView().findViewById(R.id.recorded_shiurim);
        shtayim_mikrah = getView().findViewById(R.id.shtayim_mikra);


        siddur.setLayoutParams(param48);
        limud.setLayoutParams(param48);
        others.setLayoutParams(param48);

        siddur.setOnClickListener(v -> {

            if (ashkenaz.getVisibility() == View.GONE) {
                initclose();
                siddur.setLayoutParams(param24);
                limud.setLayoutParams(param24);
                others.setLayoutParams(param24);
                ashkenaz.setVisibility(View.VISIBLE);
                sefard.setVisibility(View.VISIBLE);
                edot.setVisibility(View.VISIBLE);
            } else {
                initclose();
                siddur.setLayoutParams(param48);
                limud.setLayoutParams(param48);
                others.setLayoutParams(param48);
            }
        });

        limud.setOnClickListener(v -> {

            if (daf_yomi.getVisibility() == View.GONE) {
                initclose();
                limud.setLayoutParams(param18);
                siddur.setLayoutParams(param18);
                others.setLayoutParams(param18);
                daf_yomi.setVisibility(View.VISIBLE);
                mishna_yomi.setVisibility(View.VISIBLE);
                shtayim_mikrah.setVisibility(View.VISIBLE);
                tehillim.setVisibility(View.VISIBLE);
                shiurim.setVisibility(View.VISIBLE);
            } else {
                initclose();
                siddur.setLayoutParams(param48);
                limud.setLayoutParams(param48);
                others.setLayoutParams(param48);
            }
        });

        others.setOnClickListener(v -> {

            if (tefilllin.getVisibility() == View.GONE) {
                initclose();
                others.setLayoutParams(param18);
                siddur.setLayoutParams(param18);
                limud.setLayoutParams(param18);
                rav_chat.setVisibility(View.VISIBLE);
                calender.setVisibility(View.VISIBLE);
                compass.setVisibility(View.VISIBLE);
                tefilllin.setVisibility(View.VISIBLE);
                zmanai_hayom.setVisibility(View.VISIBLE);
            } else {
                initclose();
                siddur.setLayoutParams(param48);
                limud.setLayoutParams(param48);
                others.setLayoutParams(param48);
            }
        });

        ashkenaz.setOnClickListener(v -> getParentFragmentManager().beginTransaction().addToBackStack("test").replace(R.id.nav_host_fragment, new Ashkenaz()).commit());

//        sefard.setOnClickListener(v -> {
//            Intent goToSefard = new Intent(v.getContext(), SefardSiddur.class);
//            startActivity(goToSefard);
//        });


        edot.setOnClickListener(v -> {
            Intent goToEdot = new Intent(v.getContext(), EdotSiddur.class);
            startActivity(goToEdot);
        });



        compass.setOnClickListener(v -> getParentFragmentManager().beginTransaction().addToBackStack("test").replace(R.id.nav_host_fragment, new CompassFragment()).commit());
        rav_chat.setOnClickListener(v -> getParentFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new ChatLogin()).commit());
        zmanai_hayom.setOnClickListener(v -> getParentFragmentManager().beginTransaction().addToBackStack("test").replace(R.id.nav_host_fragment, new Zmanim()).commit());
        tefilllin.setOnClickListener(v -> getParentFragmentManager().beginTransaction().addToBackStack("hi").replace(R.id.nav_host_fragment, new TefillinVideo()).commit());
        shiurim.setOnClickListener(v -> getParentFragmentManager().beginTransaction().addToBackStack("hi").replace(R.id.nav_host_fragment, new RecordedShiurim()).commit());
        daf_yomi.setOnClickListener(v -> getParentFragmentManager().beginTransaction().addToBackStack("hi").replace(R.id.nav_host_fragment, new TheDaf()).commit());
        mishna_yomi.setOnClickListener(v -> getParentFragmentManager().beginTransaction().addToBackStack("hi").replace(R.id.nav_host_fragment, new MishnahYomi()).commit());
        tehillim.setOnClickListener(v -> getParentFragmentManager().beginTransaction().addToBackStack("hi").replace(R.id.nav_host_fragment, new TehillimYomi()).commit());
        shtayim_mikrah.setOnClickListener(v -> getParentFragmentManager().beginTransaction().addToBackStack("hi").replace(R.id.nav_host_fragment, new ShtayimMikrah()).commit());



    }



}