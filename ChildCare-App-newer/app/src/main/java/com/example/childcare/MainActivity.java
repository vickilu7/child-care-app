package com.example.childcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.AdapterView.OnItemClickListener;

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
        Intent babysitIntent = new Intent(getBaseContext(), Inbox.class);
        startActivity(babysitIntent);
    }


}
