//package com.example.a1.hhapp;
//
//import android.content.Context;
//import android.provider.Settings;
//import android.support.annotation.NonNull;
//import android.support.v4.app.FragmentTransaction;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.text.Layout;
//import android.util.Log;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import com.example.a1.hhapp.Model.User;
//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DatabaseError;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.database.ValueEventListener;
//
//public class SignUp extends AppCompatActivity {
//
////    FirebaseAuth mAuth;
////
////    @Override
////    protected void onCreate(Bundle savedInstanceState) {
////        super.onCreate(savedInstanceState);
////        setContentView(R.layout.activity_sign_up);
////        TextView textView;
////
////        final String deviceId = Settings.Secure.getString(this.getContentResolver(),
////                Settings.Secure.ANDROID_ID);
////        final FirebaseDatabase database = FirebaseDatabase.getInstance();
////        final DatabaseReference table_user = database.getReference();
////        User user = new User(deviceId);
////        table_user.setValue(user);
////
////Intent homeIntent = new Intent(MainActivity.this, Home.class);
////startActivity(homeIntent);
////finish();
//    }
//
//}
