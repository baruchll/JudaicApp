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


public class Brachos extends Fragment {

    FirebaseFirestore db = FirebaseFirestore.getInstance();
    TextView bracha_rishona, bracha_achrona_1, rosh_chodesh, pesach, sukkos, bracha_achrona_2, borei_nefashos;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_brachos, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        brachaRishona();
    }

    private void brachaRishona() {
        bracha_rishona = getView().findViewById(R.id.a_br_bracha_rishona);
        bracha_achrona_1 = getView().findViewById(R.id.a_br_bracha_achrona_1);
        rosh_chodesh = getView().findViewById(R.id.a_br_rosh_chodesh);
        pesach = getView().findViewById(R.id.a_br_pesach);
        sukkos = getView().findViewById(R.id.a_br_sukkos);
        bracha_achrona_2 = getView().findViewById(R.id.a_br_bracha_achrona_2);
        borei_nefashos = getView().findViewById(R.id.a_br_borei_nefashos);

        DocumentReference docref = db.collection("ashkenaz").document("brachos");
        docref.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                if (error != null) {
                    return;
                }
                assert value != null;
                bracha_rishona.setText(Html.fromHtml(requireNonNull(value.getString("bracha_rishona")).replaceAll("_b", "<br/>")));
                bracha_achrona_1.setText(Html.fromHtml(requireNonNull(value.getString("bracha_achrona_1")).replaceAll("_b", "<br/>")));
                rosh_chodesh.setText(Html.fromHtml(requireNonNull(value.getString("rosh_chodesh")).replaceAll("_b", "<br/>")));
                pesach.setText(Html.fromHtml(requireNonNull(value.getString("pesach")).replaceAll("_b", "<br/>")));
                sukkos.setText(Html.fromHtml(requireNonNull(value.getString("sukkos")).replaceAll("_b", "<br/>")));
                bracha_achrona_2.setText(Html.fromHtml(requireNonNull(value.getString("bracha_achrona_2")).replaceAll("_b", "<br/>")));
                borei_nefashos.setText(Html.fromHtml(requireNonNull(value.getString("borei_nefashos")).replaceAll("_b", "<br/>")));
            }
        });


    }

}