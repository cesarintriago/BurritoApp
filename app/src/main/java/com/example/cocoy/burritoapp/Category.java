package com.example.cocoy.burritoapp;

/**
 * Created by cocoy on 23/10/2017.
 */

public class Category {
    private String name;
    private int icon;

    public Category(String name, int icon) {
        this.name = name;
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public int getIcon() {
        return icon;
    }
}
