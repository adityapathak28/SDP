package com.revauniversity.revasdpapp;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class retrieve extends AppCompatActivity {
    public DatabaseReference mFirebaseDatabase;
    public FirebaseDatabase mFirebaseInstance;
    public DatabaseReference mFirebaseDatabase2;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrieve);

        mFirebaseInstance = FirebaseDatabase.getInstance();
        mFirebaseDatabase = mFirebaseInstance.getReference("users/SCIT/FirstYear/");
        mFirebaseDatabase2=mFirebaseDatabase.child("System Servicing and Troubleshooting");

        ValueEventListener valueEventListener=new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for(DataSnapshot ds : dataSnapshot.getChildren()){
                    name=ds.child("Name").getValue(String.class);
                    Log.d("TAG",name+"/");

                }


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        mFirebaseDatabase2.addListenerForSingleValueEvent(valueEventListener);

    }
}
