package com.example.childcare;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    String nameExtra;
    String locExtra;
    String infoExtra;
    int picExtra;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        nameExtra = getIntent().getStringExtra("name");
        TextView myText = (TextView) findViewById(R.id.profileName);
        myText.setText(nameExtra);

        locExtra = getIntent().getStringExtra("location");
        TextView myText2 = (TextView) findViewById(R.id.locLang);
        myText2.setText(locExtra);

        infoExtra = getIntent().getStringExtra("info");
        TextView myText3 = (TextView) findViewById(R.id.infoText);
        myText3.setText(infoExtra);

        picExtra = getIntent().getIntExtra("avatar", 0);
        ImageView myImage = (ImageView) findViewById(R.id.profilePicture);
        myImage.setImageResource(picExtra);

    }

    public void onBackClick(View v){
        Intent myIntent = new Intent(getBaseContext(),   GetBabysitter.class);
        startActivity(myIntent);
    }

    public void onContactClick(View v){
        Intent myIntent = new Intent(getBaseContext(),   Messaging.class);

        myIntent.putExtra("name", nameExtra);
        myIntent.putExtra("location", locExtra);
        myIntent.putExtra("info", infoExtra);
        myIntent.putExtra("avatar", picExtra);

        startActivity(myIntent);
    }

}
