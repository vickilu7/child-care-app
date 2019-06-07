package com.example.childcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Messaging extends AppCompatActivity {
    String nameExtra;
    int picExtra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messaging);

        nameExtra = getIntent().getStringExtra("name");
        TextView myText = (TextView) findViewById(R.id.nameText);
        myText.setText(nameExtra);

        picExtra = getIntent().getIntExtra("avatar", 0);
        ImageView myImage = (ImageView) findViewById(R.id.avatar);
        myImage.setImageResource(picExtra);


    }

    public void onMessageBack(View v){
        Intent myIntent = new Intent(getBaseContext(),   Profile.class);
        myIntent.putExtra("name", nameExtra);
        myIntent.putExtra("location", getIntent().getStringExtra("location"));
        myIntent.putExtra("info", getIntent().getStringExtra("info"));
        myIntent.putExtra("avatar", picExtra);
        startActivity(myIntent);
    }
}
