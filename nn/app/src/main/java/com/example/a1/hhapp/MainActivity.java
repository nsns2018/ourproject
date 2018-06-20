package com.example.a1.hhapp;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.a1.hhapp.Model.User;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference table_user = database.getReference();
        final String deviceId = Settings.Secure.getString(this.getContentResolver(),
                Settings.Secure.ANDROID_ID);
        table_user.addListenerForSingleValueEvent(new ValueEventListener() {

            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                if (!dataSnapshot.child("Users").exists()) {
                    table_user.child("Users");
                }

                if (!dataSnapshot.child("Users").child(deviceId).exists()) {
                    User user = new User(deviceId);
                    table_user.child("Users").child(deviceId).setValue(user);
                    Intent homeIntent = new Intent(MainActivity.this, Home.class);

                    Toast.makeText(MainActivity.this, "Sign Up Successfully !", Toast.LENGTH_SHORT).show();
                    startActivity(homeIntent);
                    finish();
                } else {
                    //get user information
                    User user = dataSnapshot.child("Users").child(deviceId).getValue(User.class);
//                    user.setDeviceid(deviceId);

                    Intent homeIntent = new Intent(MainActivity.this, Home.class);
                    Common.currentUser = user;
                    Toast.makeText(MainActivity.this, "Sign IN Successfully !", Toast.LENGTH_SHORT).show();
                    startActivity(homeIntent);
                    finish();
                }
            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }


}

