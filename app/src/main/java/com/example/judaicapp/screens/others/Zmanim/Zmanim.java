package com.example.judaicapp.screens.others.Zmanim;

import android.os.Bundle;

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
    double latitude = 31.7767; //Western Wall, Israel
    double longitude = 35.2345; //Western Wall, Israel
    double elevation = 800; //optional elevation
    TimeZone timeZone = TimeZone.getTimeZone("Asia/Jerusalem");
    GeoLocation location = new GeoLocation(locationName, latitude, longitude, elevation, timeZone);
    ComplexZmanimCalendar czc = new ComplexZmanimCalendar(location);


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        zmanimList = requireView().findViewById(R.id.zmanim_list);

        ArrayList<String> categories = new ArrayList<>();
        Format time = new SimpleDateFormat("HH:mm:ss");
        boolean dawn = categories.add("עלות השחר: "+ time.format(czc.getAlosHashachar()));
        boolean misheyakir = categories.add("תחילת זמן ציצית ותפילין: "+ time.format(czc.getMisheyakir11Point5Degrees()));
        boolean sunrise = categories.add("הנץ החמה: "+ time.format(czc.getSunrise()));
        boolean shemaMGA = categories.add("סוף זמן קריאת שמע מגן אברהם (72 דקות): "+ time.format(czc.getSofZmanShmaMGA72Minutes()));
        boolean shemaGra = categories.add("סוף זמן קריאת שמע גר\"א ובעל התניא: "+ time.format(czc.getSofZmanShmaBaalHatanya()));
        boolean tfilaMGA = categories.add("סוף זמן תפילה מגן אברהם (72 דקות): "+ time.format(czc.getSofZmanTfilaMGA72Minutes()));
        boolean tfilaGra = categories.add("סוף זמן תפילה גר\"א ובעל התניא: "+ time.format(czc.getSofZmanTfilaBaalHatanya()));
        boolean midday = categories.add("חצות היום: "+ time.format(czc.getFixedLocalChatzos()));
        boolean earlyMincha = categories.add("מנחה גדולה: "+ time.format(czc.getMinchaGedolaBaalHatanya()));
        boolean plagMincha = categories.add("פלג המנחה: "+ time.format(czc.getPlagHamincha()));
        boolean sunset = categories.add("שקיעה: "+ time.format(czc.getSunset()));
        boolean threeStars = categories.add("לילה - צאת ג' כוכבים: "+ time.format(czc.getTzaisGeonim8Point5Degrees()));
        boolean nightfall = categories.add("לילה - 72 דקות: "+ time.format(czc.getTzais72Zmanis()));



        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, categories);

        zmanimList.setAdapter(arrayAdapter);
        return inflater.inflate(R.layout.fragment_zmanim, container, false);
    }


}