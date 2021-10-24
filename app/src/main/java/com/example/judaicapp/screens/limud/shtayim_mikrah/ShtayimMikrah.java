package com.example.judaicapp.screens.limud.shtayim_mikrah;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.judaicapp.R;
import com.example.judaicapp.screens.Siddurim.Ashkenaz;
import com.example.judaicapp.screens.limud.mishnaYomi.MishnahYomi;
import com.github.barteksc.pdfviewer.PDFView;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;


public class ShtayimMikrah extends Fragment {
    Button berashis, shemos, vayikrah, bamidbar, devarim;

    private PDFView mikrah_pdfView;





    public ShtayimMikrah() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_shtayim_mikrah, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mikrahInit2();

    }

    private void done() {
        berashis.setVisibility(View.GONE);
        shemos.setVisibility(View.GONE);
        vayikrah.setVisibility(View.GONE);
        bamidbar.setVisibility(View.GONE);
        devarim.setVisibility(View.GONE);
        mikrah_pdfView.setVisibility(View.VISIBLE);
    }

    private void mikrahInit2() {
        berashis = requireView().findViewById(R.id.berashis);
        shemos = requireView().findViewById(R.id.shemos);
        vayikrah = requireView().findViewById(R.id.vayikrah);
        bamidbar = requireView().findViewById(R.id.bamidbar);
        devarim = requireView().findViewById(R.id.devarim);
        mikrah_pdfView = requireView().findViewById(R.id.mikrah_pdfview);

        berashis.setOnClickListener(v -> {
            done();
            new RetrievePdfFromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mikrah%2FBerashis.pdf?alt=media&token=c8866049-6640-4f27-bcae-5531859d8090");
        });
        shemos.setOnClickListener(v -> {
            done();
            new RetrievePdfFromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mikrah%2FShemos.pdf?alt=media&token=31a0ed51-7c9a-4c81-8385-b642e4ece6c6");
        });
        vayikrah.setOnClickListener(v -> {
            done();
            new RetrievePdfFromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mikrah%2FVayikrah.pdf?alt=media&token=773fbf5c-bed9-4364-8b30-4d7f1fb34d70");
        });
        bamidbar.setOnClickListener(v -> {
            done();
            new RetrievePdfFromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mikrah%2FBamidbar.pdf?alt=media&token=884a9356-4c89-421a-be2b-c77a5d18b9e6");
        });
        devarim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                done();
                new RetrievePdfFromUrl().execute("https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/mikrah%2FDevarim.pdf?alt=media&token=af981297-aa04-4589-b9ae-c53100ef8230");
            }
        });



    }
     class RetrievePdfFromUrl extends AsyncTask<String, Void, InputStream> {

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
            mikrah_pdfView.fromStream(inputStream).load();
        }
    }



}