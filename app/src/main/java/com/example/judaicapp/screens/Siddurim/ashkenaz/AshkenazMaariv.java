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

import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class AshkenazMaariv extends Fragment {

    Calendar currentDate = new GregorianCalendar();
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    TextView a_ma_maariv_1, a_ma_shmona_esrei_1, a_ma_asseret_yami_teshuva_1, a_ma_shmona_esrei_2, a_ma_morid_hatal, a_ma_mashiv_harauch, a_ma_shmona_esrei_3,
            a_ma_asseret_yami_teshuva_2, a_ma_shmona_esrei_4, a_ma_hakel_hakadosh, a_ma_hamelech_hakadosh, a_ma_shmona_esrei_5, a_ma_veten_beracha, a_ma_tal_umatar,
            a_ma_shmona_esrei_6, a_ma_melech_ohev, a_ma_hamelech_hamishpat, a_ma_shmona_esrei_7, a_ma_rosh_chodesh, a_ma_pesach, a_ma_sukkos, a_ma_shmona_esrei_8,
            a_ma_chanukah, a_ma_purim, a_ma_shmona_esrei_9, a_ma_asseret_yami_teshuva_3, a_ma_shmona_esrei_10, a_ma_asseret_yami_teshuva_4, a_ma_shmona_esrei_11,
            a_ma_asseret_yami_teshuva_end, a_ma_shmona_esrei_end, a_ma_sefiras_haomer_1, a_ma_sefiras_haomer_2, a_ma_sefiras_haomer_3, a_ma_maariv_2, a_ma_ledovid;
    String[] omerCount;




    public AshkenazMaariv() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ashkenaz_maariv, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        currentDate.clear();
        currentDate.set(Calendar.getInstance().get(Calendar.YEAR), Calendar.getInstance().get(Calendar.MONTH), Calendar.getInstance().get(Calendar.DATE));
        maarivInit();
        omerDay();
        AYTeshuva();
        purim();
        chanukah();
    }

    private void purim(){
        for (int i = 0; i < Hollidays.purim.size(); i++) {
            if (currentDate.getTime().equals(Hollidays.purim.get(i).getTime())){
                a_ma_purim.setVisibility(View.VISIBLE);
            }
        }
    }

    private void chanukah(){
        for (int i = 0; i < Hollidays.chanukah.size(); i++) {
            if (currentDate.getTime().equals(Hollidays.chanukah.get(i).getTime())){
                a_ma_chanukah.setVisibility(View.VISIBLE);

            }

        }
    }

    private void maarivInit() {
        a_ma_maariv_1 = getView().findViewById(R.id.a_ma_maariv_1);
        a_ma_shmona_esrei_1 = getView().findViewById(R.id.a_ma_shmona_esrei_1);
        a_ma_asseret_yami_teshuva_1 = getView().findViewById(R.id.a_ma_asseret_yami_teshuva_1);
        a_ma_shmona_esrei_2 = getView().findViewById(R.id.a_ma_shmona_esrei_2);
        a_ma_morid_hatal = getView().findViewById(R.id.a_ma_morid_hatal);
        a_ma_mashiv_harauch = getView().findViewById(R.id.a_ma_mashiv_harauch);
        a_ma_shmona_esrei_3 = getView().findViewById(R.id.a_ma_shmona_esrei_3);
        a_ma_asseret_yami_teshuva_2 = getView().findViewById(R.id.a_ma_asseret_yami_teshuva_2);
        a_ma_shmona_esrei_4 = getView().findViewById(R.id.a_ma_shmona_esrei_4);
        a_ma_hakel_hakadosh = getView().findViewById(R.id.a_ma_hakel_hakadosh);
        a_ma_hamelech_hakadosh = getView().findViewById(R.id.a_ma_hamelech_hakadosh);
        a_ma_shmona_esrei_5 = getView().findViewById(R.id.a_ma_shmona_esrei_5);
        a_ma_veten_beracha = getView().findViewById(R.id.a_ma_veten_beracha);
        a_ma_tal_umatar = getView().findViewById(R.id.a_ma_tal_umatar);
        a_ma_shmona_esrei_6 = getView().findViewById(R.id.a_ma_shmona_esrei_6);
        a_ma_melech_ohev = getView().findViewById(R.id.a_ma_melech_ohev);
        a_ma_hamelech_hamishpat = getView().findViewById(R.id.a_ma_hamelech_hamishpat);
        a_ma_shmona_esrei_7 = getView().findViewById(R.id.a_ma_shmona_esrei_7);
        a_ma_rosh_chodesh = getView().findViewById(R.id.a_ma_rosh_chodesh);
        a_ma_pesach = getView().findViewById(R.id.a_ma_pesach);
        a_ma_sukkos = getView().findViewById(R.id.a_ma_sukkos);
        a_ma_shmona_esrei_8 = getView().findViewById(R.id.a_ma_shmona_esrei_8);
        a_ma_chanukah = getView().findViewById(R.id.a_ma_chanukah);
        a_ma_purim = getView().findViewById(R.id.a_ma_purim);
        a_ma_shmona_esrei_9 = getView().findViewById(R.id.a_ma_shmona_esrei_9);
        a_ma_asseret_yami_teshuva_3 = getView().findViewById(R.id.a_ma_asseret_yami_teshuva_3);
        a_ma_shmona_esrei_10 = getView().findViewById(R.id.a_ma_shmona_esrei_10);
        a_ma_asseret_yami_teshuva_4 = getView().findViewById(R.id.a_ma_asseret_yami_teshuva_4);
        a_ma_shmona_esrei_11 = getView().findViewById(R.id.a_ma_shmona_esrei_11);
        a_ma_asseret_yami_teshuva_end = getView().findViewById(R.id.a_ma_asseret_yami_teshuva_end);
        a_ma_shmona_esrei_end = getView().findViewById(R.id.a_ma_shmona_esrei_end);
        a_ma_sefiras_haomer_1 = getView().findViewById(R.id.a_ma_sefiras_haomer_1);
        a_ma_sefiras_haomer_2 = getView().findViewById(R.id.a_ma_sefiras_haomer_2);
        a_ma_sefiras_haomer_3 = getView().findViewById(R.id.a_ma_sefiras_haomer_3);
        a_ma_maariv_2 = getView().findViewById(R.id.a_ma_maariv_2);
        a_ma_ledovid = getView().findViewById(R.id.a_ma_ledovid);

        DocumentReference docref = db.collection("ashkenaz").document("maariv");
        docref.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error != null) {
                    return;
                }
                assert value != null;
                a_ma_maariv_1.setText(Html.fromHtml(requireNonNull(value.getString("maariv_1")).replaceAll("_b", "<br/>")));
                a_ma_shmona_esrei_1.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_1")).replaceAll("_b", "<br/>")));
                a_ma_asseret_yami_teshuva_1.setText(Html.fromHtml(requireNonNull(value.getString("asseret_yami_teshuva_1")).replaceAll("_b", "<br/>")));
                a_ma_shmona_esrei_2.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_2")).replaceAll("_b", "<br/>")));
                a_ma_morid_hatal.setText(Html.fromHtml(requireNonNull(value.getString("morid_hatal")).replaceAll("_b", "<br/>")));
                a_ma_mashiv_harauch.setText(Html.fromHtml(requireNonNull(value.getString("mashiv_harauch")).replaceAll("_b", "<br/>")));
                a_ma_shmona_esrei_3.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_3")).replaceAll("_b", "<br/>")));
                a_ma_asseret_yami_teshuva_2.setText(Html.fromHtml(requireNonNull(value.getString("asseret_yami_teshuva_2")).replaceAll("_b", "<br/>")));
                a_ma_shmona_esrei_4.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_4")).replaceAll("_b", "<br/>")));
                a_ma_hakel_hakadosh.setText(Html.fromHtml(requireNonNull(value.getString("hakel_hakadosh")).replaceAll("_b", "<br/>")));
                a_ma_hamelech_hakadosh.setText(Html.fromHtml(requireNonNull(value.getString("hamelech_hakadosh")).replaceAll("_b", "<br/>")));
                a_ma_shmona_esrei_5.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_5")).replaceAll("_b", "<br/>")));
                a_ma_veten_beracha.setText(Html.fromHtml(requireNonNull(value.getString("veten_beracha")).replaceAll("_b", "<br/>")));
                a_ma_tal_umatar.setText(Html.fromHtml(requireNonNull(value.getString("tal_umatar")).replaceAll("_b", "<br/>")));
                a_ma_shmona_esrei_6.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_6")).replaceAll("_b", "<br/>")));
                a_ma_melech_ohev.setText(Html.fromHtml(requireNonNull(value.getString("melech_ohev")).replaceAll("_b", "<br/>")));
                a_ma_hamelech_hamishpat.setText(Html.fromHtml(requireNonNull(value.getString("hamelech_hamishpat")).replaceAll("_b", "<br/>")));
                a_ma_shmona_esrei_7.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_7")).replaceAll("_b", "<br/>")));
                a_ma_rosh_chodesh.setText(Html.fromHtml(requireNonNull(value.getString("rosh_chodesh")).replaceAll("_b", "<br/>")));
                a_ma_pesach.setText(Html.fromHtml(requireNonNull(value.getString("pesach")).replaceAll("_b", "<br/>")));
                a_ma_sukkos.setText(Html.fromHtml(requireNonNull(value.getString("sukkos")).replaceAll("_b", "<br/>")));
                a_ma_shmona_esrei_8.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_8")).replaceAll("_b", "<br/>")));
                a_ma_chanukah.setText(Html.fromHtml(requireNonNull(value.getString("chanukah")).replaceAll("_b", "<br/>")));
                a_ma_purim.setText(Html.fromHtml(requireNonNull(value.getString("purim")).replaceAll("_b", "<br/>")));
                a_ma_shmona_esrei_9.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_9")).replaceAll("_b", "<br/>")));
                a_ma_asseret_yami_teshuva_3.setText(Html.fromHtml(requireNonNull(value.getString("asseret_yami_teshuva_3")).replaceAll("_b", "<br/>")));
                a_ma_shmona_esrei_10.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_10")).replaceAll("_b", "<br/>")));
                a_ma_asseret_yami_teshuva_4.setText(Html.fromHtml(requireNonNull(value.getString("asseret_yami_teshuva_4")).replaceAll("_b", "<br/>")));
                a_ma_shmona_esrei_11.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_11")).replaceAll("_b", "<br/>")));
                a_ma_asseret_yami_teshuva_end.setText(Html.fromHtml(requireNonNull(value.getString("asseret_yami_teshuva_end")).replaceAll("_b", "<br/>")));
                a_ma_shmona_esrei_end.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_end")).replaceAll("_b", "<br/>")));
                a_ma_sefiras_haomer_1.setText(Html.fromHtml(requireNonNull(value.getString("sefiras_haomer_1")).replaceAll("_b", "<br/>")));
                a_ma_sefiras_haomer_3.setText(Html.fromHtml(requireNonNull(value.getString("sefiras_haomer_3")).replaceAll("_b", "<br/>")));
                a_ma_maariv_2.setText(Html.fromHtml(requireNonNull(value.getString("maariv_2")).replaceAll("_b", "<br/>")));
                a_ma_ledovid.setText(Html.fromHtml(requireNonNull(value.getString("ledovid")).replaceAll("_b", "<br/>")));
            }
        });


    }

    private void omerDay() {
        omerCount = getResources().getStringArray(R.array.a_ma_sefiras_haomer_2);


        long diff = currentDate.getTimeInMillis() - Hollidays.omer_start.get(1).getTimeInMillis();
        long unit;
        unit = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);


        if (unit > 48 || unit < 0){
            a_ma_sefiras_haomer_1.setVisibility(View.VISIBLE);
            a_ma_sefiras_haomer_2.setText(Html.fromHtml(omerCount[(int) unit].replaceAll("_b", "<br/>")));
            a_ma_sefiras_haomer_2.setVisibility(View.VISIBLE);
            a_ma_sefiras_haomer_3.setVisibility(View.VISIBLE);
        }
        else {
            a_ma_sefiras_haomer_1.setVisibility(View.GONE);
            a_ma_sefiras_haomer_2.setVisibility(View.GONE);
            a_ma_sefiras_haomer_3.setVisibility(View.GONE);
        }
    }

    private void AYTeshuva() {
        for (int i = 0; i < Hollidays.ayt.size(); i++) {
            if (currentDate.getTime().equals(Hollidays.ayt.get(i).getTime())){

                a_ma_asseret_yami_teshuva_1.setVisibility(View.VISIBLE);
                a_ma_asseret_yami_teshuva_2.setVisibility(View.VISIBLE);
                a_ma_asseret_yami_teshuva_3.setVisibility(View.VISIBLE);
                a_ma_asseret_yami_teshuva_4.setVisibility(View.VISIBLE);
                a_ma_asseret_yami_teshuva_end.setVisibility(View.VISIBLE);
                a_ma_ledovid.setVisibility(View.VISIBLE);
                a_ma_hamelech_hakadosh.setVisibility(View.VISIBLE);
                a_ma_hamelech_hamishpat.setVisibility(View.VISIBLE);

            }
            else {
                a_ma_hakel_hakadosh.setVisibility(View.VISIBLE);
                a_ma_melech_ohev.setVisibility(View.VISIBLE);
            }
        }
    }

}