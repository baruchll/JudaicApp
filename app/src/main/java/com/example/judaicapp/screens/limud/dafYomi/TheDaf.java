package com.example.judaicapp.screens.limud.dafYomi;

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
import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Objects;
import java.util.TimeZone;

import javax.net.ssl.HttpsURLConnection;


public class TheDaf extends Fragment {
    static PDFView pdfView;

    HashMap<Integer, String> pdfUrl;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_the_daf, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        storageInit2();
    }

    private void storageInit2() {
        pdfUrl = new HashMap<>();
        pdfUrl.put(257, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah14.pdf?alt=media&token=10a6a357-5ac1-49b0-bc8a-f159a6bbda93");
        pdfUrl.put(258, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah15.pdf?alt=media&token=5d83491c-0d22-4ab7-beb3-ae12d35e3772");
        pdfUrl.put(259, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah16.pdf?alt=media&token=92d6162a-8bec-4de4-8f9e-2eab47ee0cc3");
        pdfUrl.put(260, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah17.pdf?alt=media&token=edb3bbdb-7d89-459c-9b04-f4036df67daa");
        pdfUrl.put(261, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah18.pdf?alt=media&token=f8f6f823-fc50-49ee-9573-f5d6947271fb");
        pdfUrl.put(262, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah19.pdf?alt=media&token=8356ec41-1dde-4ae5-8922-b5b0bab0b2d9");
        pdfUrl.put(263, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah20.pdf?alt=media&token=a14ee82e-230d-44cc-a822-51fa0739299d");
        pdfUrl.put(264, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah21.pdf?alt=media&token=2c201533-d93e-493d-b194-39852780313f");
        pdfUrl.put(265, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah22.pdf?alt=media&token=112eb36a-e177-400b-ad6c-6c219522b558");
        pdfUrl.put(266, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah23.pdf?alt=media&token=83ef1066-c512-4a04-a76f-86cb493f5034");
        pdfUrl.put(267, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah24.pdf?alt=media&token=df053fa2-b8b0-442a-9afa-67d4823be389");
        pdfUrl.put(268, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah25.pdf?alt=media&token=428ee1b8-bb2d-42c7-bc33-e72beaa4d6bd");
        pdfUrl.put(269, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah26.pdf?alt=media&token=932b97b7-64bd-40f7-aadb-2eb531ddb5f9");
        pdfUrl.put(270, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah27.pdf?alt=media&token=f7a1cf9c-9159-4d27-9d28-433769ab8043");
        pdfUrl.put(271, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah28.pdf?alt=media&token=2f4413d2-a29e-40b5-9c6e-43b93d3ac439");
        pdfUrl.put(272, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah29.pdf?alt=media&token=ee41291e-f738-4c6d-90be-fc790f8ee135");
        pdfUrl.put(273, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah30.pdf?alt=media&token=21165dd2-362e-4456-963b-de79408210bf");
        pdfUrl.put(274, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah31.pdf?alt=media&token=e464a324-8e0a-4d05-8960-63ccf603f4cb");
        pdfUrl.put(275, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah32.pdf?alt=media&token=3f092878-669d-4703-9fb4-38c2ab9ad5c9");
        pdfUrl.put(276, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah33.pdf?alt=media&token=d16ba97f-e707-4da0-8bf7-94bbd14c33a5");
        pdfUrl.put(277, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah34.pdf?alt=media&token=235bf055-4343-49c8-9478-00ca41f840eb");
        pdfUrl.put(278, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah35.pdf?alt=media&token=e020b4f9-9558-4e24-a8a2-07410a82bcaf");
        pdfUrl.put(279, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah36.pdf?alt=media&token=4e3b4f30-9acd-4c6c-bffd-663bd79deeee");
        pdfUrl.put(280, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah37.pdf?alt=media&token=9ece742f-360d-44ae-aaa6-760a731ecc63");
        pdfUrl.put(281, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah38.pdf?alt=media&token=3d3a428a-6fe1-4f94-9907-59f1261b835e");
        pdfUrl.put(287, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah39.pdf?alt=media&token=d2ee171d-64e2-4e79-aa0b-7fd16ddab87b");
        pdfUrl.put(6, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah40.pdf?alt=media&token=a74a1437-c6b7-470d-be0a-4b0be2bbeea5");
        pdfView = requireView().findViewById(R.id.pdfview);
        Date date=new Date();
        Calendar localCalendar = Calendar.getInstance(TimeZone.getDefault());
        localCalendar.set(date.getYear(), date.getMonth(),date.getDate());
        int CurrentDayOfYear = localCalendar.get(Calendar.DAY_OF_YEAR);



        for (int i = 0; i < pdfUrl.size(); i++) {
            if (pdfUrl.containsKey(CurrentDayOfYear)) {
                new RetrievePdffromUrl().execute(pdfUrl.get(CurrentDayOfYear));
                break;
            }


        }



    }
    //for the siddur not here
    boolean isWithinRange(Date testDate) {
        return testDate.after(new Date()) && testDate.before(new Date());
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