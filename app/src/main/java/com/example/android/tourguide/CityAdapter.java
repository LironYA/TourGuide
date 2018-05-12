package com.example.android.tourguide;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CityAdapter extends ArrayAdapter<CitySelection> {
    private int colorResource;

    public CityAdapter(@NonNull Context context, ArrayList<CitySelection> cities, int colorResourceId) {
        super(context, 0, cities);
        colorResource = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        // Check if the existing view is being reused, otherwise inflate the view
        if (listItemView == null) {
            //We inflate the view meaning we create a new list item layout
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        // Get the object located at this position in the list
        CitySelection currentWord = getItem(position);
        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView CityText = (TextView) listItemView.findViewById(R.id.city_list);
        // Get the English word from the current Word object and set this text on the name TextView
        CityText.setText(currentWord.getCity());
        //Find the TextView in the list_item.xml layout with the Miwok word
        TextView areaTextView = (TextView) listItemView.findViewById(R.id.area_list);
        areaTextView.setText(currentWord.getArea());
        //Return the whole list item layout so that it can be shown in the ListView
        ImageView city_image = (ImageView) listItemView.findViewById(R.id.city_image);
        city_image.setImageResource(currentWord.getImage());
        city_image.setVisibility(View.VISIBLE);
        //Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        //find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), colorResource);
        //Set the GB color of the text container view
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}
