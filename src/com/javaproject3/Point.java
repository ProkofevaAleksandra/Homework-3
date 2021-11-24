package com.javaproject3;

public class Point {
    private double x ;
    private double y ;

    public Point() {
    }

    @Override
    public String toString() {
        return " Point: "+ x + " , " + y + " ; ";
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void moveBy(double dx, double dy) {
        double x = this.x + dx;
        double y = this.y + dy;
    }
}
