package com.example.judaicapp.screens;

import android.os.Build;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.example.judaicapp.R;
import com.example.judaicapp.TimezoneMapper;
import com.kosherjava.zmanim.ComplexZmanimCalendar;
import com.kosherjava.zmanim.util.GeoLocation;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;

@RequiresApi(api = Build.VERSION_CODES.N)
public class StartAnimation extends AppCompatActivity {
    String locationName = "Jerusalem, Israel";
    double latitude = 31.7767; //Western Wall, Israel
    double longitude = 35.2345; //Western Wall, Israel
    double elevation = 800; //optional elevation
    Date currentTime = new Date();
    TimeZone timeZone = TimeZone.getTimeZone(TimezoneMapper.latLngToTimezoneString(latitude, longitude));
    GeoLocation location = new GeoLocation(locationName, latitude, longitude, elevation, timeZone);
    ComplexZmanimCalendar czc = new ComplexZmanimCalendar(location);
    Format dayOfWeek = new SimpleDateFormat("");
    String day = dayOfWeek.format(currentTime);

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

        Date lighting = czc.getCandleLighting();
        Date motzash = czc.getTzaisGeonim8Point5Degrees();



//this is a timer that waits for the animation to finish and then is supposed to change the screen
        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                //this if is supposed to check if it's shabbos and if it is it moves you to the shabbos screen
                if (day.equals("5") && currentTime.after(lighting)
                        || day.equals("6")&&currentTime.before(motzash)){

                }
                else{

                }

            }
        }, 6000);
    }
}