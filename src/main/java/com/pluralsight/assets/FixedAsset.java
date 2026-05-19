package com.pluralsight.assets;

abstract class FixedAsset implements Valuable {
    private String name;
    private double marketValue;

    //methods
    //Asset(name: String, value: double);

    //Constructor
    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    //Getter/setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return marketValue;
    }

    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }
}
