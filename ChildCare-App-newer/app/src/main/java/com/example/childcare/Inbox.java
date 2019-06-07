package com.example.childcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Inbox extends AppCompatActivity {
    String[] nameArray = {"Jane","Lily","Angela" };

    String[] childrenArray = {"3 children", "2 children", "2 children"};

    String[] subjectArray = {
            "Hi! I'd love for you to help me out next week.",
            "Hi, how are you? I saw your profile and I'd like you to help.",
            "What is your schedule like next week?"
    };

    Integer[] imageArray = {R.drawable.avatar2,
            R.drawable.avatar2,
            R.drawable.avatar2,
    };

    ListView listView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inbox);

        CustomListAdapter whatever2 = new CustomListAdapter(this, nameArray, childrenArray, subjectArray, imageArray);
        listView2 = (ListView) findViewById(R.id.listViewID);
        listView2.setAdapter(whatever2);

        listView2.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                Intent intent = new Intent(Inbox.this, Responding.class);

                String nameMessage = nameArray[position];
                intent.putExtra("name", nameMessage);

                String childrenMessage = childrenArray[position];
                intent.putExtra("location", childrenMessage);

                String subjectMessage = subjectArray[position];
                intent.putExtra("subject", subjectMessage);

                Integer picMessage = imageArray[position];
                intent.putExtra("avatar", picMessage);

                startActivity(intent);

            }
        });
    }

    public void onBabysitBack(View v){
        Intent myIntent = new Intent(getBaseContext(),   MainActivity.class);
        startActivity(myIntent);
    }
}
