package com.example.judaicapp.screens.limud.tehillim;

import static java.util.Objects.requireNonNull;

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.judaicapp.R;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import java.util.Calendar;


public class TehillimYomi extends Fragment {
    TextView sunday, monday, tuesday, wednesday, thursday, friday, shabbos;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    Calendar cal = Calendar.getInstance();



    public TehillimYomi() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tehillim_yomi, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        tehillimInit();
    }

    private void tehillimInit() {
        sunday = getView().findViewById(R.id.tehillim_sun);
        monday = getView().findViewById(R.id.tehillim_mon);
        tuesday = getView().findViewById(R.id.tehillim_tue);
        wednesday = getView().findViewById(R.id.tehillim_wed);
        thursday = getView().findViewById(R.id.tehillim_thu);
        friday = getView().findViewById(R.id.tehillim_fri);
        shabbos = getView().findViewById(R.id.tehillim_sat);
        sunday.setVisibility(View.GONE);
        monday.setVisibility(View.GONE);
        tuesday.setVisibility(View.GONE);
        wednesday.setVisibility(View.GONE);
        thursday.setVisibility(View.GONE);
        friday.setVisibility(View.GONE);
        shabbos.setVisibility(View.GONE);


        DocumentReference docref = db.collection("tehillim").document("tehillim");
        docref.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error != null) {
                    return;
                }
                assert value != null;
                sunday.setText(Html.fromHtml(requireNonNull(value.getString("sunday")).replaceAll("_b", "<br/>")));
                monday.setText(Html.fromHtml(requireNonNull(value.getString("monday")).replaceAll("_b", "<br/>")));
                tuesday.setText(Html.fromHtml(requireNonNull(value.getString("tuesday")).replaceAll("_b", "<br/>")));
                wednesday.setText(Html.fromHtml(requireNonNull(value.getString("wednesday")).replaceAll("_b", "<br/>")));
                thursday.setText(Html.fromHtml(requireNonNull(value.getString("thursday")).replaceAll("_b", "<br/>")));
                friday.setText(Html.fromHtml(requireNonNull(value.getString("friday")).replaceAll("_b", "<br/>")));
                shabbos.setText(Html.fromHtml(requireNonNull(value.getString("shabbos")).replaceAll("_b", "<br/>")));

    }

        });


            if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
                sunday.setVisibility(View.VISIBLE);
            }
            else if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY){
                monday.setVisibility(View.VISIBLE);
            }
            else if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY){
                tuesday.setVisibility(View.VISIBLE);
            }
            else if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY){
                wednesday.setVisibility(View.VISIBLE);
            }
            else if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY){
                thursday.setVisibility(View.VISIBLE);
            }
            else if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY){
                friday.setVisibility(View.VISIBLE);
            }
            else if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY){
                shabbos.setVisibility(View.VISIBLE);
            }


    }
}