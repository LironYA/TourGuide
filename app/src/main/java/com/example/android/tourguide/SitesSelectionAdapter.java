package com.example.android.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SitesSelectionAdapter extends ArrayAdapter<SitesSelection> {

    public SitesSelectionAdapter(@NonNull Context context, ArrayList<SitesSelection> sites) {
        super(context, 0, sites);

    }

    @NonNull
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            //We create a new list item layout
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_selection, parent, false);
        }
        SitesSelection currentEntry = getItem(position);
        TextView CityText = (TextView) listItemView.findViewById(R.id.text_view_selection);
        CityText.setText(currentEntry.getDescriptionSites());
        ImageView city_image = (ImageView) listItemView.findViewById(R.id.city_image);
        city_image.setImageResource(currentEntry.getImage());
        city_image.setVisibility(View.VISIBLE);
        TextView info_text = (TextView) listItemView.findViewById(R.id.click);
        info_text.setText(currentEntry.getInfo());
        return listItemView;
    }


}
