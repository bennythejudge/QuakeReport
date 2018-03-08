package com.example.android.quakereport;

/**
 * Created by neo on 08/03/2018.
 */

public class EarthQuake {
    private String mMagnitude;
    private String mLocation;
    private String mDate;

    public EarthQuake(String magnitude, String location, String date) {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    public String getMagnitude() { return mMagnitude; }

    public String getLocation() { return mLocation; }

    public String getDate() { return mDate; }

}
