package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
//Image sources: Israel Tourism
//Text sources: Wikipedia


public class EilatAboutFragment extends Fragment {


    public EilatAboutFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.activity_main, container, false);

        final ArrayList<SitesSelection> sites = new ArrayList<SitesSelection>();
        sites.add(new SitesSelection("Eilat", R.drawable.eilat, "Eilat is a home to 50,072 people, Eilat is part of the Southern Negev Desert, at the southern end of the Arava, adjacent to the Egyptian village of Taba to the south, the Jordanian port city of Aqaba to the east, and within sight of Saudi Arabia to the south-east, across the gulf." + "\n" +
                "Eilat's arid desert climate and low humidity are moderated by proximity to a warm sea. Temperatures often exceed 40 °C (104 °F) in summer, and 21 °C (70 °F) in winter, while water temperatures range between 20 and 26 °C (68 and 79 °F). Eilat averages 360 sunny days a year."));
        final SitesSelectionAdapter adapter = new SitesSelectionAdapter(getActivity(), sites);
        final ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;

    }
}
