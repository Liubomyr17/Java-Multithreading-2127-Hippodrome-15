package com.company;

public class Horse {
    private String name;
    private double speed;
    private double distance;
    public void move(){

        this.distance += this.speed*Math.random();
    }
    // 12
    public void print(){
        for (int i=0; i<((int)this.getDistance()); i++){
            System.out.print(".");
        }
        System.out.println(this.getName());
    }
    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }
}
