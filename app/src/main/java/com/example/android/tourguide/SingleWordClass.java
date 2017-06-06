package com.example.android.tourguide;

/**
 * Created by Niina on 5.6.2017.
 */

public class SingleWordClass {

    private String mTitle;
    private String mDescription;
    private String mAddress;
    private int mTourImage;


    //"Blueprint' of the class' content
    public SingleWordClass(String title, String description, String address, int tourImage) {
        mTitle = title;
        mDescription = description;
        mAddress = address;
        mTourImage = tourImage;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmDescription() {
        return mDescription;
    }

    public String getmAddress() {
        return mAddress;
    }

    public int getmTourImage() {
        return mTourImage;
    }
}
