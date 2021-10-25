package com.example.judaicapp.screens.limud.mishnaYomi;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import com.example.judaicapp.R;
import com.example.judaicapp.screens.limud.shtayim_mikrah.ShtayimMikrah;
import com.github.barteksc.pdfviewer.PDFView;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class MishnahYomi extends Fragment {
    ConstraintLayout seder, zeraim, moed, nashim, nezikin, kedashim, taharos;

    Button seder_zeraim_btn, seder_moed_btn, seder_nashim_btn, seder_nezikin_btn, seder_kodshin_btn, seder_taharos_btn;
    Button berachos_btn, peah_btn, demai_btn, kilayim_btn, shviis_btn, terumos_btn, maaseros_btn, maaser_sheni_btn, challah_btn, orlah_btn, bikkurim_btn;
    Button shabbos_btn, eiruvin_btn, pesachin_btn, shekalim_btn, yuma_btn, sukkah_btn, baitza_btn, rosh_hashanah_btn, taanis_btn, megillah_btn, moed_katan_btn, chagigah_btn;
    Button yevamos_btn, kesubos_btn, nedarim_btn, nazir_btn, sota_btn, gittin_btn, kidushin_btn;
    Button baba_kama_btn, baba_metziah_btn, baba_basra_btn, sanhedrin_btn, makkos_btn, shevous_btn, aiduyos_btn, avoda_zara_btn, avos_btn, horayos_btn;
    Button zevachim_btn, menachos_btn, chulin_btn, bechoros_btn, arachin_btn, temura_btn, kritus_btn, meila_btn, tomid_btn, midos_btn, kinim_btn;
    Button kailim_btn, ohalos_btn, negaim_btn, parah_btn, taharos_btn, mikvaos_btn, niddah_btn, machshirin_btn, zavim_btn, tevul_yom_btn, yadim_btn, ukatzim_btn;



    private PDFView pdfView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_mishnah_yomi, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        storageInit2();
        pdfView = getView().findViewById(R.id.mishnah_pdfview);
    }

    private void gone() {
        seder.setVisibility(View.GONE);
        zeraim.setVisibility(View.GONE);
        moed.setVisibility(View.GONE);
        nashim.setVisibility(View.GONE);
        nezikin.setVisibility(View.GONE);
        kedashim.setVisibility(View.GONE);
        taharos.setVisibility(View.GONE);
    }

    private void storageInit2() {
        seder = getView().findViewById(R.id.seder);
        zeraim = getView().findViewById(R.id.zeraim);
        moed = getView().findViewById(R.id.moed);
        nashim = getView().findViewById(R.id.nashim);
        nezikin = getView().findViewById(R.id.nezikin);
        kedashim = getView().findViewById(R.id.kedashim);
        taharos = getView().findViewById(R.id.taharos);
        seder_zeraim_btn = getView().findViewById(R.id.seder_zeraim_btn);
        seder_moed_btn = getView().findViewById(R.id.seder_moed_btn);
        seder_nashim_btn = getView().findViewById(R.id.seder_nashim_btn);
        seder_nezikin_btn = getView().findViewById(R.id.seder_nezikin_btn);
        seder_kodshin_btn = getView().findViewById(R.id.seder_kodshin_btn);
        seder_taharos_btn = getView().findViewById(R.id.seder_taharos_btn);
        berachos_btn = getView().findViewById(R.id.berachos_btn);
        peah_btn = getView().findViewById(R.id.peah_btn);
        demai_btn = getView().findViewById(R.id.demai_btn);
        kilayim_btn = getView().findViewById(R.id.kilayim_btn);
        shviis_btn = getView().findViewById(R.id.shviis_btn);
        terumos_btn = getView().findViewById(R.id.terumos_btn);
        maaseros_btn = getView().findViewById(R.id.maaseros_btn);
        maaser_sheni_btn = getView().findViewById(R.id.maaser_sheni_btn);
        challah_btn = getView().findViewById(R.id.challah_btn);
        orlah_btn = getView().findViewById(R.id.orlah_btn);
        bikkurim_btn = getView().findViewById(R.id.bikkurim_btn);
        shabbos_btn = getView().findViewById(R.id.shabbos_btn);
        eiruvin_btn = getView().findViewById(R.id.eiruvin_btn);
        shekalim_btn = getView().findViewById(R.id.shekalim_btn);
        pesachin_btn = getView().findViewById(R.id.pesachin_btn);
        yuma_btn = getView().findViewById(R.id.yuma_btn);
        sukkah_btn = getView().findViewById(R.id.sukkah_btn);
        baitza_btn = getView().findViewById(R.id.baitza_btn);
        rosh_hashanah_btn = getView().findViewById(R.id.rosh_hashanah_btn);
        taanis_btn = getView().findViewById(R.id.taanis_btn);
        megillah_btn = getView().findViewById(R.id.megillah_btn);
        moed_katan_btn = getView().findViewById(R.id.moed_katan_btn);
        chagigah_btn = getView().findViewById(R.id.chagigah_btn);
        yevamos_btn = getView().findViewById(R.id.yevamos_btn);
        kesubos_btn = getView().findViewById(R.id.kesubos_btn);
        nedarim_btn = getView().findViewById(R.id.nedarim_btn);
        nazir_btn = getView().findViewById(R.id.nazir_btn);
        sota_btn = getView().findViewById(R.id.sota_btn);
        gittin_btn = getView().findViewById(R.id.gittin_btn);
        kidushin_btn = getView().findViewById(R.id.kidushin_btn);
        baba_kama_btn = getView().findViewById(R.id.baba_kama_btn);
        baba_metziah_btn = getView().findViewById(R.id.baba_metziah_btn);
        baba_basra_btn = getView().findViewById(R.id.baba_basra_btn);
        sanhedrin_btn = getView().findViewById(R.id.sanhedrin_btn);
        makkos_btn = getView().findViewById(R.id.makkos_btn);
        shevous_btn = getView().findViewById(R.id.shevous_btn);
        aiduyos_btn = getView().findViewById(R.id.aiduyos_btn);
        avoda_zara_btn = getView().findViewById(R.id.avoda_zara_btn);
        avos_btn = getView().findViewById(R.id.avos_btn);
        kinim_btn = getView().findViewById(R.id.kinim_btn);
        horayos_btn = getView().findViewById(R.id.horayos_btn);

        zevachim_btn = getView().findViewById(R.id.zevachim_btn);
        menachos_btn = getView().findViewById(R.id.menachos_btn);
        chulin_btn = getView().findViewById(R.id.chulin_btn);
        bechoros_btn = getView().findViewById(R.id.bechoros_btn);
        arachin_btn = getView().findViewById(R.id.arachin_btn);
        temura_btn = getView().findViewById(R.id.temura_btn);
        kritus_btn = getView().findViewById(R.id.kritus_btn);
        meila_btn = getView().findViewById(R.id.meila_btn);
        tomid_btn = getView().findViewById(R.id.tomid_btn);
        midos_btn = getView().findViewById(R.id.midos_btn);
        kailim_btn = getView().findViewById(R.id.kailim_btn);
        ohalos_btn = getView().findViewById(R.id.ohalos_btn);
        negaim_btn = getView().findViewById(R.id.negaim_btn);
        parah_btn = getView().findViewById(R.id.parah_btn);
        taharos_btn = getView().findViewById(R.id.taharos_btn);
        mikvaos_btn = getView().findViewById(R.id.mikvaos_btn);
        niddah_btn = getView().findViewById(R.id.niddah_btn);
        machshirin_btn = getView().findViewById(R.id.machshirin_btn);
        zavim_btn = getView().findViewById(R.id.zavim_btn);
        tevul_yom_btn = getView().findViewById(R.id.tevul_yom_btn);
        yadim_btn = getView().findViewById(R.id.yadim_btn);
        ukatzim_btn = getView().findViewById(R.id.ukatzim_btn);



        seder_zeraim_btn.setOnClickListener(v -> {
            gone();
            zeraim.setVisibility(View.VISIBLE);
        });
        seder_moed_btn.setOnClickListener(v -> {
            gone();
            moed.setVisibility(View.VISIBLE);
        });
        seder_nashim_btn.setOnClickListener(v -> {
            gone();
            nashim.setVisibility(View.VISIBLE);
        });
        seder_nezikin_btn.setOnClickListener(v -> {
            gone();
            nezikin.setVisibility(View.VISIBLE);
        });
        seder_kodshin_btn.setOnClickListener(v -> {
            gone();
            kedashim.setVisibility(View.VISIBLE);
        });
        seder_taharos_btn.setOnClickListener(v -> {
            gone();
            taharos.setVisibility(View.VISIBLE);
        });



        berachos_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fzeraim%2Fbrachos.pdf?alt=media&token=cec96ff6-9f36-45fe-ad80-15abb2396885");
            }
        });
        peah_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fzeraim%2Fpeah.pdf?alt=media&token=e2e58117-d7b3-444d-88e5-69124d7cc5aa");
            }
        });
        demai_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fzeraim%2Fdemai.pdf?alt=media&token=3801fcfe-39c5-4a40-851c-93bea4b02453");
            }
        });
        kilayim_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fzeraim%2Fkilayim.pdf?alt=media&token=cde7800c-7c9d-4fdb-9550-04ac02980a8b");
            }
        });
        shviis_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fzeraim%2Fsheviis.pdf?alt=media&token=c5438700-e861-4bd3-9a27-e506187f3d76");
            }
        });
        terumos_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fzeraim%2Fterumos.pdf?alt=media&token=bb0d5a57-fdfb-4983-b2c5-d81246ecf044");
            }
        });
        maaseros_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fzeraim%2Fmaaseros.pdf?alt=media&token=251999a0-072a-46a9-b9b5-d8b7031ec50b");
            }
        });
        maaser_sheni_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fzeraim%2Fmaaser%20sheni.pdf?alt=media&token=c8583e73-f899-4c52-b53f-f22b7e3162a9");
            }
        });
        challah_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fzeraim%2Fchallah.pdf?alt=media&token=8623d51a-e9b9-4637-bbf7-c8e1a1c0d472");
            }
        });
        orlah_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fzeraim%2Forlah.pdf?alt=media&token=dfbbecd0-310a-4838-b738-020d76623bb7");
            }
        });
        bikkurim_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fzeraim%2Fbikkurim.pdf?alt=media&token=06f71b6e-537d-4316-9fa1-80e83e50f403");
            }
        });
        shabbos_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fmoed%2Fshabbos.pdf?alt=media&token=e4761518-e26b-4ac9-8f22-5c79f6b182ac");
            }
        });
        eiruvin_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fmoed%2Feiruvin.pdf?alt=media&token=8bb0c642-f836-47b0-92be-0b2ef971ec48");
            }
        });
        pesachin_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fmoed%2Fpesachim.pdf?alt=media&token=02f76235-6271-4bc4-8e48-9145430277b1");
            }
        });
        shekalim_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fmoed%2Fshkalim.pdf?alt=media&token=cd0aa2c3-cc44-40af-81e7-8bad6875514a");
            }
        });
        yuma_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fmoed%2Fyoma.pdf?alt=media&token=9e52dfac-1bf9-403f-9482-b86b563d6ce3");
            }
        });
        sukkah_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fmoed%2Fsukkah.pdf?alt=media&token=61a9c4cd-536c-49b5-88cc-ded27979d45e");
            }
        });
        baitza_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fmoed%2Fbaitzah.pdf?alt=media&token=5d1a3037-755a-452b-9110-620fd5867ee8");
            }
        });
        rosh_hashanah_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fmoed%2Frosh%20hashanah.pdf?alt=media&token=f45ea24f-d7b9-4624-9c53-e301bedd4fbc");
            }
        });
        taanis_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fmoed%2Ftaanis.pdf?alt=media&token=166dac64-81cd-492a-a516-b928f4fca760");
            }
        });
        megillah_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fmoed%2Fmegilliah.pdf?alt=media&token=0ec5f68d-8f55-4af2-b2bf-71f11baa96a7");
            }
        });
        moed_katan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fmoed%2Fmoed%20katan.pdf?alt=media&token=4af0f2a5-fc06-4bae-ba0f-03d555675611");
            }
        });
        chagigah_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fmoed%2Fchagigah.pdf?alt=media&token=b9961f4a-352c-43b6-a184-0cfa8ad742ae");
            }
        });
        yevamos_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fnashim%2Fyevamos.pdf?alt=media&token=19c83777-e081-4586-8a76-68c000f4b10e");
            }
        });
        kesubos_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fnashim%2Fkesuvos.pdf?alt=media&token=c405a067-593c-4eb3-a6eb-d4d66a7130e1");
            }
        });
        nedarim_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fnashim%2Fnedarim.pdf?alt=media&token=bac10ca6-b67d-4317-abaf-cd5314a5239f");
            }
        });
        nazir_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fnashim%2Fnazir.pdf?alt=media&token=99ef20cd-4e2c-457d-9300-b2f353a03614");
            }
        });
        sota_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fnashim%2Fsota.pdf?alt=media&token=566b2726-5232-4b32-b602-e1d635686389");
            }
        });
        gittin_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fnashim%2Fgittin.pdf?alt=media&token=33950e15-808b-4ff2-86cb-124386660917");
            }
        });
        kidushin_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fnashim%2Fkidushin.pdf?alt=media&token=197d8061-4718-4363-9e2a-6ecd2b4d42fc");
            }
        });
        baba_kama_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fnezikin%2Fbaba%20kama.pdf?alt=media&token=7ee1f1e7-d4a9-45b9-92cf-03395bb47c28");
            }
        });
        baba_metziah_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fnezikin%2Fbaba%20metzia.pdf?alt=media&token=149fe59f-76ec-4eaf-a4e3-6fdf60fbb866");
            }
        });
        baba_basra_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fnezikin%2Fbaba%20basra.pdf?alt=media&token=c33939bd-933f-4cdb-a24e-e2945a36dc46");
            }
        });
        sanhedrin_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fnezikin%2Fsanhedrin.pdf?alt=media&token=b6ac2b9b-1100-4ab1-b336-f32e246aee1d");
            }
        });
        makkos_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fnezikin%2Fmakkos.pdf?alt=media&token=d0ce88a1-7883-4752-990a-1aa350d05de9");
            }
        });
        shevous_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fnezikin%2Fshevous.pdf?alt=media&token=3c54b564-9aee-4a2e-a5f4-adcc5fe59f4a");
            }
        });
        aiduyos_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fnezikin%2Feiduyot.pdf?alt=media&token=751b9bab-551f-4d45-b2ce-a080503f2be3");
            }
        });
        avoda_zara_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fnezikin%2Favoda%20zara.pdf?alt=media&token=9fbfa664-9df8-4067-ae83-6d35b4ed0a65");
            }
        });
        avos_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fnezikin%2Favos.pdf?alt=media&token=fef068e3-f95d-4288-9d43-5d69d1c48123");
            }
        });
        horayos_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fnezikin%2Fhorayos.pdf?alt=media&token=515a72d3-9c6a-4880-8474-ae047ff318bf");
            }
        });
        zevachim_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fkedashim%2Fzevachim.pdf?alt=media&token=059430fe-df78-4f9f-9d89-679a7947aa2e");
            }
        });
        menachos_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fkedashim%2Fmenachos.pdf?alt=media&token=f028ed6b-d017-4325-81b2-542519eeef5a");
            }
        });
        chulin_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fkedashim%2Fchulin.pdf?alt=media&token=4ce393b9-600f-464c-b635-54c9510312a2");
            }
        });
        bechoros_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fkedashim%2Fbechoros.pdf?alt=media&token=9538d300-6e4a-46ec-ad79-99c49da98b52");
            }
        });
        arachin_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fkedashim%2Farachin.pdf?alt=media&token=5a7737f3-c91e-4735-b45a-f27cf8cb49d1");
            }
        });
        temura_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fkedashim%2Ftemura.pdf?alt=media&token=7b9dbfaf-c20a-41b6-8eb2-0813f2da1682");
            }
        });
        kritus_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fkedashim%2Fkritus.pdf?alt=media&token=ef2b9528-5755-4de0-bdc1-d6bf2f93af70");
            }
        });
        meila_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fkedashim%2Fmeeilah.pdf?alt=media&token=d5bd5cf0-3322-4931-8c23-b7bf712fe1a2");
            }
        });
        tomid_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fkedashim%2Ftamid.pdf?alt=media&token=bfff0afd-e3b8-443f-a4e2-e2668f8b6501");
            }
        });
        midos_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fkedashim%2Fmidos.pdf?alt=media&token=d15063a7-2c21-43ed-a6c8-b139af1d8aa6");
            }
        });
        kinim_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Fkedashim%2Fkinim.pdf?alt=media&token=b644c097-3e42-4af7-a534-64fb4921711f");
            }
        });
        kailim_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Ftaharos%2Fkailim.pdf?alt=media&token=c99eaf6d-7dcc-4258-b526-623357bbd7ef");
            }
        });
        ohalos_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Ftaharos%2Fohalos.pdf?alt=media&token=ffea975a-da52-43cd-ac35-7cdcb190db52");
            }
        });
        negaim_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Ftaharos%2Fnegaim.pdf?alt=media&token=c8efb42f-d323-4b63-b031-2ae509e11281");
            }
        });
        parah_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Ftaharos%2Fparah.pdf?alt=media&token=e81a7a3c-32f9-46f6-8c4b-15483331fb15");
            }
        });
        taharos_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Ftaharos%2Ftaharos.pdf?alt=media&token=b23d22d1-57a8-48fd-aa12-e92ee0fa0812");
            }
        });
        mikvaos_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Ftaharos%2Fmikvaaos.pdf?alt=media&token=a4bb6e15-8de3-4975-87cd-c02817e1786a");
            }
        });
        niddah_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Ftaharos%2Fniddah.pdf?alt=media&token=c0f714e8-afd4-4416-bf03-de218cb2de73");
            }
        });
        machshirin_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Ftaharos%2Fmachshirin.pdf?alt=media&token=ce62035a-40ea-41c7-9d03-79727b36a850");
            }
        });
        zavim_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Ftaharos%2Fzavim.pdf?alt=media&token=5089acf2-e6f5-4773-9342-aced12f987c9");
            }
        });
        tevul_yom_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Ftaharos%2Ftvul%20yom.pdf?alt=media&token=fe879c9b-297f-4770-856d-0f5b2abb6e16");
            }
        });
        yadim_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Ftaharos%2Fyadim.pdf?alt=media&token=d52bfb68-b8f1-4693-8edc-004f9472c6e1");
            }
        });
        ukatzim_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gone();
                pdfView.setVisibility(View.VISIBLE);
                new RetrievePdffromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mishnah%2Ftaharos%2Fukatzim.pdf?alt=media&token=a9719efc-49e6-4e04-a573-83e6ee37e928");
            }
        });



    }



     class RetrievePdffromUrl extends AsyncTask<String, Void, InputStream> {


        @Override
        protected InputStream doInBackground(String... strings) {
            InputStream inputStream = null;

            try {
                URL url = new URL(strings[0]);

                HttpURLConnection urlConnection = (HttpsURLConnection) url.openConnection();
                if (urlConnection.getResponseCode() == 200) {
                    inputStream = new BufferedInputStream(urlConnection.getInputStream());
                }

            }
            catch (IOException e)
            {
                e.printStackTrace();
                return null;
            }
            return inputStream;
        }

        @Override
        protected void onPostExecute(InputStream inputStream) {
            pdfView.fromStream(inputStream).load();
        }
    }

}