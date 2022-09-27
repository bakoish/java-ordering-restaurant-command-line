package io.bakoish.model;

public class Dish extends Food {

    private Double weight;

    public Dish(String name, Double price, String details, Double weight) {
        super(name, price, details);
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
