package com.example.listsexample12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] nameArray = {"Carbs", "Fruit", "Veggies", "Meat", "Dairy"};
    String[] infoArray = {"Bread, Cereals, Pasta, Grains", "Citrus, Melons, Berries, Tomatoes",
            "Leafy Greens, Carrots, Roots", "Beef, Chicken, Fish", "Milk, Eggs, Cream"};
    Integer[] imageArray = {R.drawable.bread, R.drawable.orange, R.drawable.asparagus,
            R.drawable.meat, R.drawable.milk};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create and instance our CustomListAdapter and feed these data arrays into it,
        // then tell the ListView to use it.
        CustomListAdapter whatever = new CustomListAdapter(this, nameArray, infoArray, imageArray);
        listView = (ListView) findViewById(R.id.listViewID);
        listView.setAdapter(whatever);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                String message = nameArray[position];
                intent.putExtra("food group", message);
                startActivity(intent);

            }
        });


    }
}
