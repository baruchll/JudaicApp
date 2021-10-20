package com.example.judaicapp.screens;

import static com.example.judaicapp.screens.others.Zmanim.Zmanim.czc;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.judaicapp.R;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;

public class StartAnimation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_start_animation);
        super.onCreate(savedInstanceState);
        candle();
    }

    private Animation rotate() {
        RotateAnimation rotate = new RotateAnimation(0, 360, android.view.animation.Animation.RELATIVE_TO_SELF, 0.5f, android.view.animation.Animation.RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(3000);
        rotate.setInterpolator(new LinearInterpolator());
        rotate.setRepeatCount(2);
        rotate.setRepeatMode(android.view.animation.Animation.REVERSE);
        return rotate;
    }

    private void candle() {
        ImageView image = findViewById(R.id.animation);
        image.startAnimation(rotate());

        Calendar cal = new GregorianCalendar();
        int dayofweek = cal.get(Calendar.DAY_OF_WEEK);
        cal.clear();
        cal.set(Calendar.HOUR, Calendar.MINUTE, Calendar.SECOND);
        Format time = new SimpleDateFormat("HH:mm:ss");

        String lighting = time.format(czc.getCandleLighting());
        String motzash = time.format(czc.getTzaisGeonim8Point5Degrees());



//this is a timer that does the waits for the animation to finish and then is supposed to change the screen
        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                //this if is supposed to check if its shabbos and if it is it moves you to the shabbos screen
                if (dayofweek == Calendar.FRIDAY && lighting.get()){

                }

            }
        }, 6000);
    }
}