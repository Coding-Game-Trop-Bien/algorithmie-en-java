package com.lunar.robot;

class Robot{
    private int x;
    private int y;
    private Orientation orientation;

    public Robot(int x, int y, Orientation orientation) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    public void moveForward(){
        switch (orientation){
            case N:
                this.y++;
                break;
            case W:
                this.x++;
                break;
            case E:
                this.x--;
                break;
            case S:
                this.y--;
                break;
            default:
                break;
        }
    }

    public void turnRight(){
        switch (orientation){
            case N:
                this.orientation=Orientation.E;
                break;
            case W:
                this.orientation=Orientation.N;
                break;
            case E:
                this.orientation=Orientation.S;
                break;
            case S:
                this.orientation=Orientation.W;
                break;
            default:
                break;
        }
    }

    public void turnLeft(){
        switch (orientation){
            case N:
                this.orientation=Orientation.W;
                break;
            case W:
                this.orientation=Orientation.S;
                break;
            case S:
                this.orientation=Orientation.E;
                break;
            case E:
                this.orientation=Orientation.N;
                break;
            default:
                break;
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    @Override
    public String toString() {
        return this.getX() + " " + this.getY() + " " + this.getOrientation();
    }
}