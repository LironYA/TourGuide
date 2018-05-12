package com.example.android.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ArrayList<CitySelection> options = new ArrayList<>();
        options.add(new CitySelection("Tel Aviv", "Center", R.drawable.telaviv));
        options.add(new CitySelection("Eilat", "South", R.drawable.eilat));
        CityAdapter adapter = new CityAdapter(this, options, R.color.main);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // if (indexOf(Selection) == 0) {
                if (position == 0) {
                    Intent myIntent = new Intent(MainActivity.this, TelAvivActivity.class);
                    MainActivity.this.startActivity(myIntent);
                }
                if (position == 1) {
                    Intent myIntent = new Intent(MainActivity.this, EilatActivity.class);
                    MainActivity.this.startActivity(myIntent);
                }
            }
        });

    }
}