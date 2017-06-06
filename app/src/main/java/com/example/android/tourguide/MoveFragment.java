package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MoveFragment extends Fragment {


    public MoveFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment + call it 'rootView'
        View rootView = inflater.inflate(R.layout.tour_list_view, container, false);

        //Content of this ArrayList:
        final ArrayList<SingleWordClass> toursListed = new ArrayList<>();
        toursListed.add(new SingleWordClass(getString(R.string.name_move_hellasgarden), getString(R.string.description_move_hellasgarden), getString(R.string.address_move_hellasgarden),R.drawable.img_hellasgarden));
        toursListed.add(new SingleWordClass(getString(R.string.name_move_nacka), getString(R.string.description_move_nacka), getString(R.string.address_move_nacka),R.drawable.img_nacka));
        toursListed.add(new SingleWordClass(getString(R.string.name_move_gym), getString(R.string.description_move_gym), getString(R.string.address_move_gym), R.drawable.img_outdoorgym));
        toursListed.add(new SingleWordClass(getString(R.string.name_move_park), getString(R.string.description_move_park), getString(R.string.address_move_park), R.drawable.img_nacka));
        toursListed.add(new SingleWordClass(getString(R.string.name_move_citybike), getString(R.string.description_move_citybike), getString(R.string.address_move_citybike), R.drawable.img_citybike));

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


