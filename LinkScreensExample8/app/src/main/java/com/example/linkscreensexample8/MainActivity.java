package com.example.linkscreensexample8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v){
        Intent myIntent = new Intent(getBaseContext(),   SecondActivity.class);
        myIntent.putExtra("value1", "Barcelona");
        startActivity(myIntent);
    }
}
