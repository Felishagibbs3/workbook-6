package com.pluralsight.finance;

public class Jewelry  extends FixedAsset {
    private double karat;
    public Jewelry(String name, double karat, double marketValue) {
        super(name, marketValue);
        this.karat = karat;
    }

    public double getKarat() {
        return karat;
    }

    public void setKarat(double karat) {
        this.karat = karat;
    }

    @Override
    public double getValue() {
        return marketValue;
    }
}
