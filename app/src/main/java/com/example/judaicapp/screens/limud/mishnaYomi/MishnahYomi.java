package com.example.judaicapp.screens.limud.mishnaYomi;

import android.os.AsyncTask;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.judaicapp.R;
import com.github.barteksc.pdfviewer.PDFView;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;

import javax.net.ssl.HttpsURLConnection;

public class MishnahYomi extends Fragment {
    static PDFView pdfView;

    HashMap<Integer, String> pdfUrl;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        storageInit2();
    }

    private void storageInit2() {
        pdfUrl = new HashMap<>();
        //add mishna pdf inside hashmap with day of year as key and link as value
        pdfView = requireView().findViewById(R.id.pdfview);
        Integer dayOfYear = Calendar.DAY_OF_YEAR;
        for (int i = 0; i < pdfUrl.size(); i++) {
            if (pdfUrl.containsKey(dayOfYear)) {
                new RetrievePdffromUrl().execute(pdfUrl.get(dayOfYear));
                break;
            }


        }



    }



    static class RetrievePdffromUrl extends AsyncTask<String, Void, InputStream> {


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