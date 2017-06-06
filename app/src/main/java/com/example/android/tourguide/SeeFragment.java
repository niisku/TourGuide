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
public class SeeFragment extends Fragment {


    public SeeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment + call it 'rootView'
        View rootView = inflater.inflate(R.layout.tour_list_view, container, false);

        //Content of this ArrayList:
        final ArrayList<SingleWordClass> toursListed = new ArrayList<>();
        toursListed.add(new SingleWordClass(getString(R.string.name_see_hotorgshallen), getString(R.string.description_see_hotorgshallen), getString(R.string.address_see_hotorgshallen), R.drawable.img_hotorgshallen));
        toursListed.add(new SingleWordClass(getString(R.string.name_see_soldiers), getString(R.string.description_see_soldiers), getString(R.string.address_see_soldiers), R.drawable.img_soldiers));
        toursListed.add(new SingleWordClass(getString(R.string.name_see_skansen), getString(R.string.description_see_skansen), getString(R.string.address_see_skansen), R.drawable.img_skansen));
        toursListed.add(new SingleWordClass(getString(R.string.name_see_naturalhistorymuseum), getString(R.string.description_see_naturalhistorymuseum), getString(R.string.address_see_naturalhistorymuseum), R.drawable.img_naturhistoriskamuseet));
        toursListed.add(new SingleWordClass(getString(R.string.name_see_subwayart), getString(R.string.description_see_subwayart), getString(R.string.address_see_subwayart), R.drawable.img_metroart));

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
