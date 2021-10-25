package com.example.judaicapp.screens.Siddurim.ashkenaz;

import static java.util.Objects.requireNonNull;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.judaicapp.Hollidays;
import com.example.judaicapp.R;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;


public class BirkasHamazon extends Fragment {
    Calendar currentDate = new GregorianCalendar();
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    TextView a_bh_bircas_hamazon_1, a_bh_purim, a_bh_chanukah, a_bh_bircas_hamazon_2, a_bh_rosh_chodesh_1, a_bh_pesach, a_bh_sukkos_1, a_bh_bircas_hamazon_3,
            a_bh_rosh_chodesh_2, a_bh_sukkos_2, a_bh_yom_tov, a_bh_migdol, a_bh_magdil;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_birkas_hamazon, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        currentDate.clear();
        currentDate.set(Calendar.getInstance().get(Calendar.YEAR), Calendar.getInstance().get(Calendar.MONTH), Calendar.getInstance().get(Calendar.DATE));
        hamazon();
        chodesh();
        purim();
        sukkos();
        pesach();
        chanukah();
    }




    private void hamazon() {
        a_bh_bircas_hamazon_1 = getView().findViewById(R.id.a_bh_bircas_hamazon_1);
        a_bh_purim = getView().findViewById(R.id.a_bh_purim);
        a_bh_chanukah = getView().findViewById(R.id.a_bh_chanukah);
        a_bh_bircas_hamazon_2 = getView().findViewById(R.id.a_bh_bircas_hamazon_2);
        a_bh_rosh_chodesh_1 = getView().findViewById(R.id.a_bh_rosh_chodesh_1);
        a_bh_pesach = getView().findViewById(R.id.a_bh_pesach);
        a_bh_sukkos_1 = getView().findViewById(R.id.a_bh_sukkos_1);
        a_bh_bircas_hamazon_3 = getView().findViewById(R.id.a_bh_bircas_hamazon_3);
        a_bh_rosh_chodesh_2 = getView().findViewById(R.id.a_bh_rosh_chodesh_2);
        a_bh_sukkos_2 = getView().findViewById(R.id.a_bh_sukkos_2);
        a_bh_yom_tov = getView().findViewById(R.id.a_bh_yom_tov);
        a_bh_migdol = getView().findViewById(R.id.a_bh_migdol);
        a_bh_magdil = getView().findViewById(R.id.a_bh_magdil);

        DocumentReference docref = db.collection("ashkenaz").document("birkas_hamazon");
        docref.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error != null) {
                    return;
                }
                assert value != null;
                a_bh_bircas_hamazon_1.setText(Html.fromHtml(requireNonNull(value.getString("bircas_hamazon_1")).replaceAll("_b", "<br/>")));
                a_bh_purim.setText(Html.fromHtml(requireNonNull(value.getString("purim")).replaceAll("_b", "<br/>")));
                a_bh_chanukah.setText(Html.fromHtml(requireNonNull(value.getString("chanukah")).replaceAll("_b", "<br/>")));
                a_bh_bircas_hamazon_2.setText(Html.fromHtml(requireNonNull(value.getString("bircas_hamazon_2")).replaceAll("_b", "<br/>")));
                a_bh_rosh_chodesh_1.setText(Html.fromHtml(requireNonNull(value.getString("rosh_chodesh_1")).replaceAll("_b", "<br/>")));
                a_bh_pesach.setText(Html.fromHtml(requireNonNull(value.getString("pesach")).replaceAll("_b", "<br/>")));
                a_bh_sukkos_1.setText(Html.fromHtml(requireNonNull(value.getString("sukkos_1")).replaceAll("_b", "<br/>")));
                a_bh_bircas_hamazon_3.setText(Html.fromHtml(requireNonNull(value.getString("bircas_hamazon_3")).replaceAll("_b", "<br/>")));
                a_bh_rosh_chodesh_2.setText(Html.fromHtml(requireNonNull(value.getString("rosh_chodesh_2")).replaceAll("_b", "<br/>")));
                a_bh_sukkos_2.setText(Html.fromHtml(requireNonNull(value.getString("sukkos_2")).replaceAll("_b", "<br/>")));
                a_bh_yom_tov.setText(Html.fromHtml(requireNonNull(value.getString("yom_tov")).replaceAll("_b", "<br/>")));
                a_bh_migdol.setText(Html.fromHtml(requireNonNull(value.getString("migdol")).replaceAll("_b", "<br/>")));
                a_bh_magdil.setText(Html.fromHtml(requireNonNull(value.getString("magdil")).replaceAll("_b", "<br/>")));
            }
        });

    }
    private void chodesh() {
        for (int i = 0; i < Hollidays.rosh_chodesh.size(); i++) {
            if (currentDate.getTime().equals(Hollidays.rosh_chodesh.get(i).getTime())){
                a_bh_rosh_chodesh_1.setVisibility(View.VISIBLE);
                a_bh_rosh_chodesh_2.setVisibility(View.VISIBLE);
                a_bh_migdol.setVisibility(View.VISIBLE);
                a_bh_magdil.setVisibility(View.GONE);
            }
        }
    }

    private void purim(){
        for (int i = 0; i < Hollidays.purim.size(); i++) {
            if (currentDate.getTime().equals(Hollidays.purim.get(i).getTime())){
                a_bh_purim.setVisibility(View.VISIBLE);
                a_bh_migdol.setVisibility(View.VISIBLE);
                a_bh_magdil.setVisibility(View.GONE);
            }
        }
    }


    private void chanukah(){
        for (int i = 0; i < Hollidays.chanukah.size(); i++) {
            if (currentDate.getTime().equals(Hollidays.chanukah.get(i).getTime())){
                a_bh_purim.setVisibility(View.VISIBLE);
                a_bh_migdol.setVisibility(View.VISIBLE);
                a_bh_magdil.setVisibility(View.GONE);
            }
        }
    }


    private void sukkos() {
        for (int i = 0; i < Hollidays.sukkos.size(); i++){
            if (currentDate.getTime().equals(Hollidays.sukkos.get(i).getTime())){
                a_bh_sukkos_1.setVisibility(View.VISIBLE);
                a_bh_sukkos_2.setVisibility(View.VISIBLE);
                a_bh_yom_tov.setVisibility(View.VISIBLE);
                a_bh_migdol.setVisibility(View.VISIBLE);
                a_bh_magdil.setVisibility(View.GONE);
            }

        }

    }

    private void pesach() {
        for (int i = 0; i < Hollidays.pesach.size(); i++){
            if (currentDate.getTime().equals(Hollidays.pesach.get(i).getTime())){
                a_bh_pesach.setVisibility(View.VISIBLE);
                a_bh_yom_tov.setVisibility(View.VISIBLE);
                a_bh_migdol.setVisibility(View.VISIBLE);
                a_bh_magdil.setVisibility(View.GONE);
            }
        }

    }







}