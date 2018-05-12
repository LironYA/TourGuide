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
//Image sources: Lonely Planet
//Text sources: Wikipedia


public class TelAvivAboutFragment extends Fragment {


    public TelAvivAboutFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.activity_main, container, false);

        final ArrayList<SitesSelection> sites = new ArrayList<SitesSelection>();
        sites.add(new SitesSelection("Tel Aviv", R.drawable.telaviv, "Tel Aviv is the second most populous city in Israel, after Jerusalem and the most populous city in the conurbation of Gush Dan, Israel's largest metropolitan area. Located on the country's Mediterranean coastline and with a population of 438,818, it is the financial and technological center of the country. Silicon Wadi is another name for Gush Dan, in comparison to Silicon Valley in the U.S. state of California.\n" +
                "\n" +
                "Tel Aviv is governed by the Tel Aviv-Yafo Municipality, headed by Ron Huldai, and is home to many foreign embassies. It is a global city and is ranked 34th in the Global Financial Centres Index. Tel Aviv has the third-largest economy in the Middle East after Abu Dhabi and Kuwait City. The city has the 31st highest cost of living in the world. Tel Aviv receives over 2.5 million international visitors annually. A \"party capital\" in the Middle East, it has a lively nightlife and 24-hour culture. Tel Aviv is home to Tel Aviv University, the largest university in the country with more than 30,000 students."));
        final SitesSelectionAdapter adapter = new SitesSelectionAdapter(getActivity(), sites);
        final ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;


    }
}
