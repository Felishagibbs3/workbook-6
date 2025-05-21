package com.pluralsight.finance;

import java.util.List;

public class Portfolio {
    private String name;
    private String owner;
    private List<Valuable> assets;

    public Portfolio(String name, String owner, List<Valuable> assets) {
        this.name = name;
        this.owner = owner;
        this.assets = assets;
    }
    public void add (Valuable asset) {
        assets.add(asset);
    }
    public double getValue() {
        double total = 0;
        for (Valuable v : assets) {
            total += v.getValue();
        }
        return total;
    }
    public Valuable getMostValuable() {
        Valuable max = assets.get(0);
        for (Valuable v : assets) {
            if (v.getValue() > max.getValue()) {
                max = v;
            }
        }
        return max;
    }
    public Valuable getLeastValuable() {
        Valuable min = assets.get(0);
        for (Valuable v : assets) {
            if (v.getValue() < min.getValue()) {
                min = v;
            }
        }
        return min;
    }
}
