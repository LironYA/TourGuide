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
//Image sources: Shutterstock
//Text sources: TouristIsrael

/**
 * A simple {@link Fragment} subclass.
 */
public class EilatSitesFragment extends Fragment {


    public EilatSitesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.activity_main, container, false);

        final ArrayList<SitesSelection> sites = new ArrayList<SitesSelection>();
        sites.add(new SitesSelection("Dolphin Reef", R.drawable.dolpine_reef, "The Dolphin Reef in Eilat, on the shores of the Red Sea offers a magical and unique opportunity to observe and swim alongside some of nature’s most magnificent sea creatures.  The Reef is home to a colorful array of tropical fish, beautiful coral and, most significantly, a school of bottle-nosed dolphins including babies born on the site.  It was established over twenty years ago with the vision of bringing humans closer to animals in a sensitive and respectful way.  The dolphins are not kept captive.  They live in their natural habitat and have free access to the open sea should they choose to leave.  Human intervention in their lifestyle is minimized solely to the prevention of endangerment to their existence."));
        final SitesSelectionAdapter adapter = new SitesSelectionAdapter(getActivity(), sites);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;


    }
}
