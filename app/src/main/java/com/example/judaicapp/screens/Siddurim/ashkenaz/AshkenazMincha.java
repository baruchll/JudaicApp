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

import com.example.judaicapp.R;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import java.util.concurrent.Executor;


public class AshkenazMincha extends Fragment {
    private TextView a_m_ashrei, a_m_shmona_esrei_1,a_m_ayt_1,a_m_shmona_esrei_2,a_m_morid_hatal,a_m_mashiv_harauch,
            a_m_shmona_esrei_3,a_m_ayt_2,a_m_shmona_esrei_4,a_m_hakel_hakadosh,a_m_hamelech_hakadosh,
            a_m_shmona_esrei_5,a_m_veten_beracha,a_m_tal_umatar,a_m_shmona_esrei_6,a_m_melech_ohev,
            a_m_hamelech_hamishpat,a_m_shmona_esrei_7,a_m_tisha_baav,a_m_shmona_esrei_8,a_m_fast_day,
            a_m_shmona_esrei_9,a_m_rosh_chodesh,a_m_pesach,a_m_sukkos,a_m_shmona_esrei_10,a_m_chanukah,
            a_m_purim,a_m_shmona_esrei_11,a_m_ayt_3,a_m_shmona_esrei_12,a_m_ayt_4,a_m_shmona_esrei_13,
            a_m_ayt_end,a_m_shmona_esrei_end,a_m_chazarat_hashatz_1,a_m_ch_ayt_1,a_m_chazarat_hashatz_2,
            a_m_ch_morid_hatal,a_m_ch_mashiv_harauch,a_m_chazarat_hashatz_3,a_m_ch_ayt_2,a_m_chazarat_hashatz_4,
            a_m_ch_hakel_hakadosh,a_m_ch_hamelech_hakadosh,a_m_chazarat_hashatz_5,a_m_ch_fast_day,
            a_m_chazarat_hashatz_6,a_m_ch_veten_beracha,a_m_ch_tal_umatar,a_m_chazarat_hashatz_7,a_m_ch_melech_ohev,
            a_m_ch_hamelech_hamishpat,a_m_chazarat_hashatz_8,a_m_ch_tisha_baav,a_m_chazarat_hashatz_9,
            a_m_ch_rosh_chodesh,a_m_ch_pesach,a_m_ch_sukkos,a_m_chazarat_hashatz_10,a_m_ch_chanukah,
            a_m_ch_purim,a_m_chazarat_hashatz_11,a_m_ch_ayt_3,a_m_chazarat_hashatz_12,a_m_ch_ayt_4,
            a_m_chazarat_hashatz_13,a_m_avinu_malkainu_fast_day,a_m_avinu_malkainu_ayt,a_m_tachanun,a_m_alainu;

    FirebaseFirestore db = FirebaseFirestore.getInstance();




    public AshkenazMincha() {
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_ashkenaz_mincha, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        minchaInit();
    }



    private void minchaInit() {
        a_m_ashrei = getView().findViewById(R.id.a_m_ashrei);
        a_m_shmona_esrei_1 = getView().findViewById(R.id.a_m_shmona_esrei_1);
        a_m_ayt_1 = getView().findViewById(R.id.a_m_ayt_1);
        a_m_shmona_esrei_2 = getView().findViewById(R.id.a_m_shmona_esrei_2);
        a_m_morid_hatal = getView().findViewById(R.id.a_m_morid_hatal);
        a_m_mashiv_harauch = getView().findViewById(R.id.a_m_mashiv_harauch);
        a_m_shmona_esrei_3 = getView().findViewById(R.id.a_m_shmona_esrei_3);
        a_m_ayt_2 = getView().findViewById(R.id.a_m_ayt_2);
        a_m_shmona_esrei_4 = getView().findViewById(R.id.a_m_shmona_esrei_4);
        a_m_hakel_hakadosh = getView().findViewById(R.id.a_m_hakel_hakadosh);
        a_m_hamelech_hakadosh = getView().findViewById(R.id.a_m_hamelech_hakadosh);
        a_m_shmona_esrei_5 = getView().findViewById(R.id.a_m_shmona_esrei_5);
        a_m_veten_beracha = getView().findViewById(R.id.a_m_veten_beracha);
        a_m_tal_umatar = getView().findViewById(R.id.a_m_tal_umatar);
        a_m_shmona_esrei_6 = getView().findViewById(R.id.a_m_shmona_esrei_6);
        a_m_melech_ohev = getView().findViewById(R.id.a_m_melech_ohev);
        a_m_hamelech_hamishpat = getView().findViewById(R.id.a_m_hamelech_hamishpat);
        a_m_shmona_esrei_7 = getView().findViewById(R.id.a_m_shmona_esrei_7);
        a_m_tisha_baav = getView().findViewById(R.id.a_m_tisha_baav);
        a_m_shmona_esrei_8 = getView().findViewById(R.id.a_m_shmona_esrei_8);
        a_m_fast_day = getView().findViewById(R.id.a_m_fast_day);
        a_m_shmona_esrei_9 = getView().findViewById(R.id.a_m_shmona_esrei_9);
        a_m_rosh_chodesh = getView().findViewById(R.id.a_m_rosh_chodesh);
        a_m_pesach = getView().findViewById(R.id.a_m_pesach);
        a_m_sukkos = getView().findViewById(R.id.a_m_sukkos);
        a_m_shmona_esrei_10 = getView().findViewById(R.id.a_m_shmona_esrei_10);
        a_m_chanukah = getView().findViewById(R.id.a_m_chanukah);
        a_m_purim = getView().findViewById(R.id.a_m_purim);
        a_m_shmona_esrei_11 = getView().findViewById(R.id.a_m_shmona_esrei_11);
        a_m_ayt_3 = getView().findViewById(R.id.a_m_ayt_3);
        a_m_shmona_esrei_12 = getView().findViewById(R.id.a_m_shmona_esrei_12);
        a_m_ayt_4 = getView().findViewById(R.id.a_m_ayt_4);
        a_m_shmona_esrei_13 = getView().findViewById(R.id.a_m_shmona_esrei_13);
        a_m_ayt_end = getView().findViewById(R.id.a_m_ayt_end);
        a_m_shmona_esrei_end = getView().findViewById(R.id.a_m_shmona_esrei_end);
        a_m_chazarat_hashatz_1 = getView().findViewById(R.id.a_m_chazarat_hashatz_1);
        a_m_ch_ayt_1 = getView().findViewById(R.id.a_m_ch_ayt_1);
        a_m_chazarat_hashatz_2 = getView().findViewById(R.id.a_m_chazarat_hashatz_2);
        a_m_ch_morid_hatal = getView().findViewById(R.id.a_m_ch_morid_hatal);
        a_m_ch_mashiv_harauch = getView().findViewById(R.id.a_m_ch_mashiv_harauch);
        a_m_chazarat_hashatz_3 = getView().findViewById(R.id.a_m_chazarat_hashatz_3);
        a_m_ch_ayt_2 = getView().findViewById(R.id.a_m_ch_ayt_2);
        a_m_chazarat_hashatz_4 = getView().findViewById(R.id.a_m_chazarat_hashatz_4);
        a_m_ch_hakel_hakadosh = getView().findViewById(R.id.a_m_ch_hakel_hakadosh);
        a_m_ch_hamelech_hakadosh = getView().findViewById(R.id.a_m_ch_hamelech_hakadosh);
        a_m_chazarat_hashatz_5 = getView().findViewById(R.id.a_m_chazarat_hashatz_5);
        a_m_ch_fast_day = getView().findViewById(R.id.a_m_ch_fast_day);
        a_m_chazarat_hashatz_6 = getView().findViewById(R.id.a_m_chazarat_hashatz_6);
        a_m_ch_veten_beracha = getView().findViewById(R.id.a_m_ch_veten_beracha);
        a_m_ch_tal_umatar = getView().findViewById(R.id.a_m_ch_tal_umatar);
        a_m_chazarat_hashatz_7 = getView().findViewById(R.id.a_m_chazarat_hashatz_7);
        a_m_ch_melech_ohev = getView().findViewById(R.id.a_m_ch_melech_ohev);
        a_m_ch_hamelech_hamishpat = getView().findViewById(R.id.a_m_ch_hamelech_hamishpat);
        a_m_chazarat_hashatz_8 = getView().findViewById(R.id.a_m_chazarat_hashatz_8);
        a_m_ch_tisha_baav = getView().findViewById(R.id.a_m_ch_tisha_baav);
        a_m_chazarat_hashatz_9 = getView().findViewById(R.id.a_m_chazarat_hashatz_9);
        a_m_ch_rosh_chodesh = getView().findViewById(R.id.a_m_ch_rosh_chodesh);
        a_m_ch_pesach = getView().findViewById(R.id.a_m_ch_pesach);
        a_m_ch_sukkos = getView().findViewById(R.id.a_m_ch_sukkos);
        a_m_chazarat_hashatz_10 = getView().findViewById(R.id.a_m_chazarat_hashatz_10);
        a_m_ch_chanukah = getView().findViewById(R.id.a_m_ch_chanukah);
        a_m_ch_purim = getView().findViewById(R.id.a_m_ch_purim);
        a_m_chazarat_hashatz_11 = getView().findViewById(R.id.a_m_chazarat_hashatz_11);
        a_m_ch_ayt_3 = getView().findViewById(R.id.a_m_ch_ayt_3);
        a_m_chazarat_hashatz_12 = getView().findViewById(R.id.a_m_chazarat_hashatz_12);
        a_m_ch_ayt_4 = getView().findViewById(R.id.a_m_ch_ayt_4);
        a_m_chazarat_hashatz_13 = getView().findViewById(R.id.a_m_chazarat_hashatz_13);
        a_m_avinu_malkainu_fast_day = getView().findViewById(R.id.a_m_avinu_malkainu_fast_day);
        a_m_avinu_malkainu_ayt = getView().findViewById(R.id.a_m_avinu_malkainu_ayt);
        a_m_tachanun = getView().findViewById(R.id.a_m_tachanun);
        a_m_alainu = getView().findViewById(R.id.a_m_alainu);

        DocumentReference docref = db.collection("ashkenaz").document("mincha");
        docref.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error != null) {
                    return;
                }
                assert value != null;
                a_m_alainu.setText(Html.fromHtml(requireNonNull(value.getString("alainu")).replaceAll("_b", "<br/>")));
                a_m_ashrei.setText(Html.fromHtml(requireNonNull(requireNonNull(value.getString("ashrei")).replaceAll("_b", "<br/>"))));
                a_m_avinu_malkainu_ayt.setText(Html.fromHtml(requireNonNull(value.getString("avinu_malkainu_ayt")).replaceAll("_b", "<br/>")));
                a_m_avinu_malkainu_fast_day.setText(Html.fromHtml(requireNonNull(value.getString("avinu_malkainu_fast_day")).replaceAll("_b", "<br/>")));
                a_m_ayt_1.setText(Html.fromHtml(requireNonNull(value.getString("ayt_1")).replaceAll("_b", "<br/>")));
                a_m_ayt_2.setText(Html.fromHtml(requireNonNull(value.getString("ayt_2")).replaceAll("_b", "<br/>")));
                a_m_ayt_3.setText(Html.fromHtml(requireNonNull(value.getString("ayt_3")).replaceAll("_b", "<br/>")));
                a_m_ayt_4.setText(Html.fromHtml(requireNonNull(value.getString("ayt_4")).replaceAll("_b", "<br/>")));
                a_m_ayt_end.setText(Html.fromHtml(requireNonNull(value.getString("ayt_end")).replaceAll("_b", "<br/>")));
                a_m_ch_ayt_1.setText(Html.fromHtml(requireNonNull(value.getString("ch_ayt_1")).replaceAll("_b", "<br/>")));
                a_m_ch_ayt_2.setText(Html.fromHtml(requireNonNull(value.getString("ch_ayt_2")).replaceAll("_b", "<br/>")));
                a_m_ch_ayt_3.setText(Html.fromHtml(requireNonNull(value.getString("ch_ayt_3")).replaceAll("_b", "<br/>")));
                a_m_ch_ayt_4.setText(Html.fromHtml(requireNonNull(value.getString("ch_ayt_4")).replaceAll("_b", "<br/>")));
                a_m_ch_chanukah.setText(Html.fromHtml(requireNonNull(value.getString("ch_chanukah")).replaceAll("_b", "<br/>")));
                a_m_ch_fast_day.setText(Html.fromHtml(requireNonNull(value.getString("ch_fast_day")).replaceAll("_b", "<br/>")));
                a_m_ch_hakel_hakadosh.setText(Html.fromHtml(requireNonNull(value.getString("ch_hakel_hakadosh")).replaceAll("_b", "<br/>")));
                a_m_ch_hamelech_hakadosh.setText(Html.fromHtml(requireNonNull(value.getString("ch_hamelech_hakadosh")).replaceAll("_b", "<br/>")));
                a_m_ch_hamelech_hamishpat.setText(Html.fromHtml(requireNonNull(value.getString("ch_hamelech_hamishpat")).replaceAll("_b", "<br/>")));
                a_m_ch_mashiv_harauch.setText(Html.fromHtml(requireNonNull(value.getString("ch_mashiv_harauch")).replaceAll("_b", "<br/>")));
                a_m_ch_melech_ohev.setText(Html.fromHtml(requireNonNull(value.getString("ch_melech_ohev")).replaceAll("_b", "<br/>")));
                a_m_ch_morid_hatal.setText(Html.fromHtml(requireNonNull(value.getString("ch_morid_hatal")).replaceAll("_b", "<br/>")));
                a_m_ch_pesach.setText(Html.fromHtml(requireNonNull(value.getString("ch_pesach")).replaceAll("_b", "<br/>")));
                a_m_ch_purim.setText(Html.fromHtml(requireNonNull(value.getString("ch_purim")).replaceAll("_b", "<br/>")));
                a_m_ch_rosh_chodesh.setText(Html.fromHtml(requireNonNull(value.getString("ch_rosh_chodesh")).replaceAll("_b", "<br/>")));
                a_m_ch_sukkos.setText(Html.fromHtml(requireNonNull(value.getString("ch_sukkos")).replaceAll("_b", "<br/>")));
                a_m_ch_tal_umatar.setText(Html.fromHtml(requireNonNull(value.getString("ch_tal_umatar")).replaceAll("_b", "<br/>")));
                a_m_ch_tisha_baav.setText(Html.fromHtml(requireNonNull(value.getString("ch_tisha_baav")).replaceAll("_b", "<br/>")));
                a_m_ch_veten_beracha.setText(Html.fromHtml(requireNonNull(value.getString("ch_veten_beracha")).replaceAll("_b", "<br/>")));
                a_m_chanukah.setText(Html.fromHtml(requireNonNull(value.getString("chanukah")).replaceAll("_b", "<br/>")));
                a_m_chazarat_hashatz_1.setText(Html.fromHtml(requireNonNull(value.getString("chazarat_hashatz_1")).replaceAll("_b", "<br/>")));
                a_m_chazarat_hashatz_2.setText(Html.fromHtml(requireNonNull(value.getString("chazarat_hashatz_2")).replaceAll("_b", "<br/>")));
                a_m_chazarat_hashatz_3.setText(Html.fromHtml(requireNonNull(value.getString("chazarat_hashatz_3")).replaceAll("_b", "<br/>")));
                a_m_chazarat_hashatz_4.setText(Html.fromHtml(requireNonNull(value.getString("chazarat_hashatz_4")).replaceAll("_b", "<br/>")));
                a_m_chazarat_hashatz_5.setText(Html.fromHtml(requireNonNull(value.getString("chazarat_hashatz_5")).replaceAll("_b", "<br/>")));
                a_m_chazarat_hashatz_6.setText(Html.fromHtml(requireNonNull(value.getString("chazarat_hashatz_6")).replaceAll("_b", "<br/>")));
                a_m_chazarat_hashatz_7.setText(Html.fromHtml(requireNonNull(value.getString("chazarat_hashatz_7")).replaceAll("_b", "<br/>")));
                a_m_chazarat_hashatz_8.setText(Html.fromHtml(requireNonNull(value.getString("chazarat_hashatz_8")).replaceAll("_b", "<br/>")));
                a_m_chazarat_hashatz_9.setText(Html.fromHtml(requireNonNull(value.getString("chazarat_hashatz_9")).replaceAll("_b", "<br/>")));
                a_m_chazarat_hashatz_10.setText(Html.fromHtml(requireNonNull(value.getString("chazarat_hashatz_10")).replaceAll("_b", "<br/>")));
                a_m_chazarat_hashatz_11.setText(Html.fromHtml(requireNonNull(value.getString("chazarat_hashatz_11")).replaceAll("_b", "<br/>")));
                a_m_chazarat_hashatz_12.setText(Html.fromHtml(requireNonNull(value.getString("chazarat_hashatz_12")).replaceAll("_b", "<br/>")));
                a_m_chazarat_hashatz_13.setText(Html.fromHtml(requireNonNull(value.getString("chazarat_hashatz_13")).replaceAll("_b", "<br/>")));
                a_m_fast_day.setText(Html.fromHtml(requireNonNull(value.getString("fast_day")).replaceAll("_b", "<br/>")));
                a_m_hakel_hakadosh.setText(Html.fromHtml(requireNonNull(value.getString("hakel_hakadosh")).replaceAll("_b", "<br/>")));
                a_m_hamelech_hakadosh.setText(Html.fromHtml(requireNonNull(value.getString("hamelech_hakadosh")).replaceAll("_b", "<br/>")));
                a_m_hamelech_hamishpat.setText(Html.fromHtml(requireNonNull(value.getString("hamelech_hamishpat")).replaceAll("_b", "<br/>")));
                a_m_mashiv_harauch.setText(Html.fromHtml(requireNonNull(value.getString("mashiv_haruach")).replaceAll("_b", "<br/>")));
                a_m_melech_ohev.setText(Html.fromHtml(requireNonNull(value.getString("melech_ohev")).replaceAll("_b", "<br/>")));
                a_m_morid_hatal.setText(Html.fromHtml(requireNonNull(value.getString("morid_hatal")).replaceAll("_b", "<br/>")));
                a_m_pesach.setText(Html.fromHtml(requireNonNull(value.getString("pesach")).replaceAll("_b", "<br/>")));
                a_m_purim.setText(Html.fromHtml(requireNonNull(value.getString("purim")).replaceAll("_b", "<br/>")));
                a_m_rosh_chodesh.setText(Html.fromHtml(requireNonNull(value.getString("rosh_chodesh")).replaceAll("_b", "<br/>")));
                a_m_shmona_esrei_1.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_1")).replaceAll("_b", "<br/>")));
                a_m_shmona_esrei_2.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_2")).replaceAll("_b", "<br/>")));
                a_m_shmona_esrei_3.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_3")).replaceAll("_b", "<br/>")));
                a_m_shmona_esrei_4.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_4")).replaceAll("_b", "<br/>")));
                a_m_shmona_esrei_5.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_5")).replaceAll("_b", "<br/>")));
                a_m_shmona_esrei_6.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_6")).replaceAll("_b", "<br/>")));
                a_m_shmona_esrei_7.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_7")).replaceAll("_b", "<br/>")));
                a_m_shmona_esrei_8.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_8")).replaceAll("_b", "<br/>")));
                a_m_shmona_esrei_9.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_9")).replaceAll("_b", "<br/>")));
                a_m_shmona_esrei_10.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_10")).replaceAll("_b", "<br/>")));
                a_m_shmona_esrei_11.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_11")).replaceAll("_b", "<br/>")));
                a_m_shmona_esrei_12.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_12")).replaceAll("_b", "<br/>")));
                a_m_shmona_esrei_13.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_13")).replaceAll("_b", "<br/>")));
                a_m_shmona_esrei_end.setText(Html.fromHtml(requireNonNull(value.getString("shmona_esrei_end")).replaceAll("_b", "<br/>")));
                a_m_sukkos.setText(Html.fromHtml(requireNonNull(value.getString("sukkos")).replaceAll("_b", "<br/>")));
                a_m_tachanun.setText(Html.fromHtml(requireNonNull(value.getString("tachanun")).replaceAll("_b", "<br/>")));
                a_m_tal_umatar.setText(Html.fromHtml(requireNonNull(value.getString("tal_umatar")).replaceAll("_b", "<br/>")));
                a_m_tisha_baav.setText(Html.fromHtml(requireNonNull(value.getString("tisha_baav")).replaceAll("_b", "<br/>")));
                a_m_veten_beracha.setText(Html.fromHtml(requireNonNull(value.getString("veten_beracha")).replaceAll("_b", "<br/>")));


            }
        });
    }

}