package com.example.judaicapp.screens.Siddurim.ashkenaz;

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

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
import java.util.concurrent.TimeUnit;

public class AshkenazShachris extends Fragment {
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    Calendar currentDate = new GregorianCalendar();
    long sukkosDiff;
    long sukkosunit = TimeUnit.DAYS.convert(sukkosDiff, TimeUnit.MILLISECONDS);


    private TextView a_s_hachana, a_s_korbanos, a_s_korbanos_2, a_s_puskei_dezimra, a_s_ashrei,
            a_s_shirat_hayam, a_s_yishtabach, a_s_shema, a_s_shmona_esrei_1, a_s_asseret_yami_teshuva_1,
            a_s_shmona_esrei_2, a_s_morid_hatal, a_s_mashiv_harauch, a_s_shmona_esrei_3, a_s_asseret_yami_teshuva_2,
            a_s_shmona_esrei_4, a_s_hakel_hakadosh, a_s_hamelech_hakadosh, a_s_shmona_esrei_5, a_s_veten_beracha,
            a_s_tal_umatar, a_s_shmona_esrei_6, a_s_melech_ohev, a_s_hamelech_hamishpat, a_s_shmona_esrei_7,
            a_s_rosh_chodesh, a_s_pesach, a_s_sukkos, a_s_shmona_esrei_8, a_s_chanukah, a_s_purim, a_s_shmona_esrei_9,
            a_s_asseret_yami_teshuva_3, a_s_shmona_esrei_10, a_s_asseret_yami_teshuva_4, a_s_shmona_esrei_11, a_s_asseret_yami_teshuva_end,
            a_s_shmona_esrei_end;

    private TextView a_s_chazarat_hashatz_1, a_s_ch_ayt_1, a_s_chazarat_hashatz_2, a_s_ch_morid_hatal, a_s_ch_mashiv_harauch, a_s_chazarat_hashatz_3,
            a_s_ch_ayt_2, a_s_chazarat_hashatz_4, a_s_ch_hakel_hakadosh, a_s_ch_hamelech_hakadosh, a_s_chazarat_hashatz_5, a_s_ch_fast_day,
            a_s_chazarat_hashatz_6, a_s_ch_veten_beracha, a_s_ch_tal_umatar, a_s_chazarat_hashatz_7, a_s_ch_melech_ohev, a_s_ch_hamelech_hamishpat,
            a_s_chazarat_hashatz_8, a_s_ch_rosh_chodesh, a_s_ch_pesach, a_s_ch_sukkos, a_s_chazarat_hashatz_9, a_s_ch_chanukah, a_s_ch_purim,
            a_s_chazarat_hashatz_10, a_s_ch_ayt_3, a_s_chazarat_hashatz_11, a_s_ch_ayt_4, a_s_chazarat_hashatz_12, a_s_netilas_lulav, a_s_full_hallel,
            a_s_half_hallel, a_s_kaddish_after_hallel, a_s_kaddish_after_hallel_chanukah, a_s_tachanun_1, a_s_avinu_malkainu_fast_day, a_s_avinu_malkainu_ayt,
            a_s_tachanun_for_mon_and_thurs, a_s_tachanun_2, a_s_kriat_hatorah, a_s_kriat_hatorah_mon_and_thurs, a_s_hachnasat_sefer_torah, a_s_ashrei_2;

    private TextView a_s_lamnatzeach, a_s_uva_letzion, a_s_mussaf_shalosh_regalim_1, a_s_mussaf_shalosh_regalim_morid_hatal, a_s_mussaf_shalosh_regalim_mashiv_harauch,
            a_s_mussaf_shalosh_regalim_2, a_s_mussaf_shalosh_regalim_pesach_1, a_s_mussaf_shalosh_regalim_sukkos_1, a_s_mussaf_shalosh_regalim_3,
            a_s_mussaf_shalosh_regalim_pesach_2, a_s_mussaf_shalosh_regalim_sukkos_2, a_s_mussaf_shalosh_regalim_pesach_end, a_s_mussaf_shalosh_regalim_sukkos_chol_hamoed_1,
            a_s_mussaf_shalosh_regalim_sukkos_chol_hamoed_2, a_s_mussaf_shalosh_regalim_sukkos_chol_hamoed_3, a_s_mussaf_shalosh_regalim_sukkos_chol_hamoed_4,
            a_s_mussaf_shalosh_regalim_sukkos_chol_hamoed_5, a_s_mussaf_shalosh_regalim_sukkos_chol_hamoed_hoshana_raba, a_s_mussaf_shalosh_regalim_4,
            a_s_ch_mussaf_shalosh_regalim_1, a_s_ch_mussaf_shalosh_regalim_morid_hatal, a_s_ch_mussaf_shalosh_regalim_mashiv_harauch, a_s_ch_mussaf_shalosh_regalim_2,
            a_s_ch_mussaf_shalosh_regalim_pesach_1, a_s_ch_mussaf_shalosh_regalim_sukkos_1, a_s_ch_mussaf_shalosh_regalim_3, a_s_ch_mussaf_shalosh_regalim_pesach_2,
            a_s_ch_mussaf_shalosh_regalim_sukkos_2, a_s_ch_mussaf_shalosh_regalim_pesach_end, a_s_ch_mussaf_shalosh_regalim_sukkos_chol_hamoed_1, a_s_ch_mussaf_shalosh_regalim_sukkos_chol_hamoed_2,
            a_s_ch_mussaf_shalosh_regalim_sukkos_chol_hamoed_3, a_s_ch_mussaf_shalosh_regalim_sukkos_chol_hamoed_4, a_s_ch_mussaf_shalosh_regalim_sukkos_chol_hamoed_5,
            a_s_ch_mussaf_shalosh_regalim_4, a_s_mussaf_rosh_chodesh_1, a_s_morid_hatal_mussaf, a_s_mashiv_harauch_mussaf, a_s_mussaf_rosh_chodesh_2,
            a_s_mussaf_chanukah, a_s_mussaf_rosh_chodesh_3, a_s_ch_mussaf_rosh_chodesh_1, a_s_ch_morid_hatal_mussaf, a_s_ch_mashiv_harauch_mussaf, a_s_ch_mussaf_rosh_chodesh_2,
            a_s_ch_mussaf_chanukah, a_s_ch_mussaf_rosh_chodesh_3, a_s_end_of_davening_1, a_s_shir_shel_yom_sunday, a_s_shir_shel_yom_monday, a_s_shir_shel_yom_tuesday,
            a_s_shir_shel_yom_wednesday, a_s_shir_shel_yom_thursday, a_s_shir_shel_yom_friday, a_s_borchi_nafshi, a_s_ledovid, a_s_end_of_davening_2, a_s_tefilot_nosafot;






    public AshkenazShachris() {
        // Required empty public constructor
    }






    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ashkenaz_shachris, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        currentDate.clear();
        currentDate.set(Calendar.getInstance().get(Calendar.YEAR), Calendar.getInstance().get(Calendar.MONTH), Calendar.getInstance().get(Calendar.DATE));
        for (int i = 0; i < Hollidays.sukkos.size(); i++) {
            sukkosDiff = currentDate.getTimeInMillis() - Hollidays.sukkos.get(i).getTimeInMillis();

        }

        shachrisInit();
        moridHatalandMashiv();
        roshChodesh();
        purim();
        chanukah();
        shushan_purim();
        fastDays();
        pesach();
        sukkos();

        vetenOrTal();
        AYTeshuva();
    }




    private void holiday() {
        a_s_half_hallel.setVisibility(View.VISIBLE);
        a_s_kaddish_after_hallel.setVisibility(View.VISIBLE);
        a_s_tachanun_for_mon_and_thurs.setVisibility(View.GONE);
        a_s_tachanun_1.setVisibility(View.GONE);
        a_s_tachanun_2.setVisibility(View.GONE);
        a_s_kriat_hatorah.setVisibility(View.VISIBLE);
        a_s_hachnasat_sefer_torah.setVisibility(View.VISIBLE);

    }

    private void roshChodesh() {
        for (int i = 0; i < Hollidays.rosh_chodesh.size(); i++) {
            if (currentDate.getTime().equals(Hollidays.rosh_chodesh.get(i).getTime())){
                holiday();
                a_s_rosh_chodesh.setVisibility(View.VISIBLE);
                a_s_ch_rosh_chodesh.setVisibility(View.VISIBLE);
                a_s_mussaf_rosh_chodesh_1.setVisibility(View.VISIBLE);
                a_s_mussaf_rosh_chodesh_2.setVisibility(View.VISIBLE);
                a_s_mussaf_rosh_chodesh_3.setVisibility(View.VISIBLE);
                a_s_ch_mussaf_rosh_chodesh_1.setVisibility(View.VISIBLE);
                a_s_ch_mussaf_rosh_chodesh_2.setVisibility(View.VISIBLE);
                a_s_ch_mussaf_rosh_chodesh_3.setVisibility(View.VISIBLE);
                a_s_borchi_nafshi.setVisibility(View.VISIBLE);
            }
        }
    }

    private void purim(){
        for (int i = 0; i < Hollidays.purim.size(); i++) {
            if (currentDate.getTime().equals(Hollidays.purim.get(i).getTime())){
                holiday();
                a_s_purim.setVisibility(View.VISIBLE);
                a_s_ch_purim.setVisibility(View.VISIBLE);
            }
        }
    }

    private void shushan_purim(){
        for (int i = 0; i < Hollidays.shushan_purim.size(); i++) {
            if (currentDate.getTime().equals(Hollidays.shushan_purim.get(i).getTime())){
                holiday();
                a_s_purim.setVisibility(View.VISIBLE);
                a_s_ch_purim.setVisibility(View.VISIBLE);
            }
        }
    }

    private void chanukah(){
        for (int i = 0; i < Hollidays.chanukah.size(); i++) {
            if (currentDate.getTime().equals(Hollidays.chanukah.get(i).getTime())){

                holiday();
                a_s_half_hallel.setVisibility(View.GONE);
                a_s_full_hallel.setVisibility(View.VISIBLE);
                a_s_kaddish_after_hallel.setVisibility(View.GONE);
                a_s_chanukah.setVisibility(View.VISIBLE);
                a_s_ch_chanukah.setVisibility(View.VISIBLE);
                a_s_kaddish_after_hallel_chanukah.setVisibility(View.VISIBLE);
                if (currentDate.getTime().equals(Hollidays.rosh_chodesh.get(i).getTime())){
                    a_s_mussaf_chanukah.setVisibility(View.VISIBLE);
                    a_s_ch_mussaf_chanukah.setVisibility(View.VISIBLE);
                }
            }

        }
    }


    private void pesach() {
        for (int i = 0; i < Hollidays.pesach.size(); i++) {
            if (currentDate.getTime().equals(Hollidays.pesach.get(i).getTime())){
                holiday();
                a_s_pesach.setVisibility(View.VISIBLE);
                a_s_ch_pesach.setVisibility(View.VISIBLE);
                a_s_half_hallel.setVisibility(View.VISIBLE);
                a_s_mussaf_shalosh_regalim_1.setVisibility(View.VISIBLE);
                a_s_mussaf_shalosh_regalim_2.setVisibility(View.VISIBLE);
                a_s_mussaf_shalosh_regalim_pesach_1.setVisibility(View.VISIBLE);
                a_s_mussaf_shalosh_regalim_3.setVisibility(View.VISIBLE);
                a_s_mussaf_shalosh_regalim_pesach_2.setVisibility(View.VISIBLE);
                a_s_mussaf_shalosh_regalim_pesach_end.setVisibility(View.VISIBLE);
                a_s_mussaf_shalosh_regalim_4.setVisibility(View.VISIBLE);
                a_s_ch_mussaf_shalosh_regalim_1.setVisibility(View.VISIBLE);
                a_s_ch_mussaf_shalosh_regalim_2.setVisibility(View.VISIBLE);
                a_s_ch_mussaf_shalosh_regalim_pesach_1.setVisibility(View.VISIBLE);
                a_s_ch_mussaf_shalosh_regalim_3.setVisibility(View.VISIBLE);
                a_s_ch_mussaf_shalosh_regalim_pesach_2.setVisibility(View.VISIBLE);
                a_s_ch_mussaf_shalosh_regalim_pesach_end.setVisibility(View.VISIBLE);

            }

        }
    }

    private void fastDays() {
        for (int i = 0; i < Hollidays.asara_betevet.size(); i++) {
            if (currentDate.getTime().equals(Hollidays.asara_betevet.get(i).getTime())){
                a_s_ch_fast_day.setVisibility(View.VISIBLE);
                a_s_avinu_malkainu_fast_day.setVisibility(View.VISIBLE);
            }
        }
        for (int i = 0; i < Hollidays.shivaAsar_betammuz.size(); i++) {
            if (currentDate.getTime().equals(Hollidays.shivaAsar_betammuz.get(i).getTime())){
                a_s_ch_fast_day.setVisibility(View.VISIBLE);
                a_s_avinu_malkainu_fast_day.setVisibility(View.VISIBLE);
            }
        }
        for (int i = 0; i < Hollidays.taanis_ester.size(); i++) {
            if (currentDate.getTime().equals(Hollidays.taanis_ester.get(i).getTime())){
                a_s_ch_fast_day.setVisibility(View.VISIBLE);
                a_s_avinu_malkainu_fast_day.setVisibility(View.VISIBLE);
            }
        }
        for (int i = 0; i < Hollidays.tzom_gedalya.size(); i++) {
            if (currentDate.getTime().equals(Hollidays.tzom_gedalya.get(i).getTime())) {
                a_s_ch_fast_day.setVisibility(View.VISIBLE);
                a_s_avinu_malkainu_fast_day.setVisibility(View.VISIBLE);
            }
        }
    }


    private void otherSukkos() {
        holiday();
        a_s_half_hallel.setVisibility(View.GONE);
        a_s_full_hallel.setVisibility(View.VISIBLE);
        a_s_netilas_lulav.setVisibility(View.VISIBLE);
        a_s_sukkos.setVisibility(View.VISIBLE);
        a_s_ch_sukkos.setVisibility(View.VISIBLE);
        a_s_mussaf_shalosh_regalim_1.setVisibility(View.VISIBLE);
        a_s_mussaf_shalosh_regalim_2.setVisibility(View.VISIBLE);
        a_s_mussaf_shalosh_regalim_sukkos_1.setVisibility(View.VISIBLE);
        a_s_mussaf_shalosh_regalim_3.setVisibility(View.VISIBLE);
        a_s_mussaf_shalosh_regalim_sukkos_2.setVisibility(View.VISIBLE);
        a_s_mussaf_shalosh_regalim_4.setVisibility(View.VISIBLE);
        a_s_ch_mussaf_shalosh_regalim_1.setVisibility(View.VISIBLE);
        a_s_ch_mussaf_shalosh_regalim_2.setVisibility(View.VISIBLE);
        a_s_ch_mussaf_shalosh_regalim_sukkos_1.setVisibility(View.VISIBLE);
        a_s_ch_mussaf_shalosh_regalim_3.setVisibility(View.VISIBLE);
        a_s_ch_mussaf_shalosh_regalim_sukkos_2.setVisibility(View.VISIBLE);
        a_s_ch_mussaf_shalosh_regalim_4.setVisibility(View.VISIBLE);

    }

    private void sukkos(){
        for (int i = 0; i < Hollidays.sukkos.size(); i++) {
            if (currentDate.getTime().equals(Hollidays.sukkos.get(i).getTime())) {
                otherSukkos();
                if (sukkosunit < 7 && sukkosunit >= 0) {
                    if (sukkosunit == 1) {
                        a_s_mussaf_shalosh_regalim_sukkos_chol_hamoed_1.setVisibility(View.VISIBLE);
                        a_s_ch_mussaf_shalosh_regalim_sukkos_chol_hamoed_1.setVisibility(View.VISIBLE);
                    }
                    if (sukkosunit == 2) {
                        a_s_mussaf_shalosh_regalim_sukkos_chol_hamoed_2.setVisibility(View.VISIBLE);
                        a_s_ch_mussaf_shalosh_regalim_sukkos_chol_hamoed_2.setVisibility(View.VISIBLE);
                    }
                    if (sukkosunit == 3) {
                        a_s_mussaf_shalosh_regalim_sukkos_chol_hamoed_3.setVisibility(View.VISIBLE);
                        a_s_ch_mussaf_shalosh_regalim_sukkos_chol_hamoed_3.setVisibility(View.VISIBLE);
                    }
                    if (sukkosunit == 4) {
                        a_s_mussaf_shalosh_regalim_sukkos_chol_hamoed_4.setVisibility(View.VISIBLE);
                        a_s_ch_mussaf_shalosh_regalim_sukkos_chol_hamoed_4.setVisibility(View.VISIBLE);
                    }
                    if (sukkosunit == 5) {
                        a_s_mussaf_shalosh_regalim_sukkos_chol_hamoed_5.setVisibility(View.VISIBLE);
                        a_s_ch_mussaf_shalosh_regalim_sukkos_chol_hamoed_5.setVisibility(View.VISIBLE);
                    }
                    if (sukkosunit == 6) {
                        a_s_mussaf_shalosh_regalim_sukkos_chol_hamoed_hoshana_raba.setVisibility(View.VISIBLE);
                    }
                }
            }


        }
    }


    private void vetenOrTal() {
        for (int i = 0; i < Hollidays.vetenTal.size(); i++) {
            long diff1 = Hollidays.vetenTal.get(i).getTimeInMillis() - Hollidays.moridHatalVetenBracha.get(i).getTimeInMillis();
            long unit = TimeUnit.DAYS.convert(diff1, TimeUnit.MILLISECONDS);
            if (unit >= 0){
                a_s_tal_umatar.setVisibility(View.VISIBLE);
                a_s_ch_tal_umatar.setVisibility(View.VISIBLE);
            }
            else{
                a_s_veten_beracha.setVisibility(View.VISIBLE);
                a_s_ch_veten_beracha.setVisibility(View.VISIBLE);
            }
        }
    }


    private void moridHatalandMashiv() {
        for (int i = 0; i < Hollidays.moridHatalVetenBracha.size(); i++) {
            long diff1 = Hollidays.mashiv.get(i).getTimeInMillis() - Hollidays.moridHatalVetenBracha.get(i).getTimeInMillis();
            long unit = TimeUnit.DAYS.convert(diff1, TimeUnit.MILLISECONDS);
            if (unit < 0){
                a_s_morid_hatal.setVisibility(View.VISIBLE);
                a_s_ch_morid_hatal.setVisibility(View.VISIBLE);
                if (currentDate.getTime().equals(Hollidays.rosh_chodesh.get(i).getTime())){
                    a_s_morid_hatal_mussaf.setVisibility(View.VISIBLE);
                    a_s_ch_morid_hatal_mussaf.setVisibility(View.VISIBLE);
                }
                if (sukkosunit < 7 && sukkosunit >= 0){
                    a_s_mussaf_shalosh_regalim_morid_hatal.setVisibility(View.VISIBLE);
                    a_s_ch_mussaf_shalosh_regalim_morid_hatal.setVisibility(View.VISIBLE);
                }

            }
            else {
                a_s_mashiv_harauch.setVisibility(View.VISIBLE);
                a_s_ch_mashiv_harauch.setVisibility(View.VISIBLE);
            }
        }
    }

    private void AYTeshuva() {
        for (int i = 0; i < Hollidays.ayt.size(); i++) {
            if (currentDate.getTime().equals(Hollidays.ayt.get(i).getTime())){
                a_s_avinu_malkainu_ayt.setVisibility(View.VISIBLE);
                a_s_asseret_yami_teshuva_1.setVisibility(View.VISIBLE);
                a_s_asseret_yami_teshuva_2.setVisibility(View.VISIBLE);
                a_s_asseret_yami_teshuva_3.setVisibility(View.VISIBLE);
                a_s_asseret_yami_teshuva_4.setVisibility(View.VISIBLE);
                a_s_asseret_yami_teshuva_end.setVisibility(View.VISIBLE);
                a_s_ch_ayt_1.setVisibility(View.VISIBLE);
                a_s_ch_ayt_2.setVisibility(View.VISIBLE);
                a_s_ch_ayt_3.setVisibility(View.VISIBLE);
                a_s_ch_ayt_4.setVisibility(View.VISIBLE);
                a_s_ledovid.setVisibility(View.VISIBLE);
                a_s_hamelech_hakadosh.setVisibility(View.VISIBLE);
                a_s_ch_hamelech_hakadosh.setVisibility(View.VISIBLE);
                a_s_hamelech_hamishpat.setVisibility(View.VISIBLE);
                a_s_ch_hamelech_hamishpat.setVisibility(View.VISIBLE);

            }
            else {
                a_s_hakel_hakadosh.setVisibility(View.VISIBLE);
                a_s_ch_hakel_hakadosh.setVisibility(View.VISIBLE);
                a_s_melech_ohev.setVisibility(View.VISIBLE);
                a_s_ch_melech_ohev.setVisibility(View.VISIBLE);
            }
        }
    }

    private void shachrisInit() {
        a_s_hachana = getView().findViewById(R.id.a_s_hachana);
        a_s_korbanos = getView().findViewById(R.id.a_s_korbanos);
        a_s_korbanos_2 = getView().findViewById(R.id.a_s_korbanos_2);
        a_s_puskei_dezimra = getView().findViewById(R.id.a_s_puskei_dezimra);
        a_s_ashrei = getView().findViewById(R.id.a_s_ashrei);
        a_s_shirat_hayam = getView().findViewById(R.id.a_s_shirat_hayam);
        a_s_yishtabach = getView().findViewById(R.id.a_s_yishtabach);
        a_s_shema = getView().findViewById(R.id.a_s_shema);
        a_s_shmona_esrei_1 = getView().findViewById(R.id.a_s_shmona_esrei_1);
        a_s_asseret_yami_teshuva_1 = getView().findViewById(R.id.a_s_asseret_yami_teshuva_1);
        a_s_shmona_esrei_2 = getView().findViewById(R.id.a_s_shmona_esrei_2);
        a_s_morid_hatal = getView().findViewById(R.id.a_s_morid_hatal);
        a_s_mashiv_harauch = getView().findViewById(R.id.a_s_mashiv_harauch);
        a_s_shmona_esrei_3 = getView().findViewById(R.id.a_s_shmona_esrei_3);
        a_s_asseret_yami_teshuva_2 = getView().findViewById(R.id.a_s_asseret_yami_teshuva_2);
        a_s_shmona_esrei_4 = getView().findViewById(R.id.a_s_shmona_esrei_4);
        a_s_hakel_hakadosh = getView().findViewById(R.id.a_s_hakel_hakadosh);
        a_s_hamelech_hakadosh = getView().findViewById(R.id.a_s_hamelech_hakadosh);
        a_s_shmona_esrei_5 = getView().findViewById(R.id.a_s_shmona_esrei_5);
        a_s_veten_beracha = getView().findViewById(R.id.a_s_veten_beracha);
        a_s_tal_umatar = getView().findViewById(R.id.a_s_tal_umatar);
        a_s_shmona_esrei_6 = getView().findViewById(R.id.a_s_shmona_esrei_6);
        a_s_melech_ohev = getView().findViewById(R.id.a_s_melech_ohev);
        a_s_hamelech_hamishpat = getView().findViewById(R.id.a_s_hamelech_hamishpat);
        a_s_shmona_esrei_7 = getView().findViewById(R.id.a_s_shmona_esrei_7);
        a_s_rosh_chodesh = getView().findViewById(R.id.a_s_rosh_chodesh);
        a_s_pesach = getView().findViewById(R.id.a_s_pesach);
        a_s_sukkos = getView().findViewById(R.id.a_s_sukkos);
        a_s_shmona_esrei_8 = getView().findViewById(R.id.a_s_shmona_esrei_8);
        a_s_chanukah = getView().findViewById(R.id.a_s_chanukah);
        a_s_purim = getView().findViewById(R.id.a_s_purim);
        a_s_shmona_esrei_9 = getView().findViewById(R.id.a_s_shmona_esrei_9);
        a_s_asseret_yami_teshuva_3 = getView().findViewById(R.id.a_s_asseret_yami_teshuva_3);
        a_s_shmona_esrei_10 = getView().findViewById(R.id.a_s_shmona_esrei_10);
        a_s_asseret_yami_teshuva_4 = getView().findViewById(R.id.a_s_asseret_yami_teshuva_4);
        a_s_shmona_esrei_11 = getView().findViewById(R.id.a_s_shmona_esrei_11);
        a_s_asseret_yami_teshuva_end = getView().findViewById(R.id.a_s_asseret_yami_teshuva_end);
        a_s_shmona_esrei_end = getView().findViewById(R.id.a_s_shmona_esrei_end);
        a_s_chazarat_hashatz_1 = getView().findViewById(R.id.a_s_chazarat_hashatz_1);
        a_s_ch_ayt_1 = getView().findViewById(R.id.a_s_ch_ayt_1);
        a_s_chazarat_hashatz_2 = getView().findViewById(R.id.a_s_chazarat_hashatz_2);
        a_s_ch_morid_hatal = getView().findViewById(R.id.a_s_ch_morid_hatal);
        a_s_ch_mashiv_harauch = getView().findViewById(R.id.a_s_ch_mashiv_harauch);
        a_s_chazarat_hashatz_3 = getView().findViewById(R.id.a_s_chazarat_hashatz_3);
        a_s_ch_ayt_2 = getView().findViewById(R.id.a_s_ch_ayt_2);
        a_s_chazarat_hashatz_4 = getView().findViewById(R.id.a_s_chazarat_hashatz_4);
        a_s_ch_hakel_hakadosh = getView().findViewById(R.id.a_s_ch_hakel_hakadosh);
        a_s_ch_hamelech_hakadosh = getView().findViewById(R.id.a_s_ch_hamelech_hakadosh);
        a_s_chazarat_hashatz_5 = getView().findViewById(R.id.a_s_chazarat_hashatz_5);
        a_s_ch_fast_day = getView().findViewById(R.id.a_s_ch_fast_day);
        a_s_chazarat_hashatz_6 = getView().findViewById(R.id.a_s_chazarat_hashatz_6);
        a_s_ch_veten_beracha = getView().findViewById(R.id.a_s_ch_veten_beracha);
        a_s_ch_tal_umatar = getView().findViewById(R.id.a_s_ch_tal_umatar);
        a_s_chazarat_hashatz_7 = getView().findViewById(R.id.a_s_chazarat_hashatz_7);
        a_s_ch_melech_ohev = getView().findViewById(R.id.a_s_ch_melech_ohev);
        a_s_ch_hamelech_hamishpat = getView().findViewById(R.id.a_s_ch_hamelech_hamishpat);
        a_s_chazarat_hashatz_8 = getView().findViewById(R.id.a_s_chazarat_hashatz_8);
        a_s_ch_rosh_chodesh = getView().findViewById(R.id.a_s_ch_rosh_chodesh);
        a_s_ch_pesach = getView().findViewById(R.id.a_s_ch_pesach);
        a_s_ch_sukkos = getView().findViewById(R.id.a_s_ch_sukkos);
        a_s_chazarat_hashatz_9 = getView().findViewById(R.id.a_s_chazarat_hashatz_9);
        a_s_ch_chanukah = getView().findViewById(R.id.a_s_ch_chanukah);
        a_s_ch_purim = getView().findViewById(R.id.a_s_ch_purim);
        a_s_chazarat_hashatz_10 = getView().findViewById(R.id.a_s_chazarat_hashatz_10);
        a_s_ch_ayt_3 = getView().findViewById(R.id.a_s_ch_ayt_3);
        a_s_chazarat_hashatz_11 = getView().findViewById(R.id.a_s_chazarat_hashatz_11);
        a_s_ch_ayt_4 = getView().findViewById(R.id.a_s_ch_ayt_4);
        a_s_chazarat_hashatz_12 = getView().findViewById(R.id.a_s_chazarat_hashatz_12);
        a_s_netilas_lulav = getView().findViewById(R.id.a_s_netilas_lulav);
        a_s_full_hallel = getView().findViewById(R.id.a_s_full_hallel);
        a_s_half_hallel = getView().findViewById(R.id.a_s_half_hallel);
        a_s_kaddish_after_hallel = getView().findViewById(R.id.a_s_kaddish_after_hallel);
        a_s_kaddish_after_hallel_chanukah = getView().findViewById(R.id.a_s_kaddish_after_hallel_chanukah);
        a_s_tachanun_1 = getView().findViewById(R.id.a_s_tachanun_1);
        a_s_avinu_malkainu_fast_day = getView().findViewById(R.id.a_s_avinu_malkainu_fast_day);
        a_s_avinu_malkainu_ayt = getView().findViewById(R.id.a_s_avinu_malkainu_ayt);
        a_s_tachanun_for_mon_and_thurs = getView().findViewById(R.id.a_s_tachanun_for_mon_and_thurs);
        a_s_tachanun_2 = getView().findViewById(R.id.a_s_tachanun_2);
        a_s_kriat_hatorah = getView().findViewById(R.id.a_s_kriat_hatorah);
        a_s_kriat_hatorah_mon_and_thurs = getView().findViewById(R.id.a_s_kriat_hatorah_mon_and_thurs);
        a_s_hachnasat_sefer_torah = getView().findViewById(R.id.a_s_hachnasat_sefer_torah);
        a_s_ashrei_2 = getView().findViewById(R.id.a_s_ashrei_2);
        a_s_lamnatzeach = getView().findViewById(R.id.a_s_lamnatzeach);
        a_s_uva_letzion = getView().findViewById(R.id.a_s_uva_letzion);
        a_s_mussaf_shalosh_regalim_1 = getView().findViewById(R.id.a_s_mussaf_shalosh_regalim_1);
        a_s_mussaf_shalosh_regalim_morid_hatal = getView().findViewById(R.id.a_s_mussaf_shalosh_regalim_morid_hatal);
        a_s_mussaf_shalosh_regalim_mashiv_harauch = getView().findViewById(R.id.a_s_mussaf_shalosh_regalim_mashiv_harauch);
        a_s_mussaf_shalosh_regalim_2 = getView().findViewById(R.id.a_s_mussaf_shalosh_regalim_2);
        a_s_mussaf_shalosh_regalim_pesach_1 = getView().findViewById(R.id.a_s_mussaf_shalosh_regalim_pesach_1);
        a_s_mussaf_shalosh_regalim_sukkos_1 = getView().findViewById(R.id.a_s_mussaf_shalosh_regalim_sukkos_1);
        a_s_mussaf_shalosh_regalim_3 = getView().findViewById(R.id.a_s_mussaf_shalosh_regalim_3);
        a_s_mussaf_shalosh_regalim_pesach_2 = getView().findViewById(R.id.a_s_mussaf_shalosh_regalim_pesach_2);
        a_s_mussaf_shalosh_regalim_sukkos_2 = getView().findViewById(R.id.a_s_mussaf_shalosh_regalim_sukkos_2);
        a_s_mussaf_shalosh_regalim_pesach_end = getView().findViewById(R.id.a_s_mussaf_shalosh_regalim_pesach_end);
        a_s_mussaf_shalosh_regalim_sukkos_chol_hamoed_1 = getView().findViewById(R.id.a_s_mussaf_shalosh_regalim_sukkos_chol_hamoed_1);
        a_s_mussaf_shalosh_regalim_sukkos_chol_hamoed_2 = getView().findViewById(R.id.a_s_mussaf_shalosh_regalim_sukkos_chol_hamoed_2);
        a_s_mussaf_shalosh_regalim_sukkos_chol_hamoed_3 = getView().findViewById(R.id.a_s_mussaf_shalosh_regalim_sukkos_chol_hamoed_3);
        a_s_mussaf_shalosh_regalim_sukkos_chol_hamoed_4 = getView().findViewById(R.id.a_s_mussaf_shalosh_regalim_sukkos_chol_hamoed_4);
        a_s_mussaf_shalosh_regalim_sukkos_chol_hamoed_5 = getView().findViewById(R.id.a_s_mussaf_shalosh_regalim_sukkos_chol_hamoed_5);
        a_s_mussaf_shalosh_regalim_sukkos_chol_hamoed_hoshana_raba = getView().findViewById(R.id.a_s_mussaf_shalosh_regalim_sukkos_chol_hamoed_hoshana_raba);
        a_s_mussaf_shalosh_regalim_4 = getView().findViewById(R.id.a_s_mussaf_shalosh_regalim_4);
        a_s_ch_mussaf_shalosh_regalim_1 = getView().findViewById(R.id.a_s_ch_mussaf_shalosh_regalim_1);
        a_s_ch_mussaf_shalosh_regalim_morid_hatal = getView().findViewById(R.id.a_s_ch_mussaf_shalosh_regalim_morid_hatal);
        a_s_ch_mussaf_shalosh_regalim_mashiv_harauch = getView().findViewById(R.id.a_s_ch_mussaf_shalosh_regalim_mashiv_harauch);
        a_s_ch_mussaf_shalosh_regalim_2 = getView().findViewById(R.id.a_s_ch_mussaf_shalosh_regalim_2);
        a_s_ch_mussaf_shalosh_regalim_pesach_1 = getView().findViewById(R.id.a_s_ch_mussaf_shalosh_regalim_pesach_1);
        a_s_ch_mussaf_shalosh_regalim_sukkos_1 = getView().findViewById(R.id.a_s_ch_mussaf_shalosh_regalim_sukkos_1);
        a_s_ch_mussaf_shalosh_regalim_3 = getView().findViewById(R.id.a_s_ch_mussaf_shalosh_regalim_3);
        a_s_ch_mussaf_shalosh_regalim_pesach_2 = getView().findViewById(R.id.a_s_ch_mussaf_shalosh_regalim_pesach_2);
        a_s_ch_mussaf_shalosh_regalim_sukkos_2 = getView().findViewById(R.id.a_s_ch_mussaf_shalosh_regalim_sukkos_2);
        a_s_ch_mussaf_shalosh_regalim_pesach_end = getView().findViewById(R.id.a_s_ch_mussaf_shalosh_regalim_pesach_end);
        a_s_ch_mussaf_shalosh_regalim_sukkos_chol_hamoed_1 = getView().findViewById(R.id.a_s_ch_mussaf_shalosh_regalim_sukkos_chol_hamoed_1);
        a_s_ch_mussaf_shalosh_regalim_sukkos_chol_hamoed_2 = getView().findViewById(R.id.a_s_ch_mussaf_shalosh_regalim_sukkos_chol_hamoed_2);
        a_s_ch_mussaf_shalosh_regalim_sukkos_chol_hamoed_3 = getView().findViewById(R.id.a_s_ch_mussaf_shalosh_regalim_sukkos_chol_hamoed_3);
        a_s_ch_mussaf_shalosh_regalim_sukkos_chol_hamoed_4 = getView().findViewById(R.id.a_s_ch_mussaf_shalosh_regalim_sukkos_chol_hamoed_4);
        a_s_ch_mussaf_shalosh_regalim_sukkos_chol_hamoed_5 = getView().findViewById(R.id.a_s_ch_mussaf_shalosh_regalim_sukkos_chol_hamoed_5);
        a_s_ch_mussaf_shalosh_regalim_4 = getView().findViewById(R.id.a_s_ch_mussaf_shalosh_regalim_4);
        a_s_mussaf_rosh_chodesh_1 = getView().findViewById(R.id.a_s_mussaf_rosh_chodesh_1);
        a_s_morid_hatal_mussaf = getView().findViewById(R.id.a_s_morid_hatal_mussaf);
        a_s_mashiv_harauch_mussaf = getView().findViewById(R.id.a_s_mashiv_haruach_mussaf);
        a_s_mussaf_rosh_chodesh_2 = getView().findViewById(R.id.a_s_mussaf_rosh_chodesh_2);
        a_s_mussaf_chanukah = getView().findViewById(R.id.a_s_mussaf_chanukah);
        a_s_mussaf_rosh_chodesh_3 = getView().findViewById(R.id.a_s_mussaf_rosh_chodesh_3);
        a_s_ch_mussaf_rosh_chodesh_1 = getView().findViewById(R.id.a_s_ch_mussaf_rosh_chodesh_1);
        a_s_morid_hatal_mussaf = getView().findViewById(R.id.a_s_morid_hatal_mussaf);
        a_s_mashiv_harauch_mussaf = getView().findViewById(R.id.a_s_mashiv_haruach_mussaf);
        a_s_mussaf_rosh_chodesh_2 = getView().findViewById(R.id.a_s_mussaf_rosh_chodesh_2);
        a_s_mussaf_chanukah = getView().findViewById(R.id.a_s_mussaf_chanukah);
        a_s_mussaf_rosh_chodesh_3 = getView().findViewById(R.id.a_s_mussaf_rosh_chodesh_3);
        a_s_ch_mussaf_rosh_chodesh_1 = getView().findViewById(R.id.a_s_ch_mussaf_rosh_chodesh_1);
        a_s_ch_morid_hatal_mussaf = getView().findViewById(R.id.a_s_ch_morid_hatal_mussaf);
        a_s_ch_mashiv_harauch_mussaf = getView().findViewById(R.id.a_s_ch_mashiv_harauch_mussaf);
        a_s_ch_mussaf_rosh_chodesh_2 = getView().findViewById(R.id.a_s_ch_mussaf_rosh_chodesh_2);
        a_s_ch_mussaf_chanukah = getView().findViewById(R.id.a_s_ch_mussaf_chanukah);
        a_s_ch_mussaf_rosh_chodesh_3 = getView().findViewById(R.id.a_s_ch_mussaf_rosh_chodesh_3);
        a_s_end_of_davening_1 = getView().findViewById(R.id.a_s_end_of_davening_1);
        a_s_shir_shel_yom_sunday = getView().findViewById(R.id.a_s_shir_shel_yom_sunday);
        a_s_shir_shel_yom_monday = getView().findViewById(R.id.a_s_shir_shel_yom_monday);
        a_s_shir_shel_yom_tuesday = getView().findViewById(R.id.a_s_shir_shel_yom_tuesday);
        a_s_shir_shel_yom_wednesday = getView().findViewById(R.id.a_s_shir_shel_yom_wednesday);
        a_s_shir_shel_yom_thursday = getView().findViewById(R.id.a_s_shir_shel_yom_thursday);
        a_s_shir_shel_yom_friday = getView().findViewById(R.id.a_s_shir_shel_yom_friday);
        a_s_borchi_nafshi = getView().findViewById(R.id.a_s_borchi_nafshi);
        a_s_ledovid = getView().findViewById(R.id.a_s_ledovid);
        a_s_end_of_davening_2 = getView().findViewById(R.id.a_s_end_of_davening_2);
        a_s_tefilot_nosafot = getView().findViewById(R.id.a_s_tefilot_nosafot);


        DocumentReference docref = db.collection("ashkenaz").document("shachris");
        docref.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error != null){
                    return;
                }
                assert value != null;
                a_s_hachana.setText(Html.fromHtml(Objects.requireNonNull(value.getString("hachana")).replaceAll("_b", "<br/>").replaceAll(String.valueOf(R.string.stuffs), "'")));
                a_s_korbanos.setText(Html.fromHtml(Objects.requireNonNull(value.getString("korbanos")).replaceAll("_b", "<br/>")));
                a_s_korbanos_2.setText(Html.fromHtml(Objects.requireNonNull(value.getString("korbanos_2")).replaceAll("_b", "<br/>")));
                a_s_puskei_dezimra.setText(Html.fromHtml(Objects.requireNonNull(value.getString("psukei_dezimra")).replaceAll("_b", "<br/>")));
                a_s_ashrei.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ashrei")).replaceAll("_b", "<br/>")));
                a_s_shirat_hayam.setText(Html.fromHtml(Objects.requireNonNull(value.getString("shirat_hayam")).replaceAll("_b", "<br/>")));
                a_s_yishtabach.setText(Html.fromHtml(Objects.requireNonNull(value.getString("yishtabach")).replaceAll("_b", "<br/>")));
                a_s_shema.setText(Html.fromHtml(Objects.requireNonNull(value.getString("shema")).replaceAll("_b", "<br/>")));
                a_s_shmona_esrei_1.setText(Html.fromHtml(Objects.requireNonNull(value.getString("shmona_esrei_1")).replaceAll("_b", "<br/>")));
                a_s_asseret_yami_teshuva_1.setText(Html.fromHtml(Objects.requireNonNull(value.getString("asseret_yami_teshuva_1")).replaceAll("_b", "<br/>")));
                a_s_shmona_esrei_2.setText(Html.fromHtml(Objects.requireNonNull(value.getString("shmona_esrei_2")).replaceAll("_b", "<br/>")));
                a_s_morid_hatal.setText(Html.fromHtml(Objects.requireNonNull(value.getString("morid_hatal")).replaceAll("_b", "<br/>")));
                a_s_mashiv_harauch.setText(Html.fromHtml(Objects.requireNonNull(value.getString("mashiv_harauch")).replaceAll("_b", "<br/>")));
                a_s_shmona_esrei_3.setText(Html.fromHtml(Objects.requireNonNull(value.getString("shmona_esrei_3")).replaceAll("_b", "<br/>")));
                a_s_asseret_yami_teshuva_2.setText(Html.fromHtml(Objects.requireNonNull(value.getString("asseret_yami_teshuva_2")).replaceAll("_b", "<br/>")));
                a_s_shmona_esrei_4.setText(Html.fromHtml(Objects.requireNonNull(value.getString("shmona_esrei_4")).replaceAll("_b", "<br/>")));
                a_s_hakel_hakadosh.setText(Html.fromHtml(Objects.requireNonNull(value.getString("hakel_hakadosh")).replaceAll("_b", "<br/>")));
                a_s_hamelech_hakadosh.setText(Html.fromHtml(Objects.requireNonNull(value.getString("hamelech_hakadosh")).replaceAll("_b", "<br/>")));
                a_s_shmona_esrei_5.setText(Html.fromHtml(Objects.requireNonNull(value.getString("shmona_esrei_5")).replaceAll("_b", "<br/>")));
                a_s_veten_beracha.setText(Html.fromHtml(Objects.requireNonNull(value.getString("veten_beracha")).replaceAll("_b", "<br/>")));
                a_s_tal_umatar.setText(Html.fromHtml(Objects.requireNonNull(value.getString("tal_umatar")).replaceAll("_b", "<br/>")));
                a_s_shmona_esrei_6.setText(Html.fromHtml(Objects.requireNonNull(value.getString("shmona_esrei_6")).replaceAll("_b", "<br/>")));
                a_s_melech_ohev.setText(Html.fromHtml(Objects.requireNonNull(value.getString("melech_ohev")).replaceAll("_b", "<br/>")));
                a_s_hamelech_hamishpat.setText(Html.fromHtml(Objects.requireNonNull(value.getString("hamelech_hamishpat")).replaceAll("_b", "<br/>")));
                a_s_shmona_esrei_7.setText(Html.fromHtml(Objects.requireNonNull(value.getString("shmona_esrei_7")).replaceAll("_b", "<br/>")));
                a_s_rosh_chodesh.setText(Html.fromHtml(Objects.requireNonNull(value.getString("rosh_chodesh")).replaceAll("_b", "<br/>")));
                a_s_pesach.setText(Html.fromHtml(Objects.requireNonNull(value.getString("pesach")).replaceAll("_b", "<br/>")));
                a_s_sukkos.setText(Html.fromHtml(Objects.requireNonNull(value.getString("sukkos")).replaceAll("_b", "<br/>")));
                a_s_shmona_esrei_8.setText(Html.fromHtml(Objects.requireNonNull(value.getString("shmona_esrei_8")).replaceAll("_b", "<br/>")));
                a_s_chanukah.setText(Html.fromHtml(Objects.requireNonNull(value.getString("chanukah")).replaceAll("_b", "<br/>")));
                a_s_purim.setText(Html.fromHtml(Objects.requireNonNull(value.getString("purim")).replaceAll("_b", "<br/>")));
                a_s_shmona_esrei_9.setText(Html.fromHtml(Objects.requireNonNull(value.getString("shmona_esrei_9")).replaceAll("_b", "<br/>")));
                a_s_asseret_yami_teshuva_3.setText(Html.fromHtml(Objects.requireNonNull(value.getString("asseret_yami_teshuva_3")).replaceAll("_b", "<br/>")));
                a_s_shmona_esrei_10.setText(Html.fromHtml(Objects.requireNonNull(value.getString("shmona_esrei_10")).replaceAll("_b", "<br/>")));
                a_s_asseret_yami_teshuva_4.setText(Html.fromHtml(Objects.requireNonNull(value.getString("asseret_yami_teshuva_4")).replaceAll("_b", "<br/>")));
                a_s_shmona_esrei_11.setText(Html.fromHtml(Objects.requireNonNull(value.getString("shmona_esrei_11")).replaceAll("_b", "<br/>")));
                a_s_asseret_yami_teshuva_end.setText(Html.fromHtml(Objects.requireNonNull(value.getString("asseret_yami_teshuva_end")).replaceAll("_b", "<br/>")));
                a_s_shmona_esrei_end.setText(Html.fromHtml(Objects.requireNonNull(value.getString("shmona_esrei_end")).replaceAll("_b", "<br/>")));
                a_s_chazarat_hashatz_1.setText(Html.fromHtml(Objects.requireNonNull(value.getString("chazarat_hashatz_1")).replaceAll("_b", "<br/>")));
                a_s_ch_ayt_1.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ch_ayt_1")).replaceAll("_b", "<br/>")));
                a_s_chazarat_hashatz_2.setText(Html.fromHtml(Objects.requireNonNull(value.getString("chazarat_hashatz_2")).replaceAll("_b", "<br/>")));
                a_s_ch_morid_hatal.setText(Html.fromHtml(Objects.requireNonNull(value.getString("chazarat_hashatz_2")).replaceAll("_b", "<br/>")));
                a_s_ch_mashiv_harauch.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ch_mashiv_harauch")).replaceAll("_b", "<br/>")));
                a_s_chazarat_hashatz_3.setText(Html.fromHtml(Objects.requireNonNull(value.getString("chazarat_hashatz_3")).replaceAll("_b", "<br/>")));
                a_s_ch_ayt_2.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ch_ayt_2")).replaceAll("_b", "<br/>")));
                a_s_chazarat_hashatz_4.setText(Html.fromHtml(Objects.requireNonNull(value.getString("chazarat_hashatz_4")).replaceAll("_b", "<br/>")));
                a_s_ch_hakel_hakadosh.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ch_hakel_hakadosh")).replaceAll("_b", "<br/>")));
                a_s_ch_hamelech_hakadosh.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ch_hamelech_hakadosh")).replaceAll("_b", "<br/>")));
                a_s_chazarat_hashatz_5.setText(Html.fromHtml(Objects.requireNonNull(value.getString("chazarat_hashatz_5")).replaceAll("_b", "<br/>")));
                a_s_ch_fast_day.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ch_fast_day")).replaceAll("_b", "<br/>")));
                a_s_chazarat_hashatz_6.setText(Html.fromHtml(Objects.requireNonNull(value.getString("chazarat_hashatz_6")).replaceAll("_b", "<br/>")));
                a_s_ch_veten_beracha.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ch_veten_beracha")).replaceAll("_b", "<br/>")));
                a_s_ch_tal_umatar.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ch_tal_umatar")).replaceAll("_b", "<br/>")));
                a_s_chazarat_hashatz_7.setText(Html.fromHtml(Objects.requireNonNull(value.getString("chazarat_hashatz_7")).replaceAll("_b", "<br/>")));
                a_s_ch_melech_ohev.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ch_melech_ohev")).replaceAll("_b", "<br/>")));
                a_s_ch_hamelech_hamishpat.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ch_hamelech_hamishpat")).replaceAll("_b", "<br/>")));
                a_s_chazarat_hashatz_8.setText(Html.fromHtml(Objects.requireNonNull(value.getString("chazarat_hashatz_8")).replaceAll("_b", "<br/>")));
                a_s_ch_rosh_chodesh.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ch_rosh_chodesh")).replaceAll("_b", "<br/>")));
                a_s_ch_pesach.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ch_pesach")).replaceAll("_b", "<br/>")));
                a_s_ch_sukkos.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ch_sukkos")).replaceAll("_b", "<br/>")));
                a_s_chazarat_hashatz_9.setText(Html.fromHtml(Objects.requireNonNull(value.getString("chazarat_hashatz_9")).replaceAll("_b", "<br/>")));
                a_s_ch_chanukah.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ch_chanukah")).replaceAll("_b", "<br/>")));
                a_s_ch_purim.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ch_purim")).replaceAll("_b", "<br/>")));
                a_s_chazarat_hashatz_10.setText(Html.fromHtml(Objects.requireNonNull(value.getString("chazarat_hashatz_10")).replaceAll("_b", "<br/>")));
                a_s_ch_ayt_3.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ch_ayt_3")).replaceAll("_b", "<br/>")));
                a_s_chazarat_hashatz_11.setText(Html.fromHtml(Objects.requireNonNull(value.getString("chazarat_hashatz_11")).replaceAll("_b", "<br/>")));
                a_s_ch_ayt_4.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ch_ayt_4")).replaceAll("_b", "<br/>")));
                a_s_chazarat_hashatz_12.setText(Html.fromHtml(Objects.requireNonNull(value.getString("chazarat_hashatz_12")).replaceAll("_b", "<br/>")));
                a_s_netilas_lulav.setText(Html.fromHtml(Objects.requireNonNull(value.getString("netilas_lulav")).replaceAll("_b", "<br/>")));
                a_s_full_hallel.setText(Html.fromHtml(Objects.requireNonNull(value.getString("full_hallel")).replaceAll("_b", "<br/>")));
                a_s_half_hallel.setText(Html.fromHtml(Objects.requireNonNull(value.getString("half_hallel")).replaceAll("_b", "<br/>")));
                a_s_kaddish_after_hallel.setText(Html.fromHtml(Objects.requireNonNull(value.getString("kaddish_after_hallel")).replaceAll("_b", "<br/>")));
                a_s_kaddish_after_hallel_chanukah.setText(Html.fromHtml(Objects.requireNonNull(value.getString("kaddish_after_hallel_chanukah")).replaceAll("_b", "<br/>")));
                a_s_tachanun_1.setText(Html.fromHtml(Objects.requireNonNull(value.getString("tachanun_1")).replaceAll("_b", "<br/>")));
                a_s_avinu_malkainu_fast_day.setText(Html.fromHtml(Objects.requireNonNull(value.getString("avinu_malkainu_fast_day")).replaceAll("_b", "<br/>")));
                a_s_avinu_malkainu_ayt.setText(Html.fromHtml(Objects.requireNonNull(value.getString("avinu_malkainu_ayt")).replaceAll("_b", "<br/>")));
                a_s_tachanun_for_mon_and_thurs.setText(Html.fromHtml(Objects.requireNonNull(value.getString("tachanun_for_mon_and_thurs")).replaceAll("_b", "<br/>")));
                a_s_tachanun_2.setText(Html.fromHtml(Objects.requireNonNull(value.getString("tachanun_2")).replaceAll("_b", "<br/>")));
                a_s_kriat_hatorah.setText(Html.fromHtml(Objects.requireNonNull(value.getString("kriat_hatorah")).replaceAll("_b", "<br/>")));
                a_s_kriat_hatorah_mon_and_thurs.setText(Html.fromHtml(Objects.requireNonNull(value.getString("kriat_hatorah_mon_and_thurs")).replaceAll("_b", "<br/>")));
                a_s_hachnasat_sefer_torah.setText(Html.fromHtml(Objects.requireNonNull(value.getString("hachnasat_sefer_torah")).replaceAll("_b", "<br/>")));
                a_s_ashrei_2.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ashrei_2")).replaceAll("_b", "<br/>")));
                a_s_lamnatzeach.setText(Html.fromHtml(Objects.requireNonNull(value.getString("lamnatzeach")).replaceAll("_b", "<br/>")));
                a_s_uva_letzion.setText(Html.fromHtml(Objects.requireNonNull(value.getString("uva_letzion")).replaceAll("_b", "<br/>")));
                a_s_mussaf_shalosh_regalim_1.setText(Html.fromHtml(Objects.requireNonNull(value.getString("mussaf_shalosh_regalim_1")).replaceAll("_b", "<br/>")));
                a_s_mussaf_shalosh_regalim_morid_hatal.setText(Html.fromHtml(Objects.requireNonNull(value.getString("mussaf_shalosh_regalim_morid_hatal")).replaceAll("_b", "<br/>")));
                a_s_mussaf_shalosh_regalim_mashiv_harauch.setText(Html.fromHtml(Objects.requireNonNull(value.getString("mussaf_shalosh_regalim_mashiv_harauch")).replaceAll("_b", "<br/>")));
                a_s_mussaf_shalosh_regalim_2.setText(Html.fromHtml(Objects.requireNonNull(value.getString("mussaf_shalosh_regalim_2")).replaceAll("_b", "<br/>")));
                a_s_mussaf_shalosh_regalim_pesach_1.setText(Html.fromHtml(Objects.requireNonNull(value.getString("mussaf_shalosh_regalim_2")).replaceAll("_b", "<br/>")));
                a_s_mussaf_shalosh_regalim_sukkos_1.setText(Html.fromHtml(Objects.requireNonNull(value.getString("mussaf_shalosh_regalim_sukkos_1")).replaceAll("_b", "<br/>")));
                a_s_mussaf_shalosh_regalim_3.setText(Html.fromHtml(Objects.requireNonNull(value.getString("mussaf_shalosh_regalim_3")).replaceAll("_b", "<br/>")));
                a_s_mussaf_shalosh_regalim_pesach_2.setText(Html.fromHtml(Objects.requireNonNull(value.getString("mussaf_shalosh_regalim_pesach_2")).replaceAll("_b", "<br/>")));
                a_s_mussaf_shalosh_regalim_sukkos_2.setText(Html.fromHtml(Objects.requireNonNull(value.getString("mussaf_shalosh_regalim_sukkos_2")).replaceAll("_b", "<br/>")));
                a_s_mussaf_shalosh_regalim_pesach_end.setText(Html.fromHtml(Objects.requireNonNull(value.getString("mussaf_shalosh_regalim_pesach_end")).replaceAll("_b", "<br/>")));
                a_s_mussaf_shalosh_regalim_sukkos_chol_hamoed_1.setText(Html.fromHtml(Objects.requireNonNull(value.getString("mussaf_shalosh_regalim_sukkos_chol_hamoed_1")).replaceAll("_b", "<br/>")));
                a_s_mussaf_shalosh_regalim_sukkos_chol_hamoed_2.setText(Html.fromHtml(Objects.requireNonNull(value.getString("mussaf_shalosh_regalim_sukkos_chol_hamoed_2")).replaceAll("_b", "<br/>")));
                a_s_mussaf_shalosh_regalim_sukkos_chol_hamoed_3.setText(Html.fromHtml(Objects.requireNonNull(value.getString("mussaf_shalosh_regalim_sukkos_chol_hamoed_3")).replaceAll("_b", "<br/>")));
                a_s_mussaf_shalosh_regalim_sukkos_chol_hamoed_4.setText(Html.fromHtml(Objects.requireNonNull(value.getString("mussaf_shalosh_regalim_sukkos_chol_hamoed_4")).replaceAll("_b", "<br/>")));
                a_s_mussaf_shalosh_regalim_sukkos_chol_hamoed_5.setText(Html.fromHtml(Objects.requireNonNull(value.getString("mussaf_shalosh_regalim_sukkos_chol_hamoed_5")).replaceAll("_b", "<br/>")));
                a_s_mussaf_shalosh_regalim_sukkos_chol_hamoed_hoshana_raba.setText(Html.fromHtml(Objects.requireNonNull(value.getString("mussaf_shalosh_regalim_sukkos_chol_hamoed_hoshana_raba")).replaceAll("_b", "<br/>")));
                a_s_mussaf_shalosh_regalim_4.setText(Html.fromHtml(Objects.requireNonNull(value.getString("mussaf_shalosh_regalim_4")).replaceAll("_b", "<br/>")));
                a_s_ch_mussaf_shalosh_regalim_1.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ch_mussaf_shalosh_regalim_1")).replaceAll("_b", "<br/>")));
                a_s_ch_mussaf_shalosh_regalim_morid_hatal.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ch_mussaf_shalosh_regalim_morid_hatal")).replaceAll("_b", "<br/>")));
                a_s_ch_mussaf_shalosh_regalim_mashiv_harauch.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ch_mussaf_shalosh_regalim_mashiv_harauch")).replaceAll("_b", "<br/>")));
                a_s_ch_mussaf_shalosh_regalim_2.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ch_mussaf_shalosh_regalim_2")).replaceAll("_b", "<br/>")));
                a_s_ch_mussaf_shalosh_regalim_pesach_1.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ch_mussaf_shalosh_regalim_pesach_1")).replaceAll("_b", "<br/>")));
                a_s_ch_mussaf_shalosh_regalim_sukkos_1.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ch_mussaf_shalosh_regalim_sukkos_1")).replaceAll("_b", "<br/>")));
                a_s_ch_mussaf_shalosh_regalim_3.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ch_mussaf_shalosh_regalim_3")).replaceAll("_b", "<br/>")));
                a_s_ch_mussaf_shalosh_regalim_pesach_2.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ch_mussaf_shalosh_regalim_pesach_2")).replaceAll("_b", "<br/>")));
                a_s_ch_mussaf_shalosh_regalim_sukkos_2.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ch_mussaf_shalosh_regalim_sukkos_2")).replaceAll("_b", "<br/>")));
                a_s_ch_mussaf_shalosh_regalim_pesach_end.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ch_mussaf_shalosh_regalim_pesach_end")).replaceAll("_b", "<br/>")));
                a_s_ch_mussaf_shalosh_regalim_sukkos_chol_hamoed_1.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ch_mussaf_shalosh_regalim_sukkos_chol_hamoed_1")).replaceAll("_b", "<br/>")));
                a_s_ch_mussaf_shalosh_regalim_sukkos_chol_hamoed_2.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ch_mussaf_shalosh_regalim_sukkos_chol_hamoed_2")).replaceAll("_b", "<br/>")));
                a_s_ch_mussaf_shalosh_regalim_sukkos_chol_hamoed_3.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ch_mussaf_shalosh_regalim_sukkos_chol_hamoed_3")).replaceAll("_b", "<br/>")));
                a_s_ch_mussaf_shalosh_regalim_sukkos_chol_hamoed_4.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ch_mussaf_shalosh_regalim_sukkos_chol_hamoed_4")).replaceAll("_b", "<br/>")));
                a_s_ch_mussaf_shalosh_regalim_sukkos_chol_hamoed_5.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ch_mussaf_shalosh_regalim_sukkos_chol_hamoed_5")).replaceAll("_b", "<br/>")));
                a_s_ch_mussaf_shalosh_regalim_4.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ch_mussaf_shalosh_regalim_4")).replaceAll("_b", "<br/>")));
                a_s_mussaf_rosh_chodesh_1.setText(Html.fromHtml(Objects.requireNonNull(value.getString("mussaf_rosh_chodesh_1")).replaceAll("_b", "<br/>")));
                a_s_morid_hatal_mussaf.setText(Html.fromHtml(Objects.requireNonNull(value.getString("morid_hatal_mussaf")).replaceAll("_b", "<br/>")));
                a_s_mashiv_harauch_mussaf.setText(Html.fromHtml(Objects.requireNonNull(value.getString("mashiv_harauch_mussaf")).replaceAll("_b", "<br/>")));
                a_s_mussaf_rosh_chodesh_2.setText(Html.fromHtml(Objects.requireNonNull(value.getString("mussaf_rosh_chodesh_2")).replaceAll("_b", "<br/>")));
                a_s_mussaf_chanukah.setText(Html.fromHtml(Objects.requireNonNull(value.getString("mussaf_chanukah")).replaceAll("_b", "<br/>")));
                a_s_mussaf_rosh_chodesh_3.setText(Html.fromHtml(Objects.requireNonNull(value.getString("mussaf_rosh_chodesh_3")).replaceAll("_b", "<br/>")));
                a_s_ch_mussaf_rosh_chodesh_1.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ch_mussaf_rosh_chodesh_1")).replaceAll("_b", "<br/>")));
                a_s_ch_morid_hatal_mussaf.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ch_morid_hatal_mussaf")).replaceAll("_b", "<br/>")));
                a_s_ch_mashiv_harauch_mussaf.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ch_mashiv_harauch_mussaf")).replaceAll("_b", "<br/>")));
                a_s_ch_mussaf_rosh_chodesh_2.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ch_mussaf_rosh_chodesh_2")).replaceAll("_b", "<br/>")));
                a_s_ch_mussaf_chanukah.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ch_mussaf_chanukah")).replaceAll("_b", "<br/>")));
                a_s_ch_mussaf_rosh_chodesh_3.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ch_mussaf_rosh_chodesh_3")).replaceAll("_b", "<br/>")));
                a_s_end_of_davening_1.setText(Html.fromHtml(Objects.requireNonNull(value.getString("end_of_davening_1")).replaceAll("_b", "<br/>")));
                a_s_shir_shel_yom_sunday.setText(Html.fromHtml(Objects.requireNonNull(value.getString("shir_shel_yom_sunday")).replaceAll("_b", "<br/>")));
                a_s_shir_shel_yom_monday.setText(Html.fromHtml(Objects.requireNonNull(value.getString("shir_shel_yom_monday")).replaceAll("_b", "<br/>")));
                a_s_shir_shel_yom_tuesday.setText(Html.fromHtml(Objects.requireNonNull(value.getString("shir_shel_yom_tuesday")).replaceAll("_b", "<br/>")));
                a_s_shir_shel_yom_wednesday.setText(Html.fromHtml(Objects.requireNonNull(value.getString("shir_shel_yom_wednesday")).replaceAll("_b", "<br/>")));
                a_s_shir_shel_yom_thursday.setText(Html.fromHtml(Objects.requireNonNull(value.getString("shir_shel_yom_thursday")).replaceAll("_b", "<br/>")));
                a_s_shir_shel_yom_friday.setText(Html.fromHtml(Objects.requireNonNull(value.getString("shir_shel_yom_friday")).replaceAll("_b", "<br/>")));
                a_s_borchi_nafshi.setText(Html.fromHtml(Objects.requireNonNull(value.getString("borchi_nafshi")).replaceAll("_b", "<br/>")));
                a_s_ledovid.setText(Html.fromHtml(Objects.requireNonNull(value.getString("ledovid")).replaceAll("_b", "<br/>")));
                a_s_end_of_davening_2.setText(Html.fromHtml(Objects.requireNonNull(value.getString("end_of_davening_2")).replaceAll("_b", "<br/>")));
                a_s_tefilot_nosafot.setText(Html.fromHtml(Objects.requireNonNull(value.getString("tefilot_nosafot")).replaceAll("_b", "<br/>")));
            }

        });




            if (currentDate.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
                a_s_shir_shel_yom_sunday.setVisibility(View.VISIBLE);
                a_s_shir_shel_yom_monday.setVisibility(View.GONE);
                a_s_shir_shel_yom_tuesday.setVisibility(View.GONE);
                a_s_shir_shel_yom_wednesday.setVisibility(View.GONE);
                a_s_shir_shel_yom_thursday.setVisibility(View.GONE);
                a_s_shir_shel_yom_friday.setVisibility(View.GONE);
                monThurs();
            }
            else if (currentDate.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY){
                a_s_shir_shel_yom_sunday.setVisibility(View.GONE);
                a_s_shir_shel_yom_monday.setVisibility(View.VISIBLE);
                a_s_shir_shel_yom_tuesday.setVisibility(View.GONE);
                a_s_shir_shel_yom_wednesday.setVisibility(View.GONE);
                a_s_shir_shel_yom_thursday.setVisibility(View.GONE);
                a_s_shir_shel_yom_friday.setVisibility(View.GONE);
                monThurs();
            }
            else if (currentDate.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY){
                a_s_shir_shel_yom_sunday.setVisibility(View.GONE);
                a_s_shir_shel_yom_monday.setVisibility(View.GONE);
                a_s_shir_shel_yom_tuesday.setVisibility(View.VISIBLE);
                a_s_shir_shel_yom_wednesday.setVisibility(View.GONE);
                a_s_shir_shel_yom_thursday.setVisibility(View.GONE);
                a_s_shir_shel_yom_friday.setVisibility(View.GONE);
                monThurs();
            }
            else if (currentDate.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY){
                a_s_shir_shel_yom_sunday.setVisibility(View.GONE);
                a_s_shir_shel_yom_monday.setVisibility(View.GONE);
                a_s_shir_shel_yom_tuesday.setVisibility(View.GONE);
                a_s_shir_shel_yom_wednesday.setVisibility(View.VISIBLE);
                a_s_shir_shel_yom_thursday.setVisibility(View.GONE);
                a_s_shir_shel_yom_friday.setVisibility(View.GONE);
                monThurs();
            }
            else if (currentDate.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY){
                a_s_shir_shel_yom_sunday.setVisibility(View.GONE);
                a_s_shir_shel_yom_monday.setVisibility(View.GONE);
                a_s_shir_shel_yom_tuesday.setVisibility(View.GONE);
                a_s_shir_shel_yom_wednesday.setVisibility(View.GONE);
                a_s_shir_shel_yom_thursday.setVisibility(View.VISIBLE);
                a_s_shir_shel_yom_friday.setVisibility(View.GONE);
                monThurs();
            }
            else if (currentDate.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY){
                a_s_shir_shel_yom_sunday.setVisibility(View.GONE);
                a_s_shir_shel_yom_monday.setVisibility(View.GONE);
                a_s_shir_shel_yom_tuesday.setVisibility(View.GONE);
                a_s_shir_shel_yom_wednesday.setVisibility(View.GONE);
                a_s_shir_shel_yom_thursday.setVisibility(View.GONE);
                a_s_shir_shel_yom_friday.setVisibility(View.VISIBLE);
                monThurs();
            }


        }

    public void monThurs(){

        if (currentDate.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY || currentDate.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY) {
            a_s_hachnasat_sefer_torah.setVisibility(View.VISIBLE);
            a_s_kriat_hatorah_mon_and_thurs.setVisibility(View.VISIBLE);
            a_s_kriat_hatorah.setVisibility(View.VISIBLE);
            a_s_tachanun_for_mon_and_thurs.setVisibility(View.VISIBLE);
        }
        else {
            a_s_hachnasat_sefer_torah.setVisibility(View.GONE);
            a_s_kriat_hatorah_mon_and_thurs.setVisibility(View.GONE);
            a_s_kriat_hatorah.setVisibility(View.GONE);
            a_s_tachanun_for_mon_and_thurs.setVisibility(View.GONE);
        }
    }


}