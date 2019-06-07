package com.example.childcare;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    public void onBackClick(View v){
        Intent myIntent = new Intent(getBaseContext(),   GetBabysitter.class);
        startActivity(myIntent);
    }

    public void onContactClick(View v){
        Intent myIntent = new Intent(getBaseContext(),   Messaging.class);
        startActivity(myIntent);
    }

}
