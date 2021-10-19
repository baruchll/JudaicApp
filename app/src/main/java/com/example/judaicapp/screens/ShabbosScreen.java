package com.example.judaicapp.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.judaicapp.R;
import com.example.judaicapp.screens.Siddurim.Ashkenaz;
import com.kosherjava.zmanim.ComplexZmanimCalendar;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ShabbosScreen extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shabbos_screen);
    }
}