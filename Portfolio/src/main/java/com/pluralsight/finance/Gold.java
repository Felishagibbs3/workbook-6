package com.pluralsight.finance;

public class Gold  extends FixedAsset{
    private double weight;

    public Gold(String name, double weight, double marketValue) {
        super(name, marketValue);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getValue() {
        return marketValue;
    }
}
