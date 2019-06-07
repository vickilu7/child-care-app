package com.example.childcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Responding extends AppCompatActivity {
    String nameExtra;
    int picExtra;
    String subjectExtra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_responding);

        nameExtra = getIntent().getStringExtra("name");
        TextView myText = (TextView) findViewById(R.id.nameText);
        myText.setText(nameExtra);

        picExtra = getIntent().getIntExtra("avatar", 0);
        ImageView myImage = (ImageView) findViewById(R.id.avatar);
        myImage.setImageResource(picExtra);

        subjectExtra = getIntent().getStringExtra("subject");
        TextView mySubject = (TextView) findViewById(R.id.subjectText);
        mySubject.setText(subjectExtra);
    }

    public void onRespondBack(View v){
        Intent myIntent = new Intent(getBaseContext(),   Inbox.class);
        myIntent.putExtra("name", nameExtra);
        myIntent.putExtra("location", getIntent().getStringExtra("location"));
        myIntent.putExtra("subject", subjectExtra);
        myIntent.putExtra("avatar", picExtra);
        startActivity(myIntent);
    }
}
