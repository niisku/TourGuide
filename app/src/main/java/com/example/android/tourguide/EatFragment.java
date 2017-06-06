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
public class EatFragment extends Fragment {


    public EatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment + call it 'rootView'
        View rootView = inflater.inflate(R.layout.tour_list_view, container, false);

        //Content of this ArrayList:
        final ArrayList<SingleWordClass> toursListed = new ArrayList<>();
        toursListed.add(new SingleWordClass(getString(R.string.name_eat_gardenbistro), getString(R.string.description_eat_gardenbistro), getString(R.string.address_eat_gardenbistro), R.drawable.img_gardenbistro));
        toursListed.add(new SingleWordClass(getString(R.string.name_eat_sturekatten), getString(R.string.description_eat_sturekatten), getString(R.string.address_eat_sturekatten), R.drawable.img_sturekatten));
        toursListed.add(new SingleWordClass(getString(R.string.name_eat_drottninghof), getString(R.string.description_eat_drottninghof), getString(R.string.address_eat_drottninghof), R.drawable.img_drottninghof));
        toursListed.add(new SingleWordClass(getString(R.string.name_eat_gunters), getString(R.string.description_eat_gunters), getString(R.string.address_eat_gunters), R.drawable.img_gunters));
        toursListed.add(new SingleWordClass(getString(R.string.name_eat_fangyan), getString(R.string.description_eat_fangyan), getString(R.string.address_eat_fangyan), R.drawable.img_dumplings));

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
