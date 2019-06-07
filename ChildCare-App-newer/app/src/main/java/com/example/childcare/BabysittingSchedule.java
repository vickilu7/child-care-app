package com.example.childcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BabysittingSchedule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babysitting_schedule);
    }

    public void onToInbox(View v){
        Intent myIntent = new Intent(getBaseContext(),   Inbox.class);
        startActivity(myIntent);
    }
}
