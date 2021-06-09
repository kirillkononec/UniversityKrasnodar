package com.example.universitykrasnodar.data;

public class Fackultet {
    private int id;
    private int name;
    private int description;

    public Fackultet(int id, int name, int description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public int getName() {
        return name;
    }

    public int getDescription() {
        return description;
    }

}
