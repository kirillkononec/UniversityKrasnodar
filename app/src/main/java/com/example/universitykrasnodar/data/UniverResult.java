package com.example.universitykrasnodar.data;

import android.widget.ImageView;

import java.util.ArrayList;

public class UniverResult {
    private int id;
    private ImageView logo;
    private String name;
    private final ArrayList<Fackultet> facultyList;

    public UniverResult(int id, ImageView logo, String name, ArrayList<Fackultet> facultyList) {
        this.id = id;
        this.logo = logo;
        this.name = name;
        this.facultyList = facultyList;
    }

    public int getId() {
        return id;
    }

    public ImageView getLogo() {
        return logo;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Fackultet> getFacultyList() {
        return facultyList;
    }
}
