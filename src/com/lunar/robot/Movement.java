package com.lunar.robot;

public enum Movement {
    M("move"), L("move"), R("right");

    public String movement;

    private Movement(String movement){
        this.movement=movement;
    }
}
