package com.example.android.tourguide;


public class CitySelection {

    private String city;
    private String area;
    int imageResource;

    public CitySelection(String cityList, String cityArea, int image) {

        city = cityList;
        area = cityArea;
        imageResource = image;
    }

    public String getCity() {
        return city;
    }

    public String getArea() {
        return area;
    }

    public int getImage() {
        return imageResource;
    }

}
