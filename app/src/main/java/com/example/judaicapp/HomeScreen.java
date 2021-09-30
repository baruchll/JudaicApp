package com.example.judaicapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Toast;

import com.example.judaicapp.screens.BanScreen;
import com.example.judaicapp.screens.others.rav_chat.ChatUtils;
import com.example.judaicapp.screens.others.rav_chat.chat_screens.Chat;
import com.example.judaicapp.screens.others.rav_chat.objects.User;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import io.grpc.okhttp.internal.Util;

public class HomeScreen extends AppCompatActivity {
    private SharedPreferences sharedPreferences;
    private AppBarConfiguration mAppBarConfiguration;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.home, R.id.siddur, R.id.limud_yomi,R.id.compassFragment)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
        this.loadUser();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home_screen, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public void loadUser(){
        sharedPreferences=getSharedPreferences("userData",MODE_PRIVATE);
        db.collection("users").document(sharedPreferences.getString("phone", "")).get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                try {
                    User user=documentSnapshot.toObject(User.class);
                    ChatUtils.user=user;
                    Toast.makeText(getApplicationContext(),"ser.getTotalStrike()"+user.getTotalStrike(),Toast.LENGTH_LONG).show();
                    if(user!=null&&user.getTotalStrike()>=3){
                        startActivity(new Intent(getApplicationContext(),BanScreen.class));
                        finish();
                    }

                }catch (Exception e){

                }

            }
        });
    }
}