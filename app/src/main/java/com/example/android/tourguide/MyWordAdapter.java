package com.example.android.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Niina on 5.6.2017.
 */

public class MyWordAdapter extends ArrayAdapter<SingleWordClass> {

    public MyWordAdapter(Activity context, ArrayList<SingleWordClass> toursListed) {
        super(context, 0, toursListed);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //convertView = existing view that we can re-use; but sometimes equals 'null',
        //meaning that there's no re-usable view (e.g. when opening activity and creating items of the
        //list to fill the screen
        View checkViewEmptiness = convertView;

        //Check that the view is empty and inflate it:
        if (checkViewEmptiness == null) {
            checkViewEmptiness = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //Get position location + name it 'currentItem'
        SingleWordClass currentItem = getItem(position);

        //For Title-part:
        TextView titleTextView = (TextView) checkViewEmptiness.findViewById(R.id.text_title);
        titleTextView.setText(currentItem.getmTitle());

        //For Description-part:
        TextView descriptionTextView = (TextView) checkViewEmptiness.findViewById(R.id.text_description);
        descriptionTextView.setText(currentItem.getmDescription());

        //For Address-part:
        TextView addressTextView = (TextView) checkViewEmptiness.findViewById(R.id.text_address);
        addressTextView.setText(currentItem.getmAddress());

        //For Image (+ making sure it's visible):
        ImageView imageView = (ImageView) checkViewEmptiness.findViewById(R.id.image);
        imageView.setImageResource(currentItem.getmTourImage());
        imageView.setVisibility(View.VISIBLE);

        return checkViewEmptiness;
    }


}
