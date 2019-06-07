package com.example.childcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class GetBabysitter extends AppCompatActivity {

    String[] nameArray = {"Jane Last","Lily Last","Michelle Last","Sarah Last","Angela Last","Lindsey Last" };

    String[] locArray = {"Durham","Raleigh","Charlotte","Asheville","Chapel Hill","Greensboro" };

    String[] infoArray = {
            "Has babysat 15 times previously",
            "Great with kids because she is one",
            "Will read books to your child",
            "Always on top of her responsibilities",
            "Fun and kids love her",
            "New babysitter but very caring."
    };

    Integer[] imageArray = {R.drawable.avatar2,
            R.drawable.avatar2,
            R.drawable.avatar2,
            R.drawable.avatar2,
            R.drawable.avatar2,
            R.drawable.avatar2};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_babysitter);

        CustomListAdapter whatever = new CustomListAdapter(this, nameArray, locArray, infoArray, imageArray);
        listView = (ListView) findViewById(R.id.listViewID);
        listView.setAdapter(whatever);

        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                Intent intent = new Intent(GetBabysitter.this, Profile.class);

                String nameMessage = nameArray[position];
                intent.putExtra("name", nameMessage);

                String locMessage = locArray[position];
                intent.putExtra("location", locMessage);

                String infoMessage = infoArray[position];
                intent.putExtra("info", infoMessage);

                Integer picMessage = imageArray[position];
                intent.putExtra("avatar", picMessage);

                startActivity(intent);

            }
        });
    }

    public void onGetBabysitBack(View v){
        Intent myIntent = new Intent(getBaseContext(),   MainActivity.class);
        startActivity(myIntent);
    }



}
