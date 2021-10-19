package com.example.judaicapp.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import com.example.judaicapp.R;

import java.util.Timer;
import java.util.TimerTask;

public class Animation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_animation);
        super.onCreate(savedInstanceState);
        candle();
    }

    private void candle() {
        RotateAnimation rotate = new RotateAnimation(0, 360, android.view.animation.Animation.RELATIVE_TO_SELF, 0.5f, android.view.animation.Animation.RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(3000);
        rotate.setInterpolator(new LinearInterpolator());
        rotate.setRepeatCount(2);
        rotate.setRepeatMode(android.view.animation.Animation.REVERSE);


        ImageView image = findViewById(R.id.animation);

        image.startAnimation(rotate);

        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {

//                Intent i = new Intent(MainActivity.this, MainActivity2.class);
//                startActivity(i);
            }
        }, 6000);
    }
}