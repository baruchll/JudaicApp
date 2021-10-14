package com.example.judaicapp.screens.others.Zmanim;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.kosherjava.zmanim.ComplexZmanimCalendar;
import com.kosherjava.zmanim.util.GeoLocation;
import com.kosherjava.zmanim.AstronomicalCalendar;

import com.example.judaicapp.R;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.TimeZone;


public class Zmanim extends Fragment {
    ListView zmanimList;
    String locationName = "Jerusalem, Israel";
    double latitude = 0; //Western Wall, Israel
    double longitude = 0; //Western Wall, Israel
    double elevation = 800; //optional elevation
    TimeZone timeZone = TimeZone.getTimeZone("Asia/Jerusalem");
    GeoLocation location2;
    ComplexZmanimCalendar czc;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    private void test() {
        LocationManager locationManager = (LocationManager) getContext().getSystemService(Context.LOCATION_SERVICE);


        if (ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            ActivityResultLauncher<String[]> locationPermissionRequest =
                    registerForActivityResult(new ActivityResultContracts
                                    .RequestMultiplePermissions(), result -> {
                                Boolean fineLocationGranted = null;
                                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                                    fineLocationGranted = result.getOrDefault(
                                            Manifest.permission.ACCESS_FINE_LOCATION, false);
                                }
                                Boolean coarseLocationGranted = null;
                                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                                    coarseLocationGranted = result.getOrDefault(
                                            Manifest.permission.ACCESS_COARSE_LOCATION, false);
                                }
                                if (fineLocationGranted != null && fineLocationGranted) {
                                    // Precise location access granted.
                                    initLocation();
                                } else if (coarseLocationGranted != null && coarseLocationGranted) {

                                    initLocation();
                                } else {
                                    // No location access granted.
                                }
                            }
                    );
            locationPermissionRequest.launch(new String[]{
                    Manifest.permission.ACCESS_FINE_LOCATION,
                    Manifest.permission.ACCESS_COARSE_LOCATION
            });
            return;
        } else {
            initLocation();

        }


    }

    public void initLocation() {
        LocationManager lm = (LocationManager) getContext().getSystemService(Context.LOCATION_SERVICE);
        if (ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        Location location = lm.getLastKnownLocation(LocationManager.GPS_PROVIDER);
        longitude = location.getLongitude();
        latitude = location.getLatitude();
        location2 = new GeoLocation(locationName, latitude, longitude, elevation, timeZone);
        czc = new ComplexZmanimCalendar(location2);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        zmanimList = getView().findViewById(R.id.zmanim_list);
        test();
        ArrayList<String> categories = new ArrayList<>();
        Format time = new SimpleDateFormat("HH:mm:ss");
        boolean dawn = categories.add("עלות השחר: " + time.format(czc.getAlosHashachar()));
        boolean misheyakir = categories.add("תחילת זמן ציצית ותפילין: " + time.format(czc.getMisheyakir11Point5Degrees()));
        boolean sunrise = categories.add("הנץ החמה: " + time.format(czc.getSunrise()));
        boolean shemaMGA = categories.add("סוף זמן קריאת שמע מגן אברהם (72 דקות): " + time.format(czc.getSofZmanShmaMGA72Minutes()));
        boolean shemaGra = categories.add("סוף זמן קריאת שמע גר\"א ובעל התניא: " + time.format(czc.getSofZmanShmaBaalHatanya()));
        boolean tfilaMGA = categories.add("סוף זמן תפילה מגן אברהם (72 דקות): " + time.format(czc.getSofZmanTfilaMGA72Minutes()));
        boolean tfilaGra = categories.add("סוף זמן תפילה גר\"א ובעל התניא: " + time.format(czc.getSofZmanTfilaBaalHatanya()));
        boolean midday = categories.add("חצות היום: " + time.format(czc.getFixedLocalChatzos()));
        boolean earlyMincha = categories.add("מנחה גדולה: " + time.format(czc.getMinchaGedolaBaalHatanya()));
        boolean plagMincha = categories.add("פלג המנחה: " + time.format(czc.getPlagHamincha()));
        boolean sunset = categories.add("שקיעה: " + time.format(czc.getSunset()));
        boolean threeStars = categories.add("לילה - צאת ג' כוכבים: " + time.format(czc.getTzaisGeonim8Point5Degrees()));
        boolean nightfall = categories.add("לילה - 72 דקות: " + time.format(czc.getTzais72Zmanis()));


        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, categories);

        zmanimList.setAdapter(arrayAdapter);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_zmanim, container, false);
    }


}