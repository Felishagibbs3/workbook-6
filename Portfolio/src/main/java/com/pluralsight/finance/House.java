package com.pluralsight.finance;

public class House extends FixedAsset{
    private int yearBuilt;
    private int squareFeet;
    private int bedroom;

    public House(String name, double marketValue, int yearBuilt, int squareFeet, int bedroom) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedroom = bedroom;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }

    public int getBedroom() {
        return bedroom;
    }

    public void setBedroom(int bedroom) {
        this.bedroom = bedroom;
    }

    @Override
    public double getValue() {
        return marketValue;
    }
}
