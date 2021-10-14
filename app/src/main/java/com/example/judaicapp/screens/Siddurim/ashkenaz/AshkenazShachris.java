package com.example.judaicapp.screens.Siddurim.ashkenaz;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.judaicapp.R;

public class AshkenazShachris extends Fragment {
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
        shachrisInit();
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
    }
}