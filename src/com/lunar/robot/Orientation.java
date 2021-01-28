package com.lunar.robot;

public enum Orientation {
    N("North"), W("West"), E("East"), S("South");

    public String orientation;

    private Orientation(String orientation){
        this.orientation=orientation;
    }
}
