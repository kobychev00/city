package com.example.city.domain;

import java.awt.geom.Point2D;

public class Place {
    private String name;

    private String briefDescription;

    private int categoryNumber;
    private Point2D.Double location;

    public Place(String name, String briefDescription, int categoryNumber, Point2D.Double location) {
        this.name = name;
        this.briefDescription = briefDescription;
        this.categoryNumber = categoryNumber;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBriefDescription() {
        return briefDescription;
    }

    public void setBriefDescription(String briefDescription) {
        this.briefDescription = briefDescription;
    }

    public int getCategoryNumber() {
        return categoryNumber;
    }

    public void setCategoryNumber(int categoryNumber) {
        this.categoryNumber = categoryNumber;
    }

    public Point2D.Double getLocation() {
        return location;
    }

    public void setLocation(Point2D.Double location) {
        this.location = location;
    }
}
