package com.example.childcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onGetBabysitterClick(View v){
        Intent myIntent = new Intent(getBaseContext(),   GetBabysitter.class);
        startActivity(myIntent);
    }

    public void onBabysitClick(View v){
        Intent myIntent = new Intent(getBaseContext(),   GetBabysitter.class);
        startActivity(myIntent);
    }

}
