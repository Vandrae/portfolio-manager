package com.pluralsight.assets;

public class Gold implements Valuable{

   private double weight;

    //methods
    @Override
    public double getValue() {
        return 0;
    }

    //constructor
    public Gold(double weight) {
        this.weight = weight;
    }

    //getter/setter
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
