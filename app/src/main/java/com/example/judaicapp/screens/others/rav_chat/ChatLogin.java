package com.example.judaicapp.screens.others.rav_chat;

import static android.content.Context.MODE_PRIVATE;

import android.app.FragmentManager;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.judaicapp.R;
import com.example.judaicapp.screens.others.rav_chat.chat_screens.Chat;
import com.example.judaicapp.screens.others.rav_chat.objects.User;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.zip.Inflater;

public class ChatLogin extends Fragment {
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    private EditText phone, name, password;
    private AutoCompleteTextView gender;
    private SharedPreferences sharedPreferences;
    private Button login;

    private View init(LayoutInflater inflater,ViewGroup viewGroup) {

        View view=   inflater.inflate(R.layout.activity_chat_login, viewGroup, false);


        sharedPreferences = view.getContext().getSharedPreferences("userData", MODE_PRIVATE);

        if (sharedPreferences.getString("phone", "").length() > 0) {
            navToChat();
        } else {
            return inflater.inflate(R.layout.activity_chat_login, viewGroup, false);
        }
        return inflater.inflate(R.layout.splash_screen, viewGroup, false);

    }
    private void goToNextActivity() {
        //זה לא עובר לעבור לפרגמנט
        navToChat();
    }
    public void navToChat(){
        db.collection("user").document(sharedPreferences.getString("phone", "")).get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                try {
                    ChatUtils.user = documentSnapshot.toObject(User.class);
                    Toast.makeText(getContext(), "success", Toast.LENGTH_LONG).show();
                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.chat_layout_fragment,new Chat()).commit();
                }catch (Exception e){

                }

            }
        });
    }

    private void initComponents(){




        try {
            initAutoComplete();
            phone = getView().findViewById(R.id.phone_number);
            name = getView().findViewById(R.id.name);
            password = getView().findViewById(R.id.password);
            login =getView().findViewById(R.id.login_button);
            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    User user = new User(name.getText().toString(),
                            password.getText().toString(),
                            phone.getText().toString(),
                            gender.getText().toString());
                    db.
                            collection("users").
                            document(phone.getText().toString()).
                            set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            sharedPreferences.edit().putString("phone", phone.getText().toString()).apply();
                            ChatUtils.user = user;
                            goToNextActivity();

                        }
                    });

                }
            });
        }catch (Exception e){

        }

    }



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return init(inflater,container);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initComponents();
    }

    private void initAutoComplete() {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_dropdown_item_1line, GENDERS);
        gender = getView().findViewById(R.id.gender);
        gender.setAdapter(adapter);
    }

    private static final String[] GENDERS = new String[]{
            "Male", "Female", "Unknown",
    };
}