package com.lujunjie.decorator;

public abstract class Beverage {
    private String description;
    public abstract Double cost();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
