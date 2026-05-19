package com.pluralsight.assets;

public class Jewelry implements Valuable{

    private double karat;
//methods


    @Override
    public double getValue() {
        return 0;
    }

//constructor
    public Jewelry(double karat) {
        this.karat = karat;
    }

//getters/setters
    public double getKarat() {
        return karat;
    }

    public void setKarat(double karat) {
        this.karat = karat;
    }
}
