package com.example.android.tourguide;

public class SitesSelection {


    String descriptionSites;
    String information;
    int imageResource;

    public SitesSelection(String description, int image, String info) {

        descriptionSites = description;
        imageResource = image;
        information = info;
    }

    public String getDescriptionSites() {
        return descriptionSites;
    }

    public int getImage() {
        return imageResource;
    }

    public String getInfo() {
        return information;
    }

}