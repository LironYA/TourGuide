package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
//Image sources: TripAdvisor, yourway Israel Tours
//Text: lonely planet

/**
 * A simple {@link Fragment} subclass.
 */
public class EilatFoodFragment extends Fragment {


    public EilatFoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.activity_main, container, false);

        final ArrayList<SitesSelection> sites = new ArrayList<SitesSelection>();

        sites.add(new SitesSelection("5th Avenue", R.drawable.fifth, "Known as a unique, New York style cocktail bar serving hot meticulous cuisine by the Red Sea, 5th Avenue is a high end beach escape."));
        sites.add(new SitesSelection("Last Refuge", R.drawable.last_refuge, "Run aground in a 1970s time warp (fishing nets dangle from the ceiling, French chansons pine for Paris and garlic butter figures heavily on the menu), this place promises little on first inspection but confounds the sceptic with its delicious catch of the day (when available), grilled over coals, and fish such as locally caught swordfish."));
        final SitesSelectionAdapter adapter = new SitesSelectionAdapter(getActivity(), sites);
        final ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;

    }
}
