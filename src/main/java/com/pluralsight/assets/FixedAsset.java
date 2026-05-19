package com.pluralsight.assets;

abstract class FixedAsset {
    String name;
    double marketValue;

    //methods

    //Asset(name: String, value: double);
    //getValue(): double;

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
