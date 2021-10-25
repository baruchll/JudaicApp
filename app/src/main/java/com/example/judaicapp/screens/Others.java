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
import com.example.judaicapp.screens.others.JlemCompass.CompassFragment;
import com.example.judaicapp.screens.others.Zmanim.Zmanim;
import com.example.judaicapp.screens.others.rav_chat.ChatLogin;
import com.example.judaicapp.screens.others.tefillin.TefillinVideo;


public class Others extends Fragment {
    Button chat, compass, calendar, tefillin, zmanim;



    public Others() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_others, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        othersInit();
    }

    private void othersInit() {
        chat = getView().findViewById(R.id.menu_rav_chat);
        compass = getView().findViewById(R.id.menu_jlem_compass);
        calendar = getView().findViewById(R.id.menu_calendar);
        tefillin = getView().findViewById(R.id.menu_tefillin);
        zmanim = getView().findViewById(R.id.menu_zmanim);

        compass.setOnClickListener(v -> getParentFragmentManager().beginTransaction().addToBackStack("test").replace(R.id.nav_host_fragment, new CompassFragment()).commit());
        chat.setOnClickListener(v -> getParentFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new ChatLogin()).commit());
        zmanim.setOnClickListener(v -> getParentFragmentManager().beginTransaction().addToBackStack("test").replace(R.id.nav_host_fragment, new Zmanim()).commit());
        tefillin.setOnClickListener(v -> getParentFragmentManager().beginTransaction().addToBackStack("hi").replace(R.id.nav_host_fragment, new TefillinVideo()).commit());
        //calendar.setOnClickListener(v -> getParentFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new Calendar()).commit());

    }
}