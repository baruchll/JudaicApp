package com.example.judaicapp.screens.others.rav_chat.chat_screens;

import static android.content.Context.MODE_PRIVATE;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.airbnb.lottie.LottieAnimationView;
import com.example.judaicapp.R;
import com.example.judaicapp.screens.others.rav_chat.ChatUtils;
import com.example.judaicapp.screens.others.rav_chat.RecyclerChat;
import com.example.judaicapp.screens.others.rav_chat.objects.ChatConversation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.Date;


public class Chat extends Fragment {
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    private RecyclerView recyclerView;
    private LottieAnimationView lottieAnimationView;
    private ArrayList<ChatConversation> chats;
    private SharedPreferences sharedPreferences;
    private EditText textOfUser;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_chat, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        lottieAnimationView = requireView().findViewById(R.id.animationView);
        getChatsFromServer();
        sendMessage();
        sharedPreferences = this.requireActivity().getSharedPreferences("userData",MODE_PRIVATE);
    }

    private void sendMessage() {
        ImageButton imageButton = requireView().findViewById(R.id.send_message);
        EditText editText = requireView().findViewById(R.id.message_to_send);
        imageButton.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View v) {
                db.
                        collection("chats")
                        .document(""+new Date().getTime()).
                        set(new ChatConversation(ChatUtils.user.getName(),new Date().toGMTString(),editText.getText().toString(),""));

            }
        });
    }

    private void getChatsFromServer() {

        db.collection("chats").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot value, @Nullable FirebaseFirestoreException error) {
                if(error==null){
                    chats= (ArrayList<ChatConversation>) value.toObjects(ChatConversation.class);
                    if(chats.size()>0){
                        lottieAnimationView.setVisibility(View.GONE);
                    }else{
                        lottieAnimationView.setVisibility(View.VISIBLE);
                    }

                    setRecyclerView();
                }
            }
        });
        db.collection("chats").get().addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
            @Override
            public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                chats= (ArrayList<ChatConversation>) queryDocumentSnapshots.toObjects(ChatConversation.class);
                if(chats.size()>0){
                    lottieAnimationView.setVisibility(View.GONE);
                }

                setRecyclerView();
            }
        });
    }

    private void setRecyclerView() {
        recyclerView = requireView().findViewById(R.id.recycler_chat);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(requireActivity().getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        RecyclerChat mAdapter = new RecyclerChat(chats);
        recyclerView.setAdapter(mAdapter);
    }
}