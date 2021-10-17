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

    HashMap<Integer, String> pdfUrl21;



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
        pdfUrl21 = new HashMap<>();
        pdfUrl21.put(257, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah14.pdf?alt=media&token=10a6a357-5ac1-49b0-bc8a-f159a6bbda93");
        pdfUrl21.put(258, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah15.pdf?alt=media&token=5d83491c-0d22-4ab7-beb3-ae12d35e3772");
        pdfUrl21.put(259, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah16.pdf?alt=media&token=92d6162a-8bec-4de4-8f9e-2eab47ee0cc3");
        pdfUrl21.put(260, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah17.pdf?alt=media&token=edb3bbdb-7d89-459c-9b04-f4036df67daa");
        pdfUrl21.put(261, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah18.pdf?alt=media&token=f8f6f823-fc50-49ee-9573-f5d6947271fb");
        pdfUrl21.put(262, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah19.pdf?alt=media&token=8356ec41-1dde-4ae5-8922-b5b0bab0b2d9");
        pdfUrl21.put(263, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah20.pdf?alt=media&token=a14ee82e-230d-44cc-a822-51fa0739299d");
        pdfUrl21.put(264, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah21.pdf?alt=media&token=2c201533-d93e-493d-b194-39852780313f");
        pdfUrl21.put(265, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah22.pdf?alt=media&token=112eb36a-e177-400b-ad6c-6c219522b558");
        pdfUrl21.put(266, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah23.pdf?alt=media&token=83ef1066-c512-4a04-a76f-86cb493f5034");
        pdfUrl21.put(267, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah24.pdf?alt=media&token=df053fa2-b8b0-442a-9afa-67d4823be389");
        pdfUrl21.put(268, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah25.pdf?alt=media&token=428ee1b8-bb2d-42c7-bc33-e72beaa4d6bd");
        pdfUrl21.put(269, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah26.pdf?alt=media&token=932b97b7-64bd-40f7-aadb-2eb531ddb5f9");
        pdfUrl21.put(270, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah27.pdf?alt=media&token=f7a1cf9c-9159-4d27-9d28-433769ab8043");
        pdfUrl21.put(271, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah28.pdf?alt=media&token=2f4413d2-a29e-40b5-9c6e-43b93d3ac439");
        pdfUrl21.put(272, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah29.pdf?alt=media&token=ee41291e-f738-4c6d-90be-fc790f8ee135");
        pdfUrl21.put(273, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah30.pdf?alt=media&token=21165dd2-362e-4456-963b-de79408210bf");
        pdfUrl21.put(274, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah31.pdf?alt=media&token=e464a324-8e0a-4d05-8960-63ccf603f4cb");
        pdfUrl21.put(275, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah32.pdf?alt=media&token=3f092878-669d-4703-9fb4-38c2ab9ad5c9");
        pdfUrl21.put(276, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah33.pdf?alt=media&token=d16ba97f-e707-4da0-8bf7-94bbd14c33a5");
        pdfUrl21.put(277, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah34.pdf?alt=media&token=235bf055-4343-49c8-9478-00ca41f840eb");
        pdfUrl21.put(278, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah35.pdf?alt=media&token=e020b4f9-9558-4e24-a8a2-07410a82bcaf");
        pdfUrl21.put(279, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah36.pdf?alt=media&token=4e3b4f30-9acd-4c6c-bffd-663bd79deeee");
        pdfUrl21.put(280, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah37.pdf?alt=media&token=9ece742f-360d-44ae-aaa6-760a731ecc63");
        pdfUrl21.put(281, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah38.pdf?alt=media&token=3d3a428a-6fe1-4f94-9907-59f1261b835e");
        pdfUrl21.put(282, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah39.pdf?alt=media&token=d2ee171d-64e2-4e79-aa0b-7fd16ddab87b");
        pdfUrl21.put(283, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Fbaitzah40.pdf?alt=media&token=a74a1437-c6b7-470d-be0a-4b0be2bbeea5");
        pdfUrl21.put(284, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Frosh%20hashana%2Frosh%20hashana%202.pdf?alt=media&token=9f47df15-05ce-49bb-a8be-7899182f94c5");
        pdfUrl21.put(285,"https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Frosh%20hashana%2Frosh%20hashana%203.pdf?alt=media&token=e86ca3ad-a197-49be-a78a-8943bf218c1b");
        pdfUrl21.put(286, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Frosh%20hashana%2Frosh%20hashana%204.pdf?alt=media&token=96ee12cc-d26b-415b-8e46-294d298f3e82");
        pdfUrl21.put(287, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Frosh%20hashana%2Frosh%20hashana%205.pdf?alt=media&token=0de1d622-ba0e-4f7e-9e69-d27ad3977936");
        pdfUrl21.put(288, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Frosh%20hashana%2Frosh%20hashana%206.pdf?alt=media&token=697192b5-83af-48e7-bcdc-2e53ea65f3da");
        pdfUrl21.put(289, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Frosh%20hashana%2Frosh%20hashana%207.pdf?alt=media&token=2f14d30a-ba96-4ca8-b422-8aad9e2d18f8");
        pdfUrl21.put(290, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Frosh%20hashana%2Frosh%20hashana%208.pdf?alt=media&token=c8615f25-2e6b-4314-93bb-cb0e621c088f");
        pdfUrl21.put(291, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Frosh%20hashana%2Frosh%20hashana%209.pdf?alt=media&token=7aeb6d1f-08a2-4603-a196-ae449021c4ce");
        pdfUrl21.put(292, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Frosh%20hashana%2Frosh%20hashana%2010.pdf?alt=media&token=3bb1168b-b86a-4226-8f2a-d05587d91d5a");
        pdfUrl21.put(293, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Frosh%20hashana%2Frosh%20hashana%2011.pdf?alt=media&token=b053d5b4-cdb8-43c3-84d5-6463325cc06a");
        pdfUrl21.put(294, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Frosh%20hashana%2Frosh%20hashana%2012.pdf?alt=media&token=c57c59a4-50ee-4844-ae29-92af844913bf");
        pdfUrl21.put(295, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Frosh%20hashana%2Frosh%20hashana%2013.pdf?alt=media&token=f19dfb09-a818-4122-b307-6b75bada8c83");
        pdfUrl21.put(296, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Frosh%20hashana%2Frosh%20hashana%2014.pdf?alt=media&token=3a3b6a80-db4e-403f-8595-6d6fa24a9035");
        pdfUrl21.put(297, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Frosh%20hashana%2Frosh%20hashana%2015.pdf?alt=media&token=987ac8a0-22b8-45c5-8783-da13a42e26b3");
        pdfUrl21.put(298, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Frosh%20hashana%2Frosh%20hashana%2016.pdf?alt=media&token=edb9447a-f371-4732-9467-3f12877901b9");
        pdfUrl21.put(299, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Frosh%20hashana%2Frosh%20hashana%2017.pdf?alt=media&token=e112442d-961b-48cb-adc3-3214863828f0");
        pdfUrl21.put(300, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Frosh%20hashana%2Frosh%20hashana%2018.pdf?alt=media&token=fbfe31fd-381b-4f5f-b1d1-f96d771a910c");
        pdfUrl21.put(301, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Frosh%20hashana%2Frosh%20hashana%2019.pdf?alt=media&token=ed3f131e-19b6-49cb-b933-0e1086dbaaa4");
        pdfUrl21.put(302, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Frosh%20hashana%2Frosh%20hashana%2020.pdf?alt=media&token=a0bf60c3-0300-44cc-831e-661fe6b1092e");
        pdfUrl21.put(303, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Frosh%20hashana%2Frosh%20hashana%2020.pdf?alt=media&token=a0bf60c3-0300-44cc-831e-661fe6b1092e");
        pdfUrl21.put(304, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Frosh%20hashana%2Frosh%20hashana%2022.pdf?alt=media&token=80b87bb9-83d0-4497-8de2-965c493c0b34");
        pdfUrl21.put(305, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Frosh%20hashana%2Frosh%20hashana%2023.pdf?alt=media&token=c4a0fc44-a894-42cd-a3e9-eb55ced0bba2");
        pdfUrl21.put(306, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Frosh%20hashana%2Frosh%20hashana%2024.pdf?alt=media&token=744e87ff-67e7-45fd-b944-c638caaf2843");
        pdfUrl21.put(307, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Frosh%20hashana%2Frosh%20hashana%2025.pdf?alt=media&token=c3392e06-5740-4c66-8628-16c28fa52716");
        pdfUrl21.put(308, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Frosh%20hashana%2Frosh%20hashana%2026.pdf?alt=media&token=a7445cef-c796-4c72-b974-e6d75bf6c79d");
        pdfUrl21.put(309, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Frosh%20hashana%2Frosh%20hashana%2027.pdf?alt=media&token=6ef8cc23-4fb3-4925-bfa5-daf821085ffd");
        pdfUrl21.put(310, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Frosh%20hashana%2Frosh%20hashana%2028.pdf?alt=media&token=03ecf4dd-1a0e-4126-8b07-cd87e96689dc");
        pdfUrl21.put(311, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Frosh%20hashana%2Frosh%20hashana%2029.pdf?alt=media&token=218c34e9-385c-44df-abc5-ec464ce732c8");
        pdfUrl21.put(312, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Frosh%20hashana%2Frosh%20hashana%2030.pdf?alt=media&token=ae1032d3-d9ed-44f9-92ed-882a65e334e4");
        pdfUrl21.put(313, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Frosh%20hashana%2Frosh%20hashana%2031.pdf?alt=media&token=a66b94b1-2609-4de9-badc-ad427cb29c9a");
        pdfUrl21.put(314, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Frosh%20hashana%2Frosh%20hashana%2032.pdf?alt=media&token=ac0359f2-5a35-4cfe-b0a6-019a188bddcc");
        pdfUrl21.put(315, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Frosh%20hashana%2Frosh%20hashana%2033.pdf?alt=media&token=f5ce90ae-065d-419f-8848-e2fb93af6568");
        pdfUrl21.put(316, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Frosh%20hashana%2Frosh%20hashana%2034.pdf?alt=media&token=913d06d0-0f84-4499-a505-24e0c31c8684");
        pdfUrl21.put(317, "https://firebasestorage.googleapis.com/v0/b/judaicapp-62d9f.appspot.com/o/daf_yomi%2Frosh%20hashana%2Frosh%20hashana%2035a.pdf?alt=media&token=c1d8e00f-52df-4004-89d4-6aa8a40048cd");


        pdfView = requireView().findViewById(R.id.pdfview);
        Date date=new Date();
        Calendar localCalendar = Calendar.getInstance(TimeZone.getDefault());
        localCalendar.set(date.getYear(), date.getMonth(),date.getDate());
        int CurrentDayOfYear = localCalendar.get(Calendar.DAY_OF_YEAR);



        for (int i = 0; i < pdfUrl21.size(); i++) {
            if (pdfUrl21.containsKey(CurrentDayOfYear)) {
                new RetrievePdffromUrl().execute(pdfUrl21.get(CurrentDayOfYear));
                break;
            }
        }



    }
    //for the siddur not here
//    boolean isWithinRange(Date testDate) {
//        return testDate.after(new Date()) && testDate.before(new Date());
//    }




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