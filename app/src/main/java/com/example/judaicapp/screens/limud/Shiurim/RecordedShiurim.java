package com.example.judaicapp.screens.limud.Shiurim;

import android.app.ProgressDialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.judaicapp.R;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class RecordedShiurim extends Fragment {
    ListView lvRss;
    ArrayList<String> titles;
    ArrayList<String> links;
    ArrayList<String> authors;
    ArrayList<String> all;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_recorded_shiurim, container, false);


    }



    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Inits();
    }
    private void Inits() {
        lvRss = getView().findViewById(R.id.lvRss);
        titles = new ArrayList<String>();
        links = new ArrayList<String>();
        authors = new ArrayList<String>();
        all = new ArrayList<String>();


        lvRss.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Uri uri = Uri.parse(links.get(i));
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                //intent.putExtra("URL", uri);
                startActivity(intent);

            }
        });

        new ProcessInBackground().execute();

    }

    public InputStream getInputStream(URL url){
        try {
            return url.openConnection().getInputStream();
        }
        catch (IOException e){
            return null;
        }
    }

    public class ProcessInBackground extends AsyncTask<Integer, Void, Exception> {

        ProgressDialog progressDialog = new ProgressDialog(getContext());

        Exception exception = null;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            progressDialog.setMessage("המסך טוען נא להמתין");
            progressDialog.show();
        }

        @Override
        protected Exception doInBackground(Integer... integers) {

            try
            {
                URL url = new URL("https://www.yutorah.org/search/rss.cfm?q=&f=language:HE,seriesid:4331,teacherishidden:0&s=shiurdate%20desc");
                XmlPullParserFactory factory = XmlPullParserFactory.newInstance();

                factory.setNamespaceAware(false);

                XmlPullParser xpp = factory.newPullParser();

                xpp.setInput(getInputStream(url), "UTF_8");

                boolean insideItem = false;

                int eventType = xpp.getEventType();

                while (eventType != XmlPullParser.END_DOCUMENT)
                {


                    if (eventType == XmlPullParser.START_TAG)
                    {

                        if (xpp.getName().equalsIgnoreCase("item"))
                        {
                            insideItem = true;
                        }

                        else if (xpp.getName().equalsIgnoreCase("author"))
                        {

                            if (insideItem)
                            {
                                Spanned spanned = Html.fromHtml(xpp.nextText());
                                authors.add(spanned.toString());
                            }
                        }

                        else if (xpp.getName().equalsIgnoreCase("title"))
                        {


                            if (insideItem)
                            {
                                Spanned spanned = Html.fromHtml(xpp.nextText());
                                titles.add(spanned.toString());
                            }

                        }
                        else if (xpp.getName().equalsIgnoreCase("link"))
                        {
                            if (insideItem)
                            {
                                links.add(xpp.nextText());
                            }
                        }
                    }
                    else if (eventType == XmlPullParser.END_TAG && xpp.getName().equalsIgnoreCase("item"))
                    {
                        insideItem = false;
                    }

                    eventType = xpp.next();
                }
            }
            catch (MalformedURLException e)
            {
                exception = e;

            }
            catch (XmlPullParserException e)
            {
                exception = e;
            }
            catch (IOException e)
            {
                exception = e;
            }

            return exception;
        }

        @Override
        protected void onPostExecute(Exception s) {
            super.onPostExecute(s);


            for (int i = 0; i < authors.size(); i++) {
                all.add(authors.get(i) + "\n" + titles.get(i));
            }

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext() ,android.R.layout.simple_list_item_1, all);

            lvRss.setAdapter(adapter);

            progressDialog.dismiss();
        }
    }


}