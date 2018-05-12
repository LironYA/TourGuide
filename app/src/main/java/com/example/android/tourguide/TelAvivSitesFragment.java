package com.example.android.tourguide;


import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
//Image sources: TimeOut, tripadvisor, Wikimedia Commons
//Text sources: Wikipedia

/**
 * A simple {@link Fragment} subclass.
 */
public class TelAvivSitesFragment extends Fragment {


    public TelAvivSitesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.activity_main, container, false);

        final ArrayList<SitesSelection> sites = new ArrayList<SitesSelection>();
        sites.add(new SitesSelection("Gordon beach", R.drawable.gordon, "Gordon Beach boasts volleyball courts and a lovely saltwater swimming pool, surrounded by lawns to lounge on. On the boardwalk you’ll find a myriad of restaurants serving huge portions of classics like Israeli breakfast, fresh fish, sandwiches and a huge array of salads."));
        sites.add(new SitesSelection("Tel Aviv Port", R.drawable.tel_aviv_port, "It has a little bit of everything that is Tel Aviv - blue sea, serene mornings, bustling markets, shops and restaurants galore, kids stuff, outdoor happenings and a lively night scene with clubs and bars."));
        sites.add(new SitesSelection("Sarona", R.drawable.sarona, "Sarona is popular for its namesake covered market, a trendy hub of gourmet food stores selling local cheeses and cured meats, with restaurants by big-name Israeli chefs known for creative cuisine emphasizing seasonal ingredients. The area is full of busy bars serving cocktails and craft beer, while nearby, 19th-century cellars built by Templar Christians have been transformed into chic subterranean wine bars."));
        final SitesSelectionAdapter adapter = new SitesSelectionAdapter(getActivity(), sites);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;

    }
}
