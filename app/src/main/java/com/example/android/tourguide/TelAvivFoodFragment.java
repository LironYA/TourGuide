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
//Image sources: TimeOut, eater.com

/**
 * A simple {@link Fragment} subclass.
 */
public class TelAvivFoodFragment extends Fragment {


    public TelAvivFoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.activity_main, container, false);

        final ArrayList<SitesSelection> sites = new ArrayList<SitesSelection>();

        sites.add(new SitesSelection("Yassou Tel Aviv Greek Restaurant", R.drawable.yassu, "Beat the Mediterranean heat with this Greek tavern and its Middle Eastern twist. Where Ouzo oozes as authentically as its Greek identity, relax for a gorgeous night out or get in touch with your inner plate-smasher every Sunday. Chef Tal Holtzer knows how to create an intimate atmosphere and Yassou is no exception. Tucked away next to the Prima Hotel, it’s a haven for Greek cuisine; from Sashimi Tabbouleh to Yassou’s Moussaka, it’s hard to bite into anything without feeling as if you’ve stepped into an alternate world."));
        sites.add(new SitesSelection("Mashya", R.drawable.mashya, "Mashya’s crisp, contemporary design, coupled with chef Yossi Shitrit’s innovative techniques and Moroccan influences, have made this restaurant one of the most talked\u00AD-about in town. Alternatively, make reservations for a weekend brunch for a great value — 86 shekels buys you an elegant, all\u00AD-you\u00AD-can\u00AD-eat feast complete with every kind of cheese, fish, and fresh bread you can dream of."));
        final SitesSelectionAdapter adapter = new SitesSelectionAdapter(getActivity(), sites);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;

    }
}
