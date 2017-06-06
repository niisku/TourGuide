package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class PlayFragment extends Fragment {


    public PlayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment + call it 'rootView'
        View rootView = inflater.inflate(R.layout.tour_list_view, container, false);

        //Content of this ArrayList:
        final ArrayList<SingleWordClass> toursListed = new ArrayList<>();
        toursListed.add(new SingleWordClass(getString(R.string.name_play_karaoke), getString(R.string.description_play_karaoke), getString(R.string.address_play_karaoke), R.drawable.img_karaoke));
        toursListed.add(new SingleWordClass(getString(R.string.name_play_cybertown), getString(R.string.description_play_cybertown), getString(R.string.address_play_cybertown), R.drawable.img_lasertag));
        toursListed.add(new SingleWordClass(getString(R.string.name_play_minigolf), getString(R.string.description_play_minigolf), getString(R.string.address_play_minigolf), R.drawable.img_minigolf));
        toursListed.add(new SingleWordClass(getString(R.string.name_play_standup), getString(R.string.description_play_standup), getString(R.string.address_play_standup), R.drawable.img_standup));
        toursListed.add(new SingleWordClass(getString(R.string.name_play_escaperoom), getString(R.string.description_play_escaperoom), getString(R.string.address_play_escaperoom), R.drawable.img_escaperoom));

        // Create an adapter, whose data source is a list of 'toursListed'. The
        // adapter knows how to create list items for each item in the list (because
        //its "blueprint" created in class 'MyWordAdapter'
        MyWordAdapter adapter = new MyWordAdapter(getActivity(), toursListed);

        // Find the 'view_listview' + name it as 'listView'
        ListView listView = (ListView) rootView.findViewById(R.id.view_listview);

        //Attach created 'adapter¨' to the created 'listView'
        listView.setAdapter(adapter);

        return rootView;
    }
}
